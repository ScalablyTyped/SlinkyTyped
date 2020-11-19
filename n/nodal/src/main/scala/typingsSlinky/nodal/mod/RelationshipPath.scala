package typingsSlinky.nodal.mod

import typingsSlinky.nodal.anon.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "RelationshipPath")
@js.native
class RelationshipPath protected () extends js.Object {
  def this(path: js.Array[RelationshipEdge | RelationshipNode]) = this()
  
  def add(node: RelationshipNode, edge: RelationshipEdge): RelationshipPath = js.native
  
  var constructor: js.Any = js.native
  
  def getModel(): TypeofModel = js.native
  
  def immediateMultiple(): Boolean = js.native
  
  def joinName(): String = js.native
  def joinName(reverse: Boolean): String = js.native
  
  def joins(): js.Array[IJoin] = js.native
  def joins(alias: js.UndefOr[scala.Nothing], firstTable: String): js.Array[IJoin] = js.native
  def joins(alias: String): js.Array[IJoin] = js.native
  def joins(alias: String, firstTable: String): js.Array[IJoin] = js.native
  def joins(alias: Null, firstTable: String): js.Array[IJoin] = js.native
  
  def multiple(): Boolean = js.native
  
  var path: js.Array[RelationshipEdge | RelationshipNode] = js.native
}
