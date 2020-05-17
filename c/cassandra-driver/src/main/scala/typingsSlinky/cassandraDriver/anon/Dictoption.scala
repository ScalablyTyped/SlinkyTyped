package typingsSlinky.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictoption
  extends /* key */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String] = js.native
}

object Dictoption {
  @scala.inline
  def apply(): Dictoption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictoption]
  }
  @scala.inline
  implicit class DictoptionOps[Self <: Dictoption] (val x: Self) extends AnyVal {
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

