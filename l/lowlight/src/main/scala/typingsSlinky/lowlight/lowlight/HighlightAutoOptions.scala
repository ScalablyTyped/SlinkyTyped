package typingsSlinky.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightAutoOptions extends HighlightOptions {
  var subset: js.UndefOr[js.Array[String]] = js.native
}

object HighlightAutoOptions {
  @scala.inline
  def apply(): HighlightAutoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightAutoOptions]
  }
  @scala.inline
  implicit class HighlightAutoOptionsOps[Self <: HighlightAutoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubset(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subset")(js.undefined)
        ret
    }
  }
  
}

