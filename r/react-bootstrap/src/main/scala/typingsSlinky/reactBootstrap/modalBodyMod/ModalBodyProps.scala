package typingsSlinky.reactBootstrap.modalBodyMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBodyProps
  extends AllHTMLAttributes[ModalBody]
     with ClassAttributes[ModalBody] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object ModalBodyProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ModalBody] = null,
    ClassAttributes: ClassAttributes[ModalBody] = null,
    bsClass: String = null,
    componentClass: ReactComponentClass[_] = null
  ): ModalBodyProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalBodyProps]
  }
}

