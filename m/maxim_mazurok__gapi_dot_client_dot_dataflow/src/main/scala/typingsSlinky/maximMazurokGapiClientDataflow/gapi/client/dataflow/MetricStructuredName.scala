package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricStructuredName extends StObject {
  
  /**
    * Zero or more labeled fields which identify the part of the job this metric is associated with, such as the name of a step or collection. For example, built-in counters associated
    * with steps will have context['step'] = . Counters associated with PCollections in the SDK will have context['pcollection'] = .
    */
  var context: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.MetricStructuredName with TopLevel[js.Any]
  ] = js.native
  
  /** Worker-defined metric name. */
  var name: js.UndefOr[String] = js.native
  
  /** Origin (namespace) of metric name. May be blank for user-define metrics; will be "dataflow" for metrics defined by the Dataflow service or SDK. */
  var origin: js.UndefOr[String] = js.native
}
object MetricStructuredName {
  
  @scala.inline
  def apply(): MetricStructuredName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricStructuredName]
  }
  
  @scala.inline
  implicit class MetricStructuredNameMutableBuilder[Self <: MetricStructuredName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.MetricStructuredName with TopLevel[js.Any]
    ): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
