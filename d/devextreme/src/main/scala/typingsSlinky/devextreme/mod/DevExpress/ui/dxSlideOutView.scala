package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOutView extends Widget {
  /** Gets the widget's content. */
  def content(): dxElement = js.native
  /** Hides the widget's slide-out menu. */
  def hideMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Gets the slide-out menu's content. */
  def menuContent(): dxElement = js.native
  /** Shows the slide-out menu. */
  def showMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Shows or hides the slide-out menu depending on the argument. */
  def toggleMenuVisibility(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

