package typingsSlinky.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutCorsPolicyInput extends js.Object {
  /**
    * The name of the container that you want to assign the CORS policy to.
    */
  var ContainerName: typingsSlinky.awsDashSdk.clientsMediastoreMod.ContainerName = js.native
  /**
    * The CORS policy to apply to the container. 
    */
  var CorsPolicy: typingsSlinky.awsDashSdk.clientsMediastoreMod.CorsPolicy = js.native
}

object PutCorsPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, CorsPolicy: CorsPolicy): PutCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutCorsPolicyInput]
  }
}

