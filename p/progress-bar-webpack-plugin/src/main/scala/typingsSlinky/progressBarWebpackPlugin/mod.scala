package typingsSlinky.progressBarWebpackPlugin

import typingsSlinky.progress.mod.ProgressBarOptions
import typingsSlinky.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A progress bar plugin for Webpack.
    */
  @JSImport("progress-bar-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends ProgressBarOptions {
    
    /**
      * optional function to call when the progress bar completes
      */
    @JSName("callback")
    var callback_Options: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * function to display a custom summary
      * (passed build time)
      */
    var customSummary: js.UndefOr[js.Function1[/* summary */ String, Unit]] = js.native
    
    /**
      * the format of the progress bar
      * @default ':bar'
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * option to show summary of time taken
      * @default true
      */
    var summary: js.UndefOr[Boolean] = js.native
    
    /**
      * custom summary message if summary option is false
      */
    var summaryContent: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(total: Double): Options = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCustomSummary(value: /* summary */ String => Unit): Self = StObject.set(x, "customSummary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomSummaryUndefined: Self = StObject.set(x, "customSummary", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setSummary(value: Boolean): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryContent(value: Boolean): Self = StObject.set(x, "summaryContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryContentUndefined: Self = StObject.set(x, "summaryContent", js.undefined)
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  /**
    * A progress bar plugin for Webpack.
    */
  type ProgressBarPlugin = Plugin
}
