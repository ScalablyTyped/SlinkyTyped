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

trait Reader[T] extends js.Object {
  val _fsStatSettings: Settings
  val _settings: typingsSlinky.fastDashGlob.outSettingsMod.default
  /* protected */ def _getFullEntryPath(filepath: String): String
  /* protected */ def _isFatalError(error: ErrnoException): Boolean
  /* protected */ def _makeEntry(stats: Stats, pattern: Pattern): Entry
  def dynamic(root: String, options: ReaderOptions): T
  def static(patterns: js.Array[Pattern], options: ReaderOptions): T
}

object Reader {
  @scala.inline
  def apply[T](
    _fsStatSettings: Settings,
    _getFullEntryPath: String => String,
    _isFatalError: ErrnoException => Boolean,
    _makeEntry: (Stats, Pattern) => Entry,
    _settings: typingsSlinky.fastDashGlob.outSettingsMod.default,
    dynamic: (String, ReaderOptions) => T,
    static: (js.Array[Pattern], ReaderOptions) => T
  ): Reader[T] = {
    val __obj = js.Dynamic.literal(_fsStatSettings = _fsStatSettings.asInstanceOf[js.Any], _getFullEntryPath = js.Any.fromFunction1(_getFullEntryPath), _isFatalError = js.Any.fromFunction1(_isFatalError), _makeEntry = js.Any.fromFunction2(_makeEntry), _settings = _settings.asInstanceOf[js.Any], dynamic = js.Any.fromFunction2(dynamic), static = js.Any.fromFunction2(static))
  
    __obj.asInstanceOf[Reader[T]]
  }
}

