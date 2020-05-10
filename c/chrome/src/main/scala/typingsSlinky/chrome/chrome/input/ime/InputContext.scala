package typingsSlinky.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputContext extends js.Object {
  /**
    * Whether the text field wants auto-complete.
    * @since Chrome 40.
    */
  var autoComplete: Boolean = js.native
  /**
    * Whether the text field wants auto-correct.
    * @since Chrome 40.
    */
  var autoCorrect: Boolean = js.native
  /** This is used to specify targets of text field operations. This ID becomes invalid as soon as onBlur is called. */
  var contextID: Double = js.native
  /**
    * Whether the text field wants spell-check.
    * @since Chrome 40.
    */
  var spellCheck: Boolean = js.native
  /** Type of value this text field edits, (Text, Number, URL, etc) */
  var `type`: String = js.native
}

object InputContext {
  @scala.inline
  def apply(
    autoComplete: Boolean,
    autoCorrect: Boolean,
    contextID: Double,
    spellCheck: Boolean,
    `type`: String
  ): InputContext = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], autoCorrect = autoCorrect.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any], spellCheck = spellCheck.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContext]
  }
  @scala.inline
  implicit class InputContextOps[Self <: InputContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpellCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

