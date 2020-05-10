package typingsSlinky.reactBootstrap.modalBodyMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalBodyProps
  extends AllHTMLAttributes[ModalBody]
     with ClassAttributes[ModalBody] {
  var bsClass: js.UndefOr[String] = js.native
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.native
}

object ModalBodyProps {
  @scala.inline
  def apply(): ModalBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalBodyProps]
  }
  @scala.inline
  implicit class ModalBodyPropsOps[Self <: ModalBodyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
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

