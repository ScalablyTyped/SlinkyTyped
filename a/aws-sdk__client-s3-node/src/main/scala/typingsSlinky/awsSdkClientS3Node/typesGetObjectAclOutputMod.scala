package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesGrantMod.UnmarshalledGrant
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetObjectAclOutput", JSImport.Namespace)
@js.native
object typesGetObjectAclOutputMod extends js.Object {
  @js.native
  trait GetObjectAclOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>A list of grants.</p>
      */
    var Grants: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[UnmarshalledOwner] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  
}

