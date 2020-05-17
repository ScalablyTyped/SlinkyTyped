package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertySet extends js.Object {
  var propertySet: js.UndefOr[String] = js.native
  var stateProperties: js.UndefOr[js.Array[_]] = js.native
}

object PropertySet {
  @scala.inline
  def apply(): PropertySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertySet]
  }
  @scala.inline
  implicit class PropertySetOps[Self <: PropertySet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertySet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertySet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertySet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertySet")(js.undefined)
        ret
    }
    @scala.inline
    def withStateProperties(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateProperties")(js.undefined)
        ret
    }
  }
  
}

