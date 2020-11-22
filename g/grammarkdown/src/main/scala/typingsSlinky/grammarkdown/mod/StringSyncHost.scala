package typingsSlinky.grammarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "StringSyncHost")
@js.native
class StringSyncHost protected ()
  extends typingsSlinky.grammarkdown.hostMod.StringSyncHost {
  /**
    * @param file The file name for the content.
    * @param content The content of the file.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(file: String, content: String) = this()
  def this(file: String, content: String, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost) = this()
}
