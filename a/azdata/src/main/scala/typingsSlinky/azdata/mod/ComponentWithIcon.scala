package typingsSlinky.azdata.mod

import typingsSlinky.azdata.anon.Dark
import typingsSlinky.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentWithIcon extends js.Object {
  /**
  		 * @deprecated This will be moved to `ComponentWithIconProperties`
  		 */
  var iconHeight: js.UndefOr[Double | String] = js.native
  /**
  		 * @deprecated This will be moved to `ComponentWithIconProperties`
  		 */
  var iconPath: js.UndefOr[String | Uri | Dark] = js.native
  /**
  		 * @deprecated This will be moved to `ComponentWithIconProperties`
  		 */
  var iconWidth: js.UndefOr[Double | String] = js.native
}

object ComponentWithIcon {
  @scala.inline
  def apply(): ComponentWithIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentWithIcon]
  }
  @scala.inline
  implicit class ComponentWithIconOps[Self <: ComponentWithIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconPath(value: String | Uri | Dark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(js.undefined)
        ret
    }
  }
  
}

