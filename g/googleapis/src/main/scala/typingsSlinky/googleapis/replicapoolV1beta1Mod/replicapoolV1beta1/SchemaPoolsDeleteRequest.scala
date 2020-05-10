package typingsSlinky.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPoolsDeleteRequest extends js.Object {
  /**
    * If there are instances you would like to keep, you can specify them here.
    * These instances won&#39;t be deleted, but the associated replica objects
    * will be removed.
    */
  var abandonInstances: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPoolsDeleteRequest {
  @scala.inline
  def apply(): SchemaPoolsDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoolsDeleteRequest]
  }
  @scala.inline
  implicit class SchemaPoolsDeleteRequestOps[Self <: SchemaPoolsDeleteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbandonInstances(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandonInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbandonInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandonInstances")(js.undefined)
        ret
    }
  }
  
}

