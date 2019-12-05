package typingsSlinky.fastDashGlob.outProvidersFiltersEntryMod

import typingsSlinky.fastDashGlob.outTypesMod.EntryFilterFunction
import typingsSlinky.fastDashGlob.outTypesMod.MicromatchOptions
import typingsSlinky.fastDashGlob.outTypesMod.Pattern
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/filters/entry", JSImport.Default)
@js.native
class default protected () extends EntryFilter {
  def this(
    _settings: typingsSlinky.fastDashGlob.outSettingsMod.default,
    _micromatchOptions: MicromatchOptions
  ) = this()
  /* CompleteClass */
  override var _createIndexRecord: js.Any = js.native
  /* CompleteClass */
  override var _filter: js.Any = js.native
  /* CompleteClass */
  override var _isDuplicateEntry: js.Any = js.native
  /* CompleteClass */
  override var _isMatchToPatterns: js.Any = js.native
  /* CompleteClass */
  override var _isSkippedByAbsoluteNegativePatterns: js.Any = js.native
  /* CompleteClass */
  override val _micromatchOptions: js.Any = js.native
  /* CompleteClass */
  override var _onlyDirectoryFilter: js.Any = js.native
  /* CompleteClass */
  override var _onlyFileFilter: js.Any = js.native
  /* CompleteClass */
  override val _settings: js.Any = js.native
  /* CompleteClass */
  override val index: Map[String, js.UndefOr[scala.Nothing]] = js.native
  /* CompleteClass */
  override def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
}

