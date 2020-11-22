package typingsSlinky.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HadoopJob extends js.Object {
  
  /** Optional. HCFS URIs of archives to be extracted in the working directory of Hadoop drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, or .zip. */
  var archiveUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an
    * incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. HCFS (Hadoop Compatible Filesystem) URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks. */
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Jar file URIs to add to the CLASSPATHs of the Hadoop driver and tasks. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  
  /** The name of the driver's main class. The jar file containing the class must be in the default CLASSPATH or specified in jar_file_uris. */
  var mainClass: js.UndefOr[String] = js.native
  
  /**
    * The HCFS URI of the jar file containing the main class. Examples: 'gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar' 'hdfs:/tmp/test-samples/custom-wordcount.jar'
    * 'file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar'
    */
  var mainJarFileUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. A mapping of property names to values, used to configure Hadoop. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties
    * set in /etc/hadoop/conf/ *-site and classes in user code.
    */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.HadoopJob with TopLevel[js.Any]
  ] = js.native
}
object HadoopJob {
  
  @scala.inline
  def apply(): HadoopJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HadoopJob]
  }
  
  @scala.inline
  implicit class HadoopJobOps[Self <: HadoopJob] (val x: Self) extends AnyVal {
    
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
    def setArchiveUrisVarargs(value: String*): Self = this.set("archiveUris", js.Array(value :_*))
    
    @scala.inline
    def setArchiveUris(value: js.Array[String]): Self = this.set("archiveUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchiveUris: Self = this.set("archiveUris", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setFileUrisVarargs(value: String*): Self = this.set("fileUris", js.Array(value :_*))
    
    @scala.inline
    def setFileUris(value: js.Array[String]): Self = this.set("fileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileUris: Self = this.set("fileUris", js.undefined)
    
    @scala.inline
    def setJarFileUrisVarargs(value: String*): Self = this.set("jarFileUris", js.Array(value :_*))
    
    @scala.inline
    def setJarFileUris(value: js.Array[String]): Self = this.set("jarFileUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJarFileUris: Self = this.set("jarFileUris", js.undefined)
    
    @scala.inline
    def setLoggingConfig(value: LoggingConfig): Self = this.set("loggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfig: Self = this.set("loggingConfig", js.undefined)
    
    @scala.inline
    def setMainClass(value: String): Self = this.set("mainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainClass: Self = this.set("mainClass", js.undefined)
    
    @scala.inline
    def setMainJarFileUri(value: String): Self = this.set("mainJarFileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainJarFileUri: Self = this.set("mainJarFileUri", js.undefined)
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.HadoopJob with TopLevel[js.Any]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
