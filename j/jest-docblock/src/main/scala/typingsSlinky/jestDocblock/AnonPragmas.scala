package typingsSlinky.jestDocblock

import typingsSlinky.jestDocblock.mod.Pragmas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPragmas extends js.Object {
  var comments: js.UndefOr[String] = js.native
  var pragmas: js.UndefOr[Pragmas] = js.native
}

object AnonPragmas {
  @scala.inline
  def apply(): AnonPragmas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPragmas]
  }
  @scala.inline
  implicit class AnonPragmasOps[Self <: AnonPragmas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withPragmas(value: Pragmas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pragmas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPragmas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pragmas")(js.undefined)
        ret
    }
  }
  
}

