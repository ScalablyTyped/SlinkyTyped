package typingsSlinky.nteractTransformVdom

import typingsSlinky.nteractTransformVdom.eventToObjectMod.SerializedEvent
import typingsSlinky.nteractTransformVdom.nteractTransformVdomStrings.applicationSlashvdomDotv1Plussignjson
import typingsSlinky.nteractTransformVdom.objectToReactMod.VDOMEl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nteract/transform-vdom.@nteract/transform-vdom.Props> */
@js.native
trait PartialProps extends js.Object {
  var data: js.UndefOr[VDOMEl] = js.native
  var mediaType: js.UndefOr[applicationSlashvdomDotv1Plussignjson] = js.native
  var onVDOMEvent: js.UndefOr[js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]] = js.native
}

object PartialProps {
  @scala.inline
  def apply(): PartialProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProps]
  }
  @scala.inline
  implicit class PartialPropsOps[Self <: PartialProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: VDOMEl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: applicationSlashvdomDotv1Plussignjson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVDOMEvent(value: (/* targetName */ String, /* event */ SerializedEvent[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVDOMEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnVDOMEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVDOMEvent")(js.undefined)
        ret
    }
  }
  
}

