package typingsSlinky.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Contacts representing contacts. This is the response from the
  * server to GET requests on the contacts collection.
  */
@js.native
trait SchemaContactsListResponse extends js.Object {
  /**
    * Contact list.
    */
  var items: js.UndefOr[js.Array[SchemaContact]] = js.native
  /**
    * The type of resource. This is always mirror#contacts.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaContactsListResponse {
  @scala.inline
  def apply(): SchemaContactsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactsListResponse]
  }
  @scala.inline
  implicit class SchemaContactsListResponseOps[Self <: SchemaContactsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaContact]): Self = {
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

