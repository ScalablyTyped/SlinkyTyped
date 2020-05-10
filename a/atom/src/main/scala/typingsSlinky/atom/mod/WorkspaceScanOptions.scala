package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceScanOptions extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.native
  /** A function to be periodically called with the number of paths searched. */
  var onPathsSearched: js.UndefOr[js.Function1[/* pathsSearched */ Double, Unit]] = js.native
  /** An array of glob patterns to search within. */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.native
}

object WorkspaceScanOptions {
  @scala.inline
  def apply(): WorkspaceScanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceScanOptions]
  }
  @scala.inline
  implicit class WorkspaceScanOptionsOps[Self <: WorkspaceScanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeadingContextLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingContextLineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingContextLineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingContextLineCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPathsSearched(value: /* pathsSearched */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPathsSearched")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPathsSearched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPathsSearched")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingContextLineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingContextLineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingContextLineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingContextLineCount")(js.undefined)
        ret
    }
  }
  
}

