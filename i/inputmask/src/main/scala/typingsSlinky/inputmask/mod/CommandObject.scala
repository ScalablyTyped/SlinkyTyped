package typingsSlinky.inputmask.mod

import typingsSlinky.inputmask.AnonStart
import typingsSlinky.inputmask.inputmaskBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandObject extends js.Object {
  /**
    * Character to insert.
    */
  var c: js.UndefOr[String] = js.native
  /**
    * Position of the caret.
    */
  var caret: js.UndefOr[Double] = js.native
  /**
    * Position(s) to add.
    */
  var insert: js.UndefOr[InsertPosition | js.Array[InsertPosition]] = js.native
  /**
    * Position to insert.
    */
  var pos: js.UndefOr[Double] = js.native
  /**
    * * `true` => refresh validPositions from the complete buffer .
    * * `{ start: , end: }` => refresh from start to end.
    */
  var refreshFromBuffer: js.UndefOr[`true` | AnonStart] = js.native
  /**
    * Position(s) to remove.
    */
  var remove: js.UndefOr[Double | js.Array[Double]] = js.native
}

object CommandObject {
  @scala.inline
  def apply(): CommandObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandObject]
  }
  @scala.inline
  implicit class CommandObjectOps[Self <: CommandObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(js.undefined)
        ret
    }
    @scala.inline
    def withCaret(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caret")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: InsertPosition | js.Array[InsertPosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshFromBuffer(value: `true` | AnonStart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFromBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshFromBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshFromBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
  }
  
}

