package typingsSlinky.colorNamer.mod

import typingsSlinky.colorNamer.anon.Omit
import typingsSlinky.colorNamer.anon.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-namer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Palette */](color: String): Colors[T] = js.native
  def apply[T /* <: Palette */](color: String, options: Omit[T]): Colors[Diff[Palette, T]] = js.native
  def apply[T /* <: Palette */](color: String, options: Pick[T]): Colors[T] = js.native
}

