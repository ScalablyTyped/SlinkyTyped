package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionSetProperties extends js.Object {
  var Properties: IDefaultProperties = js.native
  def Clone(): IActionSetProperties = js.native
}

object IActionSetProperties {
  @scala.inline
  def apply(Clone: () => IActionSetProperties, Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetProperties]
  }
  @scala.inline
  implicit class IActionSetPropertiesOps[Self <: IActionSetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IActionSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProperties(value: IDefaultProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

