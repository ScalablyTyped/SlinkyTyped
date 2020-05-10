package typingsSlinky.gaeaModel

import typingsSlinky.gaeaModel.FitGaea.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBeforeName extends js.Object {
  var beforeName: String = js.native
  // 重置前的信息
  var beforeProps: ComponentProps = js.native
}

object AnonBeforeName {
  @scala.inline
  def apply(beforeName: String, beforeProps: ComponentProps): AnonBeforeName = {
    val __obj = js.Dynamic.literal(beforeName = beforeName.asInstanceOf[js.Any], beforeProps = beforeProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeforeName]
  }
  @scala.inline
  implicit class AnonBeforeNameOps[Self <: AnonBeforeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeProps(value: ComponentProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

