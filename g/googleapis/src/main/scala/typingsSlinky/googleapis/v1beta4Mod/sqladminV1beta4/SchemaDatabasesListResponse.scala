package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database list response.
  */
@js.native
trait SchemaDatabasesListResponse extends js.Object {
  /**
    * List of database resources in the instance.
    */
  var items: js.UndefOr[js.Array[SchemaDatabase]] = js.native
  /**
    * This is always sql#databasesList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDatabasesListResponse {
  @scala.inline
  def apply(): SchemaDatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabasesListResponse]
  }
  @scala.inline
  implicit class SchemaDatabasesListResponseOps[Self <: SchemaDatabasesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaDatabase]): Self = {
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

