package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowDependencyAdding extends js.Object {
  var allowDependencyAdding: js.UndefOr[Boolean] = js.native
  var allowDependencyDeleting: js.UndefOr[Boolean] = js.native
  var allowDependencyUpdating: js.UndefOr[Boolean] = js.native
  var allowResourceAdding: js.UndefOr[Boolean] = js.native
  var allowResourceDeleting: js.UndefOr[Boolean] = js.native
  var allowResourceUpdating: js.UndefOr[Boolean] = js.native
  var allowTaskAdding: js.UndefOr[Boolean] = js.native
  var allowTaskDeleting: js.UndefOr[Boolean] = js.native
  var allowTaskUpdating: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
}

object AllowDependencyAdding {
  @scala.inline
  def apply(): AllowDependencyAdding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDependencyAdding]
  }
  @scala.inline
  implicit class AllowDependencyAddingOps[Self <: AllowDependencyAdding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowDependencyAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDependencyAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDependencyAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDependencyAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDependencyDeleting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDependencyDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDependencyDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDependencyDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDependencyUpdating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDependencyUpdating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDependencyUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDependencyUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResourceAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResourceAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResourceAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResourceAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResourceDeleting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResourceDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResourceDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResourceDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowResourceUpdating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResourceUpdating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowResourceUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowResourceUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTaskAdding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaskAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTaskAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaskAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTaskDeleting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaskDeleting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTaskDeleting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaskDeleting")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowTaskUpdating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaskUpdating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowTaskUpdating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTaskUpdating")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

