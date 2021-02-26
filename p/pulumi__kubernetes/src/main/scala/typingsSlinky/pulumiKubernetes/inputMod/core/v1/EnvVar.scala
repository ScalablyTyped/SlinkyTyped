package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVar represents an environment variable present in a Container.
  */
@js.native
trait EnvVar extends StObject {
  
  /**
    * Name of the environment variable. Must be a C_IDENTIFIER.
    */
  var name: Input[String] = js.native
  
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "".
    */
  var value: js.UndefOr[Input[String]] = js.native
  
  /**
    * Source for the environment variable's value. Cannot be used if value is not empty.
    */
  var valueFrom: js.UndefOr[Input[EnvVarSource]] = js.native
}
object EnvVar {
  
  @scala.inline
  def apply(name: Input[String]): EnvVar = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvVar]
  }
  
  @scala.inline
  implicit class EnvVarMutableBuilder[Self <: EnvVar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFrom(value: Input[EnvVarSource]): Self = StObject.set(x, "valueFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFromUndefined: Self = StObject.set(x, "valueFrom", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
