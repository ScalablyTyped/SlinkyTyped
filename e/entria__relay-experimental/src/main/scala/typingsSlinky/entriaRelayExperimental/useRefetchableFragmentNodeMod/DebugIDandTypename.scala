package typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugIDandTypename extends js.Object {
  var id: String = js.native
  var typename: String = js.native
}

object DebugIDandTypename {
  @scala.inline
  def apply(id: String, typename: String): DebugIDandTypename = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typename = typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugIDandTypename]
  }
  @scala.inline
  implicit class DebugIDandTypenameOps[Self <: DebugIDandTypename] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typename")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

