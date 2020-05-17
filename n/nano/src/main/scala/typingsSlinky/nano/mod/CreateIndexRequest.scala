package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.Fields
import typingsSlinky.nano.nanoStrings.json
import typingsSlinky.nano.nanoStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#db-index
@js.native
trait CreateIndexRequest extends js.Object {
  // Name of the design document in which the index will be created.
  var ddoc: js.UndefOr[String] = js.native
  // JSON object describing the index to create
  var index: Fields = js.native
  // Name of the index. If no name is provided, a name will be generated automatically.
  var name: js.UndefOr[String] = js.native
  // This field sets whether the created index will be a partitioned or global index.
  var partitioned: js.UndefOr[Boolean] = js.native
  // Can be "json" or "text". Defaults to json.
  var `type`: js.UndefOr[json | text] = js.native
}

object CreateIndexRequest {
  @scala.inline
  def apply(index: Fields): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  @scala.inline
  implicit class CreateIndexRequestOps[Self <: CreateIndexRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDdoc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDdoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ddoc")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitioned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitioned")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: json | text): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

