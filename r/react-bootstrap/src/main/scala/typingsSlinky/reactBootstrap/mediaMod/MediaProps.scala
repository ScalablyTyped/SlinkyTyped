package typingsSlinky.reactBootstrap.mediaMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaProps
  extends AllHTMLAttributes[Media]
     with ClassAttributes[Media] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.native
}

object MediaProps {
  @scala.inline
  def apply(): MediaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaProps]
  }
  @scala.inline
  implicit class MediaPropsOps[Self <: MediaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentClassComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(js.undefined)
        ret
    }
  }
  
}

