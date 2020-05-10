package typingsSlinky.appBuilderLib.integrityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsarIntegrityOptions extends js.Object {
  /**
    * Allows external asar files.
    *
    * @default false
    */
  val externalAllowed: js.UndefOr[Boolean] = js.native
}

object AsarIntegrityOptions {
  @scala.inline
  def apply(): AsarIntegrityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsarIntegrityOptions]
  }
  @scala.inline
  implicit class AsarIntegrityOptionsOps[Self <: AsarIntegrityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAllowed")(js.undefined)
        ret
    }
  }
  
}

