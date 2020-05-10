package typingsSlinky.reactWindow.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  /**
    * Optional CSS class to attach to outermost <div> element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var innerElementType: js.UndefOr[ReactElementType] = js.native
  /**
    * Ref to attach to the inner container element. This is an advanced property.
    */
  var innerRef: js.UndefOr[Ref[_]] = js.native
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var innerTagName: js.UndefOr[String] = js.native
  /**
    * Contextual data to be passed to the item renderer as a data prop. This is a light-weight alternative to React's built-in context API.
    *
    * Item data is useful for item renderers that are class components.
    */
  var itemData: js.UndefOr[js.Any] = js.native
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var outerElementType: js.UndefOr[ReactElementType] = js.native
  /**
    * Ref to attach to the outer container element. This is an advanced property.
    */
  var outerRef: js.UndefOr[Ref[_]] = js.native
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var outerTagName: js.UndefOr[String] = js.native
  /**
    * Optional inline style to attach to outermost <div> element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Adds an additional isScrolling parameter to the children render function. This parameter can be used to show a placeholder row or column while the list is being scrolled.
    *
    * Note that using this parameter will result in an additional render call after scrolling has stopped (when isScrolling changes from true to false).
    */
  var useIsScrolling: js.UndefOr[Boolean] = js.native
}

object CommonProps {
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerElementTypeFunctionComponent(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerElementTypeComponentClass(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerElementType(value: ReactElementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerElementType")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(null)
        ret
    }
    @scala.inline
    def withInnerTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withItemData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterElementTypeFunctionComponent(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterElementTypeComponentClass(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterElementType(value: ReactElementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerElementType")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOuterRef(value: Ref[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withOuterRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRef")(null)
        ret
    }
    @scala.inline
    def withOuterTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuterTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerTagName")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUseIsScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIsScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseIsScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useIsScrolling")(js.undefined)
        ret
    }
  }
  
}

