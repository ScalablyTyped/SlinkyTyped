package typingsSlinky.graygelf.mod

import typingsSlinky.graygelf.anon.Alert
import typingsSlinky.graygelf.graygelfNumbers.`1240`
import typingsSlinky.graygelf.graygelfNumbers.`8154`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graygelf", JSImport.Namespace)
@js.native
class ^ () extends graygelf {
  def this(setup: typingsSlinky.graygelf.mod.setup) = this()
}
@JSImport("graygelf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Create a graygelf instance
    *
    * @param setup
    */
  def apply(): Instance = js.native
  def apply(setup: setup): Instance = js.native
  
  /**
    * Chunk size for local network
    */
  var CHUNK_LAN: `8154` = js.native
  
  /**
    * Chunk size for wide network
    */
  var CHUNK_WAN: `1240` = js.native
  
  /**
    * GELF log levels
    */
  var LOG_LEVELS: Alert = js.native
}
