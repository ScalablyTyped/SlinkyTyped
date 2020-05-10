package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node Affinity: the configuration of desired nodes onto which this Instance
  * could be scheduled.
  */
@js.native
trait SchemaSchedulingNodeAffinity extends js.Object {
  /**
    * Corresponds to the label key of Node resource.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Defines the operation of node selection.
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * Corresponds to the label values of Node resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaSchedulingNodeAffinity {
  @scala.inline
  def apply(): SchemaSchedulingNodeAffinity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingNodeAffinity]
  }
  @scala.inline
  implicit class SchemaSchedulingNodeAffinityOps[Self <: SchemaSchedulingNodeAffinity] (val x: Self) extends AnyVal {
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
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
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

