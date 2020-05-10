package typingsSlinky.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --- Browser ---
@js.native
trait BrowserOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.native
  var domain: js.UndefOr[js.Any] = js.native
  var flags: js.UndefOr[js.Any] = js.native
  var interfaceIndex: js.UndefOr[Double] = js.native
  var networkInterface: js.UndefOr[String] = js.native
  var resolverSequence: js.UndefOr[
    js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]
  ] = js.native
}

object BrowserOptions {
  @scala.inline
  def apply(): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptions]
  }
  @scala.inline
  implicit class BrowserOptionsOps[Self <: BrowserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withFlags(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.undefined)
        ret
    }
    @scala.inline
    def withInterfaceIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterfaceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interfaceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withResolverSequence(value: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolverSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolverSequence")(js.undefined)
        ret
    }
  }
  
}

