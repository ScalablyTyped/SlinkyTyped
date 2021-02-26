package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeGroupNode extends StObject {
  
  /**
    * Instances scheduled on this node.
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the node.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The type of this node.
    */
  var nodeType: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object SchemaNodeGroupNode {
  
  @scala.inline
  def apply(): SchemaNodeGroupNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupNode]
  }
  
  @scala.inline
  implicit class SchemaNodeGroupNodeMutableBuilder[Self <: SchemaNodeGroupNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
