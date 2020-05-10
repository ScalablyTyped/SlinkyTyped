package typingsSlinky.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc job for running Presto (https://prestosql.io/) queries
  */
@js.native
trait SchemaPrestoJob extends js.Object {
  /**
    * Optional. Presto client tags to attach to this query
    */
  var clientTags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Whether to continue executing queries if a query fails. The
    * default value is false. Setting to true can be useful when executing
    * independent parallel queries.
    */
  var continueOnFailure: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The runtime log config for job execution.
    */
  var loggingConfig: js.UndefOr[SchemaLoggingConfig] = js.native
  /**
    * Optional. The format in which query output will be displayed. See the
    * Presto documentation for supported output formats
    */
  var outputFormat: js.UndefOr[String] = js.native
  /**
    * Optional. A mapping of property names to values. Used to set Presto
    * session properties
    * (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to
    * using the --session flag in the Presto CLI
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The HCFS URI of the script that contains SQL queries.
    */
  var queryFileUri: js.UndefOr[String] = js.native
  /**
    * A list of queries.
    */
  var queryList: js.UndefOr[SchemaQueryList] = js.native
}

object SchemaPrestoJob {
  @scala.inline
  def apply(): SchemaPrestoJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrestoJob]
  }
  @scala.inline
  implicit class SchemaPrestoJobOps[Self <: SchemaPrestoJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTags")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueOnFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnFailure")(js.undefined)
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
    def withOutputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
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
    def withQueryList(value: SchemaQueryList): Self = {
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
  }
  
}

