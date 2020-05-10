package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom constraint that specifies a key and a list of allowed values for
  * Istio attributes.
  */
@js.native
trait SchemaPermissionConstraint extends js.Object {
  /**
    * Key of the constraint.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * A list of allowed values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPermissionConstraint {
  @scala.inline
  def apply(): SchemaPermissionConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionConstraint]
  }
  @scala.inline
  implicit class SchemaPermissionConstraintOps[Self <: SchemaPermissionConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
  }
  
}

