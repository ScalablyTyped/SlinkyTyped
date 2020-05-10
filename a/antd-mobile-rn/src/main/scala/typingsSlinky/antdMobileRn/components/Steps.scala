package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.horizontal
import typingsSlinky.antdMobileRn.antdMobileRnStrings.vertical
import typingsSlinky.antdMobileRn.stepsIndexNativeMod.StepsNativeProps
import typingsSlinky.antdMobileRn.stepsStyleIndexNativeMod.IStepsStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  @JSImport("antd-mobile-rn", "Steps")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Steps] {
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def finishIcon(value: String): this.type = set("finishIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: IStepsStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Steps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

