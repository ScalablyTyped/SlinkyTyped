package typingsSlinky.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLinkOpts extends js.Object {
  /** Whether or not to follow through any upstream links when resolving the source. */
  var canonical: js.UndefOr[Boolean] = js.native
}

object ReadLinkOpts {
  @scala.inline
  def apply(): ReadLinkOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadLinkOpts]
  }
  @scala.inline
  implicit class ReadLinkOptsOps[Self <: ReadLinkOpts] (val x: Self) extends AnyVal {
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
  }
  
}

