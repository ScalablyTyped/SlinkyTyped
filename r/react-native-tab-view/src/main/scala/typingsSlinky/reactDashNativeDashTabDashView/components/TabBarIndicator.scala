package typingsSlinky.reactDashNativeDashTabDashView.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTabBarIndicatorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashTabDashView), Name(libTypescriptSrcTabBarIndicatorMod), Name(Props))) was not a @ScalaJSDefined trait */
object TabBarIndicator
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-tab-view/lib/typescript/src/TabBarIndicator", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.reactDashNativeDashTabDashView.libTypescriptSrcTabBarIndicatorMod.Props[js.Any]
}

