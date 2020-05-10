package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the upload status of a row in the request.
  */
@js.native
trait SchemaRowStatus extends js.Object {
  /**
    * Whether the stored entity is changed as a result of upload.
    */
  var changed: js.UndefOr[Boolean] = js.native
  /**
    * Entity Id.
    */
  var entityId: js.UndefOr[String] = js.native
  /**
    * Entity name.
    */
  var entityName: js.UndefOr[String] = js.native
  /**
    * Reasons why the entity can&#39;t be uploaded.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the entity is persisted.
    */
  var persisted: js.UndefOr[Boolean] = js.native
  /**
    * Row number.
    */
  var rowNumber: js.UndefOr[Double] = js.native
}

object SchemaRowStatus {
  @scala.inline
  def apply(): SchemaRowStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowStatus]
  }
  @scala.inline
  implicit class SchemaRowStatusOps[Self <: SchemaRowStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityId")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityName")(js.undefined)
        ret
    }
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
    def withPersisted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersisted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNumber")(js.undefined)
        ret
    }
  }
  
}

