package typingsSlinky.nodegit.rebaseMod

import typingsSlinky.nodegit.checkoutOptionsMod.CheckoutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebaseOptions extends js.Object {
  var checkoutOptions: CheckoutOptions = js.native
  var quiet: Double = js.native
  var rewriteNotesRef: String = js.native
  var version: Double = js.native
}

object RebaseOptions {
  @scala.inline
  def apply(checkoutOptions: CheckoutOptions, quiet: Double, rewriteNotesRef: String, version: Double): RebaseOptions = {
    val __obj = js.Dynamic.literal(checkoutOptions = checkoutOptions.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], rewriteNotesRef = rewriteNotesRef.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebaseOptions]
  }
  @scala.inline
  implicit class RebaseOptionsOps[Self <: RebaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckoutOptions(value: CheckoutOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkoutOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuiet(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewriteNotesRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteNotesRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

