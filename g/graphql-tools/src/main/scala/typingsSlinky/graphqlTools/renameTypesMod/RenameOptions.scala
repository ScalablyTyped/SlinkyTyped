package typingsSlinky.graphqlTools.renameTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameOptions extends js.Object {
  var renameBuiltins: Boolean = js.native
  var renameScalars: Boolean = js.native
}

object RenameOptions {
  @scala.inline
  def apply(renameBuiltins: Boolean, renameScalars: Boolean): RenameOptions = {
    val __obj = js.Dynamic.literal(renameBuiltins = renameBuiltins.asInstanceOf[js.Any], renameScalars = renameScalars.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameOptions]
  }
  @scala.inline
  implicit class RenameOptionsOps[Self <: RenameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenameBuiltins(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameBuiltins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenameScalars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameScalars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

