package typingsSlinky.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  /**
    * Selector used by dynatable in order to find the table body rows
    *
    * @default 'tbody tr'
    */
  var bodyRowSelector: js.UndefOr[String] = js.native
  /** Generated internally by the plugin, will be reset by the DomColumns at init */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /**
    * By default, dynatable converts headings to JSON attribute names using:
    *
    * @enum('camelCase', 'trimDash', 'dashed', 'underscore', 'lowercase')
    * @default 'camelCase'
    * @see http://www.dynatable.com/#converting-attribute-names
    *
    * @example
    * // Given the html `<th>Favorite Music</th>` column header
    * // `camelCase` would translate it to id `favoriteMusic`
    * // `trimDash` would translate it to id `Favorite-Music`
    * // `dashed` would translate it to id `favorite-music`
    * // `underscore` would translate it to id `favorite_music`
    * // `lowercase` would translate it to id `favorite music`
    */
  var defaultColumnIdStyle: js.UndefOr[String] = js.native
  /**
    * Optional classname that can be added by dynatable to the header cells
    *
    * @default null
    */
  var headRowClass: js.UndefOr[String] = js.native
  /**
    * Selector used by dynatable in order to find the table header row
    *
    * @default 'thead tr'
    */
  var headRowSelector: js.UndefOr[String] = js.native
}

object Table {
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyRowSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRowSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyRowSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRowSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[Column]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultColumnIdStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnIdStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultColumnIdStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultColumnIdStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadRowClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headRowClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadRowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headRowClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadRowSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headRowSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadRowSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headRowSelector")(js.undefined)
        ret
    }
  }
  
}

