package typingsSlinky.checksum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("checksum", "file")
@js.native
object file extends js.Object {
  
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param callback    Callback which is called with the result or an error
    */
  def apply(filename: String, callback: js.Function2[/* error */ js.Error, /* hash */ String, Unit]): Unit = js.native
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param options    Options object to indicate hash algo
    * @param callback    Callback which is called with the result or an error
    */
  def apply(
    filename: String,
    options: ChecksumOptions,
    callback: js.Function2[/* error */ js.Error, /* hash */ String, Unit]
  ): Unit = js.native
}
