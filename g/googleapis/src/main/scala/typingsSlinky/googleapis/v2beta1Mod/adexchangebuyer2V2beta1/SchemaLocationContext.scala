package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The Geo criteria the restriction applies to.
  */
@js.native
trait SchemaLocationContext extends js.Object {
  /**
    * IDs representing the geo location for this context. Please refer to the
    * [geo-table.csv](https://storage.googleapis.com/adx-rtb-dictionaries/geo-table.csv)
    * file for different geo criteria IDs.
    */
  var geoCriteriaIds: js.UndefOr[js.Array[Double]] = js.native
}

object SchemaLocationContext {
  @scala.inline
  def apply(): SchemaLocationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationContext]
  }
  @scala.inline
  implicit class SchemaLocationContextOps[Self <: SchemaLocationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoCriteriaIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoCriteriaIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoCriteriaIds")(js.undefined)
        ret
    }
  }
  
}

