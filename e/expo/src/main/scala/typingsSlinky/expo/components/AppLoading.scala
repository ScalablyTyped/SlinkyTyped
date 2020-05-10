package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expo.appLoadingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppLoading {
  object AnonAutoHideSplash {
    @JSImport("expo/build/launch/AppLoading", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      @scala.inline
      def autoHideSplash(value: Boolean): this.type = set("autoHideSplash", value.asInstanceOf[js.Any])
      @scala.inline
      def onError(value: /* error */ js.Error => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      @scala.inline
      def onFinish(value: () => Unit): this.type = set("onFinish", js.Any.fromFunction0(value))
      @scala.inline
      def startAsync(value: () => js.Promise[Unit]): this.type = set("startAsync", js.Any.fromFunction0(value))
    }
    
    def withProps(p: typingsSlinky.expo.AnonAutoHideSplash): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: AnonAutoHideSplash.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object AnonOnError {
    @JSImport("expo/build/launch/AppLoading", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps(p: typingsSlinky.expo.AnonOnError): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(onError: Null, onFinish: Null, startAsync: Null): Default[tag.type, default] = {
        val __props = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
        new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[typingsSlinky.expo.AnonOnError]))
    }
  }
  
}

