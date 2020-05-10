package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired order for a specific property.
  */
@js.native
trait SchemaPropertyOrder extends js.Object {
  /**
    * The direction to order by. Defaults to `ASCENDING`.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The property to order by.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.native
}

object SchemaPropertyOrder {
  @scala.inline
  def apply(): SchemaPropertyOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyOrder]
  }
  @scala.inline
  implicit class SchemaPropertyOrderOps[Self <: SchemaPropertyOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: SchemaPropertyReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
  }
  
}

