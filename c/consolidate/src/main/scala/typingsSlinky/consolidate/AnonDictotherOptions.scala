package typingsSlinky.consolidate

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictotherOptions
  extends /* otherOptions */ StringDictionary[js.Any] {
  var cache: js.UndefOr[Boolean] = js.native
}

object AnonDictotherOptions {
  @scala.inline
  def apply(): AnonDictotherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictotherOptions]
  }
  @scala.inline
  implicit class AnonDictotherOptionsOps[Self <: AnonDictotherOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
  }
  
}

