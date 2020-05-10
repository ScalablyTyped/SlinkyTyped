package typingsSlinky.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllResults extends js.Object {
  var anonymityLevel: js.UndefOr[AnonymityLevel] = js.native
  var protocols: js.UndefOr[ProtocolResult] = js.native
  var tunnel: js.UndefOr[Result] = js.native
}

object AllResults {
  @scala.inline
  def apply(): AllResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllResults]
  }
  @scala.inline
  implicit class AllResultsOps[Self <: AllResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnonymityLevel(value: AnonymityLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymityLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnonymityLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anonymityLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocols(value: ProtocolResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(js.undefined)
        ret
    }
    @scala.inline
    def withTunnel(value: Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTunnel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tunnel")(js.undefined)
        ret
    }
  }
  
}

