package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnloadT extends js.Object {
  var onloadT: integer = js.native
  var pageT: integer = js.native
  var startE: integer = js.native
  var tran: integer = js.native
}

object OnloadT {
  @scala.inline
  def apply(onloadT: integer, pageT: integer, startE: integer, tran: integer): OnloadT = {
    val __obj = js.Dynamic.literal(onloadT = onloadT.asInstanceOf[js.Any], pageT = pageT.asInstanceOf[js.Any], startE = startE.asInstanceOf[js.Any], tran = tran.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnloadT]
  }
  @scala.inline
  implicit class OnloadTOps[Self <: OnloadT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnloadT(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageT(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartE(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTran(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tran")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

