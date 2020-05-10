package typingsSlinky.actionsOnGoogle.simpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleResponseOptions extends js.Object {
  /**
    * Speech to be spoken to user. SSML allowed.
    * @public
    */
  var speech: String = js.native
  /**
    * Optional text to be shown to user
    * @public
    */
  var text: js.UndefOr[String] = js.native
}

object SimpleResponseOptions {
  @scala.inline
  def apply(speech: String): SimpleResponseOptions = {
    val __obj = js.Dynamic.literal(speech = speech.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleResponseOptions]
  }
  @scala.inline
  implicit class SimpleResponseOptionsOps[Self <: SimpleResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpeech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

