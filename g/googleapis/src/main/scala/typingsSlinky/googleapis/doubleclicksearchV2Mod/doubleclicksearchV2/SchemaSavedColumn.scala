package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A saved column
  */
@js.native
trait SchemaSavedColumn extends js.Object {
  /**
    * Identifies this as a SavedColumn resource. Value: the fixed string
    * doubleclicksearch#savedColumn.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the saved column.
    */
  var savedColumnName: js.UndefOr[String] = js.native
  /**
    * The type of data this saved column will produce.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaSavedColumn {
  @scala.inline
  def apply(): SchemaSavedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumn]
  }
  @scala.inline
  implicit class SchemaSavedColumnOps[Self <: SchemaSavedColumn] (val x: Self) extends AnyVal {
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
    def withSavedColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedColumnName")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

