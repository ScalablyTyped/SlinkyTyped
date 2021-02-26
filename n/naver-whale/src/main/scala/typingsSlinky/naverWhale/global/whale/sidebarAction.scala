package typingsSlinky.naverWhale.global.whale

import typingsSlinky.naverWhale.whale.sidebarAction.BadgeBackgroundColorDetails
import typingsSlinky.naverWhale.whale.sidebarAction.BrowserClickedEvent
import typingsSlinky.naverWhale.whale.sidebarAction.ColorArray
import typingsSlinky.naverWhale.whale.sidebarAction.SidebarBadgeDetail
import typingsSlinky.naverWhale.whale.sidebarAction.SidebarDockDetail
import typingsSlinky.naverWhale.whale.sidebarAction.SidebarIconDetail
import typingsSlinky.naverWhale.whale.sidebarAction.SidebarPageDetail
import typingsSlinky.naverWhale.whale.sidebarAction.SidebarShowDetail
import typingsSlinky.naverWhale.whale.sidebarAction.SidebarTitleDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sidebarAction {
  
  @JSGlobal("whale.sidebarAction")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("whale.sidebarAction.dock")
  @js.native
  def dock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  @JSGlobal("whale.sidebarAction.dock")
  @js.native
  def dock(
    popupWindowId: Double,
    details: SidebarDockDetail,
    callback: js.Function1[/* windowId */ Double, Unit]
  ): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.getBadgeBackgroundColor")
  @js.native
  def getBadgeBackgroundColor(callback: js.Function1[/* color */ ColorArray, Unit]): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.getBadgeText")
  @js.native
  def getBadgeText(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.getPage")
  @js.native
  def getPage(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.getTitle")
  @js.native
  def getTitle(callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.hide")
  @js.native
  def hide(): Unit = js.native
  @JSGlobal("whale.sidebarAction.hide")
  @js.native
  def hide(callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  @JSGlobal("whale.sidebarAction.hide")
  @js.native
  def hide(windowId: Double): Unit = js.native
  @JSGlobal("whale.sidebarAction.hide")
  @js.native
  def hide(windowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.onClicked")
  @js.native
  def onClicked: BrowserClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: BrowserClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("whale.sidebarAction.setBadgeBackgroundColor")
  @js.native
  def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.setBadgeText")
  @js.native
  def setBadgeText(details: SidebarBadgeDetail): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.setIcon")
  @js.native
  def setIcon(details: SidebarIconDetail): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.setPage")
  @js.native
  def setPage(details: SidebarPageDetail): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.setTitle")
  @js.native
  def setTitle(details: SidebarTitleDetail): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(): Unit = js.native
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(details: SidebarShowDetail): Unit = js.native
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(windowId: Double): Unit = js.native
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(
    windowId: Double,
    details: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* windowId */ Double, Unit]
  ): Unit = js.native
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(windowId: Double, details: SidebarShowDetail): Unit = js.native
  @JSGlobal("whale.sidebarAction.show")
  @js.native
  def show(windowId: Double, details: SidebarShowDetail, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
  
  @JSGlobal("whale.sidebarAction.undock")
  @js.native
  def undock(popupWindowId: Double, callback: js.Function1[/* windowId */ Double, Unit]): Unit = js.native
}
