package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMapping extends js.Object {
  var entityTypeName: String = js.native
  var realValue: js.Any = js.native
  var tempValue: js.Any = js.native
}

object KeyMapping {
  @scala.inline
  def apply(entityTypeName: String, realValue: js.Any, tempValue: js.Any): KeyMapping = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any], realValue = realValue.asInstanceOf[js.Any], tempValue = tempValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapping]
  }
  @scala.inline
  implicit class KeyMappingOps[Self <: KeyMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

