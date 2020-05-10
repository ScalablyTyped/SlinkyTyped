package typingsSlinky.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The capacity of a product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#capacity.
  */
@js.native
trait SchemaCapacity extends js.Object {
  /**
    * The unit of the capacity, i.e., MB, GB, or TB.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The numeric value of the capacity.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaCapacity {
  @scala.inline
  def apply(): SchemaCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapacity]
  }
  @scala.inline
  implicit class SchemaCapacityOps[Self <: SchemaCapacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

