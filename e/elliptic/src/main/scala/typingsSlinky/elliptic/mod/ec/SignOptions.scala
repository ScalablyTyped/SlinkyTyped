package typingsSlinky.elliptic.mod.ec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignOptions extends js.Object {
  var canonical: js.UndefOr[Boolean] = js.native
  var k: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ] = js.native
  var pers: js.UndefOr[js.Any] = js.native
  var persEnc: js.UndefOr[String] = js.native
}

object SignOptions {
  @scala.inline
  def apply(): SignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignOptions]
  }
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonical")(js.undefined)
        ret
    }
    @scala.inline
    def withK(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(js.undefined)
        ret
    }
    @scala.inline
    def withPers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pers")(js.undefined)
        ret
    }
    @scala.inline
    def withPersEnc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persEnc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersEnc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persEnc")(js.undefined)
        ret
    }
  }
  
}

