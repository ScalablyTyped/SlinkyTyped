package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an edit of an app. An edit allows clients to make multiple
  * changes before committing them in one operation.
  */
@js.native
trait SchemaAppEdit extends js.Object {
  /**
    * The time at which the edit will expire and will be no longer valid for
    * use in any subsequent API calls (encoded as seconds since the Epoch).
    */
  var expiryTimeSeconds: js.UndefOr[String] = js.native
  /**
    * The ID of the edit that can be used in subsequent API calls.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaAppEdit {
  @scala.inline
  def apply(): SchemaAppEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEdit]
  }
  @scala.inline
  implicit class SchemaAppEditOps[Self <: SchemaAppEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiryTimeSeconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiryTimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

