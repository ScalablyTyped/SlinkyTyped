package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkewedInfo extends js.Object {
  /**
    * A list of names of columns that contain skewed values.
    */
  var SkewedColumnNames: js.UndefOr[NameStringList] = js.native
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.native
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.native
}

object SkewedInfo {
  @scala.inline
  def apply(): SkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkewedInfo]
  }
  @scala.inline
  implicit class SkewedInfoOps[Self <: SkewedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkewedColumnNames(value: NameStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedColumnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedColumnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewedColumnValueLocationMaps(value: LocationMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedColumnValueLocationMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedColumnValueLocationMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedColumnValueLocationMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewedColumnValues(value: ColumnValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedColumnValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedColumnValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkewedColumnValues")(js.undefined)
        ret
    }
  }
  
}

