package typingsSlinky.humaneJs.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumaneOptions extends HumaneMessageOptions {
  var baseCls: js.UndefOr[String] = js.native
  var container: js.UndefOr[Element] = js.native
}

object HumaneOptions {
  @scala.inline
  def apply(): HumaneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumaneOptions]
  }
  @scala.inline
  implicit class HumaneOptionsOps[Self <: HumaneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCls")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
  }
  
}

