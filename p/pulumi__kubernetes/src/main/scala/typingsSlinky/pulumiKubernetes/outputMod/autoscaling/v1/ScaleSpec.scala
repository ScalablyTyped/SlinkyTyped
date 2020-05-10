package typingsSlinky.pulumiKubernetes.outputMod.autoscaling.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ScaleSpec describes the attributes of a scale subresource.
  */
@js.native
trait ScaleSpec extends js.Object {
  /**
    * desired number of instances for the scaled object.
    */
  val replicas: Double = js.native
}

object ScaleSpec {
  @scala.inline
  def apply(replicas: Double): ScaleSpec = {
    val __obj = js.Dynamic.literal(replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleSpec]
  }
  @scala.inline
  implicit class ScaleSpecOps[Self <: ScaleSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicas")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

