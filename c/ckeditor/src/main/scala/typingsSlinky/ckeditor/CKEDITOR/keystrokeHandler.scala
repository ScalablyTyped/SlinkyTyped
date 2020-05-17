package typingsSlinky.ckeditor.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.ckeditor.CKEDITOR.dom.domObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait keystrokeHandler extends js.Object {
  var blockedKeystrokes: NumberDictionary[String | Boolean] = js.native
  var keystrokes: NumberDictionary[String | Boolean] = js.native
  def attach(domObject: domObject): Unit = js.native
}

object keystrokeHandler {
  @scala.inline
  def apply(
    attach: domObject => Unit,
    blockedKeystrokes: NumberDictionary[String | Boolean],
    keystrokes: NumberDictionary[String | Boolean]
  ): keystrokeHandler = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), blockedKeystrokes = blockedKeystrokes.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[keystrokeHandler]
  }
  @scala.inline
  implicit class keystrokeHandlerOps[Self <: keystrokeHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttach(value: domObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlockedKeystrokes(value: NumberDictionary[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockedKeystrokes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeystrokes(value: NumberDictionary[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

