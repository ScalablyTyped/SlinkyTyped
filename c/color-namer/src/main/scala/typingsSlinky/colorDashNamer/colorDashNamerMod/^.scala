package typingsSlinky.colorDashNamer.colorDashNamerMod

import typingsSlinky.colorDashNamer.Anon_Omit
import typingsSlinky.colorDashNamer.Anon_Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-namer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Palette */](color: String): Colors[T] = js.native
  def apply[T /* <: Palette */](color: String, options: Anon_Omit[T]): Colors[Diff[Palette, T]] = js.native
  def apply[T /* <: Palette */](color: String, options: Anon_Pick[T]): Colors[T] = js.native
}

