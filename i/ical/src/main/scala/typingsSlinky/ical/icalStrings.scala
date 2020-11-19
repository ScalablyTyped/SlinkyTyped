package typingsSlinky.ical

import typingsSlinky.ical.mod.CalendarComponentType
import typingsSlinky.ical.mod.FreeBusyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icalStrings {
  
  @scala.inline
  def BUSY: BUSY = "BUSY".asInstanceOf[BUSY]
  
  @scala.inline
  def FREE: FREE = "FREE".asInstanceOf[FREE]
  
  @scala.inline
  def VALARM: VALARM = "VALARM".asInstanceOf[VALARM]
  
  @scala.inline
  def VEVENT: VEVENT = "VEVENT".asInstanceOf[VEVENT]
  
  @scala.inline
  def VFREEBUSY: VFREEBUSY = "VFREEBUSY".asInstanceOf[VFREEBUSY]
  
  @scala.inline
  def VJOURNAL: VJOURNAL = "VJOURNAL".asInstanceOf[VJOURNAL]
  
  @scala.inline
  def VTIMEZONE: VTIMEZONE = "VTIMEZONE".asInstanceOf[VTIMEZONE]
  
  @scala.inline
  def VTODO: VTODO = "VTODO".asInstanceOf[VTODO]
  
  @js.native
  sealed trait BUSY extends FreeBusyType
  
  @js.native
  sealed trait FREE extends FreeBusyType
  
  @js.native
  sealed trait VALARM extends CalendarComponentType
  
  @js.native
  sealed trait VEVENT extends CalendarComponentType
  
  @js.native
  sealed trait VFREEBUSY extends CalendarComponentType
  
  @js.native
  sealed trait VJOURNAL extends CalendarComponentType
  
  @js.native
  sealed trait VTIMEZONE extends CalendarComponentType
  
  @js.native
  sealed trait VTODO extends CalendarComponentType
}
