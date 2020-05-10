package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about amount of some resource in the cluster. For
  * memory, value should be in GB.
  */
@js.native
trait SchemaResourceLimit extends js.Object {
  /**
    * Maximum amount of the resource in the cluster.
    */
  var maximum: js.UndefOr[String] = js.native
  /**
    * Minimum amount of the resource in the cluster.
    */
  var minimum: js.UndefOr[String] = js.native
  /**
    * Resource name &quot;cpu&quot;, &quot;memory&quot; or gpu-specific string.
    */
  var resourceType: js.UndefOr[String] = js.native
}

object SchemaResourceLimit {
  @scala.inline
  def apply(): SchemaResourceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceLimit]
  }
  @scala.inline
  implicit class SchemaResourceLimitOps[Self <: SchemaResourceLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
  }
  
}

