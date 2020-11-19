package typingsSlinky.awsSdkClientS3Node.typesListBucketsOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesBucketMod.UnmarshalledBucket
import typingsSlinky.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * _Buckets shape
    */
  var Buckets: js.UndefOr[js.Array[UnmarshalledBucket]] = js.native
  
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[UnmarshalledOwner] = js.native
}
object ListBucketsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBucketsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketsOutput]
  }
  
  @scala.inline
  implicit class ListBucketsOutputOps[Self <: ListBucketsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketsVarargs(value: UnmarshalledBucket*): Self = this.set("Buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[UnmarshalledBucket]): Self = this.set("Buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("Buckets", js.undefined)
    
    @scala.inline
    def setOwner(value: UnmarshalledOwner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
  }
}
