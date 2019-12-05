package typingsSlinky.fastDashGlob.outReadersReaderMod

import typingsSlinky.atNodelibFsDotStat.atNodelibFsDotStatMod.Settings
import typingsSlinky.fastDashGlob.outTypesMod.Entry
import typingsSlinky.fastDashGlob.outTypesMod.ErrnoException
import typingsSlinky.fastDashGlob.outTypesMod.Pattern
import typingsSlinky.fastDashGlob.outTypesMod.ReaderOptions
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/readers/reader", JSImport.Default)
@js.native
abstract class default[T] protected () extends Reader[T] {
  def this(_settings: typingsSlinky.fastDashGlob.outSettingsMod.default) = this()
  /* CompleteClass */
  override val _fsStatSettings: Settings = js.native
  /* CompleteClass */
  override val _settings: typingsSlinky.fastDashGlob.outSettingsMod.default = js.native
  /* CompleteClass */
  /* protected */ override def _getFullEntryPath(filepath: String): String = js.native
  /* CompleteClass */
  /* protected */ override def _isFatalError(error: ErrnoException): Boolean = js.native
  /* CompleteClass */
  /* protected */ override def _makeEntry(stats: Stats, pattern: Pattern): Entry = js.native
  /* CompleteClass */
  override def dynamic(root: String, options: ReaderOptions): T = js.native
  /* CompleteClass */
  override def static(patterns: js.Array[Pattern], options: ReaderOptions): T = js.native
}

