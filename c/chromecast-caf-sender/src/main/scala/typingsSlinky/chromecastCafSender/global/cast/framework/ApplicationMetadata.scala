package typingsSlinky.chromecastCafSender.global.cast.framework

import typingsSlinky.chrome.chrome.cast.Image
import typingsSlinky.chrome.chrome.cast.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.ApplicationMetadata")
@js.native
class ApplicationMetadata protected ()
  extends typingsSlinky.chromecastCafSender.cast.framework.ApplicationMetadata {
  def this(sessionObj: Session) = this()
  /* CompleteClass */
  override var applicationId: String = js.native
  /* CompleteClass */
  override var images: js.Array[Image] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var namespaces: js.Array[String] = js.native
}

