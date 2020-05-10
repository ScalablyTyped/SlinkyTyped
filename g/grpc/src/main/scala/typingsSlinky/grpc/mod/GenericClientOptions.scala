package typingsSlinky.grpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericClientOptions extends js.Object {
  /**
    * Indicates that the old argument order should be used for methods, with
    * optional arguments at the end instead of the callback at the end. This
    * option is only a temporary stopgap measure to smooth an API breakage.
    * It is deprecated, and new code should not use it.
    */
  var deprecatedArgumentOrder: js.UndefOr[Boolean] = js.native
}

object GenericClientOptions {
  @scala.inline
  def apply(): GenericClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericClientOptions]
  }
  @scala.inline
  implicit class GenericClientOptionsOps[Self <: GenericClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeprecatedArgumentOrder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedArgumentOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedArgumentOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedArgumentOrder")(js.undefined)
        ret
    }
  }
  
}

