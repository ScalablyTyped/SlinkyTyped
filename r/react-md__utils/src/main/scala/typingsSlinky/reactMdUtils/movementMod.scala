package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdUtils.movementTypesMod.MovementConfig
import typingsSlinky.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantMovementProviders
import typingsSlinky.reactMdUtils.useActiveDescendantMovementMod.ActiveDescendantOptions
import typingsSlinky.reactMdUtils.useFocusMovementMod.KeyboardFocusOptions
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.KeyboardMovementOptions
import typingsSlinky.reactMdUtils.useKeyboardMovementMod.KeyboardMovementProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movementMod {
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "IncrementMovementKey")
  @js.native
  object IncrementMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey with String] = js.native
    
    /* "Alt+ArrowDown" */ val AltArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowDown with String = js.native
    
    /* "Alt+ArrowLeft" */ val AltArrowLeft: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowLeft with String = js.native
    
    /* "Alt+ArrowRight" */ val AltArrowRight: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowRight with String = js.native
    
    /* "Alt+ArrowUp" */ val AltArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltArrowUp with String = js.native
    
    /* "Alt+PageDown" */ val AltPageDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageDown with String = js.native
    
    /* "Alt+PageUp" */ val AltPageUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.AltPageUp with String = js.native
    
    /* "ArrowDown" */ val ArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowDown with String = js.native
    
    /* "ArrowLeft" */ val ArrowLeft: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowLeft with String = js.native
    
    /* "ArrowRight" */ val ArrowRight: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowRight with String = js.native
    
    /* "ArrowUp" */ val ArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ArrowUp with String = js.native
    
    /* "Control+ArrowDown" */ val ControlArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowDown with String = js.native
    
    /* "Control+ArrowUp" */ val ControlArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ControlArrowUp with String = js.native
    
    /* "PageDown" */ val PageDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.PageDown with String = js.native
    
    /* "PageUp" */ val PageUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.PageUp with String = js.native
    
    /* "Shift+ArrowDown" */ val ShiftArrowDown: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowDown with String = js.native
    
    /* "Shift+ArrowLeft" */ val ShiftArrowLeft: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowLeft with String = js.native
    
    /* "Shift+ArrowRight" */ val ShiftArrowRight: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowRight with String = js.native
    
    /* "Shift+ArrowUp" */ val ShiftArrowUp: typingsSlinky.reactMdUtils.movementTypesMod.IncrementMovementKey.ShiftArrowUp with String = js.native
  }
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "JumpMovementKey")
  @js.native
  object JumpMovementKey extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey with String] = js.native
    
    /* "Alt+End" */ val AltEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.AltEnd with String = js.native
    
    /* "Alt+Home" */ val AltHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.AltHome with String = js.native
    
    /* "Control+End" */ val ControlEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlEnd with String = js.native
    
    /* "Control+Home" */ val ControlHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlHome with String = js.native
    
    /* "Control+Shift+End" */ val ControlShiftEnd: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftEnd with String = js.native
    
    /* "Control+Shift+Home" */ val ControlShiftHome: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.ControlShiftHome with String = js.native
    
    /* "End" */ val End: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.End with String = js.native
    
    /* "Home" */ val Home: typingsSlinky.reactMdUtils.movementTypesMod.JumpMovementKey.Home with String = js.native
  }
  
  object MovementPresets {
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_COMBOBOX")
    @js.native
    val HORIZONTAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_LISTBOX")
    @js.native
    val HORIZONTAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_MENU")
    @js.native
    val HORIZONTAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_TABS")
    @js.native
    val HORIZONTAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.HORIZONTAL_TREE")
    @js.native
    val HORIZONTAL_TREE: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_COMBOBOX")
    @js.native
    val VERTICAL_COMBOBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_LISTBOX")
    @js.native
    val VERTICAL_LISTBOX: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_MENU")
    @js.native
    val VERTICAL_MENU: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_TABS")
    @js.native
    val VERTICAL_TABS: MovementConfig = js.native
    
    @JSImport("@react-md/utils/types/wia-aria/movement", "MovementPresets.VERTICAL_TREE")
    @js.native
    val VERTICAL_TREE: MovementConfig = js.native
  }
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "getItemId")
  @js.native
  def getItemId(id: String, i: Double): String = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "useActiveDescendantMovement")
  @js.native
  def useActiveDescendantMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasBaseIdGetIdDefaultFocusedIndexItemsOnChangeGetItemValueValueKeyOnKeyDownOnEnterOnSpaceOptions: ActiveDescendantOptions[D, CE, IE]
  ): ActiveDescendantMovementProviders[CE, IE] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "useFocusMovement")
  @js.native
  def useFocusMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](hasDefaultFocusedIndexOnChangeOptions: KeyboardFocusOptions[D, CE, IE]): KeyboardMovementProviders[CE, IE] = js.native
  
  @JSImport("@react-md/utils/types/wia-aria/movement", "useKeyboardMovement")
  @js.native
  def useKeyboardMovement[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */](
    hasOnKeyDownIncrementKeysDecrementKeysJumpToFirstKeysJumpToLastKeysStopPropagationOnChangeItemsResetTimeFindMatchIndexFocusedIndexLoopableSearchableValueKeyGetItemValue: KeyboardMovementOptions[D, CE, IE]
  ): KeyboardMovementProviders[CE, IE] = js.native
}
