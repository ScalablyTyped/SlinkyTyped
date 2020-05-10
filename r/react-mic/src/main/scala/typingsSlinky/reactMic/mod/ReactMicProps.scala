package typingsSlinky.reactMic.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.reactMic.reactMicStrings.frequencyBars
import typingsSlinky.reactMic.reactMicStrings.sinewave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactMicProps extends js.Object {
  /** Background color */
  var backgroundColor: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  /** Callback that is executed when chunk of audio is available */
  var onData: js.UndefOr[js.Function1[/* recordedData */ Blob, Unit]] = js.native
  /** Callback that is executed when audio stops recording */
  var onStop: js.UndefOr[js.Function1[/* recordedData */ ReactMicStopEvent, Unit]] = js.native
  /** Available in React-Mic-Plus upgrade only */
  var pause: js.UndefOr[Boolean] = js.native
  /** Set to true to begin recording */
  var record: js.UndefOr[Boolean] = js.native
  /** Sound wave color */
  var strokeColor: js.UndefOr[String] = js.native
  var visualSetting: js.UndefOr[sinewave | frequencyBars] = js.native
}

object ReactMicProps {
  @scala.inline
  def apply(): ReactMicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactMicProps]
  }
  @scala.inline
  implicit class ReactMicPropsOps[Self <: ReactMicProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withOnData(value: /* recordedData */ Blob => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: /* recordedData */ ReactMicStopEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withRecord(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualSetting(value: sinewave | frequencyBars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualSetting")(js.undefined)
        ret
    }
  }
  
}

