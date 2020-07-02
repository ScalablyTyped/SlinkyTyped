package typingsSlinky.antd.skeletonSkeletonMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.paragraphMod.SkeletonParagraphProps
import typingsSlinky.antd.titleMod.SkeletonTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var avatar: js.UndefOr[SkeletonAvatarProps | Boolean] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var paragraph: js.UndefOr[SkeletonParagraphProps | Boolean] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[SkeletonTitleProps | Boolean] = js.undefined
}

object SkeletonProps {
  @scala.inline
  def apply(): SkeletonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkeletonProps]
  }
  @scala.inline
  implicit class SkeletonPropsOps[Self <: SkeletonProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAvatar(value: SkeletonAvatarProps | Boolean): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setParagraph(value: SkeletonParagraphProps | Boolean): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setTitle(value: SkeletonTitleProps | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

