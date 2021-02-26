package typingsSlinky.pulumiAws.inputMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docdb {
  
  @js.native
  trait ClusterParameterGroupParameter extends StObject {
    
    /**
      * Valid values are `immediate` and `pending-reboot`. Defaults to `pending-reboot`.
      */
    var applyMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the documentDB parameter.
      */
    var name: Input[String] = js.native
    
    /**
      * The value of the documentDB parameter.
      */
    var value: Input[String] = js.native
  }
  object ClusterParameterGroupParameter {
    
    @scala.inline
    def apply(name: Input[String], value: Input[String]): ClusterParameterGroupParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterParameterGroupParameter]
    }
    
    @scala.inline
    implicit class ClusterParameterGroupParameterMutableBuilder[Self <: ClusterParameterGroupParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyMethod(value: Input[String]): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
