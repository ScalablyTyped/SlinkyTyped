package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkSqlJob extends StObject {
  
  /** Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  
  /** Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Dataproc API may be overwritten. */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkSqlJob with TopLevel[js.Any]
  ] = js.native
  
  /** The HCFS URI of the script that contains SQL queries. */
  var queryFileUri: js.UndefOr[String] = js.native
  
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.native
  
  /** Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";). */
  var scriptVariables: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkSqlJob with TopLevel[js.Any]
  ] = js.native
}
object SparkSqlJob {
  
  @scala.inline
  def apply(): SparkSqlJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkSqlJob]
  }
  
  @scala.inline
  implicit class SparkSqlJobMutableBuilder[Self <: SparkSqlJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value :_*))
    
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkSqlJob with TopLevel[js.Any]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    @scala.inline
    def setQueryList(value: QueryList): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryListUndefined: Self = StObject.set(x, "queryList", js.undefined)
    
    @scala.inline
    def setScriptVariables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.SparkSqlJob with TopLevel[js.Any]
    ): Self = StObject.set(x, "scriptVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptVariablesUndefined: Self = StObject.set(x, "scriptVariables", js.undefined)
  }
}
