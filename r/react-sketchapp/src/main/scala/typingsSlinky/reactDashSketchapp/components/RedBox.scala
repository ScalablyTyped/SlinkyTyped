package typingsSlinky.reactDashSketchapp.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashSketchapp.reactDashSketchappMod.RedBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RedBox
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashSketchapp.reactDashSketchappMod.RedBox] {
  @JSImport("react-sketchapp", "RedBox")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(error: js.Error, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashSketchapp.reactDashSketchappMod.RedBox] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RedBoxProps
}

