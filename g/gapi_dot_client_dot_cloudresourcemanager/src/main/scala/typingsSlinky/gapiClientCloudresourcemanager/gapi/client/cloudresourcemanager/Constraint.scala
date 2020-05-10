package typingsSlinky.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraint extends js.Object {
  /** Defines this constraint as being a BooleanConstraint. */
  var booleanConstraint: js.UndefOr[js.Any] = js.native
  /** The evaluation behavior of this constraint in the absense of 'Policy'. */
  var constraintDefault: js.UndefOr[String] = js.native
  /**
    * Detailed description of what this `Constraint` controls as well as how and
    * where it is enforced.
    *
    * Mutable.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The human readable name.
    *
    * Mutable.
    */
  var displayName: js.UndefOr[String] = js.native
  /** Defines this constraint as being a ListConstraint. */
  var listConstraint: js.UndefOr[ListConstraint] = js.native
  /**
    * Immutable value, required to globally be unique. For example,
    * `constraints/serviceuser.services`
    */
  var name: js.UndefOr[String] = js.native
  /** Version of the `Constraint`. Default version is 0; */
  var version: js.UndefOr[Double] = js.native
}

object Constraint {
  @scala.inline
  def apply(): Constraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Constraint]
  }
  @scala.inline
  implicit class ConstraintOps[Self <: Constraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanConstraint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraintDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraintDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withListConstraint(value: ListConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

