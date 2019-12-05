package typingsSlinky.reactDashShowDashMore.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashShowDashMore.reactDashShowDashMoreMod.ReactShowMoreProps
import typingsSlinky.reactDashShowDashMore.reactDashShowDashMoreMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashShowDashMore
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-show-more", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    anchorClass: String = null,
    less: String = null,
    lines: Int | Double = null,
    more: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (anchorClass != null) __obj.updateDynamic("anchorClass")(anchorClass.asInstanceOf[js.Any])
    if (less != null) __obj.updateDynamic("less")(less.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (more != null) __obj.updateDynamic("more")(more.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactShowMoreProps
}

