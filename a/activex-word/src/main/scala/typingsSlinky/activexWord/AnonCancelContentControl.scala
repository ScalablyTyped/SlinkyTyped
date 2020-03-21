package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelContentControl extends js.Object {
  var Cancel: Boolean
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl
}

object AnonCancelContentControl {
  @scala.inline
  def apply(Cancel: Boolean, ContentControl: ContentControl): AnonCancelContentControl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelContentControl]
  }
}

