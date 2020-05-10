package typingsSlinky.ejWebAll.ej.DropDownList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascadeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** Returns the cascading dropdown model.
    */
  var cascadeModel: js.UndefOr[js.Any] = js.native
  /** returns the current selected value in first dropdown.
    */
  var cascadeValue: js.UndefOr[String] = js.native
  /** returns the DropDownList model
    */
  var model: js.UndefOr[js.Any] = js.native
  /** returns the default filter action for second dropdown data should happen or not.
    */
  var requiresDefaultFilter: js.UndefOr[Boolean] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object CascadeEventArgs {
  @scala.inline
  def apply(): CascadeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadeEventArgs]
  }
  @scala.inline
  implicit class CascadeEventArgsOps[Self <: CascadeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCascadeModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascadeModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeModel")(js.undefined)
        ret
    }
    @scala.inline
    def withCascadeValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCascadeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascadeValue")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresDefaultFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresDefaultFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresDefaultFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresDefaultFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

