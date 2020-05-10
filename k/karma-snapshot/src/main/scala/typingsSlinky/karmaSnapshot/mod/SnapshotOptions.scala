package typingsSlinky.karmaSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotOptions extends js.Object {
  /**
    * Checks existince of the source file associated with tests
    * @default false
    */
  var checkSourceFile: js.UndefOr[Boolean] = js.native
  /**
    * Snapshot format
    * @default 'md'
    */
  var format: js.UndefOr[String | SnapshotSerializer] = js.native
  /**
    * Limit number of unused snapshots reported in the warning.
    * `-1` means unlimited.
    * @default -1
    */
  var limitUnusedSnapshotsInWarning: js.UndefOr[Double] = js.native
  /**
    * Custom path resolver
    */
  var pathResolver: js.UndefOr[SnapshotPathResolver] = js.native
  /**
    * Prune unused snapshots
    * @default false
    */
  var prune: js.UndefOr[Boolean] = js.native
  /**
    * Run snapshot tests in UPDATE mode
    * @default false
    */
  var update: js.UndefOr[Boolean] = js.native
}

object SnapshotOptions {
  @scala.inline
  def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  @scala.inline
  implicit class SnapshotOptionsOps[Self <: SnapshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckSourceFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckSourceFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkSourceFile")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String | SnapshotSerializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitUnusedSnapshotsInWarning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitUnusedSnapshotsInWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitUnusedSnapshotsInWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitUnusedSnapshotsInWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withPathResolver(value: (/* basePath */ String, /* suiteName */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathResolver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPathResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withPrune(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prune")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

