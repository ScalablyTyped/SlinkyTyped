package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.closeUp
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.itemClick
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.itemMouseOut
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.itemMouseOver
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.popUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapMenu extends Control {
  
  def getItem(index: Double): BootstrapMenuItem | Null = js.native
  
  def getItemByName(name: String): BootstrapMenuItem | Null = js.native
  
  def getItemCount(): Double = js.native
  
  def getOrientation(): String = js.native
  
  def getRootItem(): BootstrapMenuItem | Null = js.native
  
  def getSelectedItem(): BootstrapMenuItem | Null = js.native
  
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[EventArgs | MenuItemClickEventArgs | MenuItemEventArgs | MenuItemMouseEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_closeUp(eventName: closeUp): this.type = js.native
  @JSName("off")
  def off_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemClick(eventName: itemClick): this.type = js.native
  @JSName("off")
  def off_itemClick(
    eventName: itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemMouseOut(eventName: itemMouseOut): this.type = js.native
  @JSName("off")
  def off_itemMouseOut(
    eventName: itemMouseOut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemMouseEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemMouseOver(eventName: itemMouseOver): this.type = js.native
  @JSName("off")
  def off_itemMouseOver(
    eventName: itemMouseOver,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemMouseEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_popUp(eventName: popUp): this.type = js.native
  @JSName("off")
  def off_popUp(
    eventName: popUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemClick(
    eventName: itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemMouseOut(
    eventName: itemMouseOut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemMouseEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemMouseOver(
    eventName: itemMouseOver,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemMouseEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_popUp(
    eventName: popUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_closeUp(
    eventName: closeUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemClick(
    eventName: itemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemMouseOut(
    eventName: itemMouseOut,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemMouseEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemMouseOver(
    eventName: itemMouseOver,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemMouseEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_popUp(
    eventName: popUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[MenuItemEventArgs], Unit]
  ): this.type = js.native
  
  def setOrientation(orientation: String): Unit = js.native
  
  def setSelectedItem(item: BootstrapMenuItem): Unit = js.native
}
