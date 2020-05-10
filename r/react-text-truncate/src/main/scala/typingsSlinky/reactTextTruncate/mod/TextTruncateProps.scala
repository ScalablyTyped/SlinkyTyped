package typingsSlinky.reactTextTruncate.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTruncateProps extends js.Object {
  var containerClassName: js.UndefOr[String] = js.native
  var element: js.UndefOr[String] = js.native
  var line: js.UndefOr[Double | Boolean] = js.native
  var maxCalculateTimes: js.UndefOr[Double] = js.native
  var onCalculated: js.UndefOr[js.Function0[Unit]] = js.native
  var onToggled: js.UndefOr[js.Function1[/* truncated */ Boolean, Unit]] = js.native
  var onTruncated: js.UndefOr[js.Function0[Unit]] = js.native
  var text: js.UndefOr[String] = js.native
  var textElement: js.UndefOr[TagMod[Any]] = js.native
  var textTruncateChild: js.UndefOr[TagMod[Any]] = js.native
  var truncateText: js.UndefOr[String] = js.native
}

object TextTruncateProps {
  @scala.inline
  def apply(): TextTruncateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTruncateProps]
  }
  @scala.inline
  implicit class TextTruncatePropsOps[Self <: TextTruncateProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCalculateTimes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCalculateTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCalculateTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCalculateTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCalculated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCalculated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnCalculated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCalculated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggled(value: /* truncated */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTruncated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTruncated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTruncated")(js.undefined)
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
    @scala.inline
    def withTextElementReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextElement(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTextTruncateChildReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTruncateChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextTruncateChild(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTruncateChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextTruncateChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textTruncateChild")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncateText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncateText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncateText")(js.undefined)
        ret
    }
  }
  
}

