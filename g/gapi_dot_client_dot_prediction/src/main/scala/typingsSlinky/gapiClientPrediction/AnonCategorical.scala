package typingsSlinky.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCategorical extends js.Object {
  /** Description of the categorical values of this feature. */
  var categorical: js.UndefOr[AnonValues] = js.native
  /** The feature index. */
  var index: js.UndefOr[String] = js.native
  /** Description of the numeric values of this feature. */
  var numeric: js.UndefOr[AnonMean] = js.native
  /** Description of multiple-word text values of this feature. */
  var text: js.UndefOr[AnonCountString] = js.native
}

object AnonCategorical {
  @scala.inline
  def apply(): AnonCategorical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCategorical]
  }
  @scala.inline
  implicit class AnonCategoricalOps[Self <: AnonCategorical] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategorical(value: AnonValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategorical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categorical")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withNumeric(value: AnonMean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: AnonCountString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

