package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryStatement
  extends BaseNode
     with Statement {
  
  var block: BlockStatement = js.native
  
  var finalizer: js.UndefOr[BlockStatement | Null] = js.native
  
  var handler: js.UndefOr[CatchClause | Null] = js.native
  
  @JSName("type")
  var type_TryStatement: typingsSlinky.estree.estreeStrings.TryStatement = js.native
}
object TryStatement {
  
  @scala.inline
  def apply(block: BlockStatement, `type`: typingsSlinky.estree.estreeStrings.TryStatement): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement]
  }
  
  @scala.inline
  implicit class TryStatementMutableBuilder[Self <: TryStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: BlockStatement): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizer(value: BlockStatement): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizerNull: Self = StObject.set(x, "finalizer", null)
    
    @scala.inline
    def setFinalizerUndefined: Self = StObject.set(x, "finalizer", js.undefined)
    
    @scala.inline
    def setHandler(value: CatchClause): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
