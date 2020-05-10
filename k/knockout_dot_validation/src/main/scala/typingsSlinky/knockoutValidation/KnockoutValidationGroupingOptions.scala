package typingsSlinky.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationGroupingOptions extends js.Object {
  /**
    * indicates whether to walk the ViewModel (or object)
    * recursively, or only walk first-level properties.
    */
  var deep: js.UndefOr[Boolean] = js.native
  /**
    * indicates whether changes to observableArrays inside
    * the model should cause the validator to re-run
    */
  var live: js.UndefOr[Boolean] = js.native
  /**
    * indicates whether the returned errors object
    * is a ko.computed or a simple function
    */
  var observable: js.UndefOr[Boolean] = js.native
}

object KnockoutValidationGroupingOptions {
  @scala.inline
  def apply(): KnockoutValidationGroupingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationGroupingOptions]
  }
  @scala.inline
  implicit class KnockoutValidationGroupingOptionsOps[Self <: KnockoutValidationGroupingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
    @scala.inline
    def withLive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(js.undefined)
        ret
    }
    @scala.inline
    def withObservable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable")(js.undefined)
        ret
    }
  }
  
}

