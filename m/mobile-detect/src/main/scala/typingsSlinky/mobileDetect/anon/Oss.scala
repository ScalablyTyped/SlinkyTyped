package typingsSlinky.mobileDetect.anon

import typingsSlinky.mobileDetect.mod.MobileDetectComplexRules
import typingsSlinky.mobileDetect.mod.MobileDetectRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oss extends js.Object {
  var oss: MobileDetectRules = js.native
  var phones: MobileDetectRules = js.native
  var props: MobileDetectComplexRules = js.native
  var tablets: MobileDetectRules = js.native
  var uas: MobileDetectRules = js.native
  var utils: MobileDetectRules = js.native
}

object Oss {
  @scala.inline
  def apply(
    oss: MobileDetectRules,
    phones: MobileDetectRules,
    props: MobileDetectComplexRules,
    tablets: MobileDetectRules,
    uas: MobileDetectRules,
    utils: MobileDetectRules
  ): Oss = {
    val __obj = js.Dynamic.literal(oss = oss.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tablets = tablets.asInstanceOf[js.Any], uas = uas.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oss]
  }
  @scala.inline
  implicit class OssOps[Self <: Oss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOss(value: MobileDetectRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhones(value: MobileDetectRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: MobileDetectComplexRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTablets(value: MobileDetectRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUas(value: MobileDetectRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: MobileDetectRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

