package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChefConfiguration extends js.Object {
  /**
    * The Berkshelf version.
    */
  var BerkshelfVersion: js.UndefOr[String] = js.native
  /**
    * Whether to enable Berkshelf.
    */
  var ManageBerkshelf: js.UndefOr[Boolean] = js.native
}

object ChefConfiguration {
  @scala.inline
  def apply(): ChefConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChefConfiguration]
  }
  @scala.inline
  implicit class ChefConfigurationOps[Self <: ChefConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBerkshelfVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BerkshelfVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBerkshelfVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BerkshelfVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withManageBerkshelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManageBerkshelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManageBerkshelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManageBerkshelf")(js.undefined)
        ret
    }
  }
  
}

