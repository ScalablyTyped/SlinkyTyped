package typingsSlinky.reactFns.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeviceOrientation {
  
  @JSImport("react-fns", "DeviceOrientation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFns.mod.DeviceOrientation] {
    
    @scala.inline
    def children(value: (js.Function1[DeviceOrientationProps, ReactElement]) | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: DeviceOrientationProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def component(value: ReactComponentClass[DeviceOrientationProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[DeviceOrientationProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[DeviceOrientationProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def render(value: DeviceOrientationProps => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: DeviceOrientation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SharedRenderProps[DeviceOrientationProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
