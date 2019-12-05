package typingsSlinky.fastDashGlob.outProvidersFiltersDeepMod

import typingsSlinky.fastDashGlob.outTypesMod.EntryFilterFunction
import typingsSlinky.fastDashGlob.outTypesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeepFilter extends js.Object {
  var _filter: js.Any
  var _getEntryDepth: js.Any
  var _getMaxPatternDepth: js.Any
  var _getNegativePatternsRe: js.Any
  var _isSkippedByDeep: js.Any
  var _isSkippedByMaxPatternDepth: js.Any
  var _isSkippedByNegativePatterns: js.Any
  var _isSkippedDotDirectory: js.Any
  var _isSkippedSymbolicLink: js.Any
  val _micromatchOptions: js.Any
  val _settings: js.Any
  def getFilter(basePath: String, positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction
}

object DeepFilter {
  @scala.inline
  def apply(
    _filter: js.Any,
    _getEntryDepth: js.Any,
    _getMaxPatternDepth: js.Any,
    _getNegativePatternsRe: js.Any,
    _isSkippedByDeep: js.Any,
    _isSkippedByMaxPatternDepth: js.Any,
    _isSkippedByNegativePatterns: js.Any,
    _isSkippedDotDirectory: js.Any,
    _isSkippedSymbolicLink: js.Any,
    _micromatchOptions: js.Any,
    _settings: js.Any,
    getFilter: (String, js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction
  ): DeepFilter = {
    val __obj = js.Dynamic.literal(_filter = _filter.asInstanceOf[js.Any], _getEntryDepth = _getEntryDepth.asInstanceOf[js.Any], _getMaxPatternDepth = _getMaxPatternDepth.asInstanceOf[js.Any], _getNegativePatternsRe = _getNegativePatternsRe.asInstanceOf[js.Any], _isSkippedByDeep = _isSkippedByDeep.asInstanceOf[js.Any], _isSkippedByMaxPatternDepth = _isSkippedByMaxPatternDepth.asInstanceOf[js.Any], _isSkippedByNegativePatterns = _isSkippedByNegativePatterns.asInstanceOf[js.Any], _isSkippedDotDirectory = _isSkippedDotDirectory.asInstanceOf[js.Any], _isSkippedSymbolicLink = _isSkippedSymbolicLink.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction3(getFilter))
  
    __obj.asInstanceOf[DeepFilter]
  }
}

