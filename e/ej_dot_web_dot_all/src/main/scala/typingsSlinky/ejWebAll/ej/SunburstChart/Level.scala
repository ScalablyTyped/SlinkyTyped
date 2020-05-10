package typingsSlinky.ejWebAll.ej.SunburstChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  /** Specifies the group member path
    * @Default {null}
    */
  var groupMemberPath: js.UndefOr[String] = js.native
}

object Level {
  @scala.inline
  def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupMemberPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMemberPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupMemberPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupMemberPath")(js.undefined)
        ret
    }
  }
  
}

