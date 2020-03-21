package typingsSlinky.gulpSvgmin

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.svgo.mod.Options
import typingsSlinky.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-svgmin", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): Transform = js.native
  def apply(cb: js.Function1[/* file */ File, Options]): Transform = js.native
  def apply(options: Options): Transform = js.native
}

