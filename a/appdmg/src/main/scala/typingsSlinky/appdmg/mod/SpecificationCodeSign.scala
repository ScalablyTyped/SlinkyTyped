package typingsSlinky.appdmg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecificationCodeSign extends js.Object {
  var identifier: js.UndefOr[String] = js.native
  var `signing-identity`: String = js.native
}

object SpecificationCodeSign {
  @scala.inline
  def apply(`signing-identity`: String): SpecificationCodeSign = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signing-identity")(`signing-identity`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificationCodeSign]
  }
  @scala.inline
  implicit class SpecificationCodeSignOps[Self <: SpecificationCodeSign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withSigning-identity`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signing-identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
  }
  
}

