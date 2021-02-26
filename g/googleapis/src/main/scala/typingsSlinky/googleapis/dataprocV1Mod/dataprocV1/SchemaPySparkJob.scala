package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Cloud Dataproc job for running Apache PySpark
  * (https://spark.apache.org/docs/0.9.0/python-programming-guide.html)
  * applications on YARN.
  */
@js.native
trait SchemaPySparkJob extends StObject {
  
  /**
    * Optional. HCFS URIs of archives to be extracted in the working directory
    * of .jar, .tar, .tar.gz, .tgz, and .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments,
    * such as --conf, that can be set as job properties, since a collision may
    * occur that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. HCFS URIs of files to be copied to the working directory of
    * Python drivers and distributed tasks. Useful for naively parallel tasks.
    */
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Python
    * driver and tasks.
    */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  
  /**
    * Required. The HCFS URI of the main Python file to use as the driver. Must
    * be a .py file.
    */
  var mainPythonFileUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. A mapping of property names to values, used to configure
    * PySpark. Properties that conflict with values set by the Cloud Dataproc
    * API may be overwritten. Can include properties set in
    * /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Optional. HCFS file URIs of Python files to pass to the PySpark
    * framework. Supported file types: .py, .egg, and .zip.
    */
  var pythonFileUris: js.UndefOr[js.Array[String]] = js.native
}
object SchemaPySparkJob {
  
  @scala.inline
  def apply(): SchemaPySparkJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPySparkJob]
  }
  
  @scala.inline
  implicit class SchemaPySparkJobMutableBuilder[Self <: SchemaPySparkJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveUris(value: js.Array[String]): Self = StObject.set(x, "archiveUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveUrisUndefined: Self = StObject.set(x, "archiveUris", js.undefined)
    
    @scala.inline
    def setArchiveUrisVarargs(value: String*): Self = StObject.set(x, "archiveUris", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = StObject.set(x, "fileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUrisUndefined: Self = StObject.set(x, "fileUris", js.undefined)
    
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = StObject.set(x, "fileUris", js.Array(value :_*))
    
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
    def setMainPythonFileUri(value: String): Self = StObject.set(x, "mainPythonFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainPythonFileUriUndefined: Self = StObject.set(x, "mainPythonFileUri", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPythonFileUris(value: js.Array[String]): Self = StObject.set(x, "pythonFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonFileUrisUndefined: Self = StObject.set(x, "pythonFileUris", js.undefined)
    
    @scala.inline
    def setPythonFileUrisVarargs(value: String*): Self = StObject.set(x, "pythonFileUris", js.Array(value :_*))
  }
}
