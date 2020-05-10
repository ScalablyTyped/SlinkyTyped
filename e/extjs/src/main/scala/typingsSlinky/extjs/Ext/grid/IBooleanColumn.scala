package typingsSlinky.extjs.Ext.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBooleanColumn
  extends typingsSlinky.extjs.Ext.grid.column.IColumn {
  /** [Config Option] (String) */
  var falseText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var trueText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var undefinedText: js.UndefOr[String] = js.native
}

object IBooleanColumn {
  @scala.inline
  def apply(): IBooleanColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBooleanColumn]
  }
  @scala.inline
  implicit class IBooleanColumnOps[Self <: IBooleanColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFalseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseText")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueText")(js.undefined)
        ret
    }
    @scala.inline
    def withUndefinedText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndefinedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedText")(js.undefined)
        ret
    }
  }
  
}

