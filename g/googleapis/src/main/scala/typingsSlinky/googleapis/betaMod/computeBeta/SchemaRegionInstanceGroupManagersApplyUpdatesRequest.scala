package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InstanceGroupManagers.applyUpdatesToInstances
  */
@js.native
trait SchemaRegionInstanceGroupManagersApplyUpdatesRequest extends js.Object {
  /**
    * The list of instances for which we want to apply changes on this managed
    * instance group.
    */
  var instances: js.UndefOr[js.Array[String]] = js.native
  /**
    * The minimal action that should be perfomed on the instances. By default
    * NONE.
    */
  var minimalAction: js.UndefOr[String] = js.native
  /**
    * The most disruptive action that allowed to be performed on the instances.
    * By default REPLACE.
    */
  var mostDisruptiveAllowedAction: js.UndefOr[String] = js.native
}

object SchemaRegionInstanceGroupManagersApplyUpdatesRequest {
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersApplyUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersApplyUpdatesRequest]
  }
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersApplyUpdatesRequestOps[Self <: SchemaRegionInstanceGroupManagersApplyUpdatesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstances(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimalAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimalAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimalAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimalAction")(js.undefined)
        ret
    }
    @scala.inline
    def withMostDisruptiveAllowedAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostDisruptiveAllowedAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostDisruptiveAllowedAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostDisruptiveAllowedAction")(js.undefined)
        ret
    }
  }
  
}

