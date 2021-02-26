package typingsSlinky.grammarkdown.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "StringAsyncHost")
@js.native
class StringAsyncHost protected ()
  extends typingsSlinky.grammarkdown.hostMod.StringAsyncHost {
  def this(file: String, content: String) = this()
  /**
    * @param file The file name for the content.
    * @param content The content of the file.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(file: String, content: js.Thenable[String]) = this()
  def this(file: String, content: String, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost) = this()
  def this(file: String, content: String, hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost) = this()
  def this(
    file: String,
    content: js.Thenable[String],
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreAsyncHost
  ) = this()
  def this(
    file: String,
    content: js.Thenable[String],
    hostFallback: typingsSlinky.grammarkdown.hostMod.CoreSyncHost
  ) = this()
}
