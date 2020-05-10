package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of applying a write.
  */
@js.native
trait SchemaWriteResult extends js.Object {
  /**
    * The results of applying each DocumentTransform.FieldTransform, in the
    * same order.
    */
  var transformResults: js.UndefOr[js.Array[SchemaValue]] = js.native
  /**
    * The last update time of the document after applying the write. Not set
    * after a `delete`.  If the write did not actually change the document,
    * this will be the previous update_time.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaWriteResult {
  @scala.inline
  def apply(): SchemaWriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteResult]
  }
  @scala.inline
  implicit class SchemaWriteResultOps[Self <: SchemaWriteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformResults(value: js.Array[SchemaValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResults")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

