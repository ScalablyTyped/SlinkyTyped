package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends StObject {
  
  /**
    * Information about the configuration of an input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.native
  
  /**
    * The definition of the input.
    */
  var inputDefinition: js.UndefOr[InputDefinition] = js.native
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputConfiguration(value: InputConfiguration): Self = StObject.set(x, "inputConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigurationUndefined: Self = StObject.set(x, "inputConfiguration", js.undefined)
    
    @scala.inline
    def setInputDefinition(value: InputDefinition): Self = StObject.set(x, "inputDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDefinitionUndefined: Self = StObject.set(x, "inputDefinition", js.undefined)
  }
}
