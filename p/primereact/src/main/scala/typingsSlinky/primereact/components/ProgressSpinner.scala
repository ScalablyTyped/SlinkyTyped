package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsProgressspinnerProgressSpinnerMod.ProgressSpinnerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressSpinner
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.progressspinnerMod.ProgressSpinner] {
  @JSImport("primereact/progressspinner", "ProgressSpinner")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    animationDuration: String = null,
    fill: String = null,
    strokeWidth: String = null,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.progressspinnerMod.ProgressSpinner] = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.progressspinnerMod.ProgressSpinner] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.progressspinnerMod.ProgressSpinner](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ProgressSpinnerProps
}

