package typingsSlinky.angularGrowlV2.mod.growl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Growl message with configuration.
  */
@js.native
trait IGrowlMessage extends IGrowlMessageConfig {
  var text: String = js.native
  /**
    * Destroy the message.
    */
  def destroy(): Unit = js.native
  /**
    * Update the message body.
    * @param newText new message body
    */
  def setText(newText: String): Unit = js.native
}

object IGrowlMessage {
  @scala.inline
  def apply(destroy: () => Unit, setText: String => Unit, text: String): IGrowlMessage = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setText = js.Any.fromFunction1(setText), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrowlMessage]
  }
  @scala.inline
  implicit class IGrowlMessageOps[Self <: IGrowlMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

