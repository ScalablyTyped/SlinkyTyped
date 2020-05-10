package typingsSlinky.reactBreadcrumbsDynamic.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbsProps extends js.Object {
  var container: js.UndefOr[String | Element | js.Object] = js.native
  var containerProps: js.UndefOr[js.Object] = js.native
  var duplicateProps: js.UndefOr[js.Object] = js.native
  var finalItem: js.UndefOr[String | Element | js.Object] = js.native
  var finalProps: js.UndefOr[js.Object] = js.native
  var item: js.UndefOr[String | Element | js.Object] = js.native
  var renameProps: js.UndefOr[js.Object] = js.native
  var separator: js.UndefOr[String | Element | js.Object] = js.native
}

object BreadcrumbsProps {
  @scala.inline
  def apply(): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbsProps]
  }
  @scala.inline
  implicit class BreadcrumbsPropsOps[Self <: BreadcrumbsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String | Element | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateProps")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalItemElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalItem(value: String | Element | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalItem")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalProps")(js.undefined)
        ret
    }
    @scala.inline
    def withItemElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: String | Element | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameProps")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatorElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparator(value: String | Element | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
  }
  
}

