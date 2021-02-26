package typingsSlinky.googleCloudStorage.bucketMod

import typingsSlinky.googleCloudCommon.serviceObjectMod.GetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketOptions extends GetConfig {
  
  var userProject: js.UndefOr[String] = js.native
}
object GetBucketOptions {
  
  @scala.inline
  def apply(): GetBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketOptions]
  }
  
  @scala.inline
  implicit class GetBucketOptionsMutableBuilder[Self <: GetBucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
