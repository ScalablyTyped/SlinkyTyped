package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManager extends Widget {
  /** Gets the current directory object. */
  def getCurrentDirectory(): js.Any = js.native
  /** Gets the selected items. */
  def getSelectedItems(): js.Array[_] = js.native
  /** Reloads data and repaints the widget. */
  def refresh(): Promise[_] with JQueryPromise[_] = js.native
}

