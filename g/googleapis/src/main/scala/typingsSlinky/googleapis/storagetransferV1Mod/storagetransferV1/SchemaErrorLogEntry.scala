package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entry describing an error that has occurred.
  */
@js.native
trait SchemaErrorLogEntry extends js.Object {
  /**
    * A list of messages that carry the error details.
    */
  var errorDetails: js.UndefOr[js.Array[String]] = js.native
  /**
    * A URL that refers to the target (a data source, a data sink, or an
    * object) with which the error is associated. Required.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaErrorLogEntry {
  @scala.inline
  def apply(): SchemaErrorLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorLogEntry]
  }
  @scala.inline
  implicit class SchemaErrorLogEntryOps[Self <: SchemaErrorLogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

