package typingsSlinky.reactAce.components

import typingsSlinky.reactAce.aceMod.IAceEditorProps
import typingsSlinky.reactAce.aceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ace {
  
  @JSImport("react-ace/lib/ace", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IAceEditorProps): SharedBuilder_IAceEditorProps_1046638660[default] = new SharedBuilder_IAceEditorProps_1046638660[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Ace.type): SharedBuilder_IAceEditorProps_1046638660[default] = new SharedBuilder_IAceEditorProps_1046638660[default](js.Array(this.component, js.Dictionary.empty))()
}
