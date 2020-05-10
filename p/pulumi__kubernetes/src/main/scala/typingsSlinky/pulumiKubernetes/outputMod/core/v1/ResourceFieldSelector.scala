package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResourceFieldSelector represents container resources (cpu, memory) and their output format
  */
@js.native
trait ResourceFieldSelector extends js.Object {
  /**
    * Container name: required for volumes, optional for env vars
    */
  val containerName: String = js.native
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  val divisor: String = js.native
  /**
    * Required: resource to select
    */
  val resource: String = js.native
}

object ResourceFieldSelector {
  @scala.inline
  def apply(containerName: String, divisor: String, resource: String): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], divisor = divisor.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFieldSelector]
  }
  @scala.inline
  implicit class ResourceFieldSelectorOps[Self <: ResourceFieldSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivisor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

