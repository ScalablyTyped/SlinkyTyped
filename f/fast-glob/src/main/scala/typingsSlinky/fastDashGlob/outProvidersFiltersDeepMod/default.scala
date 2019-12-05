package typingsSlinky.fastDashGlob.outProvidersFiltersDeepMod

import typingsSlinky.fastDashGlob.outTypesMod.EntryFilterFunction
import typingsSlinky.fastDashGlob.outTypesMod.MicromatchOptions
import typingsSlinky.fastDashGlob.outTypesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/filters/deep", JSImport.Default)
@js.native
class default protected () extends DeepFilter {
  def this(
    _settings: typingsSlinky.fastDashGlob.outSettingsMod.default,
    _micromatchOptions: MicromatchOptions
  ) = this()
  /* CompleteClass */
  override var _filter: js.Any = js.native
  /* CompleteClass */
  override var _getEntryDepth: js.Any = js.native
  /* CompleteClass */
  override var _getMaxPatternDepth: js.Any = js.native
  /* CompleteClass */
  override var _getNegativePatternsRe: js.Any = js.native
  /* CompleteClass */
  override var _isSkippedByDeep: js.Any = js.native
  /* CompleteClass */
  override var _isSkippedByMaxPatternDepth: js.Any = js.native
  /* CompleteClass */
  override var _isSkippedByNegativePatterns: js.Any = js.native
  /* CompleteClass */
  override var _isSkippedDotDirectory: js.Any = js.native
  /* CompleteClass */
  override var _isSkippedSymbolicLink: js.Any = js.native
  /* CompleteClass */
  override val _micromatchOptions: js.Any = js.native
  /* CompleteClass */
  override val _settings: js.Any = js.native
  /* CompleteClass */
  override def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
}

