package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This contains item&#39;s status and any errors.
  */
@js.native
trait SchemaItemStatus extends js.Object {
  /**
    * Status code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Error details in case the item is in ERROR state.
    */
  var processingErrors: js.UndefOr[js.Array[SchemaProcessingError]] = js.native
  /**
    * Repository error reported by connector.
    */
  var repositoryErrors: js.UndefOr[js.Array[SchemaRepositoryError]] = js.native
}

object SchemaItemStatus {
  @scala.inline
  def apply(): SchemaItemStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemStatus]
  }
  @scala.inline
  implicit class SchemaItemStatusOps[Self <: SchemaItemStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessingErrors(value: js.Array[SchemaProcessingError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessingErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryErrors(value: js.Array[SchemaRepositoryError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryErrors")(js.undefined)
        ret
    }
  }
  
}

