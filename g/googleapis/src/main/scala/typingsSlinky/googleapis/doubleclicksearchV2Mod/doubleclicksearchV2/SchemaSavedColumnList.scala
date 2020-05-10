package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of saved columns. Advertisers create saved columns to report on
  * Floodlight activities, Google Analytics goals, or custom KPIs. To request
  * reports with saved columns, you&#39;ll need the saved column names that are
  * available from this list.
  */
@js.native
trait SchemaSavedColumnList extends js.Object {
  /**
    * The saved columns being requested.
    */
  var items: js.UndefOr[js.Array[SchemaSavedColumn]] = js.native
  /**
    * Identifies this as a SavedColumnList resource. Value: the fixed string
    * doubleclicksearch#savedColumnList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSavedColumnList {
  @scala.inline
  def apply(): SchemaSavedColumnList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedColumnList]
  }
  @scala.inline
  implicit class SchemaSavedColumnListOps[Self <: SchemaSavedColumnList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[SchemaSavedColumn]): Self = {
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

