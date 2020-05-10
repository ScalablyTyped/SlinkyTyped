package typingsSlinky.gapiClientSqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSchemaOnly extends js.Object {
  /** Export only schemas. */
  var schemaOnly: js.UndefOr[Boolean] = js.native
  /** Tables to export, or that were exported, from the specified database. If you specify tables, specify one and only one database. */
  var tables: js.UndefOr[js.Array[String]] = js.native
}

object AnonSchemaOnly {
  @scala.inline
  def apply(): AnonSchemaOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSchemaOnly]
  }
  @scala.inline
  implicit class AnonSchemaOnlyOps[Self <: AnonSchemaOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSchemaOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
  }
  
}

