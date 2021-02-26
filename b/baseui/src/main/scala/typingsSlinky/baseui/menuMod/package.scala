package typingsSlinky.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object menuMod {
  
  type ArrayItemsT = js.Array[typingsSlinky.baseui.menuMod.ItemT]
  
  type GetRequiredItemProps = js.Function2[
    /* item */ js.Any, 
    /* index */ scala.Double, 
    typingsSlinky.baseui.menuMod.RenderItemProps
  ]
  
  type ItemT = js.Any
  
  type ItemsT = typingsSlinky.baseui.menuMod.ArrayItemsT | typingsSlinky.baseui.menuMod.GroupedItemsT
  
  @scala.inline
  def Menu: slinky.core.ReactComponentClass[typingsSlinky.baseui.menuMod.StatelessMenuProps] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("Menu").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.baseui.menuMod.StatelessMenuProps]]
  
  type OnItemSelect = js.Function1[/* args */ typingsSlinky.baseui.anon.Item, js.Any]
  
  @scala.inline
  def OptionList: slinky.core.ReactComponentClass[typingsSlinky.baseui.menuMod.OptionListProps] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("OptionList").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.baseui.menuMod.OptionListProps]]
  
  @scala.inline
  def OptionProfile: slinky.core.ReactComponentClass[typingsSlinky.baseui.menuMod.OptionProfileProps] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("OptionProfile").asInstanceOf[slinky.core.ReactComponentClass[typingsSlinky.baseui.menuMod.OptionProfileProps]]
  
  type StateReducer = js.Function3[
    /* changeType */ typingsSlinky.baseui.baseuiStrings.moveDown | typingsSlinky.baseui.baseuiStrings.moveUp | typingsSlinky.baseui.baseuiStrings.reset | typingsSlinky.baseui.baseuiStrings.enter_ | typingsSlinky.baseui.baseuiStrings.click | typingsSlinky.baseui.baseuiStrings.character | typingsSlinky.baseui.baseuiStrings.focus | typingsSlinky.baseui.baseuiStrings.mouseEnter, 
    /* changes */ typingsSlinky.baseui.menuMod.StatefulContainerState, 
    /* currentState */ typingsSlinky.baseui.menuMod.StatefulContainerState, 
    typingsSlinky.baseui.menuMod.StatefulContainerState
  ]
  
  type StatefulMenuProps = typingsSlinky.baseui.menuMod.StatefulContainerProps with typingsSlinky.baseui.menuMod.MenuProps
  
  type StatelessMenuProps = typingsSlinky.baseui.menuMod.SharedStatelessProps with typingsSlinky.baseui.menuMod.MenuProps
  
  @scala.inline
  def StyledEmptyState: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledEmptyState").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledList: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledList").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledListItem: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledListItem").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledListItemProfile: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledListItemProfile").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileBody: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileBody").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileImg: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileImg").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileImgContainer: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileImgContainer").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileLabelsContainer: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileLabelsContainer").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileSubtitle: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileSubtitle").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
  
  @scala.inline
  def StyledProfileTitle: typingsSlinky.styletronReact.mod.StyletronComponent[js.Any] = typingsSlinky.baseui.menuMod.^.asInstanceOf[js.Dynamic].selectDynamic("StyledProfileTitle").asInstanceOf[typingsSlinky.styletronReact.mod.StyletronComponent[js.Any]]
}
