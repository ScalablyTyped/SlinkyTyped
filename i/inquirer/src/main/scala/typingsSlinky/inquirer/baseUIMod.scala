package typingsSlinky.inquirer

import typingsSlinky.inquirer.mod.StreamOptions
import typingsSlinky.inquirer.mod.prompts.PromptBase
import typingsSlinky.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseUIMod {
  
  /**
    * Represents a ui.
    */
  @JSImport("inquirer/lib/ui/baseUI", JSImport.Namespace)
  @js.native
  /**
    * Initializes a new instance of the `UI` class.
    *
    * @param options
    * The input- and output-stream of the ui.
    */
  class ^ () extends UI {
    def this(options: StreamOptions) = this()
  }
  
  /**
    * Represents a ui.
    */
  @js.native
  trait UI extends StObject {
    
    /**
      * Gets or sets the currently active prompt.
      */
    var activePrompt: PromptBase = js.native
    
    /**
      * Releases all unmanaged resources.
      */
    /* protected */ def close(): Unit = js.native
    
    /**
      * Handles a forced exit of the application.
      */
    /* protected */ def onForceClose(): Unit = js.native
    
    /**
      * Gets or sets an object for performing read from and write to the console.
      */
    var rl: Interface = js.native
  }
  object UI {
    
    @scala.inline
    def apply(activePrompt: PromptBase, close: () => Unit, onForceClose: () => Unit, rl: Interface): UI = {
      val __obj = js.Dynamic.literal(activePrompt = activePrompt.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), onForceClose = js.Any.fromFunction0(onForceClose), rl = rl.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI]
    }
    
    @scala.inline
    implicit class UIMutableBuilder[Self <: UI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivePrompt(value: PromptBase): Self = StObject.set(x, "activePrompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnForceClose(value: () => Unit): Self = StObject.set(x, "onForceClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRl(value: Interface): Self = StObject.set(x, "rl", value.asInstanceOf[js.Any])
    }
  }
}
