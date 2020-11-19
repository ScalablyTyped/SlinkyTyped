package typingsSlinky.jsonEditor

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jsonEditor.anon.Ace
import typingsSlinky.jsonEditor.anon.Customvalidators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class JSONEditor[TValue] protected ()
    extends typingsSlinky.jsonEditor.JSONEditor[TValue] {
    def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
  }
  /* static members */
  @js.native
  object JSONEditor extends js.Object {
    
    var defaults: Customvalidators = js.native
    
    var plugins: Ace = js.native
  }
}
