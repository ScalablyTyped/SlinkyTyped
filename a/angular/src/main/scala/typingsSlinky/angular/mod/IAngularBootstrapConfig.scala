package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAngularBootstrapConfig extends js.Object {
  var strictDi: js.UndefOr[Boolean] = js.native
}

object IAngularBootstrapConfig {
  @scala.inline
  def apply(): IAngularBootstrapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAngularBootstrapConfig]
  }
  @scala.inline
  implicit class IAngularBootstrapConfigOps[Self <: IAngularBootstrapConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStrictDi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictDi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictDi")(js.undefined)
        ret
    }
  }
  
}

