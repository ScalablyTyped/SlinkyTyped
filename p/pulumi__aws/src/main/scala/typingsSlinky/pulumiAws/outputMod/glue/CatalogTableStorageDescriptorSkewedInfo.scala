package typingsSlinky.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorSkewedInfo extends js.Object {
  /**
    * A list of names of columns that contain skewed values.
    */
  var skewedColumnNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var skewedColumnValueLocationMaps: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var skewedColumnValues: js.UndefOr[js.Array[String]] = js.native
}

object CatalogTableStorageDescriptorSkewedInfo {
  @scala.inline
  def apply(): CatalogTableStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptorSkewedInfo]
  }
  @scala.inline
  implicit class CatalogTableStorageDescriptorSkewedInfoOps[Self <: CatalogTableStorageDescriptorSkewedInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSkewedColumnNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedColumnNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedColumnNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedColumnNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewedColumnValueLocationMaps(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedColumnValueLocationMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedColumnValueLocationMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedColumnValueLocationMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewedColumnValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedColumnValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkewedColumnValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewedColumnValues")(js.undefined)
        ret
    }
  }
  
}

