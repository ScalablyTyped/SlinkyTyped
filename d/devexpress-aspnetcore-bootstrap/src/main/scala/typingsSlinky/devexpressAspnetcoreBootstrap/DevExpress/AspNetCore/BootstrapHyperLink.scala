package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.click
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapHyperLink extends Control {
  
  def getBadgeIconCssClass(): String = js.native
  
  def getBadgeText(): String = js.native
  
  def getCaption(): String = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getNavigateUrl(): String = js.native
  
  def getText(): String = js.native
  
  def getValue(): js.Any = js.native
  
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[/* this */ this.type, js.UndefOr[EditClickEventArgs | EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(eventName: click): this.type = js.native
  @JSName("off")
  def off_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  
  def setBadgeText(text: String): Unit = js.native
  
  def setCaption(caption: String): Unit = js.native
  
  def setEnabled(value: Boolean): Unit = js.native
  
  def setNavigateUrl(url: String): Unit = js.native
  
  def setText(text: String): Unit = js.native
  
  def setValue(value: js.Any): Unit = js.native
}
