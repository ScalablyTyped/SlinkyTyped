package typingsSlinky.reactMdList.listItemChildrenMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonPosition
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemChildrenProps extends js.Object {
  
  /**
    * The main content to display. When the `textChildren` prop is enabled and
    * there is child content, it will be treated as primary text and update the
    * styles automatically.
    */
  var children: js.UndefOr[ReactElement] = js.native
  
  /**
    * Boolean if the left and/or right addons should be "forcefully" wrapped in a
    * `<span>` with the spacing class names applied instead of attempting to
    * clone it into the provided icon element.
    */
  var forceAddonWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional addon to display to the left of the `primaryText` or
    * `children` and should be used with the `leftAddonType` prop to adjust
    * spacing.
    */
  var leftAddon: js.UndefOr[ReactElement] = js.native
  
  /**
    * The vertical position the left icon, avatar, media, or large media
    * should be placed.
    */
  var leftAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
  
  /**
    * The type of the addon that appears to the left of the `primaryText` or
    * `children`.
    */
  var leftAddonType: js.UndefOr[ListItemAddonType] = js.native
  
  /**
    * An optional element that should be rendered as the `primaryText` within the
    * list item. It is most likely easier to use the `children` prop instead, but
    * this allows you to create more complex components with the `ListItem` since
    * you can provided `children` and have the styles for the `primaryText` still
    * applied. By default, this will only allow one line of text and add ellipsis
    * for any text overflow.
    */
  var primaryText: js.UndefOr[ReactElement] = js.native
  
  /**
    * An optional addon to display to the right of the `primaryText` or
    * `children` and should be used with the `rightAddonType` prop to adjust
    * spacing.
    */
  var rightAddon: js.UndefOr[ReactElement] = js.native
  
  /**
    * The vertical position the right icon, avatar, media, or large media
    * should be placed.
    */
  var rightAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
  
  /**
    * The type of the addon that appears to the right of the `primaryText` or
    * `children`.
    */
  var rightAddonType: js.UndefOr[ListItemAddonType] = js.native
  
  /**
    * An optional element that should be rendered as the `secondaryText` within
    * the list item. By default, this will only span one line and add ellipsis
    * for overflow.
    */
  var secondaryText: js.UndefOr[ReactElement] = js.native
  
  /**
    * An optional className to apply to the `<span>` that surrounds the
    * `secondaryText` within the list item.
    */
  var secondaryTextClassName: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the children should be treated as the `primaryText` prop. This
    * will wrap them in an additional class so that they have ellipsis for text
    * overflow.
    *
    * If you want to have more "freedom" within the `ListItem`, you can disable
    * this prop so that the height will grow depending on content.
    *
    * NOTE: If the `secondaryText` prop is provided, this will always be
    * considered `true`.
    */
  var textChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional className to apply to the `<span>` that surrounds the
    * `primaryText` and optionally `secondaryText` within the list item.
    */
  var textClassName: js.UndefOr[String] = js.native
}
object ListItemChildrenProps {
  
  @scala.inline
  def apply(): ListItemChildrenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemChildrenProps]
  }
  
  @scala.inline
  implicit class ListItemChildrenPropsOps[Self <: ListItemChildrenProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setForceAddonWrap(value: Boolean): Self = this.set("forceAddonWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAddonWrap: Self = this.set("forceAddonWrap", js.undefined)
    
    @scala.inline
    def setLeftAddonReactElement(value: ReactElement): Self = this.set("leftAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftAddon(value: ReactElement): Self = this.set("leftAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAddon: Self = this.set("leftAddon", js.undefined)
    
    @scala.inline
    def setLeftAddonPosition(value: ListItemAddonPosition): Self = this.set("leftAddonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAddonPosition: Self = this.set("leftAddonPosition", js.undefined)
    
    @scala.inline
    def setLeftAddonType(value: ListItemAddonType): Self = this.set("leftAddonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAddonType: Self = this.set("leftAddonType", js.undefined)
    
    @scala.inline
    def setPrimaryTextReactElement(value: ReactElement): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryText(value: ReactElement): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    
    @scala.inline
    def setRightAddonReactElement(value: ReactElement): Self = this.set("rightAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightAddon(value: ReactElement): Self = this.set("rightAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAddon: Self = this.set("rightAddon", js.undefined)
    
    @scala.inline
    def setRightAddonPosition(value: ListItemAddonPosition): Self = this.set("rightAddonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAddonPosition: Self = this.set("rightAddonPosition", js.undefined)
    
    @scala.inline
    def setRightAddonType(value: ListItemAddonType): Self = this.set("rightAddonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAddonType: Self = this.set("rightAddonType", js.undefined)
    
    @scala.inline
    def setSecondaryTextReactElement(value: ReactElement): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryText(value: ReactElement): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    
    @scala.inline
    def setSecondaryTextClassName(value: String): Self = this.set("secondaryTextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryTextClassName: Self = this.set("secondaryTextClassName", js.undefined)
    
    @scala.inline
    def setTextChildren(value: Boolean): Self = this.set("textChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextChildren: Self = this.set("textChildren", js.undefined)
    
    @scala.inline
    def setTextClassName(value: String): Self = this.set("textClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassName: Self = this.set("textClassName", js.undefined)
  }
}
