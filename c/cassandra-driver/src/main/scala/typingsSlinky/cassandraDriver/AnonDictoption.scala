package typingsSlinky.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictoption
  extends /* key */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String] = js.native
}

object AnonDictoption {
  @scala.inline
  def apply(): AnonDictoption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictoption]
  }
  @scala.inline
  implicit class AnonDictoptionOps[Self <: AnonDictoption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
  }
  
}

