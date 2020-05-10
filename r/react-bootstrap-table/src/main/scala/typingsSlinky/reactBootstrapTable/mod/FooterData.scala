package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FooterData extends js.Object {
  /**
  	 * Text alignment for the data in this footer.
  	 */
  var align: js.UndefOr[DataAlignType] = js.native
  /**
  	 * Index for the column that this footer belongs to
  	 */
  var columnIndex: Double = js.native
  /**
  	 * Formatting function for the data in this footer. Used to be able to do things like sum the contents of this
  	 * column in the table so that the footer can be used for totals, etc.
  	 *
  	 * The output value from the formatter function will be used instead of the label if the formatter function is
  	 * defined.
  	 */
  var formatter: js.UndefOr[js.Function1[/* tableData */ js.Array[_], String | Double | ReactElement]] = js.native
  /**
  	 * Title to display for the column footer
  	 */
  var label: String = js.native
}

object FooterData {
  @scala.inline
  def apply(columnIndex: Double, label: String): FooterData = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterData]
  }
  @scala.inline
  implicit class FooterDataOps[Self <: FooterData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: DataAlignType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatter(value: /* tableData */ js.Array[_] => String | Double | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
  }
  
}

