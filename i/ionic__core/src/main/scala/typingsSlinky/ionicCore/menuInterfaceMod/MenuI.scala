package typingsSlinky.ionicCore.menuInterfaceMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonMenuElement
import typingsSlinky.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuI extends js.Object {
  
  var _isOpen: Boolean = js.native
  
  def _setOpen(shouldOpen: Boolean): js.Promise[Boolean] = js.native
  def _setOpen(shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
  
  var backdropEl: js.UndefOr[HTMLElement] = js.native
  
  def close(): js.Promise[Boolean] = js.native
  def close(animated: Boolean): js.Promise[Boolean] = js.native
  
  var contentEl: js.UndefOr[HTMLElement] = js.native
  
  var disabled: Boolean = js.native
  
  var el: HTMLIonMenuElement = js.native
  
  def isActive(): js.Promise[Boolean] = js.native
  
  var isAnimating: Boolean = js.native
  
  var isEndSide: Boolean = js.native
  
  var menuCtrl: js.UndefOr[MenuControllerI] = js.native
  
  var menuId: js.UndefOr[String] = js.native
  
  var menuInnerEl: js.UndefOr[HTMLElement] = js.native
  
  def open(): js.Promise[Boolean] = js.native
  def open(animated: Boolean): js.Promise[Boolean] = js.native
  
  def setOpen(shouldOpen: Boolean): js.Promise[Boolean] = js.native
  def setOpen(shouldOpen: Boolean, animated: Boolean): js.Promise[Boolean] = js.native
  
  var side: Side = js.native
  
  def toggle(): js.Promise[Boolean] = js.native
  def toggle(animated: Boolean): js.Promise[Boolean] = js.native
  
  var width: Double = js.native
}
