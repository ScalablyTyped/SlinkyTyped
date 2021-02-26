package typingsSlinky.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Affinity: the configuration of desired nodes onto which this Instance
  * could be scheduled.
  */
@js.native
trait SchemaSchedulingNodeAffinity extends StObject {
  
  /**
    * Corresponds to the label key of Node resource.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Defines the operation of node selection.
    */
  var operator: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to the label values of Node resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaSchedulingNodeAffinity {
  
  @scala.inline
  def apply(): SchemaSchedulingNodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingNodeAffinity]
  }
  
  @scala.inline
  implicit class SchemaSchedulingNodeAffinityMutableBuilder[Self <: SchemaSchedulingNodeAffinity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
