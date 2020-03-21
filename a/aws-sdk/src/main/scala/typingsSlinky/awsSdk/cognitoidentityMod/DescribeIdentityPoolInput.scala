package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityPoolInput extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
}

object DescribeIdentityPoolInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): DescribeIdentityPoolInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeIdentityPoolInput]
  }
}

