package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.buttonClick
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.closeUp
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.customHighlighting
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.dropDown
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.itemFiltering
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyDown
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyPress
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyUp
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.queryCloseUp
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.selectedIndexChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.textChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.userInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapComboBox extends BootstrapClientEdit {
  
  def addItem(text: String): Double = js.native
  // tslint:disable-line:unified-signatures
  def addItem(text: String, value: js.Any): Double = js.native
  // tslint:disable-line:unified-signatures
  def addItem(text: String, value: js.Any, iconCssClass: String): Double = js.native
  def addItem(texts: js.Array[String]): Double = js.native
  // tslint:disable-line:unified-signatures
  def addItem(texts: js.Array[String], value: js.Any): Double = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def addItem(texts: js.Array[String], value: js.Any, iconCssClass: String): Double = js.native
  
  // tslint:disable-line:unified-signatures unified-signatures
  def addItemCssClass(index: Double, className: String): Unit = js.native
  
  def addItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  
  def adjustDropDownWindow(): Unit = js.native
  
  def beginUpdate(): Unit = js.native
  
  def clearItems(): Unit = js.native
  
  def endUpdate(): Unit = js.native
  
  def ensureDropDownLoaded(callbackFunction: js.Any): Unit = js.native
  
  def findItemByText(text: String): BootstrapListBoxItem | Null = js.native
  
  def findItemByValue(value: js.Any): BootstrapListBoxItem | Null = js.native
  
  def getButtonVisible(number: Double): Boolean = js.native
  
  def getCaretPosition(): Double = js.native
  
  def getItem(index: Double): BootstrapListBoxItem | Null = js.native
  
  def getItemBadgeIconCssClass(index: Double): String = js.native
  
  def getItemBadgeText(index: Double): String = js.native
  
  def getItemCount(): Double = js.native
  
  def getSelectedIndex(): Double = js.native
  
  def getSelectedItem(): BootstrapListBoxItem | Null = js.native
  
  def getText(): String = js.native
  
  def hideDropDown(): Unit = js.native
  
  def insertItem(index: Double, text: String): Unit = js.native
  // tslint:disable-line:unified-signatures
  def insertItem(index: Double, text: String, value: js.Any): Unit = js.native
  // tslint:disable-line:unified-signatures
  def insertItem(index: Double, text: String, value: js.Any, iconCssClass: String): Unit = js.native
  def insertItem(index: Double, texts: js.Array[String]): Unit = js.native
  // tslint:disable-line:unified-signatures
  def insertItem(index: Double, texts: js.Array[String], value: js.Any): Unit = js.native
  // tslint:disable-line:unified-signatures unified-signatures
  def insertItem(index: Double, texts: js.Array[String], value: js.Any, iconCssClass: String): Unit = js.native
  
  // tslint:disable-line:unified-signatures unified-signatures
  def makeItemVisible(index: Double): Unit = js.native
  
  @JSName("off")
  def off_beginCallback(eventName: beginCallback): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_buttonClick(eventName: buttonClick): this.type = js.native
  @JSName("off")
  def off_buttonClick(
    eventName: buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(eventName: callbackError): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_closeUp(eventName: closeUp): this.type = js.native
  @JSName("off")
  def off_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_customHighlighting(eventName: customHighlighting): this.type = js.native
  @JSName("off")
  def off_customHighlighting(
    eventName: customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_dropDown(eventName: dropDown): this.type = js.native
  @JSName("off")
  def off_dropDown(
    eventName: dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemFiltering(eventName: itemFiltering): this.type = js.native
  @JSName("off")
  def off_itemFiltering(
    eventName: itemFiltering,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ListEditItemFilteringEventArgs], Unit]
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
  def off_queryCloseUp(eventName: queryCloseUp): this.type = js.native
  @JSName("off")
  def off_queryCloseUp(
    eventName: queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_selectedIndexChanged(eventName: selectedIndexChanged): this.type = js.native
  @JSName("off")
  def off_selectedIndexChanged(
    eventName: selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_textChanged(eventName: textChanged): this.type = js.native
  @JSName("off")
  def off_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_userInput(eventName: userInput): this.type = js.native
  @JSName("off")
  def off_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_buttonClick(
    eventName: buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_customHighlighting(
    eventName: customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_dropDown(
    eventName: dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemFiltering(
    eventName: itemFiltering,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ListEditItemFilteringEventArgs], Unit]
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
  def on_queryCloseUp(
    eventName: queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_selectedIndexChanged(
    eventName: selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_buttonClick(
    eventName: buttonClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonEditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_customHighlighting(
    eventName: customHighlighting,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[ListEditCustomHighlightingEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_dropDown(
    eventName: dropDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemFiltering(
    eventName: itemFiltering,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ListEditItemFilteringEventArgs], Unit]
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
  def once_queryCloseUp(
    eventName: queryCloseUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_selectedIndexChanged(
    eventName: selectedIndexChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  
  def performCallback(data: js.Any): js.Promise[Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[Unit]): Unit = js.native
  
  def removeItem(index: Double): Unit = js.native
  
  def removeItemCssClass(index: Double, className: String): Unit = js.native
  
  def removeItemTextCellCssClass(itemIndex: Double, textCellIndex: Double, className: String): Unit = js.native
  
  def selectAll(): Unit = js.native
  
  def setButtonVisible(number: Double, value: Boolean): Unit = js.native
  
  def setCaretPosition(position: Double): Unit = js.native
  
  def setItemBadgeIconCssClass(index: Double, cssClass: String): Unit = js.native
  
  def setItemBadgeText(index: Double, text: String): Unit = js.native
  
  def setItemHtml(index: Double, html: String): Unit = js.native
  
  def setItemTextCellHtml(itemIndex: Double, textCellIndex: Double, html: String): Unit = js.native
  
  def setItemTextCellTooltip(itemIndex: Double, textCellIndex: Double, tooltip: String): Unit = js.native
  
  def setItemTooltip(index: Double, tooltip: String): Unit = js.native
  
  def setSelectedIndex(index: Double): Unit = js.native
  
  def setSelectedItem(item: BootstrapListBoxItem): Unit = js.native
  
  def setSelection(startPos: Double, endPos: Double, scrollToSelection: Boolean): Unit = js.native
  
  def setText(text: String, applyFilter: Boolean): Unit = js.native
  
  def showDropDown(): Unit = js.native
}
