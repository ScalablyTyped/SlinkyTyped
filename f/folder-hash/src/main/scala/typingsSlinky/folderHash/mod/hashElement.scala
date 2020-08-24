package typingsSlinky.folderHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("folder-hash", "hashElement")
@js.native
object hashElement extends js.Object {
  def apply(path: String): Unit = js.native
  def apply(
    path: String,
    dir: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  def apply(path: String, dir: js.UndefOr[scala.Nothing], options: HashElementOptions): Unit = js.native
  def apply(
    path: String,
    dir: js.UndefOr[scala.Nothing],
    options: HashElementOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  def apply(path: String, dir: String): Unit = js.native
  def apply(
    path: String,
    dir: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  def apply(path: String, dir: String, options: HashElementOptions): Unit = js.native
  def apply(
    path: String,
    dir: String,
    options: HashElementOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  def apply(path: String, options: HashElementOptions): js.Promise[HashElementNode] = js.native
}

