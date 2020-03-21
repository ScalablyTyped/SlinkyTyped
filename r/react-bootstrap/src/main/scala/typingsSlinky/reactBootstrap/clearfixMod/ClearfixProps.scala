package typingsSlinky.reactBootstrap.clearfixMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearfixProps
  extends AllHTMLAttributes[Clearfix]
     with ClassAttributes[Clearfix] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var visibleLgBlock: js.UndefOr[Boolean] = js.undefined
  var visibleMdBlock: js.UndefOr[Boolean] = js.undefined
  var visibleSmBlock: js.UndefOr[Boolean] = js.undefined
  var visibleXsBlock: js.UndefOr[Boolean] = js.undefined
}

object ClearfixProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Clearfix] = null,
    ClassAttributes: ClassAttributes[Clearfix] = null,
    bsClass: String = null,
    componentClass: ReactComponentClass[_] = null,
    visibleLgBlock: js.UndefOr[Boolean] = js.undefined,
    visibleMdBlock: js.UndefOr[Boolean] = js.undefined,
    visibleSmBlock: js.UndefOr[Boolean] = js.undefined,
    visibleXsBlock: js.UndefOr[Boolean] = js.undefined
  ): ClearfixProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleLgBlock)) __obj.updateDynamic("visibleLgBlock")(visibleLgBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleMdBlock)) __obj.updateDynamic("visibleMdBlock")(visibleMdBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleSmBlock)) __obj.updateDynamic("visibleSmBlock")(visibleSmBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleXsBlock)) __obj.updateDynamic("visibleXsBlock")(visibleXsBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearfixProps]
  }
}

