package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.customDisabledDate
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyDown
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyPress
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyUp
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.selectionChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.visibleMonthChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapCalendar extends BootstrapClientEdit {
  
  def clearSelection(): Unit = js.native
  
  def deselectDate(date: js.Date): Unit = js.native
  
  def deselectRange(start: js.Date, end: js.Date): Unit = js.native
  
  def getMaxDate(): js.Date = js.native
  
  def getMinDate(): js.Date = js.native
  
  def getSelectedDate(): js.Date = js.native
  
  def getSelectedDates(): js.Array[js.Date] = js.native
  
  def getVisibleDate(): js.Date = js.native
  
  def isDateSelected(date: js.Date): Boolean = js.native
  
  @JSName("off")
  def off_beginCallback(eventName: beginCallback): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(eventName: callbackError): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_customDisabledDate(eventName: customDisabledDate): this.type = js.native
  @JSName("off")
  def off_customDisabledDate(
    eventName: customDisabledDate,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CalendarCustomDisabledDateEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyDown(eventName: keyDown): this.type = js.native
  @JSName("off")
  def off_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyPress(eventName: keyPress): this.type = js.native
  @JSName("off")
  def off_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyUp(eventName: keyUp): this.type = js.native
  @JSName("off")
  def off_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectionChanged(eventName: selectionChanged): this.type = js.native
  @JSName("off")
  def off_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_visibleMonthChanged(eventName: visibleMonthChanged): this.type = js.native
  @JSName("off")
  def off_visibleMonthChanged(
    eventName: visibleMonthChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_customDisabledDate(
    eventName: customDisabledDate,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CalendarCustomDisabledDateEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_visibleMonthChanged(
    eventName: visibleMonthChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_customDisabledDate(
    eventName: customDisabledDate,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[CalendarCustomDisabledDateEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectionChanged(
    eventName: selectionChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_visibleMonthChanged(
    eventName: visibleMonthChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  
  def selectDate(date: js.Date): Unit = js.native
  
  def selectRange(start: js.Date, end: js.Date): Unit = js.native
  
  def setMaxDate(date: js.Date): Unit = js.native
  
  def setMinDate(date: js.Date): Unit = js.native
  
  def setSelectedDate(date: js.Date): Unit = js.native
  
  def setVisibleDate(date: js.Date): Unit = js.native
}
