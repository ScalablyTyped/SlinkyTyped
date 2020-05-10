package typingsSlinky.googleapis.appstateV1Mod.appstateV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template to convert a list-response for app state.
  */
@js.native
trait SchemaListResponse extends js.Object {
  /**
    * The app state data.
    */
  var items: js.UndefOr[js.Array[SchemaGetResponse]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string appstate#listResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of keys allowed for this user.
    */
  var maximumKeyCount: js.UndefOr[Double] = js.native
}

object SchemaListResponse {
  @scala.inline
  def apply(): SchemaListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListResponse]
  }
  @scala.inline
  implicit class SchemaListResponseOps[Self <: SchemaListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaGetResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
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
    def withMaximumKeyCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumKeyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumKeyCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumKeyCount")(js.undefined)
        ret
    }
  }
  
}

