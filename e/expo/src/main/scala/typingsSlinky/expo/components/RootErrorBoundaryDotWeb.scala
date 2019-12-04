package typingsSlinky.expo.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expo.buildLaunchRootErrorBoundaryDotWebMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RootErrorBoundaryDotWeb
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.expo.buildLaunchRootErrorBoundaryDotWebMod.Props
}

