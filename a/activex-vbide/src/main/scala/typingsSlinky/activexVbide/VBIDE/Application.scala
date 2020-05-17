package typingsSlinky.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  @JSName("VBIDE.Application_typekey")
  var VBIDEDotApplication_typekey: Application = js.native
  val Version: String = js.native
}

object Application {
  @scala.inline
  def apply(VBIDEDotApplication_typekey: Application, Version: String): Application = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.Application_typekey")(VBIDEDotApplication_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  @scala.inline
  implicit class ApplicationOps[Self <: Application] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVBIDEDotApplication_typekey(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VBIDE.Application_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

