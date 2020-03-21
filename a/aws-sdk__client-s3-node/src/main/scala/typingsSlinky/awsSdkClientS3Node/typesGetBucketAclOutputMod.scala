package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesGrantMod.UnmarshalledGrant
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketAclOutput", JSImport.Namespace)
@js.native
object typesGetBucketAclOutputMod extends js.Object {
  @js.native
  trait GetBucketAclOutput
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
  }
  
}

