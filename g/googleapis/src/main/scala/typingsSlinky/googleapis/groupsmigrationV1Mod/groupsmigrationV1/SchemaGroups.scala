package typingsSlinky.googleapis.groupsmigrationV1Mod.groupsmigrationV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for groups migration API.
  */
@js.native
trait SchemaGroups extends js.Object {
  /**
    * The kind of insert resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The status of the insert request.
    */
  var responseCode: js.UndefOr[String] = js.native
}

object SchemaGroups {
  @scala.inline
  def apply(): SchemaGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroups]
  }
  @scala.inline
  implicit class SchemaGroupsOps[Self <: SchemaGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(js.undefined)
        ret
    }
  }
  
}

