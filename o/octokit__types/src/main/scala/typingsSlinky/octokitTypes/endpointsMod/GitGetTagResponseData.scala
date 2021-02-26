package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.DateEmail
import typingsSlinky.octokitTypes.anon.Payload
import typingsSlinky.octokitTypes.anon.ShaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitGetTagResponseData extends StObject {
  
  var message: String = js.native
  
  var node_id: String = js.native
  
  var `object`: ShaType = js.native
  
  var sha: String = js.native
  
  var tag: String = js.native
  
  var tagger: DateEmail = js.native
  
  var url: String = js.native
  
  var verification: Payload = js.native
}
object GitGetTagResponseData {
  
  @scala.inline
  def apply(
    message: String,
    node_id: String,
    `object`: ShaType,
    sha: String,
    tag: String,
    tagger: DateEmail,
    url: String,
    verification: Payload
  ): GitGetTagResponseData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetTagResponseData]
  }
  
  @scala.inline
  implicit class GitGetTagResponseDataMutableBuilder[Self <: GitGetTagResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ShaType): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagger(value: DateEmail): Self = StObject.set(x, "tagger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Payload): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
