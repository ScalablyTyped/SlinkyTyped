package typingsSlinky.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelContentControl extends js.Object {
  var Cancel: Boolean
  val ContentControl: typingsSlinky.activexWord.Word.ContentControl
}

object CancelContentControl {
  @scala.inline
  def apply(Cancel: Boolean, ContentControl: typingsSlinky.activexWord.Word.ContentControl): CancelContentControl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContentControl]
  }
}

