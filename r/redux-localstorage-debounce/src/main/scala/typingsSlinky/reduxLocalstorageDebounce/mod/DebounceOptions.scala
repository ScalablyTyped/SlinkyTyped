package typingsSlinky.reduxLocalstorageDebounce.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebounceOptions
  extends /* key */ StringDictionary[js.Any] {
  var maxWait: js.UndefOr[Double] = js.native
}

object DebounceOptions {
  @scala.inline
  def apply(): DebounceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebounceOptions]
  }
  @scala.inline
  implicit class DebounceOptionsOps[Self <: DebounceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWait")(js.undefined)
        ret
    }
  }
  
}

