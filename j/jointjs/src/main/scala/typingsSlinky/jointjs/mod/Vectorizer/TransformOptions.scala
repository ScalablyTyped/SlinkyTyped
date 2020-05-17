package typingsSlinky.jointjs.mod.Vectorizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.native
}

object TransformOptions {
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolute")(js.undefined)
        ret
    }
  }
  
}

