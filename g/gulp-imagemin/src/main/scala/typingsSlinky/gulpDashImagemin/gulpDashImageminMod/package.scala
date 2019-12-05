package typingsSlinky.gulpDashImagemin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashImageminMod {
  import typingsSlinky.imagemin.imageminMod.Plugin

  type PluginFactory[T] = js.Function1[/* options */ js.UndefOr[T], Plugin]
}
