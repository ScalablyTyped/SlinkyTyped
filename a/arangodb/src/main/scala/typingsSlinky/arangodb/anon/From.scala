package typingsSlinky.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From
  extends /* key */ StringDictionary[js.Any] {
  var _from: js.UndefOr[String] = js.native
  var _to: js.UndefOr[String] = js.native
}

object From {
  @scala.inline
  def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  @scala.inline
  implicit class FromOps[Self <: From] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_from(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_from: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_from")(js.undefined)
        ret
    }
    @scala.inline
    def with_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_to")(js.undefined)
        ret
    }
  }
  
}

