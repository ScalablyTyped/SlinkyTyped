package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing options available for gettings the logs
  */
@js.native
trait LogsOptions extends js.Object {
  /**
    * The index to request logs from
    */
  var indexName: js.UndefOr[String] = js.native
  /**
    * Specify the maximum number of entries to retrieve starting at the offset.
    * default: 10
    * maximum: 1000
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Specify the first entry to retrieve (0-based, 0 is the most recent log entry).
    * default: 0
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * @deprecated
    * Retrieve only logs with an HTTP code different than 200 or 201
    */
  var onlyErrors: js.UndefOr[Boolean] = js.native
  /**
    * Specify the type of logs to retrieve
    * 'query' Retrieve only the queries
    * 'build' Retrieve only the build operations
    * 'error' Retrieve only the errors (same as onlyErrors parameters)
    */
  var `type`: js.UndefOr[String] = js.native
}

object LogsOptions {
  @scala.inline
  def apply(): LogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsOptions]
  }
  @scala.inline
  implicit class LogsOptionsOps[Self <: LogsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

