package typingsSlinky.appBuilderLib.platformSpecificBuildOptionsMod

import typingsSlinky.appBuilderLib.integrityMod.AsarIntegrityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsarOptions extends AsarIntegrityOptions {
  var ordering: js.UndefOr[String | Null] = js.native
  /**
    * Whether to automatically unpack executables files.
    * @default true
    */
  var smartUnpack: js.UndefOr[Boolean] = js.native
}

object AsarOptions {
  @scala.inline
  def apply(): AsarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsarOptions]
  }
  @scala.inline
  implicit class AsarOptionsOps[Self <: AsarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrdering(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordering")(null)
        ret
    }
    @scala.inline
    def withSmartUnpack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartUnpack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartUnpack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartUnpack")(js.undefined)
        ret
    }
  }
  
}

