package typingsSlinky.jestSnapshot.stateMod

import typingsSlinky.jestTypes.configMod.SnapshotUpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotStateOptions extends js.Object {
  var expand: js.UndefOr[Boolean] = js.native
  var updateSnapshot: SnapshotUpdateState = js.native
  def getBabelTraverse(): js.Function = js.native
  def getPrettier(): Null | js.Any = js.native
}

object SnapshotStateOptions {
  @scala.inline
  def apply(
    getBabelTraverse: () => js.Function,
    getPrettier: () => Null | js.Any,
    updateSnapshot: SnapshotUpdateState
  ): SnapshotStateOptions = {
    val __obj = js.Dynamic.literal(getBabelTraverse = js.Any.fromFunction0(getBabelTraverse), getPrettier = js.Any.fromFunction0(getPrettier), updateSnapshot = updateSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotStateOptions]
  }
  @scala.inline
  implicit class SnapshotStateOptionsOps[Self <: SnapshotStateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBabelTraverse(value: () => js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBabelTraverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrettier(value: () => Null | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrettier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateSnapshot(value: SnapshotUpdateState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
  }
  
}

