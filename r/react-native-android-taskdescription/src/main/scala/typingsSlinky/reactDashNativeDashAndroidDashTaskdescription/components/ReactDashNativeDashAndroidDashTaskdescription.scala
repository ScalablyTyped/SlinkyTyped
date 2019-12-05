package typingsSlinky.reactDashNativeDashAndroidDashTaskdescription.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashAndroidDashTaskdescription.reactDashNativeDashAndroidDashTaskdescriptionMod.ReactNativeAndroidTaskDescriptionProps
import typingsSlinky.reactDashNativeDashAndroidDashTaskdescription.reactDashNativeDashAndroidDashTaskdescriptionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashAndroidDashTaskdescription
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-android-taskdescription", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(backgroundColor: String = null, label: String = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ReactNativeAndroidTaskDescriptionProps
}

