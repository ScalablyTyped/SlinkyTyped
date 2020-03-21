package typingsSlinky.chromecastCafSender.cast.framework

import typingsSlinky.chrome.chrome.cast.Image
import typingsSlinky.chrome.chrome.cast.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.ApplicationMetadata")
@js.native
class ApplicationMetadata protected () extends js.Object {
  def this(sessionObj: Session) = this()
  var applicationId: String = js.native
  var images: js.Array[Image] = js.native
  var name: String = js.native
  var namespaces: js.Array[String] = js.native
}

