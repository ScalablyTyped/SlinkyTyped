package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SpeechContext. */
@js.native
trait ISpeechContext extends js.Object {
  /** SpeechContext boost */
  var boost: js.UndefOr[Double | Null] = js.native
  /** SpeechContext phrases */
  var phrases: js.UndefOr[js.Array[String] | Null] = js.native
}

object ISpeechContext {
  @scala.inline
  def apply(): ISpeechContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpeechContext]
  }
  @scala.inline
  implicit class ISpeechContextOps[Self <: ISpeechContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(js.undefined)
        ret
    }
    @scala.inline
    def withBoostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(null)
        ret
    }
    @scala.inline
    def withPhrases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhrases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(js.undefined)
        ret
    }
    @scala.inline
    def withPhrasesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phrases")(null)
        ret
    }
  }
  
}

