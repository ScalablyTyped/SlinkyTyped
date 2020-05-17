package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxContextMenu extends dxMenuBase {
  /** Hides the widget. */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows the widget. */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows or hides the widget depending on the argument. */
  def toggle(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

