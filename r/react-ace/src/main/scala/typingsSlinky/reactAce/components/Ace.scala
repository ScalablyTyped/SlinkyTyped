package typingsSlinky.reactAce.components

import typingsSlinky.reactAce.aceMod.IAceEditorProps
import typingsSlinky.reactAce.aceMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ace {
  
  @JSImport("react-ace/lib/ace", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Ace.type): SharedBuilder_IAceEditorProps_1046638660[default] = new SharedBuilder_IAceEditorProps_1046638660[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IAceEditorProps): SharedBuilder_IAceEditorProps_1046638660[default] = new SharedBuilder_IAceEditorProps_1046638660[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
