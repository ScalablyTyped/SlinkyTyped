package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.expo.appLoadingNativeWrapperMod.Props
import typingsSlinky.expo.appLoadingNativeWrapperMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppLoadingNativeWrapper {
  @JSImport("expo/build/launch/AppLoadingNativeWrapper", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoHideSplash(value: Boolean): this.type = set("autoHideSplash", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AppLoadingNativeWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

