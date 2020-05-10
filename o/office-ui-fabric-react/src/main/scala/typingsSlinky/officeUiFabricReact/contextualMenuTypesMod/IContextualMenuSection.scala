package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuSection
  extends ClassAttributes[js.Any] {
  /**
    * If set to true, the section will display a divider at the bottom of the section.
    */
  var bottomDivider: js.UndefOr[Boolean] = js.native
  /**
    * The items to include inside the section.
    */
  var items: js.Array[IContextualMenuItem] = js.native
  /**
    * The optional section title.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * If set to true, the section will display a divider at the top of the section.
    */
  var topDivider: js.UndefOr[Boolean] = js.native
}

object IContextualMenuSection {
  @scala.inline
  def apply(items: js.Array[IContextualMenuItem]): IContextualMenuSection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuSection]
  }
  @scala.inline
  implicit class IContextualMenuSectionOps[Self <: IContextualMenuSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottomDivider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomDivider")(js.undefined)
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
    @scala.inline
    def withTopDivider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topDivider")(js.undefined)
        ret
    }
  }
  
}

