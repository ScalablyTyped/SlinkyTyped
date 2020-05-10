package typingsSlinky.depsSort.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All the input properties, and:
  */
@js.native
trait OutputRow extends js.Object {
  /**
    * when 'opts.dedupe' is true, contains the row ID of a file with identical contents
    */
  var dedupe: String = js.native
  /**
    * like 'row.dedupe', but contains the 'row.index' instead of 'row.id'
    */
  var dedupeIndex: Double = js.native
  /**
    * when 'opts.index' is true, the sorted numeric index of the row
    */
  var index: Double = js.native
  /**
    * like 'row.deps', but mapping to 'row.index' instead of 'row.id'
    */
  var indexDeps: StringDictionary[Double] = js.native
}

object OutputRow {
  @scala.inline
  def apply(dedupe: String, dedupeIndex: Double, index: Double, indexDeps: StringDictionary[Double]): OutputRow = {
    val __obj = js.Dynamic.literal(dedupe = dedupe.asInstanceOf[js.Any], dedupeIndex = dedupeIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexDeps = indexDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputRow]
  }
  @scala.inline
  implicit class OutputRowOps[Self <: OutputRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedupe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedupe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDedupeIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dedupeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexDeps(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexDeps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

