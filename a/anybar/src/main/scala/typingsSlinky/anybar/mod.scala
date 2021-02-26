package typingsSlinky.anybar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Control the [AnyBar app](https://github.com/tonsky/AnyBar).
  @param status - [Name](https://github.com/tonsky/AnyBar#usage) of the color dot you want AnyBar.app to display.
  @returns Returns a promise, but AnyBar.app doesn't send back a reply, so really the only point of waiting for the promise to resolve is in case of an obscure DNS error.
  @example
  ```
  import anybar = require('anybar');
  anybar('purple');
  // The Anybar.app menubar icon turned purple
  ```
  */
  @JSImport("anybar", JSImport.Namespace)
  @js.native
  def apply(status: AnybarStatus): js.Promise[Unit] = js.native
  @JSImport("anybar", JSImport.Namespace)
  @js.native
  def apply(status: AnybarStatus, options: Options): js.Promise[Unit] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.anybar.anybarStrings.white
    - typingsSlinky.anybar.anybarStrings.red
    - typingsSlinky.anybar.anybarStrings.orange
    - typingsSlinky.anybar.anybarStrings.yellow
    - typingsSlinky.anybar.anybarStrings.green
    - typingsSlinky.anybar.anybarStrings.cyan
    - typingsSlinky.anybar.anybarStrings.blue
    - typingsSlinky.anybar.anybarStrings.purple
    - typingsSlinky.anybar.anybarStrings.black
    - typingsSlinky.anybar.anybarStrings.question
    - typingsSlinky.anybar.anybarStrings.exclamation
    - typingsSlinky.anybar.anybarStrings.quit
  */
  trait AnybarStatus extends StObject
  object AnybarStatus {
    
    @scala.inline
    def black: typingsSlinky.anybar.anybarStrings.black = "black".asInstanceOf[typingsSlinky.anybar.anybarStrings.black]
    
    @scala.inline
    def blue: typingsSlinky.anybar.anybarStrings.blue = "blue".asInstanceOf[typingsSlinky.anybar.anybarStrings.blue]
    
    @scala.inline
    def cyan: typingsSlinky.anybar.anybarStrings.cyan = "cyan".asInstanceOf[typingsSlinky.anybar.anybarStrings.cyan]
    
    @scala.inline
    def exclamation: typingsSlinky.anybar.anybarStrings.exclamation = "exclamation".asInstanceOf[typingsSlinky.anybar.anybarStrings.exclamation]
    
    @scala.inline
    def green: typingsSlinky.anybar.anybarStrings.green = "green".asInstanceOf[typingsSlinky.anybar.anybarStrings.green]
    
    @scala.inline
    def orange: typingsSlinky.anybar.anybarStrings.orange = "orange".asInstanceOf[typingsSlinky.anybar.anybarStrings.orange]
    
    @scala.inline
    def purple: typingsSlinky.anybar.anybarStrings.purple = "purple".asInstanceOf[typingsSlinky.anybar.anybarStrings.purple]
    
    @scala.inline
    def question: typingsSlinky.anybar.anybarStrings.question = "question".asInstanceOf[typingsSlinky.anybar.anybarStrings.question]
    
    @scala.inline
    def quit: typingsSlinky.anybar.anybarStrings.quit = "quit".asInstanceOf[typingsSlinky.anybar.anybarStrings.quit]
    
    @scala.inline
    def red: typingsSlinky.anybar.anybarStrings.red = "red".asInstanceOf[typingsSlinky.anybar.anybarStrings.red]
    
    @scala.inline
    def white: typingsSlinky.anybar.anybarStrings.white = "white".asInstanceOf[typingsSlinky.anybar.anybarStrings.white]
    
    @scala.inline
    def yellow: typingsSlinky.anybar.anybarStrings.yellow = "yellow".asInstanceOf[typingsSlinky.anybar.anybarStrings.yellow]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Port to communicate with the AnyBar.app.
    		@default 1738
    		*/
    var port: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
