package typingsSlinky.jsoneditorForReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jsoneditorForReact.mod.ReactJsonEditorProps
import typingsSlinky.jsoneditorForReact.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsoneditorForReact {
  
  @JSImport("jsoneditor-for-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: JsoneditorForReact.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactJsonEditorProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
