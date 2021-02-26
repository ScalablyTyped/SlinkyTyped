package typingsSlinky.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentsObject extends StObject {
  
  var callbacks: js.UndefOr[StringDictionary[ReferenceObject | CallbackObject]] = js.native
  
  var examples: js.UndefOr[StringDictionary[ReferenceObject | ExampleObject]] = js.native
  
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.native
  
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.native
  
  var parameters: js.UndefOr[StringDictionary[ReferenceObject | ParameterObject]] = js.native
  
  var requestBodies: js.UndefOr[StringDictionary[ReferenceObject | RequestBodyObject]] = js.native
  
  var responses: js.UndefOr[StringDictionary[ReferenceObject | ResponseObject]] = js.native
  
  var schemas: js.UndefOr[StringDictionary[ReferenceObject | SchemaObject]] = js.native
  
  var securitySchemes: js.UndefOr[StringDictionary[ReferenceObject | SecuritySchemeObject]] = js.native
}
object ComponentsObject {
  
  @scala.inline
  def apply(): ComponentsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsObject]
  }
  
  @scala.inline
  implicit class ComponentsObjectMutableBuilder[Self <: ComponentsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbacks(value: StringDictionary[ReferenceObject | CallbackObject]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    @scala.inline
    def setExamples(value: StringDictionary[ReferenceObject | ExampleObject]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLinks(value: StringDictionary[ReferenceObject | LinkObject]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[ReferenceObject | ParameterObject]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRequestBodies(value: StringDictionary[ReferenceObject | RequestBodyObject]): Self = StObject.set(x, "requestBodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodiesUndefined: Self = StObject.set(x, "requestBodies", js.undefined)
    
    @scala.inline
    def setResponses(value: StringDictionary[ReferenceObject | ResponseObject]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setSchemas(value: StringDictionary[ReferenceObject | SchemaObject]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSecuritySchemes(value: StringDictionary[ReferenceObject | SecuritySchemeObject]): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuritySchemesUndefined: Self = StObject.set(x, "securitySchemes", js.undefined)
  }
}
