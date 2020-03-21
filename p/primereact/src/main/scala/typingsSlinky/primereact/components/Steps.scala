package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonIndexItem
import typingsSlinky.primereact.menuItemMod.MenuItem
import typingsSlinky.primereact.stepsMod.StepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactStepsMod.Steps] {
  @JSImport("primereact/steps", "Steps")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id, readOnly */
  def apply(
    model: js.Array[MenuItem],
    activeIndex: Int | Double = null,
    onSelect: /* e */ AnonIndexItem => Unit = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactStepsMod.Steps] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepsProps
}

