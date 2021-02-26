package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Block
import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CatchClauseKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TryStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TryStatementBuilder extends StObject {
  
  def apply(block: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: js.UndefOr[scala.Nothing], finalizer: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind): TryStatement = js.native
  def apply(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement = js.native
  
  def from(params: Block): TryStatement = js.native
}
