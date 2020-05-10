package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing guardians.
  */
@js.native
trait SchemaListGuardiansResponse extends js.Object {
  /**
    * Guardians on this page of results that met the criteria specified in the
    * request.
    */
  var guardians: js.UndefOr[js.Array[SchemaGuardian]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListGuardiansResponse {
  @scala.inline
  def apply(): SchemaListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGuardiansResponse]
  }
  @scala.inline
  implicit class SchemaListGuardiansResponseOps[Self <: SchemaListGuardiansResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuardians(value: js.Array[SchemaGuardian]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardians")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardians: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardians")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

