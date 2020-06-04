package typingsSlinky.reactNavigation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsP[P] extends js.Object {
  var params: js.UndefOr[P] = js.undefined
}

object ParamsP {
  @scala.inline
  def apply[P](): ParamsP[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsP[P]]
  }
  @scala.inline
  implicit class ParamsPOps[Self <: ParamsP[_], P] (val x: Self with ParamsP[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParams(value: P): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

