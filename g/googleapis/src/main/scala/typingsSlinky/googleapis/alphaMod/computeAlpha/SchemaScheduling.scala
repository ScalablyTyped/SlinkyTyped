package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the scheduling options for an Instance.
  */
@js.native
trait SchemaScheduling extends js.Object {
  /**
    * Specifies whether the instance should be automatically restarted if it is
    * terminated by Compute Engine (not terminated by a user). You can only set
    * the automatic restart option for standard instances. Preemptible
    * instances cannot be automatically restarted.  By default, this is set to
    * true so an instance is automatically restarted if it is terminated by
    * Compute Engine.
    */
  var automaticRestart: js.UndefOr[Boolean] = js.native
  /**
    * The minimum number of virtual CPUs this instance will consume when
    * running on a sole-tenant node.
    */
  var minNodeCpus: js.UndefOr[Double] = js.native
  /**
    * A set of node affinity and anti-affinity.
    */
  var nodeAffinities: js.UndefOr[js.Array[SchemaSchedulingNodeAffinity]] = js.native
  /**
    * Defines the maintenance behavior for this instance. For standard
    * instances, the default behavior is MIGRATE. For preemptible instances,
    * the default and only possible behavior is TERMINATE. For more
    * information, see Setting Instance Scheduling Options.
    */
  var onHostMaintenance: js.UndefOr[String] = js.native
  /**
    * Defines whether the instance is preemptible. This can only be set during
    * instance creation, it cannot be set or changed after the instance has
    * been created.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
}

object SchemaScheduling {
  @scala.inline
  def apply(): SchemaScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScheduling]
  }
  @scala.inline
  implicit class SchemaSchedulingOps[Self <: SchemaScheduling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticRestart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticRestart")(js.undefined)
        ret
    }
    @scala.inline
    def withMinNodeCpus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeCpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinNodeCpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeCpus")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeAffinities(value: js.Array[SchemaSchedulingNodeAffinity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAffinities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeAffinities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeAffinities")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHostMaintenance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHostMaintenance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnHostMaintenance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHostMaintenance")(js.undefined)
        ret
    }
    @scala.inline
    def withPreemptible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreemptible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preemptible")(js.undefined)
        ret
    }
  }
  
}

