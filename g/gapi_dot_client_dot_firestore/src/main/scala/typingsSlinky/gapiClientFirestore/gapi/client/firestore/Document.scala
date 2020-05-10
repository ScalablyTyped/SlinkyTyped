package typingsSlinky.gapiClientFirestore.gapi.client.firestore

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  /**
    * Output only. The time at which the document was created.
    *
    * This value increases monotonically when a document is deleted then
    * recreated. It can also be compared to values from other documents and
    * the `read_time` of a query.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The document's fields.
    *
    * The map keys represent field names.
    *
    * A simple field name contains only characters `a` to `z`, `A` to `Z`,
    * `0` to `9`, or `_`, and must not start with `0` to `9` or `_`. For example,
    * `foo_bar_17`.
    *
    * Field names matching the regular expression `__.&#42;__` are reserved. Reserved
    * field names are forbidden except in certain documented contexts. The map
    * keys, represented as UTF-8, must not exceed 1,500 bytes and cannot be
    * empty.
    *
    * Field paths may be used in other contexts to refer to structured fields
    * defined here. For `map_value`, the field path is represented by the simple
    * or quoted field names of the containing fields, delimited by `.`. For
    * example, the structured field
    * `"foo" : { map_value: { "x&y" : { string_value: "hello" }}}` would be
    * represented by the field path `foo.x&y`.
    *
    * Within a field path, a quoted field name starts and ends with `` ` `` and
    * may contain any character. Some characters, including `` ` ``, must be
    * escaped using a `\`. For example, `` `x&y` `` represents `x&y` and
    * `` `bak\`tik` `` represents `` bak`tik ``.
    */
  var fields: js.UndefOr[Record[String, Value]] = js.native
  /**
    * The resource name of the document, for example
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the document was last changed.
    *
    * This value is initally set to the `create_time` then increases
    * monotonically with each change to the document. It can also be
    * compared to values from other documents and the `read_time` of a query.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Document {
  @scala.inline
  def apply(): Document = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Record[String, Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
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
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

