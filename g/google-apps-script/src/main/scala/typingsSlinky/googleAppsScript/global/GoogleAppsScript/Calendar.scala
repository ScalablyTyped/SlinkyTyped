package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Calendar")
@js.native
object Calendar extends js.Object {
  
  /**
    * An enum representing the named colors available in the Calendar service.
    */
  @js.native
  object Color extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color with Double] = js.native
    
    /* 0 */ val BLUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.BLUE with Double = js.native
    
    /* 1 */ val BROWN: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.BROWN with Double = js.native
    
    /* 2 */ val CHARCOAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.CHARCOAL with Double = js.native
    
    /* 3 */ val CHESTNUT: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.CHESTNUT with Double = js.native
    
    /* 4 */ val GRAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.GRAY with Double = js.native
    
    /* 5 */ val GREEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.GREEN with Double = js.native
    
    /* 6 */ val INDIGO: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.INDIGO with Double = js.native
    
    /* 7 */ val LIME: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.LIME with Double = js.native
    
    /* 8 */ val MUSTARD: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.MUSTARD with Double = js.native
    
    /* 9 */ val OLIVE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.OLIVE with Double = js.native
    
    /* 10 */ val ORANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.ORANGE with Double = js.native
    
    /* 11 */ val PINK: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.PINK with Double = js.native
    
    /* 12 */ val PLUM: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.PLUM with Double = js.native
    
    /* 13 */ val PURPLE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.PURPLE with Double = js.native
    
    /* 14 */ val RED: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.RED with Double = js.native
    
    /* 15 */ val RED_ORANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.RED_ORANGE with Double = js.native
    
    /* 16 */ val SEA_BLUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.SEA_BLUE with Double = js.native
    
    /* 17 */ val SLATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.SLATE with Double = js.native
    
    /* 18 */ val TEAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.TEAL with Double = js.native
    
    /* 19 */ val TURQOISE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.TURQOISE with Double = js.native
    
    /* 20 */ val YELLOW: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Color.YELLOW with Double = js.native
  }
  
  /**
    * An enum representing the named event colors available in the Calendar service.
    */
  @js.native
  object EventColor extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor with Double] = js.native
    
    /* 8 */ val BLUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.BLUE with Double = js.native
    
    /* 6 */ val CYAN: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.CYAN with Double = js.native
    
    /* 7 */ val GRAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.GRAY with Double = js.native
    
    /* 9 */ val GREEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.GREEN with Double = js.native
    
    /* 2 */ val MAUVE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.MAUVE with Double = js.native
    
    /* 5 */ val ORANGE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.ORANGE with Double = js.native
    
    /* 0 */ val PALE_BLUE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.PALE_BLUE with Double = js.native
    
    /* 1 */ val PALE_GREEN: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.PALE_GREEN with Double = js.native
    
    /* 3 */ val PALE_RED: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.PALE_RED with Double = js.native
    
    /* 10 */ val RED: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.RED with Double = js.native
    
    /* 4 */ val YELLOW: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.EventColor.YELLOW with Double = js.native
  }
  
  /**
    * An enum representing the statuses a guest can have for an event.
    */
  @js.native
  object GuestStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus with Double] = js.native
    
    /* 0 */ val INVITED: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.INVITED with Double = js.native
    
    /* 1 */ val MAYBE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.MAYBE with Double = js.native
    
    /* 2 */ val NO: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.NO with Double = js.native
    
    /* 3 */ val OWNER: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.OWNER with Double = js.native
    
    /* 4 */ val YES: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.GuestStatus.YES with Double = js.native
  }
  
  /**
    * An enum representing the visibility of an event.
    */
  @js.native
  object Visibility extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Visibility with Double] = js.native
    
    /* 0 */ val CONFIDENTIAL: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Visibility.CONFIDENTIAL with Double = js.native
    
    /* 1 */ val DEFAULT: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Visibility.DEFAULT with Double = js.native
    
    /* 2 */ val PRIVATE: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Visibility.PRIVATE with Double = js.native
    
    /* 3 */ val PUBLIC: typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Visibility.PUBLIC with Double = js.native
  }
}
