package typingsSlinky.reactBootstrap.modalFooterMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalFooterProps
  extends AllHTMLAttributes[ModalFooter]
     with ClassAttributes[ModalFooter] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object ModalFooterProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ModalFooter] = null,
    ClassAttributes: ClassAttributes[ModalFooter] = null,
    bsClass: String = null,
    componentClass: ReactComponentClass[_] = null
  ): ModalFooterProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFooterProps]
  }
}

