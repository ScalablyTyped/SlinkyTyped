package typingsSlinky.fflate.mod

import typingsSlinky.fflate.fflateNumbers.`0`
import typingsSlinky.fflate.fflateNumbers.`10`
import typingsSlinky.fflate.fflateNumbers.`11`
import typingsSlinky.fflate.fflateNumbers.`12`
import typingsSlinky.fflate.fflateNumbers.`1`
import typingsSlinky.fflate.fflateNumbers.`2`
import typingsSlinky.fflate.fflateNumbers.`3`
import typingsSlinky.fflate.fflateNumbers.`4`
import typingsSlinky.fflate.fflateNumbers.`5`
import typingsSlinky.fflate.fflateNumbers.`6`
import typingsSlinky.fflate.fflateNumbers.`7`
import typingsSlinky.fflate.fflateNumbers.`8`
import typingsSlinky.fflate.fflateNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent fflate.fflate.DeflateOptions */
/* Inlined parent std.Pick<fflate.fflate.GzipOptions, 'mtime'> */
@js.native
trait ZipOptions extends StObject {
  
  /**
    * The level of compression to use, ranging from 0-9.
    *
    * 0 will store the data without compression.
    * 1 is fastest but compresses the worst, 9 is slowest but compresses the best.
    * The default level is 6.
    *
    * Typically, binary data benefits much more from higher values than text data.
    * In both cases, higher values usually take disproportionately longer than the reduction in final size that results.
    *
    * For example, a 1 MB text file could:
    * - become 1.01 MB with level 0 in 1ms
    * - become 400 kB with level 1 in 10ms
    * - become 320 kB with level 9 in 100ms
    */
  var level: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  
  /**
    * The memory level to use, ranging from 0-12. Increasing this increases speed and compression ratio at the cost of memory.
    *
    * Note that this is exponential: while level 0 uses 4 kB, level 4 uses 64 kB, level 8 uses 1 MB, and level 12 uses 16 MB.
    * It is recommended not to lower the value below 4, since that tends to hurt performance.
    * In addition, values above 8 tend to help very little on most data and can even hurt performance.
    *
    * The default value is automatically determined based on the size of the input data.
    */
  var mem: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`] = js.native
  
  var mtime: js.UndefOr[js.Date | String | Double] = js.native
}
object ZipOptions {
  
  @scala.inline
  def apply(): ZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipOptions]
  }
  
  @scala.inline
  implicit class ZipOptionsMutableBuilder[Self <: ZipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMem(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
    
    @scala.inline
    def setMtime(value: js.Date | String | Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtimeDate(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
  }
}
