package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreStrings.noop
import typingsSlinky.angularCore.angularCoreStrings.zoneDotjs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides additional options to the bootstraping process.
  *
  *
  */
@js.native
trait BootstrapOptions extends js.Object {
  /**
    * Optionally specify which `NgZone` should be used.
    *
    * - Provide your own `NgZone` instance.
    * - `zone.js` - Use default `NgZone` which requires `Zone.js`.
    * - `noop` - Use `NoopNgZone` which does nothing.
    */
  var ngZone: js.UndefOr[NgZone | zoneDotjs | noop] = js.native
}

object BootstrapOptions {
  @scala.inline
  def apply(): BootstrapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapOptions]
  }
  @scala.inline
  implicit class BootstrapOptionsOps[Self <: BootstrapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNgZone(value: NgZone | zoneDotjs | noop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngZone")(js.undefined)
        ret
    }
  }
  
}

