package typingsSlinky.materialChips

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/chips/chip/constants", JSImport.Namespace)
@js.native
object chipConstantsMod extends js.Object {
  
  val jumpChipKeys: Set[String] = js.native
  
  val navigationKeys: Set[String] = js.native
  
  @js.native
  sealed trait Direction extends js.Object
  @js.native
  object Direction extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction with String] = js.native
    
    @js.native
    sealed trait LEFT extends Direction
    /* "left" */ @js.native
    object LEFT extends TopLevel[LEFT with String]
    
    @js.native
    sealed trait RIGHT extends Direction
    /* "right" */ @js.native
    object RIGHT extends TopLevel[RIGHT with String]
  }
  
  @js.native
  sealed trait EventSource extends js.Object
  @js.native
  object EventSource extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventSource with String] = js.native
    
    @js.native
    sealed trait NONE extends EventSource
    /* "none" */ @js.native
    object NONE extends TopLevel[NONE with String]
    
    @js.native
    sealed trait PRIMARY extends EventSource
    /* "primary" */ @js.native
    object PRIMARY extends TopLevel[PRIMARY with String]
    
    @js.native
    sealed trait TRAILING extends EventSource
    /* "trailing" */ @js.native
    object TRAILING extends TopLevel[TRAILING with String]
  }
  
  @js.native
  object cssClasses extends js.Object {
    
    var CHECKMARK: String = js.native
    
    var CHIP_EXIT: String = js.native
    
    var DELETABLE: String = js.native
    
    var EDITABLE: String = js.native
    
    var EDITING: String = js.native
    
    var HIDDEN_LEADING_ICON: String = js.native
    
    var LEADING_ICON: String = js.native
    
    var PRIMARY_ACTION: String = js.native
    
    var PRIMARY_ACTION_FOCUSED: String = js.native
    
    var SELECTED: String = js.native
    
    var TEXT: String = js.native
    
    var TRAILING_ACTION: String = js.native
    
    var TRAILING_ICON: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    
    var ADDED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    
    var ARIA_CHECKED: String = js.native
    
    var ARROW_DOWN_KEY: String = js.native
    
    var ARROW_LEFT_KEY: String = js.native
    
    var ARROW_RIGHT_KEY: String = js.native
    
    var ARROW_UP_KEY: String = js.native
    
    var BACKSPACE_KEY: String = js.native
    
    var CHECKMARK_SELECTOR: String = js.native
    
    var DELETE_KEY: String = js.native
    
    var END_KEY: String = js.native
    
    var ENTER_KEY: String = js.native
    
    var ENTRY_ANIMATION_NAME: String = js.native
    
    var HOME_KEY: String = js.native
    
    var IE_ARROW_DOWN_KEY: String = js.native
    
    var IE_ARROW_LEFT_KEY: String = js.native
    
    var IE_ARROW_RIGHT_KEY: String = js.native
    
    var IE_ARROW_UP_KEY: String = js.native
    
    var IE_DELETE_KEY: String = js.native
    
    var INTERACTION_EVENT: String = js.native
    
    var LEADING_ICON_SELECTOR: String = js.native
    
    var NAVIGATION_EVENT: String = js.native
    
    var PRIMARY_ACTION_SELECTOR: String = js.native
    
    var REMOVAL_EVENT: String = js.native
    
    var REMOVED_ANNOUNCEMENT_ATTRIBUTE: String = js.native
    
    var SELECTION_EVENT: String = js.native
    
    var SPACEBAR_KEY: String = js.native
    
    var TAB_INDEX: String = js.native
    
    var TRAILING_ACTION_SELECTOR: String = js.native
    
    var TRAILING_ICON_INTERACTION_EVENT: String = js.native
    
    var TRAILING_ICON_SELECTOR: String = js.native
  }
}
