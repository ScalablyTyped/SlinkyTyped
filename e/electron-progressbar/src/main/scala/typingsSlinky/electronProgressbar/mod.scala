package typingsSlinky.electronProgressbar

import typingsSlinky.electron.Electron.App
import typingsSlinky.electron.Electron.BrowserWindowConstructorOptions
import typingsSlinky.electronProgressbar.electronProgressbarStrings.aborted
import typingsSlinky.electronProgressbar.electronProgressbarStrings.completed
import typingsSlinky.electronProgressbar.electronProgressbarStrings.progress
import typingsSlinky.electronProgressbar.electronProgressbarStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-progressbar", JSImport.Namespace)
  @js.native
  class ^ protected () extends ProgressBar {
    def this(options: ProgressBarOptions) = this()
    def this(options: ProgressBarOptions, electronApp: App) = this()
  }
  
  @js.native
  trait ProgressBar extends StObject {
    
    def close(): Unit = js.native
    
    var detail: String = js.native
    
    def getOptions(): ProgressBarOptions = js.native
    
    def isCompleted(): Boolean = js.native
    
    def isInProgress(): Boolean = js.native
    
    @JSName("on")
    def on_aborted(eventName: aborted, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_completed(eventName: completed, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_progress(eventName: progress, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_ready(eventName: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def setCompleted(): Unit = js.native
    
    var text: String = js.native
    
    var value: Double = js.native
  }
  
  @js.native
  trait ProgressBarOptions extends StObject {
    
    var abortOnError: js.UndefOr[Boolean] = js.native
    
    var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.native
    
    var closeOnComplete: js.UndefOr[Boolean] = js.native
    
    var detail: js.UndefOr[String] = js.native
    
    var indeterminate: js.UndefOr[Boolean] = js.native
    
    var initialValue: js.UndefOr[Double] = js.native
    
    var maxValue: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[StyleOptions] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object ProgressBarOptions {
    
    @scala.inline
    def apply(): ProgressBarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressBarOptions]
    }
    
    @scala.inline
    implicit class ProgressBarOptionsMutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortOnError(value: Boolean): Self = StObject.set(x, "abortOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortOnErrorUndefined: Self = StObject.set(x, "abortOnError", js.undefined)
      
      @scala.inline
      def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "browserWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserWindowUndefined: Self = StObject.set(x, "browserWindow", js.undefined)
      
      @scala.inline
      def setCloseOnComplete(value: Boolean): Self = StObject.set(x, "closeOnComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnCompleteUndefined: Self = StObject.set(x, "closeOnComplete", js.undefined)
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      @scala.inline
      def setInitialValue(value: Double): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait StyleOptions extends StObject {
    
    var bar: js.UndefOr[js.Object] = js.native
    
    var detail: js.UndefOr[js.Object] = js.native
    
    var text: js.UndefOr[js.Object] = js.native
    
    var value: js.UndefOr[js.Object] = js.native
  }
  object StyleOptions {
    
    @scala.inline
    def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    @scala.inline
    implicit class StyleOptionsMutableBuilder[Self <: StyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBar(value: js.Object): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
      
      @scala.inline
      def setDetail(value: js.Object): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setText(value: js.Object): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
