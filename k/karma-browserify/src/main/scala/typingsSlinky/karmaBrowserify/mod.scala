package typingsSlinky.karmaBrowserify

import typingsSlinky.browserify.mod.BrowserifyObject
import typingsSlinky.browserify.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait BrowserifyOptions extends Options {
    
    /**
      * You may perform additional configuration in a function passed as the configure option
      * and that receives the browserify instance as an argument.
      * See {@link https://github.com/nikku/karma-browserify#additional-bundle-configuration}
      */
    var configure: js.UndefOr[js.Function1[/* bundle */ BrowserifyObject, Unit]] = js.native
  }
  object BrowserifyOptions {
    
    @scala.inline
    def apply(): BrowserifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserifyOptions]
    }
    
    @scala.inline
    implicit class BrowserifyOptionsMutableBuilder[Self <: BrowserifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigure(value: /* bundle */ BrowserifyObject => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    }
  }
  
  @js.native
  trait ConfigOptions extends StObject {
    
    /**
      * Config entry to configure how the bundle gets created
      * see {@link https://github.com/nikku/karma-browserify#usage}
      */
    var browserify: js.UndefOr[BrowserifyOptions] = js.native
    
    /**
      * You can configure the underlying watchify instance
      * see {@link https://github.com/nikku/karma-browserify#watchify-config}
      */
    var watchify: js.UndefOr[WatchifyOptions] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserify(value: BrowserifyOptions): Self = StObject.set(x, "browserify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserifyUndefined: Self = StObject.set(x, "browserify", js.undefined)
      
      @scala.inline
      def setWatchify(value: WatchifyOptions): Self = StObject.set(x, "watchify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchifyUndefined: Self = StObject.set(x, "watchify", js.undefined)
    }
  }
  
  type WatchifyOptions = typingsSlinky.watchify.mod.Options
}
