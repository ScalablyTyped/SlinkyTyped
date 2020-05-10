package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the status of upload.
  */
@js.native
trait SchemaUploadStatus extends js.Object {
  /**
    * Reasons why upload can&#39;t be completed.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Per-row upload status.
    */
  var rowStatus: js.UndefOr[js.Array[SchemaRowStatus]] = js.native
}

object SchemaUploadStatus {
  @scala.inline
  def apply(): SchemaUploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadStatus]
  }
  @scala.inline
  implicit class SchemaUploadStatusOps[Self <: SchemaUploadStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withRowStatus(value: js.Array[SchemaRowStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStatus")(js.undefined)
        ret
    }
  }
  
}

