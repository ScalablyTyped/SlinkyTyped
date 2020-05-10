package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutCorsPolicyInput extends js.Object {
  /**
    * The name of the container that you want to assign the CORS policy to.
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
  /**
    * The CORS policy to apply to the container. 
    */
  var CorsPolicy: typingsSlinky.awsSdk.mediastoreMod.CorsPolicy = js.native
}

object PutCorsPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, CorsPolicy: CorsPolicy): PutCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCorsPolicyInput]
  }
  @scala.inline
  implicit class PutCorsPolicyInputOps[Self <: PutCorsPolicyInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: ContainerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorsPolicy(value: CorsPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CorsPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

