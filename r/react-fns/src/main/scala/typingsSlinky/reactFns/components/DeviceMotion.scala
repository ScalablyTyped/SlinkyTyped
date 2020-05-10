package typingsSlinky.reactFns.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DeviceMotion {
  @JSImport("react-fns", "DeviceMotion")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFns.mod.DeviceMotion] {
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[DeviceMotionProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[DeviceMotionProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[DeviceMotionProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def render(value: DeviceMotionProps => TagMod[Any]): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps(p: SharedRenderProps[DeviceMotionProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DeviceMotion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

