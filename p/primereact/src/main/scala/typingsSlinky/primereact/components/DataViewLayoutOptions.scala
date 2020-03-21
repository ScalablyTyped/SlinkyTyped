package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonValueString
import typingsSlinky.primereact.dataViewMod.DataViewLayoutOptionsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DataViewLayoutOptions
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactDataviewMod.DataViewLayoutOptions] {
  @JSImport("primereact/dataview", "DataViewLayoutOptions")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    onChange: AnonValueString => Unit,
    layout: String = null,
    style: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactDataviewMod.DataViewLayoutOptions] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DataViewLayoutOptionsProps
}

