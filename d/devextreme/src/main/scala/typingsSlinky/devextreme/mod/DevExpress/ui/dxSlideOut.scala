package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSlideOut extends CollectionWidget {
  
  /** @name dxSlideOut.hideMenu() */
  def hideMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxSlideOut.showMenu() */
  def showMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxSlideOut.toggleMenuVisibility(showing) */
  def toggleMenuVisibility(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}
