package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.buttongroup
import typingsSlinky.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyButtonGroup
  extends CustomPropertyCommon
     with CustomProperty {
  var component: buttongroup = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]]] = js.native
  @JSName("type")
  var type_CustomPropertyButtonGroup: string = js.native
}

object CustomPropertyButtonGroup {
  @scala.inline
  def apply(component: buttongroup, `type`: string): CustomPropertyButtonGroup = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyButtonGroup]
  }
  @scala.inline
  implicit class CustomPropertyButtonGroupOps[Self <: CustomPropertyButtonGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: buttongroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsFunction0(value: () => js.Array[ButtonGroupOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

