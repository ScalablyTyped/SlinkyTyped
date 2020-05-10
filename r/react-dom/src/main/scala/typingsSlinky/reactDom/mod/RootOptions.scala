package typingsSlinky.reactDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// exposeConcurrentModeAPIs features
@js.native
trait RootOptions extends js.Object {
  var hydrate: js.UndefOr[Boolean] = js.native
  var hydrationOptions: js.UndefOr[typingsSlinky.reactDom.experimentalMod.reactDomAugmentingMod.HydrationOptions] = js.native
}

object RootOptions {
  @scala.inline
  def apply(): RootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootOptions]
  }
  @scala.inline
  implicit class RootOptionsOps[Self <: RootOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHydrate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHydrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrate")(js.undefined)
        ret
    }
    @scala.inline
    def withHydrationOptions(value: typingsSlinky.reactDom.experimentalMod.reactDomAugmentingMod.HydrationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHydrationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hydrationOptions")(js.undefined)
        ret
    }
  }
  
}

