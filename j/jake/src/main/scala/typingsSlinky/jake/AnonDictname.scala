package typingsSlinky.jake

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictname
  extends /* name */ StringDictionary[js.Any] {
  var quiet: Boolean = js.native
}

object AnonDictname {
  @scala.inline
  def apply(quiet: Boolean): AnonDictname = {
    val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictname]
  }
  @scala.inline
  implicit class AnonDictnameOps[Self <: AnonDictname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuiet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quiet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

