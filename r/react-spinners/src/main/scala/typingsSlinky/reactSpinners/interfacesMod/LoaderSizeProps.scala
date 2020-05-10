package typingsSlinky.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderSizeProps extends CommonProps {
  var size: js.UndefOr[Double] = js.native
  var sizeUnit: js.UndefOr[String] = js.native
}

object LoaderSizeProps {
  @scala.inline
  def apply(): LoaderSizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderSizeProps]
  }
  @scala.inline
  implicit class LoaderSizePropsOps[Self <: LoaderSizeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeUnit")(js.undefined)
        ret
    }
  }
  
}

