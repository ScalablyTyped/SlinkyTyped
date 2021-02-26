package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to instantiate a workflow template.
  */
@js.native
trait SchemaInstantiateWorkflowTemplateRequest extends StObject {
  
  /**
    * Deprecated. Please use request_id field instead.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Map from parameter names to values that should be used for
    * those parameters. Values may not exceed 100 characters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Optional. A tag that prevents multiple concurrent workflow instances with
    * the same tag from running. This mitigates risk of concurrent instances
    * started due to retries.It is recommended to always set this value to a
    * UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The
    * tag must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
    * and hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * Optional. The version of workflow template to instantiate. If specified,
    * the workflow will be instantiated only if the current version of the
    * workflow template has the supplied version.This option cannot be used to
    * instantiate a previous version of workflow template.
    */
  var version: js.UndefOr[Double] = js.native
}
object SchemaInstantiateWorkflowTemplateRequest {
  
  @scala.inline
  def apply(): SchemaInstantiateWorkflowTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstantiateWorkflowTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaInstantiateWorkflowTemplateRequestMutableBuilder[Self <: SchemaInstantiateWorkflowTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
