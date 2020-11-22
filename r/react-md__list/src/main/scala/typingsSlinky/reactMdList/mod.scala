package typingsSlinky.reactMdList

import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdList.getListItemHeightMod.ListItemHeight
import typingsSlinky.reactMdList.getListItemHeightMod.SimpleListItemProps
import typingsSlinky.reactMdList.listItemAddonMod.ListItemAddonProps
import typingsSlinky.reactMdList.listItemChildrenMod.ListItemChildrenProps
import typingsSlinky.reactMdList.listItemLinkMod.ListItemLinkProps
import typingsSlinky.reactMdList.listItemLinkMod.ListItemLinkWithComponentProps
import typingsSlinky.reactMdList.listItemMod.ListItemProps
import typingsSlinky.reactMdList.listItemTextMod.ListItemTextProps
import typingsSlinky.reactMdList.listMod.ListElement
import typingsSlinky.reactMdList.listMod.ListProps
import typingsSlinky.reactMdList.listSubheaderMod.ListSubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val List: ForwardRefExoticComponent[ListProps with RefAttributes[ListElement]] = js.native
  
  val ListItem: ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  val ListItemLink: ForwardRefExoticComponent[
    (ListItemLinkProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])) | (ListItemLinkWithComponentProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ]))
  ] = js.native
  
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps with RefAttributes[HTMLLIElement]] = js.native
  
  val SimpleListItem: ForwardRefExoticComponent[SimpleListItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  def getListItemHeight(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText: SimpleListItemProps): ListItemHeight = js.native
  
  @js.native
  object ListItemAddon extends js.Object {
    
    def apply(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var addon: js.Any = js.native
      
      var addonAfter: js.Any = js.native
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var forceAddonWrap: js.Any = js.native
      
      var position: js.Any = js.native
      
      var `type`: js.Any = js.native
    }
  }
  
  @js.native
  object ListItemChildren extends js.Object {
    
    def apply(
      hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapChildren: ListItemChildrenProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var forceAddonWrap: js.Any = js.native
      
      var leftAddon: js.Any = js.native
      
      var leftAddonPosition: js.Any = js.native
      
      var leftAddonType: js.Any = js.native
      
      var primaryText: js.Any = js.native
      
      var rightAddon: js.Any = js.native
      
      var rightAddonPosition: js.Any = js.native
      
      var rightAddonType: js.Any = js.native
      
      var secondaryText: js.Any = js.native
      
      var secondaryTextClassName: js.Any = js.native
      
      var textChildren: js.Any = js.native
      
      var textClassName: js.Any = js.native
    }
  }
  
  @js.native
  object ListItemText extends js.Object {
    
    def apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var secondaryText: js.Any = js.native
      
      var secondaryTextClassName: js.Any = js.native
    }
  }
}
