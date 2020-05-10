package typingsSlinky.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingHttpHeaders
  extends typingsSlinky.node.httpMod.IncomingHttpHeaders {
  @JSName(":authority")
  var Colonauthority: js.UndefOr[String] = js.native
  @JSName(":method")
  var Colonmethod: js.UndefOr[String] = js.native
  @JSName(":path")
  var Colonpath: js.UndefOr[String] = js.native
  @JSName(":scheme")
  var Colonscheme: js.UndefOr[String] = js.native
}

object IncomingHttpHeaders {
  @scala.inline
  def apply(): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
  @scala.inline
  implicit class IncomingHttpHeadersOps[Self <: IncomingHttpHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColonauthority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonauthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":authority")(js.undefined)
        ret
    }
    @scala.inline
    def withColonmethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonmethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":method")(js.undefined)
        ret
    }
    @scala.inline
    def withColonpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":path")(js.undefined)
        ret
    }
    @scala.inline
    def withColonscheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColonscheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(":scheme")(js.undefined)
        ret
    }
  }
  
}

