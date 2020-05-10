package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing a single field of a struct.
  */
@js.native
trait SchemaField extends js.Object {
  /**
    * The name of the field. For reads, this is the column name. For SQL
    * queries, it is the column alias (e.g., `&quot;Word&quot;` in the query
    * `&quot;SELECT &#39;hello&#39; AS Word&quot;`), or the column name (e.g.,
    * `&quot;ColName&quot;` in the query `&quot;SELECT ColName FROM
    * Table&quot;`). Some columns might have an empty name (e.g., !&quot;SELECT
    * UPPER(ColName)&quot;`). Note that a query result can contain multiple
    * fields with the same name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the field.
    */
  var `type`: js.UndefOr[SchemaType] = js.native
}

object SchemaField {
  @scala.inline
  def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  @scala.inline
  implicit class SchemaFieldOps[Self <: SchemaField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withType(value: SchemaType): Self = {
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

