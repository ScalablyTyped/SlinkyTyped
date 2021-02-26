package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.`var`
import typingsSlinky.babelTraverse.babelTraverseStrings.const
import typingsSlinky.babelTraverse.babelTraverseStrings.let
import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.LVal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Id extends StObject {
  
  var id: LVal = js.native
  
  var init: js.UndefOr[Expression] = js.native
  
  var kind: js.UndefOr[`var` | let | const] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object Id {
  
  @scala.inline
  def apply(id: LVal): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setKind(value: `var` | let | const): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
