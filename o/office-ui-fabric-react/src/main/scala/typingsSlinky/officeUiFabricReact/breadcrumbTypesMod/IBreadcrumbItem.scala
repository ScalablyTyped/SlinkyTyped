package typingsSlinky.officeUiFabricReact.breadcrumbTypesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h1
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h2
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h3
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h4
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h5
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.h6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbItem extends js.Object {
  /**
    * Optional prop to render the item as a heading of your choice.
    *
    * You can also use this to force items to render as links instead of buttons (by default,
    * any item with a `href` renders as a link, and any item without a `href` renders as a button).
    * This is not generally recommended because it may prevent activating the link using the keyboard.
    */
  var as: js.UndefOr[h1 | h2 | h3 | h4 | h5 | h6 | a] = js.native
  /**
    * Url to navigate to when this breadcrumb item is clicked.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * Whether this is the breadcrumb item the user is currently navigated to.
    * If true, `aria-current="page"` will be applied to this breadcrumb item.
    */
  var isCurrentItem: js.UndefOr[Boolean] = js.native
  /**
    * Arbitrary unique string associated with the breadcrumb item.
    */
  var key: String = js.native
  /**
    * Callback issued when the breadcrumb item is selected.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* item */ js.UndefOr[IBreadcrumbItem], 
      Unit
    ]
  ] = js.native
  /**
    * Text to display to the user for the breadcrumb item.
    */
  var text: String = js.native
}

object IBreadcrumbItem {
  @scala.inline
  def apply(key: String, text: String): IBreadcrumbItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbItem]
  }
  @scala.inline
  implicit class IBreadcrumbItemOps[Self <: IBreadcrumbItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAs(value: h1 | h2 | h3 | h4 | h5 | h6 | a): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCurrentItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCurrentItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[IBreadcrumbItem]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
  }
  
}

