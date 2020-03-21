package typingsSlinky.reactBootstrap.tabContentMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContentProps
  extends AllHTMLAttributes[TabContent]
     with ClassAttributes[TabContent] {
  var animation: js.UndefOr[Boolean | ReactComponentClass[_]] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object TabContentProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[TabContent] = null,
    ClassAttributes: ClassAttributes[TabContent] = null,
    animation: Boolean | ReactComponentClass[_] = null,
    bsClass: String = null,
    componentClass: ReactComponentClass[_] = null,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): TabContentProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabContentProps]
  }
}

