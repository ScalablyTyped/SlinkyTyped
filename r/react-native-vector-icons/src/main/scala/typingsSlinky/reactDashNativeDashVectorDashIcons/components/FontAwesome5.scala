package typingsSlinky.reactDashNativeDashVectorDashIcons.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.FontAwesome5IconProps
import typingsSlinky.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble it yourself using js.Dynamic.literal(...) or similar */
object FontAwesome5
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNativeDashVectorDashIcons.fontAwesome5Mod.default].asInstanceOf[String | js.Object]
  def apply(props: FontAwesome5IconProps with js.Object, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = js.Object
}

