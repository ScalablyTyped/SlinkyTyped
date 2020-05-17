package typingsSlinky.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveContext extends js.Object {
  var saveContext: js.UndefOr[Boolean] = js.native
}

object SaveContext {
  @scala.inline
  def apply(): SaveContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveContext]
  }
  @scala.inline
  implicit class SaveContextOps[Self <: SaveContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSaveContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveContext")(js.undefined)
        ret
    }
  }
  
}

