package typingsSlinky.fastGlob.filtersDeepMod

import typingsSlinky.fastGlob.typesPatternsMod.Pattern
import typingsSlinky.mrmlncReaddirEnhanced.mod.FilterFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepFilter extends js.Object {
  /**
    * Returns «true» for directory that should be read.
    */
  var filter: js.Any = js.native
  /**
    * Returns max depth of the provided patterns.
    */
  var getMaxPatternDepth: js.Any = js.native
  /**
    * Returns RegExp's for patterns that can affect the depth of reading.
    */
  var getNegativePatternsRe: js.Any = js.native
  /**
    * Returns «true» when the «deep» option is disabled or number and depth of the entry is greater that the option value.
    */
  var isSkippedByDeepOption: js.Any = js.native
  /**
    * Returns «true» when depth parameter is not an Infinity and entry depth greater that the parameter value.
    */
  var isSkippedByMaxPatternDepth: js.Any = js.native
  /**
    * Returns «true» for a directory whose path math to any negative pattern.
    */
  var isSkippedByNegativePatterns: js.Any = js.native
  /**
    * Returns «true» for a directory whose name starts with a period if «dot» option is disabled.
    */
  var isSkippedDotDirectory: js.Any = js.native
  /**
    * Returns «true» for symlinked directory if the «followSymlinkedDirectories» option is disabled.
    */
  var isSkippedSymlinkedDirectory: js.Any = js.native
  val micromatchOptions: js.Any = js.native
  val options: js.Any = js.native
  /**
    * Returns filter for directories.
    */
  def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): FilterFunction = js.native
}

object DeepFilter {
  @scala.inline
  def apply(
    filter: js.Any,
    getFilter: (js.Array[Pattern], js.Array[Pattern]) => FilterFunction,
    getMaxPatternDepth: js.Any,
    getNegativePatternsRe: js.Any,
    isSkippedByDeepOption: js.Any,
    isSkippedByMaxPatternDepth: js.Any,
    isSkippedByNegativePatterns: js.Any,
    isSkippedDotDirectory: js.Any,
    isSkippedSymlinkedDirectory: js.Any,
    micromatchOptions: js.Any,
    options: js.Any
  ): DeepFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), getMaxPatternDepth = getMaxPatternDepth.asInstanceOf[js.Any], getNegativePatternsRe = getNegativePatternsRe.asInstanceOf[js.Any], isSkippedByDeepOption = isSkippedByDeepOption.asInstanceOf[js.Any], isSkippedByMaxPatternDepth = isSkippedByMaxPatternDepth.asInstanceOf[js.Any], isSkippedByNegativePatterns = isSkippedByNegativePatterns.asInstanceOf[js.Any], isSkippedDotDirectory = isSkippedDotDirectory.asInstanceOf[js.Any], isSkippedSymlinkedDirectory = isSkippedSymlinkedDirectory.asInstanceOf[js.Any], micromatchOptions = micromatchOptions.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepFilter]
  }
  @scala.inline
  implicit class DeepFilterOps[Self <: DeepFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetFilter(value: (js.Array[Pattern], js.Array[Pattern]) => FilterFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetMaxPatternDepth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxPatternDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetNegativePatternsRe(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNegativePatternsRe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkippedByDeepOption(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippedByDeepOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkippedByMaxPatternDepth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippedByMaxPatternDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkippedByNegativePatterns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippedByNegativePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkippedDotDirectory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippedDotDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkippedSymlinkedDirectory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippedSymlinkedDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicromatchOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micromatchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

