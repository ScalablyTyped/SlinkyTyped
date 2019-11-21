package typingsSlinky.reactDashNativeDashGestureDashHandler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.NativeViewGestureHandlerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble it yourself using js.Dynamic.literal(...) or similar */
object DrawerLayoutAndroid
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.DrawerLayoutAndroid
    ] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.DrawerLayoutAndroid].asInstanceOf[String | js.Object]
  def apply(
    props: NativeViewGestureHandlerProperties with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DrawerLayoutAndroidProperties */ js.Any) with js.Object,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.DrawerLayoutAndroid
  ] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = js.Object
}

