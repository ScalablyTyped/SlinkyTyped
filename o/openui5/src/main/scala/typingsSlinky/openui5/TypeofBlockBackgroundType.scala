package typingsSlinky.openui5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBlockBackgroundType extends js.Object {
  /**
    * Background is transparent
    */
  var Default: js.Any = js.native
  /**
    * Background is with predefined light colors
    */
  var Light: js.Any = js.native
}

object TypeofBlockBackgroundType {
  @scala.inline
  def apply(Default: js.Any, Light: js.Any): TypeofBlockBackgroundType = {
    val __obj = js.Dynamic.literal(Default = Default.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBlockBackgroundType]
  }
  @scala.inline
  implicit class TypeofBlockBackgroundTypeOps[Self <: TypeofBlockBackgroundType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Light")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

