package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtraProps extends js.Object {
  var extraProps: AnonRenderBodyComponent = js.native
  var restProps: AnonClassName = js.native
}

object AnonExtraProps {
  @scala.inline
  def apply(extraProps: AnonRenderBodyComponent, restProps: AnonClassName): AnonExtraProps = {
    val __obj = js.Dynamic.literal(extraProps = extraProps.asInstanceOf[js.Any], restProps = restProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtraProps]
  }
  @scala.inline
  implicit class AnonExtraPropsOps[Self <: AnonExtraProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraProps(value: AnonRenderBodyComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestProps(value: AnonClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

