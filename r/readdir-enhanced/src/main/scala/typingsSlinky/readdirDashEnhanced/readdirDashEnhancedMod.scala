package typingsSlinky.readdirDashEnhanced

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Callback
import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Options
import typingsSlinky.readdirDashEnhanced.libTypesDashPublicMod.Stats
import typingsSlinky.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", JSImport.Namespace)
@js.native
object readdirDashEnhancedMod extends js.Object {
  @js.native
  trait Readdir extends js.Object {
    @JSName("async")
    var async_Original: Fn_Callback = js.native
    @JSName("iterator")
    var iterator_Original: Fn_DirOptionsAnonFalse = js.native
    @JSName("stream")
    var stream_Original: Fn_DirOptions = js.native
    @JSName("sync")
    var sync_Original: Fn_Dir = js.native
    def apply(dir: String): js.Promise[js.Array[String]] = js.native
    def apply(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def apply(dir: String, options: Options with (Anon_False | Anon_Stats)): js.Promise[js.Array[Stats]] = js.native
    def apply(
      dir: String,
      options: Options with (Anon_False | Anon_Stats),
      callback: Callback[js.Array[Stats | String]]
    ): Unit = js.native
    def apply(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String): js.Promise[js.Array[String]] = js.native
    def async(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
    def async(dir: String, options: Options with (Anon_False | Anon_Stats)): js.Promise[js.Array[Stats]] = js.native
    def async(
      dir: String,
      options: Options with (Anon_False | Anon_Stats),
      callback: Callback[js.Array[Stats | String]]
    ): Unit = js.native
    def async(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
    def iterator(dir: String): AsyncIterableIterator[String] = js.native
    def iterator(dir: String, options: Options with (Anon_False | Anon_Stats)): AsyncIterableIterator[Stats] = js.native
    def stream(dir: String): Readable = js.native
    def stream(dir: String, options: Options with (Anon_False | Anon_Stats)): Readable = js.native
    def sync(dir: String): js.Array[String] = js.native
    def sync(dir: String, options: Options with (Anon_False | Anon_Stats)): js.Array[Stats] = js.native
  }
  
  val default: Readdir = js.native
  val readdir: Readdir = js.native
  def readdirAsync(dir: String): js.Promise[js.Array[String]] = js.native
  def readdirAsync(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def readdirAsync(dir: String, options: Options with (Anon_False | Anon_Stats)): js.Promise[js.Array[Stats]] = js.native
  def readdirAsync(
    dir: String,
    options: Options with (Anon_False | Anon_Stats),
    callback: Callback[js.Array[Stats | String]]
  ): Unit = js.native
  def readdirAsync(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def readdirIterator(dir: String): AsyncIterableIterator[String] = js.native
  def readdirIterator(dir: String, options: Options with (Anon_False | Anon_Stats)): AsyncIterableIterator[Stats] = js.native
  def readdirStream(dir: String): Readable = js.native
  def readdirStream(dir: String, options: Options with (Anon_False | Anon_Stats)): Readable = js.native
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Options with (Anon_False | Anon_Stats)): js.Array[Stats] = js.native
}

