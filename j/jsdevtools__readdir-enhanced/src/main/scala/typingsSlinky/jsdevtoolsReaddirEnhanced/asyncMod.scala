package typingsSlinky.jsdevtoolsReaddirEnhanced

import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/readdir-enhanced/lib/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
}

