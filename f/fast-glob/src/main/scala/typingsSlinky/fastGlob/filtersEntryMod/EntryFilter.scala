package typingsSlinky.fastGlob.filtersEntryMod

import typingsSlinky.fastGlob.typesPatternsMod.Pattern
import typingsSlinky.mrmlncReaddirEnhanced.mod.FilterFunction
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntryFilter extends js.Object {
  /**
    * Create record in the cross reader index.
    */
  var createIndexRecord: js.Any = js.native
  /**
    * Returns true if entry must be added to result.
    */
  var filter: js.Any = js.native
  val index: Map[String, js.UndefOr[scala.Nothing]] = js.native
  /**
    * Return true if the entry already has in the cross reader index.
    */
  var isDuplicateEntry: js.Any = js.native
  /**
    * Return true when entry match to provided patterns.
    *
    * First, just trying to apply patterns to the path.
    * Second, trying to apply patterns to the path with final slash (need to micromatch to support «directory/ **» patterns).
    */
  var isMatchToPatterns: js.Any = js.native
  /**
    * Return true when `absolute` option is enabled and matched to the negative patterns.
    */
  var isSkippedByAbsoluteNegativePatterns: js.Any = js.native
  val micromatchOptions: js.Any = js.native
  /**
    * Returns true for non-directories if the «onlyDirectories» option is enabled.
    */
  var onlyDirectoryFilter: js.Any = js.native
  /**
    * Returns true for non-files if the «onlyFiles» option is enabled.
    */
  var onlyFileFilter: js.Any = js.native
  val options: js.Any = js.native
  /**
    * Returns filter for directories.
    */
  def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): FilterFunction = js.native
}

object EntryFilter {
  @scala.inline
  def apply(
    createIndexRecord: js.Any,
    filter: js.Any,
    getFilter: (js.Array[Pattern], js.Array[Pattern]) => FilterFunction,
    index: Map[String, js.UndefOr[scala.Nothing]],
    isDuplicateEntry: js.Any,
    isMatchToPatterns: js.Any,
    isSkippedByAbsoluteNegativePatterns: js.Any,
    micromatchOptions: js.Any,
    onlyDirectoryFilter: js.Any,
    onlyFileFilter: js.Any,
    options: js.Any
  ): EntryFilter = {
    val __obj = js.Dynamic.literal(createIndexRecord = createIndexRecord.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), index = index.asInstanceOf[js.Any], isDuplicateEntry = isDuplicateEntry.asInstanceOf[js.Any], isMatchToPatterns = isMatchToPatterns.asInstanceOf[js.Any], isSkippedByAbsoluteNegativePatterns = isSkippedByAbsoluteNegativePatterns.asInstanceOf[js.Any], micromatchOptions = micromatchOptions.asInstanceOf[js.Any], onlyDirectoryFilter = onlyDirectoryFilter.asInstanceOf[js.Any], onlyFileFilter = onlyFileFilter.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryFilter]
  }
  @scala.inline
  implicit class EntryFilterOps[Self <: EntryFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateIndexRecord(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createIndexRecord")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withIndex(value: Map[String, js.UndefOr[scala.Nothing]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDuplicateEntry(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDuplicateEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMatchToPatterns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMatchToPatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSkippedByAbsoluteNegativePatterns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSkippedByAbsoluteNegativePatterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMicromatchOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("micromatchOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyDirectoryFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyDirectoryFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnlyFileFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyFileFilter")(value.asInstanceOf[js.Any])
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

