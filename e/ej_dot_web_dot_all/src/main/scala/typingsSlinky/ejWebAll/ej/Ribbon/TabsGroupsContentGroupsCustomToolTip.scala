package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContentGroupsCustomToolTip extends js.Object {
  /** Sets content to the custom tooltip. Text and HTML support are provided for content.
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.native
  /** Sets icon to the custom tooltip content.
    * @Default {null}
    */
  var prefixIcon: js.UndefOr[String] = js.native
  /** Sets title to the custom tooltip. Text and HTML support are provided for title and the title is in bold for text format.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
}

object TabsGroupsContentGroupsCustomToolTip {
  @scala.inline
  def apply(): TabsGroupsContentGroupsCustomToolTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroupsCustomToolTip]
  }
  @scala.inline
  implicit class TabsGroupsContentGroupsCustomToolTipOps[Self <: TabsGroupsContentGroupsCustomToolTip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

