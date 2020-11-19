package typingsSlinky.reactNativeAndroidTaskdescription.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeAndroidTaskdescription.mod.ReactNativeAndroidTaskDescriptionProps
import typingsSlinky.reactNativeAndroidTaskdescription.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeAndroidTaskdescription {
  
  @JSImport("react-native-android-taskdescription", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactNativeAndroidTaskDescriptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeAndroidTaskdescription.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
