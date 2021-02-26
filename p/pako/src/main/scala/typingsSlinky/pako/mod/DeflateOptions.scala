package typingsSlinky.pako.mod

import typingsSlinky.pako.pakoNumbers.`-1`
import typingsSlinky.pako.pakoNumbers.`0`
import typingsSlinky.pako.pakoNumbers.`1`
import typingsSlinky.pako.pakoNumbers.`2`
import typingsSlinky.pako.pakoNumbers.`3`
import typingsSlinky.pako.pakoNumbers.`4`
import typingsSlinky.pako.pakoNumbers.`5`
import typingsSlinky.pako.pakoNumbers.`6`
import typingsSlinky.pako.pakoNumbers.`7`
import typingsSlinky.pako.pakoNumbers.`8`
import typingsSlinky.pako.pakoNumbers.`9`
import typingsSlinky.pako.pakoStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeflateOptions extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var dictionary: js.UndefOr[js.Any] = js.native
  
  var gzip: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[Header] = js.native
  
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  
  var memLevel: js.UndefOr[Double] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var strategy: js.UndefOr[StrategyValues] = js.native
  
  var to: js.UndefOr[string] = js.native
  
  var windowBits: js.UndefOr[Double] = js.native
}
object DeflateOptions {
  
  @scala.inline
  def apply(): DeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeflateOptions]
  }
  
  @scala.inline
  implicit class DeflateOptionsMutableBuilder[Self <: DeflateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    @scala.inline
    def setDictionary(value: js.Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    @scala.inline
    def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setStrategy(value: StrategyValues): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    @scala.inline
    def setTo(value: string): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
  }
}
