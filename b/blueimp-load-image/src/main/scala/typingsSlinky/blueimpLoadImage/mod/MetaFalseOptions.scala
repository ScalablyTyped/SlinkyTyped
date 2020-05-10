package typingsSlinky.blueimpLoadImage.mod

import typingsSlinky.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaFalseOptions extends MetaOptions {
  var meta: js.UndefOr[`false`] = js.native
}

object MetaFalseOptions {
  @scala.inline
  def apply(): MetaFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaFalseOptions]
  }
  @scala.inline
  implicit class MetaFalseOptionsOps[Self <: MetaFalseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeta(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
  }
  
}

