package typingsSlinky.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "TraversalResults")
@js.native
class TraversalResults protected () extends AbstractPersistable {
  def this(branch: js.Any, `object`: js.Any) = this()
  
  def association(id: String): Association = js.native
  
  def associationCount(callback: js.Any): this.type = js.native
  
  def associations(): NodeMap = js.native
  
  def center(): js.Any = js.native
  
  def clear(): Unit = js.native
  
  def node(id: String): Node = js.native
  
  def nodeCount(callback: js.Any): this.type = js.native
  
  def nodes(): NodeMap = js.native
}
object TraversalResults {
  
  /* static member */
  @JSImport("gitana", "TraversalResults.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "TraversalResults.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "TraversalResults.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "TraversalResults.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "TraversalResults.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
