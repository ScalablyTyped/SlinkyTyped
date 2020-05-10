package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexingPolicy extends js.Object {
  /** Represents the paths to be excluded from indexing. */
  var ExcludedPaths: js.Array[ExcludedPath] = js.native
  /** Represents the paths to be included for indexing. */
  var IncludedPaths: js.Array[IncludedPath] = js.native
  /** Specifies whether automatic indexing is enabled for a collection. */
  var automatic: Boolean = js.native
  /** The indexing mode (consistent or lazy) {@link IndexingMode}. */
  var indexingMode: IndexingMode = js.native
}

object IndexingPolicy {
  @scala.inline
  def apply(
    ExcludedPaths: js.Array[ExcludedPath],
    IncludedPaths: js.Array[IncludedPath],
    automatic: Boolean,
    indexingMode: IndexingMode
  ): IndexingPolicy = {
    val __obj = js.Dynamic.literal(ExcludedPaths = ExcludedPaths.asInstanceOf[js.Any], IncludedPaths = IncludedPaths.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], indexingMode = indexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexingPolicy]
  }
  @scala.inline
  implicit class IndexingPolicyOps[Self <: IndexingPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedPaths(value: js.Array[ExcludedPath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludedPaths(value: js.Array[IncludedPath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludedPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexingMode(value: IndexingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexingMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

