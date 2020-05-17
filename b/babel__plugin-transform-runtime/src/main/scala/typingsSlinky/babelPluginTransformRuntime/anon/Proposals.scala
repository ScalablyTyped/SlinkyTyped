package typingsSlinky.babelPluginTransformRuntime.anon

import typingsSlinky.babelPluginTransformRuntime.mod.CorejsOption
import typingsSlinky.babelPluginTransformRuntime.mod.CorejsVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proposals extends CorejsOption {
  var proposals: Boolean = js.native
  var version: CorejsVersion = js.native
}

object Proposals {
  @scala.inline
  def apply(proposals: Boolean, version: CorejsVersion): Proposals = {
    val __obj = js.Dynamic.literal(proposals = proposals.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proposals]
  }
  @scala.inline
  implicit class ProposalsOps[Self <: Proposals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProposals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: CorejsVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

