package typingsSlinky.readdirEnhanced

import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typingsSlinky.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typingsSlinky.jsdevtoolsReaddirEnhanced.mod.Readdir_
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Callback
import typingsSlinky.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: Readdir_ = js.native
  val readdir: Readdir_ = js.native
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, options: Optionsstatsfalseundefine, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  def readdirAsync(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatsfalseundefine): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Optionsstatstrue): AsyncIterableIterator[Stats] = js.native
  def readdirStream(dir: String): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatsfalseundefine): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatstrue): Readable = js.native
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
}

