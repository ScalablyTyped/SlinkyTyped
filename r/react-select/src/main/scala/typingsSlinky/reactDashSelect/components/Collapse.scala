package typingsSlinky.reactDashSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSelect.srcAnimatedTransitionsMod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSelect.srcAnimatedTransitionsMod.Collapse] {
  @JSImport("react-select/src/animated/transitions", "Collapse")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(in: Boolean, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashSelect.srcAnimatedTransitionsMod.Collapse] = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CollapseProps
}

