package typingsSlinky.nextServer.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  var groups: StringDictionary[Double] = js.native
  var re: js.RegExp = js.native
}

object Groups {
  @scala.inline
  def apply(groups: StringDictionary[Double], re: js.RegExp): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRe(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("re")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

