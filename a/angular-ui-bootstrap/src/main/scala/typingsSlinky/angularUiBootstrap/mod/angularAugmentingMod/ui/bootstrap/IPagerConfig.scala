package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPagerConfig extends js.Object {
  /**
    * Whether to align each link to the sides.
    *
    * @default true
    */
  var align: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of items per page. A value less than one indicates all items on one page.
    *
    * @default 10
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /**
    * Text for Next button.
    *
    * @default 'Next »'
    */
  var nextText: js.UndefOr[String] = js.native
  /**
    * Text for Previous button.
    *
    * @default '« Previous'
    */
  var previousText: js.UndefOr[String] = js.native
}

object IPagerConfig {
  @scala.inline
  def apply(): IPagerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagerConfig]
  }
  @scala.inline
  implicit class IPagerConfigOps[Self <: IPagerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsPerPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousText")(js.undefined)
        ret
    }
  }
  
}

