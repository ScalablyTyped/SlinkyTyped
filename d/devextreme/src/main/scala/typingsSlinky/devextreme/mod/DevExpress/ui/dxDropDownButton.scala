package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDropDownButton extends Widget {
  /** Closes the drop-down menu. */
  def close(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Opens the drop-down menu. */
  def open(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Opens or closes the drop-down menu, reversing the current state. */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Opens or closes the drop-down menu, depending on the argument. */
  def toggle(visibility: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

