package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSlideOutView extends Widget {
  
  /** @name dxSlideOutView.content() */
  def content(): dxElement = js.native
  
  /** @name dxSlideOutView.hideMenu() */
  def hideMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxSlideOutView.menuContent() */
  def menuContent(): dxElement = js.native
  
  /** @name dxSlideOutView.showMenu() */
  def showMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxSlideOutView.toggleMenuVisibility() */
  def toggleMenuVisibility(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
