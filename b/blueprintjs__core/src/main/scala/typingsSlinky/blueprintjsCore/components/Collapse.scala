package typingsSlinky.blueprintjsCore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.blueprintjsCore.collapseMod.ICollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.blueprintjsCore.mod.Collapse] {
  @JSImport("@blueprintjs/core", "Collapse")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    component: ReactComponentClass[_] = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    keepChildrenMounted: js.UndefOr[Boolean] = js.undefined,
    transitionDuration: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Collapse] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(keepChildrenMounted)) __obj.updateDynamic("keepChildrenMounted")(keepChildrenMounted.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Collapse] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.blueprintjsCore.mod.Collapse](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ICollapseProps
}

