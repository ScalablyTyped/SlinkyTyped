package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://docs.couchdb.org/en/stable/api/server/common.html#api-server-root
@js.native
trait InfoResponse extends StObject {
  
  var couchdb: String = js.native
  
  var features: js.Array[String] = js.native
  
  var git_sha: String = js.native
  
  var uuid: String = js.native
  
  var vendor: Name = js.native
  
  var version: String = js.native
}
object InfoResponse {
  
  @scala.inline
  def apply(
    couchdb: String,
    features: js.Array[String],
    git_sha: String,
    uuid: String,
    vendor: Name,
    version: String
  ): InfoResponse = {
    val __obj = js.Dynamic.literal(couchdb = couchdb.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], git_sha = git_sha.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoResponse]
  }
  
  @scala.inline
  implicit class InfoResponseMutableBuilder[Self <: InfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCouchdb(value: String): Self = StObject.set(x, "couchdb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setGit_sha(value: String): Self = StObject.set(x, "git_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: Name): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
