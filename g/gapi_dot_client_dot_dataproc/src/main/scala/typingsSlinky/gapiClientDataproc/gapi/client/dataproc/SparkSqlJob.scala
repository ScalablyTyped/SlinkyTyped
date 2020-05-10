package typingsSlinky.gapiClientDataproc.gapi.client.dataproc

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkSqlJob extends js.Object {
  /** Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH. */
  var jarFileUris: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The runtime log config for job execution. */
  var loggingConfig: js.UndefOr[LoggingConfig] = js.native
  /**
    * Optional. A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud
    * Dataproc API may be overwritten.
    */
  var properties: js.UndefOr[Record[String, String]] = js.native
  /** The HCFS URI of the script that contains SQL queries. */
  var queryFileUri: js.UndefOr[String] = js.native
  /** A list of queries. */
  var queryList: js.UndefOr[QueryList] = js.native
  /** Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET name="value";). */
  var scriptVariables: js.UndefOr[Record[String, String]] = js.native
}

object SparkSqlJob {
  @scala.inline
  def apply(): SparkSqlJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparkSqlJob]
  }
  @scala.inline
  implicit class SparkSqlJobOps[Self <: SparkSqlJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withQueryFileUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryFileUri")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryList(value: QueryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryList")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptVariables(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptVariables")(js.undefined)
        ret
    }
  }
  
}

