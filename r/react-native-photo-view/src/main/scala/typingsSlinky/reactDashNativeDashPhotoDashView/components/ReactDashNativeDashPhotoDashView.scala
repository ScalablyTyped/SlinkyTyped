package typingsSlinky.reactDashNativeDashPhotoDashView.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewProps
import typingsSlinky.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewMod.ReactNativePhotoViewProps
import typingsSlinky.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReactDashNativeDashPhotoDashView
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-photo-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ReactNativePhotoViewProps with ViewProps
}

