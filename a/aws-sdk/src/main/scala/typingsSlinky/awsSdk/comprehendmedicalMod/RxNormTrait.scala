package typingsSlinky.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormTrait extends js.Object {
  /**
    * Provides a name or contextual description about the trait.
    */
  var Name: js.UndefOr[RxNormTraitName] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detected trait.
    */
  var Score: js.UndefOr[Float] = js.native
}

object RxNormTrait {
  @scala.inline
  def apply(): RxNormTrait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RxNormTrait]
  }
  @scala.inline
  implicit class RxNormTraitOps[Self <: RxNormTrait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: RxNormTraitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withScore(value: Float): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Score")(js.undefined)
        ret
    }
  }
  
}

