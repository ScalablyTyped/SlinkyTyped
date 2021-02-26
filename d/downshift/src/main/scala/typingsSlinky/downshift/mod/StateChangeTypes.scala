package typingsSlinky.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StateChangeTypes extends StObject
@JSImport("downshift", "StateChangeTypes")
@js.native
object StateChangeTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StateChangeTypes with String] = js.native
  
  @js.native
  sealed trait blurButton extends StateChangeTypes
  /* "__autocomplete_blur_button__" */ val blurButton: typingsSlinky.downshift.mod.StateChangeTypes.blurButton with String = js.native
  
  @js.native
  sealed trait blurInput extends StateChangeTypes
  /* "__autocomplete_blur_input__" */ val blurInput: typingsSlinky.downshift.mod.StateChangeTypes.blurInput with String = js.native
  
  @js.native
  sealed trait changeInput extends StateChangeTypes
  /* "__autocomplete_change_input__" */ val changeInput: typingsSlinky.downshift.mod.StateChangeTypes.changeInput with String = js.native
  
  @js.native
  sealed trait clickButton extends StateChangeTypes
  /* "__autocomplete_click_button__" */ val clickButton: typingsSlinky.downshift.mod.StateChangeTypes.clickButton with String = js.native
  
  @js.native
  sealed trait clickItem extends StateChangeTypes
  /* "__autocomplete_click_item__" */ val clickItem: typingsSlinky.downshift.mod.StateChangeTypes.clickItem with String = js.native
  
  @js.native
  sealed trait controlledPropUpdatedSelectedItem extends StateChangeTypes
  /* "__autocomplete_controlled_prop_updated_selected_item__" */ val controlledPropUpdatedSelectedItem: typingsSlinky.downshift.mod.StateChangeTypes.controlledPropUpdatedSelectedItem with String = js.native
  
  @js.native
  sealed trait itemMouseEnter extends StateChangeTypes
  /* "__autocomplete_item_mouseenter__" */ val itemMouseEnter: typingsSlinky.downshift.mod.StateChangeTypes.itemMouseEnter with String = js.native
  
  @js.native
  sealed trait keyDownArrowDown extends StateChangeTypes
  /* "__autocomplete_keydown_arrow_down__" */ val keyDownArrowDown: typingsSlinky.downshift.mod.StateChangeTypes.keyDownArrowDown with String = js.native
  
  @js.native
  sealed trait keyDownArrowUp extends StateChangeTypes
  /* "__autocomplete_keydown_arrow_up__" */ val keyDownArrowUp: typingsSlinky.downshift.mod.StateChangeTypes.keyDownArrowUp with String = js.native
  
  @js.native
  sealed trait keyDownEnter extends StateChangeTypes
  /* "__autocomplete_keydown_enter__" */ val keyDownEnter: typingsSlinky.downshift.mod.StateChangeTypes.keyDownEnter with String = js.native
  
  @js.native
  sealed trait keyDownEscape extends StateChangeTypes
  /* "__autocomplete_keydown_escape__" */ val keyDownEscape: typingsSlinky.downshift.mod.StateChangeTypes.keyDownEscape with String = js.native
  
  @js.native
  sealed trait keyDownSpaceButton extends StateChangeTypes
  /* "__autocomplete_keydown_space_button__" */ val keyDownSpaceButton: typingsSlinky.downshift.mod.StateChangeTypes.keyDownSpaceButton with String = js.native
  
  @js.native
  sealed trait mouseUp extends StateChangeTypes
  /* "__autocomplete_mouseup__" */ val mouseUp: typingsSlinky.downshift.mod.StateChangeTypes.mouseUp with String = js.native
  
  @js.native
  sealed trait touchEnd extends StateChangeTypes
  /* "__autocomplete_touchend__" */ val touchEnd: typingsSlinky.downshift.mod.StateChangeTypes.touchEnd with String = js.native
  
  @js.native
  sealed trait unknown extends StateChangeTypes
  /* "__autocomplete_unknown__" */ val unknown: typingsSlinky.downshift.mod.StateChangeTypes.unknown with String = js.native
}
