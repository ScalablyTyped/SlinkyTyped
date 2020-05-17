package typingsSlinky.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compact extends js.Object {
  var compact: js.UndefOr[Boolean] = js.native
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.native
}

object Compact {
  @scala.inline
  def apply(): Compact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compact]
  }
  @scala.inline
  implicit class CompactOps[Self <: Compact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttribution(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttribution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttribution")(js.undefined)
        ret
    }
  }
  
}

