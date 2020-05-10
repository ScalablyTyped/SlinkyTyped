package typingsSlinky.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExclude extends js.Object {
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var typeCheck: js.UndefOr[Boolean] = js.native
}

object AnonExclude {
  @scala.inline
  def apply(): AnonExclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExclude]
  }
  @scala.inline
  implicit class AnonExcludeOps[Self <: AnonExclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeCheck")(js.undefined)
        ret
    }
  }
  
}

