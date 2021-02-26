package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Apache Pig (https://pig.apache.org/)
  * queries on YARN.
  */
@js.native
trait SchemaPigJob extends StObject {
  
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig
    * Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  
  /**
    * Optional. A mapping of property names to values, used to configure Pig.
    * Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/hadoop/conf/ *-site.xml,
    * /etc/pig/conf/pig.properties, and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The HCFS URI of the script that contains the Pig queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.native
  
  /**
    * Optional. Mapping of query variable names to values (equivalent to the
    * Pig command: name=[value]).
    */
  var scriptVariables: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaPigJob {
  
  @scala.inline
  def apply(): SchemaPigJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPigJob]
  }
  
  @scala.inline
  implicit class SchemaPigJobMutableBuilder[Self <: SchemaPigJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinueOnFailure(value: Boolean): Self = StObject.set(x, "continueOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueOnFailureUndefined: Self = StObject.set(x, "continueOnFailure", js.undefined)
    
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = StObject.set(x, "jarFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarFileUrisUndefined: Self = StObject.set(x, "jarFileUris", js.undefined)
    
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = StObject.set(x, "jarFileUris", js.Array(value :_*))
    
    @scala.inline
    def setLoggingConfig(value: SchemaLoggingConfig): Self = StObject.set(x, "loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingConfigUndefined: Self = StObject.set(x, "loggingConfig", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setQueryFileUri(value: String): Self = StObject.set(x, "queryFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryFileUriUndefined: Self = StObject.set(x, "queryFileUri", js.undefined)
    
    @scala.inline
    def setQueryList(value: SchemaQueryList): Self = StObject.set(x, "queryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryListUndefined: Self = StObject.set(x, "queryList", js.undefined)
    
    @scala.inline
    def setScriptVariables(value: StringDictionary[String]): Self = StObject.set(x, "scriptVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptVariablesUndefined: Self = StObject.set(x, "scriptVariables", js.undefined)
  }
}
