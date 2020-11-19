package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDrawer extends Widget {
  
  /** @name dxDrawer.content() */
  def content(): dxElement = js.native
  
  /** @name dxDrawer.hide() */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxDrawer.show() */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxDrawer.toggle() */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
