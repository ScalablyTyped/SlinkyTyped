package typingsSlinky.reactBootstrap.navbarMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarFormProps
  extends AllHTMLAttributes[NavbarForm]
     with ClassAttributes[NavbarForm] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var pullLeft: js.UndefOr[Boolean] = js.undefined
  var pullRight: js.UndefOr[Boolean] = js.undefined
}

object NavbarFormProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[NavbarForm] = null,
    ClassAttributes: ClassAttributes[NavbarForm] = null,
    componentClass: ReactComponentClass[_] = null,
    pullLeft: js.UndefOr[Boolean] = js.undefined,
    pullRight: js.UndefOr[Boolean] = js.undefined
  ): NavbarFormProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(pullLeft)) __obj.updateDynamic("pullLeft")(pullLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarFormProps]
  }
}

