package typingsSlinky.activexLibreoffice.com_.sun.star.awt.tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an {@link XTabPageModel} interface.
  * @since OOo 3.4
  */
@js.native
trait XTabPageModel extends js.Object {
  /** determines whether a tab page is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies a URL that references a graphic that should be displayed in the tab bar. */
  var ImageURL: String = js.native
  /** ID for tab page. */
  var TabPageID: Double = js.native
  /** specifies the text that is displayed in the tab bar of the tab page. */
  var Title: String = js.native
  /** specifies a tooltip text that should be displayed in the tab bar. */
  var ToolTip: String = js.native
}

object XTabPageModel {
  @scala.inline
  def apply(Enabled: Boolean, ImageURL: String, TabPageID: Double, Title: String, ToolTip: String): XTabPageModel = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ImageURL = ImageURL.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ToolTip = ToolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[XTabPageModel]
  }
  @scala.inline
  implicit class XTabPageModelOps[Self <: XTabPageModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabPageID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TabPageID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

