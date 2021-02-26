package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdIdentifierKind extends StObject {
  
  var id: IdentifierKind = js.native
  
  var init: LiteralKind = js.native
}
object IdIdentifierKind {
  
  @scala.inline
  def apply(id: IdentifierKind, init: LiteralKind): IdIdentifierKind = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdIdentifierKind]
  }
  
  @scala.inline
  implicit class IdIdentifierKindMutableBuilder[Self <: IdIdentifierKind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: LiteralKind): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
  }
}
