package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What operations are supported?
  */
@js.native
trait CapabilityStatementRestInteraction extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  
  /**
    * transaction | batch | search-system | history-system
    */
  var code: typingsSlinky.fhir.fhir.code = js.native
  
  /**
    * Anything special about operation behavior
    */
  var documentation: js.UndefOr[String] = js.native
}
object CapabilityStatementRestInteraction {
  
  @scala.inline
  def apply(code: code): CapabilityStatementRestInteraction = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestInteraction]
  }
  
  @scala.inline
  implicit class CapabilityStatementRestInteractionOps[Self <: CapabilityStatementRestInteraction] (val x: Self) extends AnyVal {
    
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
  }
}
