package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data to pass through to the worker harness.
  */
@js.native
trait SchemaWorkerSettings extends StObject {
  
  /**
    * The base URL for accessing Google Cloud APIs.  When workers access Google
    * Cloud APIs, they logically do so via relative URLs.  If this field is
    * specified, it supplies the base URL to use for resolving these relative
    * URLs.  The normative algorithm used is defined by RFC 1808,
    * &quot;Relative Uniform Resource Locators&quot;.  If not specified, the
    * default value is &quot;http://www.googleapis.com/&quot;
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  /**
    * Whether to send work progress updates to the service.
    */
  var reportingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The Cloud Dataflow service path relative to the root URL, for example,
    * &quot;dataflow/v1b3/projects&quot;.
    */
  var servicePath: js.UndefOr[String] = js.native
  
  /**
    * The Shuffle service path relative to the root URL, for example,
    * &quot;shuffle/v1beta1&quot;.
    */
  var shuffleServicePath: js.UndefOr[String] = js.native
  
  /**
    * The prefix of the resources the system should use for temporary storage.
    * The supported resource type is:  Google Cloud Storage:
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempStoragePrefix: js.UndefOr[String] = js.native
  
  /**
    * The ID of the worker running this pipeline.
    */
  var workerId: js.UndefOr[String] = js.native
}
object SchemaWorkerSettings {
  
  @scala.inline
  def apply(): SchemaWorkerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerSettings]
  }
  
  @scala.inline
  implicit class SchemaWorkerSettingsMutableBuilder[Self <: SchemaWorkerSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setReportingEnabled(value: Boolean): Self = StObject.set(x, "reportingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingEnabledUndefined: Self = StObject.set(x, "reportingEnabled", js.undefined)
    
    @scala.inline
    def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
    
    @scala.inline
    def setShuffleServicePath(value: String): Self = StObject.set(x, "shuffleServicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffleServicePathUndefined: Self = StObject.set(x, "shuffleServicePath", js.undefined)
    
    @scala.inline
    def setTempStoragePrefix(value: String): Self = StObject.set(x, "tempStoragePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempStoragePrefixUndefined: Self = StObject.set(x, "tempStoragePrefix", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
