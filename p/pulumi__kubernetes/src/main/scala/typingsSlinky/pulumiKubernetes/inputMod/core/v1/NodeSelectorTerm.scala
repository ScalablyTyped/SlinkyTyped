package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A null or empty node selector term matches no objects. The requirements of them are ANDed. The TopologySelectorTerm type implements a subset of the NodeSelectorTerm.
  */
@js.native
trait NodeSelectorTerm extends StObject {
  
  /**
    * A list of node selector requirements by node's labels.
    */
  var matchExpressions: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.native
  
  /**
    * A list of node selector requirements by node's fields.
    */
  var matchFields: js.UndefOr[Input[js.Array[Input[NodeSelectorRequirement]]]] = js.native
}
object NodeSelectorTerm {
  
  @scala.inline
  def apply(): NodeSelectorTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSelectorTerm]
  }
  
  @scala.inline
  implicit class NodeSelectorTermMutableBuilder[Self <: NodeSelectorTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchExpressions(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchExpressionsUndefined: Self = StObject.set(x, "matchExpressions", js.undefined)
    
    @scala.inline
    def setMatchExpressionsVarargs(value: Input[NodeSelectorRequirement]*): Self = StObject.set(x, "matchExpressions", js.Array(value :_*))
    
    @scala.inline
    def setMatchFields(value: Input[js.Array[Input[NodeSelectorRequirement]]]): Self = StObject.set(x, "matchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchFieldsUndefined: Self = StObject.set(x, "matchFields", js.undefined)
    
    @scala.inline
    def setMatchFieldsVarargs(value: Input[NodeSelectorRequirement]*): Self = StObject.set(x, "matchFields", js.Array(value :_*))
  }
}
