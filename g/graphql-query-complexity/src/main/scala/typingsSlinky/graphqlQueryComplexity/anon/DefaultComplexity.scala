package typingsSlinky.graphqlQueryComplexity.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultComplexity extends js.Object {
  var defaultComplexity: js.UndefOr[Double] = js.native
}

object DefaultComplexity {
  @scala.inline
  def apply(): DefaultComplexity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultComplexity]
  }
  @scala.inline
  implicit class DefaultComplexityOps[Self <: DefaultComplexity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultComplexity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComplexity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultComplexity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultComplexity")(js.undefined)
        ret
    }
  }
  
}

