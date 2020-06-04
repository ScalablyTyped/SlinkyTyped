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
trait BootstrapOptions extends js.Object {
  /**
    * Optionally specify which `NgZone` should be used.
    *
    * - Provide your own `NgZone` instance.
    * - `zone.js` - Use default `NgZone` which requires `Zone.js`.
    * - `noop` - Use `NoopNgZone` which does nothing.
    */
  var ngZone: js.UndefOr[NgZone | zoneDotjs | noop] = js.undefined
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNgZone(value: NgZone | zoneDotjs | noop): Self = this.set("ngZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNgZone: Self = this.set("ngZone", js.undefined)
  }
  
}

