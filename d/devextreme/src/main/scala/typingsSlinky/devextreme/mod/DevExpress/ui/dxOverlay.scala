package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxOverlay extends Widget {
  /** Gets the widget's content. */
  def content(): dxElement = js.native
  /** Hides the widget. */
  def hide(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  /** Shows the widget. */
  def show(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  /** Shows or hides the widget depending on the argument. */
  def toggle(showing: Boolean): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}

