package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkJob extends js.Object {
  /**
    * Optional. HCFS URIs of archives to be extracted in the working directory of Spark drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz,
    * and .zip.
    */
  var archiveUris: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur
    * that causes an incorrect job submission.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /** Optional. HCFS URIs of files to be copied to the working directory of Spark drivers and distributed tasks. Useful for naively parallel tasks. */
  var fileUris: js.UndefOr[js.Array[String]] = js.native
  /** Optional. HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  /** The name of the driver's main class. The jar file that contains the class must be in the default CLASSPATH or specified in jar_file_uris. */
  var mainClass: js.UndefOr[String] = js.native
  /** The HCFS URI of the jar file that contains the main class. */
  var mainJarFileUri: js.UndefOr[String] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Cloud Dataproc API may be
    * overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
}

object SparkJob {
  @scala.inline
  def apply(): SparkJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkJob]
  }
  @scala.inline
  implicit class SparkJobOps[Self <: SparkJob] (val x: Self) extends AnyVal {
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
    def withLoggingConfig(value: LoggingConfig): Self = {
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
    def withMainClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMainJarFileUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainJarFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainJarFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainJarFileUri")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Record[String, String]): Self = {
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
  }
  
}

