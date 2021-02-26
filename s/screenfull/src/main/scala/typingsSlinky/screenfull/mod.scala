package typingsSlinky.screenfull

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.screenfull.anon.IsEnabled
import typingsSlinky.screenfull.screenfullBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("screenfull", JSImport.Namespace)
  @js.native
  val ^ : Screenfull | IsEnabled = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.screenfull.screenfullStrings.change
    - typingsSlinky.screenfull.screenfullStrings.error
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def change: typingsSlinky.screenfull.screenfullStrings.change = "change".asInstanceOf[typingsSlinky.screenfull.screenfullStrings.change]
    
    @scala.inline
    def error: typingsSlinky.screenfull.screenfullStrings.error = "error".asInstanceOf[typingsSlinky.screenfull.screenfullStrings.error]
  }
  
  @js.native
  trait RawEventNames extends StObject {
    
    val exitFullscreen: String = js.native
    
    val fullscreenElement: String = js.native
    
    val fullscreenEnabled: String = js.native
    
    val fullscreenchange: String = js.native
    
    val fullscreenerror: String = js.native
    
    val requestFullscreen: String = js.native
  }
  object RawEventNames {
    
    @scala.inline
    def apply(
      exitFullscreen: String,
      fullscreenElement: String,
      fullscreenEnabled: String,
      fullscreenchange: String,
      fullscreenerror: String,
      requestFullscreen: String
    ): RawEventNames = {
      val __obj = js.Dynamic.literal(exitFullscreen = exitFullscreen.asInstanceOf[js.Any], fullscreenElement = fullscreenElement.asInstanceOf[js.Any], fullscreenEnabled = fullscreenEnabled.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], requestFullscreen = requestFullscreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawEventNames]
    }
    
    @scala.inline
    implicit class RawEventNamesMutableBuilder[Self <: RawEventNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExitFullscreen(value: String): Self = StObject.set(x, "exitFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenElement(value: String): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenEnabled(value: String): Self = StObject.set(x, "fullscreenEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenchange(value: String): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenerror(value: String): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestFullscreen(value: String): Self = StObject.set(x, "requestFullscreen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Screenfull extends StObject {
    
    /**
    		The element currently in fullscreen, otherwise `null`.
    		*/
    val element: Element | Null = js.native
    
    /**
    		Brings you out of fullscreen.
    		@returns A promise that resolves after the element exits fullscreen.
    		*/
    def exit(): js.Promise[Unit] = js.native
    
    /**
    		Whether you are allowed to enter fullscreen. If your page is inside an `<iframe>` you will need to add a `allowfullscreen` attribute (+ `webkitallowfullscreen` and `mozallowfullscreen`).
    		@example
    		```
    		if (screenfull.isEnabled) {
    			screenfull.request();
    		}
    		```
    		*/
    val isEnabled: `true` = js.native
    
    /**
    		Whether fullscreen is active.
    		*/
    val isFullscreen: Boolean = js.native
    
    /**
    		Remove a previously registered event listener.
    		@example
    		```
    		screenfull.off('change', callback);
    		```
    		*/
    def off(name: EventName, handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
    
    /**
    		Add a listener for when the browser switches in and out of fullscreen or when there is an error.
    		@example
    		```
    		// Detect fullscreen change
    		if (screenfull.isEnabled) {
    			screenfull.on('change', () => {
    				console.log('Am I fullscreen?', screenfull.isFullscreen ? 'Yes' : 'No');
    			});
    		}
    		// Detect fullscreen error
    		if (screenfull.isEnabled) {
    			screenfull.on('error', event => {
    				console.error('Failed to enable fullscreen', event);
    			});
    		}
    		```
    		*/
    def on(name: EventName, handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
    
    /**
    		Alias for `.on('change', function)`.
    		*/
    def onchange(handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
    
    /**
    		Alias for `.on('error', function)`.
    		*/
    def onerror(handler: js.Function1[/* event */ Event, Unit]): Unit = js.native
    
    /**
    		Exposes the raw properties (prefixed if needed) used internally.
    		*/
    var raw: RawEventNames = js.native
    
    /**
    		Make an element fullscreen.
    		If your page is inside an `<iframe>` you will need to add a `allowfullscreen` attribute (+ `webkitallowfullscreen` and `mozallowfullscreen`).
    		Keep in mind that the browser will only enter fullscreen when initiated by user events like click, touch, key.
    		@param element - Default is `<html>`. If called with another element than the currently active, it will switch to that if it's a decendant.
    		@returns A promise that resolves after the element enters fullscreen.
    		@example
    		```
    		// Fullscreen the page
    		document.getElementById('button').addEventListener('click', () => {
    			if (screenfull.isEnabled) {
    				screenfull.request();
    			} else {
    				// Ignore or do something else
    			}
    		});
    		// Fullscreen an element
    		const element = document.getElementById('target');
    		document.getElementById('button').addEventListener('click', () => {
    			if (screenfull.isEnabled) {
    				screenfull.request(element);
    			}
    		});
    		// Fullscreen an element with jQuery
    		const element = $('#target')[0]; // Get DOM element from jQuery collection
    		$('#button').on('click', () => {
    			if (screenfull.isEnabled) {
    				screenfull.request(element);
    			}
    		});
    		```
    		*/
    def request(): js.Promise[Unit] = js.native
    def request(element: Element): js.Promise[Unit] = js.native
    
    /**
    		Requests fullscreen if not active, otherwise exits.
    		@returns A promise that resolves after the element enters/exits fullscreen.
    		@example
    		```
    		// Toggle fullscreen on a image with jQuery
    		$('img').on('click', event => {
    			if (screenfull.isEnabled) {
    				screenfull.toggle(event.target);
    			}
    		});
    		```
    		*/
    def toggle(): js.Promise[Unit] = js.native
    def toggle(element: Element): js.Promise[Unit] = js.native
  }
  
  type _To = Screenfull | IsEnabled
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Screenfull | IsEnabled = ^
}
