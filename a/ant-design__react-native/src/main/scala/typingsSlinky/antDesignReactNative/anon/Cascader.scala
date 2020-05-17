package typingsSlinky.antDesignReactNative.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader extends js.Object {
  var cascader: ReactElement = js.native
}

object Cascader {
  @scala.inline
  def apply(cascader: ReactElement): Cascader = {
    val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascader]
  }
  @scala.inline
  implicit class CascaderOps[Self <: Cascader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCascader(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

