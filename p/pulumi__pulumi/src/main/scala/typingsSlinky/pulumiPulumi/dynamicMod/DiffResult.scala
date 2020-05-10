package typingsSlinky.pulumiPulumi.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffResult extends js.Object {
  /**
    * If true, this diff detected changes and suggests an update.
    */
  val changes: js.UndefOr[Boolean] = js.native
  /**
    * If true, and a replacement occurs, the resource will first be deleted before being recreated.  This is to
    * void potential side-by-side issues with the default create before delete behavior.
    */
  val deleteBeforeReplace: js.UndefOr[Boolean] = js.native
  /**
    * If this update requires a replacement, the set of properties triggering it.
    */
  val replaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional list of properties that will not ever change.
    */
  val stables: js.UndefOr[js.Array[String]] = js.native
}

object DiffResult {
  @scala.inline
  def apply(): DiffResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffResult]
  }
  @scala.inline
  implicit class DiffResultOps[Self <: DiffResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteBeforeReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBeforeReplace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteBeforeReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBeforeReplace")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaces")(js.undefined)
        ret
    }
    @scala.inline
    def withStables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stables")(js.undefined)
        ret
    }
  }
  
}

