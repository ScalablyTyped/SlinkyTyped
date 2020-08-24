package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", "touch")
@js.native
object touch extends js.Object {
  def apply(filepath: String): js.Promise[Unit] = js.native
  def apply(filepath: String, mtime: js.UndefOr[scala.Nothing], ctime: js.Date): js.Promise[Unit] = js.native
  def apply(filepath: String, mtime: js.Date): js.Promise[Unit] = js.native
  def apply(filepath: String, mtime: js.Date, ctime: js.Date): js.Promise[Unit] = js.native
}

