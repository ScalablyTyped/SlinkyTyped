package typingsSlinky.reactInstantsearchDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceSearchHelperParams extends js.Object {
  var language: js.UndefOr[String] = js.native
  var searchAsYouSpeak: Boolean = js.native
  def onQueryChange(query: String): Unit = js.native
  def onStateChange(): Unit = js.native
}

object VoiceSearchHelperParams {
  @scala.inline
  def apply(onQueryChange: String => Unit, onStateChange: () => Unit, searchAsYouSpeak: Boolean): VoiceSearchHelperParams = {
    val __obj = js.Dynamic.literal(onQueryChange = js.Any.fromFunction1(onQueryChange), onStateChange = js.Any.fromFunction0(onStateChange), searchAsYouSpeak = searchAsYouSpeak.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSearchHelperParams]
  }
  @scala.inline
  implicit class VoiceSearchHelperParamsOps[Self <: VoiceSearchHelperParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnQueryChange(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onQueryChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnStateChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearchAsYouSpeak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchAsYouSpeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

