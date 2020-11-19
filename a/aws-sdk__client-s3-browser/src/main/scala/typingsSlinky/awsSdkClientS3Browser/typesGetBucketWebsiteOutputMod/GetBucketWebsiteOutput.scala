package typingsSlinky.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesErrorDocumentMod.UnmarshalledErrorDocument
import typingsSlinky.awsSdkClientS3Browser.typesIndexDocumentMod.UnmarshalledIndexDocument
import typingsSlinky.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typingsSlinky.awsSdkClientS3Browser.typesRoutingRuleMod.UnmarshalledRoutingRule
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketWebsiteOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[UnmarshalledErrorDocument] = js.native
  
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[UnmarshalledIndexDocument] = js.native
  
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
  
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
}
object GetBucketWebsiteOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
  
  @scala.inline
  implicit class GetBucketWebsiteOutputOps[Self <: GetBucketWebsiteOutput] (val x: Self) extends AnyVal {
    
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
    def setErrorDocument(value: UnmarshalledErrorDocument): Self = this.set("ErrorDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDocument: Self = this.set("ErrorDocument", js.undefined)
    
    @scala.inline
    def setIndexDocument(value: UnmarshalledIndexDocument): Self = this.set("IndexDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexDocument: Self = this.set("IndexDocument", js.undefined)
    
    @scala.inline
    def setRedirectAllRequestsTo(value: UnmarshalledRedirectAllRequestsTo): Self = this.set("RedirectAllRequestsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectAllRequestsTo: Self = this.set("RedirectAllRequestsTo", js.undefined)
    
    @scala.inline
    def setRoutingRulesVarargs(value: UnmarshalledRoutingRule*): Self = this.set("RoutingRules", js.Array(value :_*))
    
    @scala.inline
    def setRoutingRules(value: js.Array[UnmarshalledRoutingRule]): Self = this.set("RoutingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingRules: Self = this.set("RoutingRules", js.undefined)
  }
}
