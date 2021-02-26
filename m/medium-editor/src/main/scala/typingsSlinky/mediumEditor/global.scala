package typingsSlinky.mediumEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.mediumEditor.MediumEditor.CoreOptions
import typingsSlinky.mediumEditor.MediumEditor.elementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object MediumEditor extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("MediumEditor")
    @js.native
    class ^ protected ()
      extends typingsSlinky.mediumEditor.MediumEditor.MediumEditor {
      // Initialization Functions
      def this(elements: elementType) = this()
      def this(elements: elementType, options: CoreOptions) = this()
    }
    
    @JSGlobal("MediumEditor")
    @js.native
    val ^ : typingsSlinky.mediumEditor.MediumEditor.MediumEditor = js.native
    
    type _To = typingsSlinky.mediumEditor.MediumEditor.MediumEditor
    
    /* This means you don't have to write `^`, but can instead just say `MediumEditor.foo` */
    override def _to: typingsSlinky.mediumEditor.MediumEditor.MediumEditor = ^
  }
}
