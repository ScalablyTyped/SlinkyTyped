package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManager extends Widget {
  /** @name dxFileManager.getCurrentDirectory() */
  def getCurrentDirectory(): js.Any = js.native
  /** @name dxFileManager.getSelectedItems() */
  def getSelectedItems(): js.Array[_] = js.native
  /** @name dxFileManager.refresh() */
  def refresh(): Promise[_] with JQueryPromise[_] = js.native
}

