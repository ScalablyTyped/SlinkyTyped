package typingsSlinky.reactDashStickynode.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashStickynode.reactDashStickynodeMod.Status
import typingsSlinky.reactDashStickynode.reactDashStickynodeMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashStickynode
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-stickynode", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    activeClass: String = null,
    bottomBoundary: Double | String = null,
    enableTransforms: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    innerZ: Double | String = null,
    onStateChange: /* status */ Status => Unit = null,
    releasedClass: String = null,
    shouldFreeze: () => Boolean = null,
    top: Double | String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (bottomBoundary != null) __obj.updateDynamic("bottomBoundary")(bottomBoundary.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransforms)) __obj.updateDynamic("enableTransforms")(enableTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (innerZ != null) __obj.updateDynamic("innerZ")(innerZ.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (releasedClass != null) __obj.updateDynamic("releasedClass")(releasedClass.asInstanceOf[js.Any])
    if (shouldFreeze != null) __obj.updateDynamic("shouldFreeze")(js.Any.fromFunction0(shouldFreeze))
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ^] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashStickynode.reactDashStickynodeMod.^](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactDashStickynode.reactDashStickynodeMod.Props
}

