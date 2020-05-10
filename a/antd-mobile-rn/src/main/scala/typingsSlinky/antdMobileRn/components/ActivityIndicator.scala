package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.activityIndicatorIndexNativeMod.ActivityIndicatorNativeProps
import typingsSlinky.antdMobileRn.antdMobileRnStrings.large
import typingsSlinky.antdMobileRn.antdMobileRnStrings.small
import typingsSlinky.antdMobileRn.styleIndexDotnativeMod.IActivityIndicatorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActivityIndicator {
  @JSImport("antd-mobile-rn", "ActivityIndicator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.ActivityIndicator] {
    @scala.inline
    def animating(value: Boolean): this.type = set("animating", value.asInstanceOf[js.Any])
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: large | small): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def styles(value: IActivityIndicatorStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def toast(value: Boolean): this.type = set("toast", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActivityIndicatorNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ActivityIndicator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

