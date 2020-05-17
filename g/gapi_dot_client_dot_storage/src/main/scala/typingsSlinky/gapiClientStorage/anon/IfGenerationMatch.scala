package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfGenerationMatch extends js.Object {
  /**
    * Only perform the composition if the generation of the source object that would be used matches this value. If this value and a generation are both
    * specified, they must be the same value or the call will fail.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
}

object IfGenerationMatch {
  @scala.inline
  def apply(): IfGenerationMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfGenerationMatch]
  }
  @scala.inline
  implicit class IfGenerationMatchOps[Self <: IfGenerationMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfGenerationMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfGenerationMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifGenerationMatch")(js.undefined)
        ret
    }
  }
  
}

