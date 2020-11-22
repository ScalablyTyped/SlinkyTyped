package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaConfig extends js.Object {
  
  /**
    * The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the
    * CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum
    * depth allowed is 5.
    */
  var recursiveStructureDepth: js.UndefOr[String] = js.native
  
  /** Specifies the output schema type. Schema type is required. */
  var schemaType: js.UndefOr[String] = js.native
}
object SchemaConfig {
  
  @scala.inline
  def apply(): SchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfig]
  }
  
  @scala.inline
  implicit class SchemaConfigOps[Self <: SchemaConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecursiveStructureDepth(value: String): Self = this.set("recursiveStructureDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursiveStructureDepth: Self = this.set("recursiveStructureDepth", js.undefined)
    
    @scala.inline
    def setSchemaType(value: String): Self = this.set("schemaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaType: Self = this.set("schemaType", js.undefined)
  }
}
