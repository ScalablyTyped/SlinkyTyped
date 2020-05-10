package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flags list response.
  */
@js.native
trait SchemaFlagsListResponse extends js.Object {
  /**
    * List of flags.
    */
  var items: js.UndefOr[js.Array[SchemaFlag]] = js.native
  /**
    * This is always sql#flagsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFlagsListResponse {
  @scala.inline
  def apply(): SchemaFlagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlagsListResponse]
  }
  @scala.inline
  implicit class SchemaFlagsListResponseOps[Self <: SchemaFlagsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaFlag]): Self = {
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
  }
  
}

