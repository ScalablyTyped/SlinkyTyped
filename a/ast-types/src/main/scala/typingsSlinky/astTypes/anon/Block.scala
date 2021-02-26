package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CatchClauseKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends StObject {
  
  var block: BlockStatementKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.native
  
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.native
  
  var handler: js.UndefOr[CatchClauseKind | Null] = js.native
  
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object Block {
  
  @scala.inline
  def apply(block: BlockStatementKind): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: BlockStatementKind): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setFinalizer(value: BlockStatementKind): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalizerNull: Self = StObject.set(x, "finalizer", null)
    
    @scala.inline
    def setFinalizerUndefined: Self = StObject.set(x, "finalizer", js.undefined)
    
    @scala.inline
    def setGuardedHandlers(value: js.Array[CatchClauseKind]): Self = StObject.set(x, "guardedHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardedHandlersUndefined: Self = StObject.set(x, "guardedHandlers", js.undefined)
    
    @scala.inline
    def setGuardedHandlersVarargs(value: CatchClauseKind*): Self = StObject.set(x, "guardedHandlers", js.Array(value :_*))
    
    @scala.inline
    def setHandler(value: CatchClauseKind): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setHandlers(value: js.Array[CatchClauseKind]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    @scala.inline
    def setHandlersVarargs(value: CatchClauseKind*): Self = StObject.set(x, "handlers", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
