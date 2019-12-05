package typingsSlinky.downshift.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StateChangeTypes extends js.Object

@JSImport("downshift", "StateChangeTypes")
@js.native
object StateChangeTypes extends js.Object {
  @js.native
  sealed trait blurButton extends StateChangeTypes
  
  @js.native
  sealed trait blurInput extends StateChangeTypes
  
  @js.native
  sealed trait changeInput extends StateChangeTypes
  
  @js.native
  sealed trait clickButton extends StateChangeTypes
  
  @js.native
  sealed trait clickItem extends StateChangeTypes
  
  @js.native
  sealed trait controlledPropUpdatedSelectedItem extends StateChangeTypes
  
  @js.native
  sealed trait itemMouseEnter extends StateChangeTypes
  
  @js.native
  sealed trait keyDownArrowDown extends StateChangeTypes
  
  @js.native
  sealed trait keyDownArrowUp extends StateChangeTypes
  
  @js.native
  sealed trait keyDownEnter extends StateChangeTypes
  
  @js.native
  sealed trait keyDownEscape extends StateChangeTypes
  
  @js.native
  sealed trait keyDownSpaceButton extends StateChangeTypes
  
  @js.native
  sealed trait mouseUp extends StateChangeTypes
  
  @js.native
  sealed trait touchEnd extends StateChangeTypes
  
  @js.native
  sealed trait unknown extends StateChangeTypes
  
  /* "__autocomplete_blur_button__" */ val blurButton: typingsSlinky.downshift.downshiftMod.StateChangeTypes.blurButton with String = js.native
  /* "__autocomplete_blur_input__" */ val blurInput: typingsSlinky.downshift.downshiftMod.StateChangeTypes.blurInput with String = js.native
  /* "__autocomplete_change_input__" */ val changeInput: typingsSlinky.downshift.downshiftMod.StateChangeTypes.changeInput with String = js.native
  /* "__autocomplete_click_button__" */ val clickButton: typingsSlinky.downshift.downshiftMod.StateChangeTypes.clickButton with String = js.native
  /* "__autocomplete_click_item__" */ val clickItem: typingsSlinky.downshift.downshiftMod.StateChangeTypes.clickItem with String = js.native
  /* "__autocomplete_controlled_prop_updated_selected_item__" */ val controlledPropUpdatedSelectedItem: typingsSlinky.downshift.downshiftMod.StateChangeTypes.controlledPropUpdatedSelectedItem with String = js.native
  /* "__autocomplete_item_mouseenter__" */ val itemMouseEnter: typingsSlinky.downshift.downshiftMod.StateChangeTypes.itemMouseEnter with String = js.native
  /* "__autocomplete_keydown_arrow_down__" */ val keyDownArrowDown: typingsSlinky.downshift.downshiftMod.StateChangeTypes.keyDownArrowDown with String = js.native
  /* "__autocomplete_keydown_arrow_up__" */ val keyDownArrowUp: typingsSlinky.downshift.downshiftMod.StateChangeTypes.keyDownArrowUp with String = js.native
  /* "__autocomplete_keydown_enter__" */ val keyDownEnter: typingsSlinky.downshift.downshiftMod.StateChangeTypes.keyDownEnter with String = js.native
  /* "__autocomplete_keydown_escape__" */ val keyDownEscape: typingsSlinky.downshift.downshiftMod.StateChangeTypes.keyDownEscape with String = js.native
  /* "__autocomplete_keydown_space_button__" */ val keyDownSpaceButton: typingsSlinky.downshift.downshiftMod.StateChangeTypes.keyDownSpaceButton with String = js.native
  /* "__autocomplete_mouseup__" */ val mouseUp: typingsSlinky.downshift.downshiftMod.StateChangeTypes.mouseUp with String = js.native
  /* "__autocomplete_touchend__" */ val touchEnd: typingsSlinky.downshift.downshiftMod.StateChangeTypes.touchEnd with String = js.native
  /* "__autocomplete_unknown__" */ val unknown: typingsSlinky.downshift.downshiftMod.StateChangeTypes.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StateChangeTypes with String] = js.native
}

