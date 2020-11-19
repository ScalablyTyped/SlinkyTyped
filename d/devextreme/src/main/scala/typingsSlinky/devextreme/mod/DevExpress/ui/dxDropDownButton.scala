package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDropDownButton extends Widget {
  
  /** @name dxDropDownButton.close() */
  def close(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource = js.native
  
  /** @name dxDropDownButton.open() */
  def open(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxDropDownButton.toggle() */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxDropDownButton.toggle(visibility) */
  def toggle(visibility: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}
