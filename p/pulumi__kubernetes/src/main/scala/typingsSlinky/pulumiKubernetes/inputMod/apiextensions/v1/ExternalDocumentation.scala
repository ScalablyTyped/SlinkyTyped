package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
@js.native
trait ExternalDocumentation extends StObject {
  
  var description: js.UndefOr[Input[String]] = js.native
  
  var url: js.UndefOr[Input[String]] = js.native
}
object ExternalDocumentation {
  
  @scala.inline
  def apply(): ExternalDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDocumentation]
  }
  
  @scala.inline
  implicit class ExternalDocumentationMutableBuilder[Self <: ExternalDocumentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
