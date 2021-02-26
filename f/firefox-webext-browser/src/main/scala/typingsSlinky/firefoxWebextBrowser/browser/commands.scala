package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the xtension.
  *
  * Manifest keys: `commands`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object commands {
  
  /* commands types */
  @js.native
  trait Command extends StObject {
    
    /** The Extension Command description */
    var description: js.UndefOr[String] = js.native
    
    /** The name of the Extension Command */
    var name: js.UndefOr[String] = js.native
    
    /** The shortcut active for this command, or blank if not active. */
    var shortcut: js.UndefOr[String] = js.native
  }
  object Command {
    
    @scala.inline
    def apply(): Command = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    }
  }
  
  /** The new description for the command. */
  @js.native
  trait UpdateDetail extends StObject {
    
    /** The new description for the command. */
    var description: js.UndefOr[String] = js.native
    
    /** The name of the command. */
    var name: String = js.native
    
    var shortcut: js.UndefOr[String] = js.native
  }
  object UpdateDetail {
    
    @scala.inline
    def apply(name: String): UpdateDetail = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateDetail]
    }
    
    @scala.inline
    implicit class UpdateDetailMutableBuilder[Self <: UpdateDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    }
  }
}
