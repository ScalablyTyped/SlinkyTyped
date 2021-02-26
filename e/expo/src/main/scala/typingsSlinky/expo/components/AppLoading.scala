package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppLoading {
  
  object AutoHideSplash {
    
    @JSImport("expo", "AppLoading")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, typingsSlinky.expo.mod.AppLoading] {
      
      @scala.inline
      def autoHideSplash(value: Boolean): this.type = set("autoHideSplash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def onError(value: /* error */ js.Error => Unit): this.type = set("onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def onFinish(value: () => Unit): this.type = set("onFinish", js.Any.fromFunction0(value))
      
      @scala.inline
      def startAsync(value: () => js.Promise[Unit]): this.type = set("startAsync", js.Any.fromFunction0(value))
    }
    
    implicit def make(companion: AutoHideSplash.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsSlinky.expo.anon.AutoHideSplash): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object OnError {
    
    @scala.inline
    def apply(onError: Null, onFinish: Null, startAsync: Null): Default[tag.type, typingsSlinky.expo.mod.AppLoading] = {
      val __props = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
      new Default[tag.type, typingsSlinky.expo.mod.AppLoading](js.Array(this.component, __props.asInstanceOf[typingsSlinky.expo.anon.OnError]))
    }
    
    @JSImport("expo", "AppLoading")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsSlinky.expo.anon.OnError): Default[tag.type, typingsSlinky.expo.mod.AppLoading] = new Default[tag.type, typingsSlinky.expo.mod.AppLoading](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
