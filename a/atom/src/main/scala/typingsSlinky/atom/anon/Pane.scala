package typingsSlinky.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pane extends StObject {
  
  var pane: typingsSlinky.atom.mod.Pane = js.native
}
object Pane {
  
  @scala.inline
  def apply(pane: typingsSlinky.atom.mod.Pane): Pane = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  
  @scala.inline
  implicit class PaneMutableBuilder[Self <: Pane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPane(value: typingsSlinky.atom.mod.Pane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
