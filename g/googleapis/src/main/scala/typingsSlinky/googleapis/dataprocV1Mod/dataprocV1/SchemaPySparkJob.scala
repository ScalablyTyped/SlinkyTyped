package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Apache PySpark
  * (https://spark.apache.org/docs/0.9.0/python-programming-guide.html)
  * applications on YARN.
  */
@js.native
trait SchemaPySparkJob extends js.Object {
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
  implicit class SchemaPySparkJobOps[Self <: SchemaPySparkJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchiveUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchiveUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archiveUris")(js.undefined)
        ret
    }
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUris")(js.undefined)
        ret
    }
    @scala.inline
    def withJarFileUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jarFileUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJarFileUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jarFileUris")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggingConfig(value: SchemaLoggingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMainPythonFileUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPythonFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainPythonFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainPythonFileUri")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withPythonFileUris(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonFileUris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPythonFileUris: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pythonFileUris")(js.undefined)
        ret
    }
  }
  
}

