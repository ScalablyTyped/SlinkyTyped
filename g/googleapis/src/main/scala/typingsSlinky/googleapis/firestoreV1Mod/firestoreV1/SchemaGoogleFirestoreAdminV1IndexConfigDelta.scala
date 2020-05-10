package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an index configuration change.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1IndexConfigDelta extends js.Object {
  /**
    * Specifies how the index is changing.
    */
  var changeType: js.UndefOr[String] = js.native
  /**
    * The index being changed.
    */
  var index: js.UndefOr[SchemaGoogleFirestoreAdminV1Index] = js.native
}

object SchemaGoogleFirestoreAdminV1IndexConfigDelta {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1IndexConfigDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1IndexConfigDelta]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1IndexConfigDeltaOps[Self <: SchemaGoogleFirestoreAdminV1IndexConfigDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeType")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: SchemaGoogleFirestoreAdminV1Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

