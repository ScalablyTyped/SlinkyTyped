package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslProperties extends js.Object {
  /**
    * A Boolean option to control whether SSL should be disabled.
    */
  var DisableSsl: js.UndefOr[Boolean] = js.native
}

object SslProperties {
  @scala.inline
  def apply(): SslProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslProperties]
  }
  @scala.inline
  implicit class SslPropertiesOps[Self <: SslProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableSsl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableSsl")(js.undefined)
        ret
    }
  }
  
}

