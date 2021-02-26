package typingsSlinky.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionSummary extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: string = js.native
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: string = js.native
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: string = js.native
  
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
}
object VersionSummary {
  
  @scala.inline
  def apply(ApplicationId: string, CreationTime: string, SemanticVersion: string): VersionSummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionSummary]
  }
  
  @scala.inline
  implicit class VersionSummaryMutableBuilder[Self <: VersionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeUrl(value: string): Self = StObject.set(x, "SourceCodeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeUrlUndefined: Self = StObject.set(x, "SourceCodeUrl", js.undefined)
  }
}
