package typingsSlinky.reactNativeKeepAwake.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeKeepAwake.anon.Children
import typingsSlinky.reactNativeKeepAwake.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeKeepAwake {
  
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def children(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeKeepAwake.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
