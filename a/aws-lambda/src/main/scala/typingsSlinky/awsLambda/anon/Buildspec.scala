package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.codebuildCloudwatchStateMod.CodeBuildSourceLocationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buildspec extends StObject {
  
  var buildspec: String = js.native
  
  var location: String = js.native
  
  var `type`: CodeBuildSourceLocationType = js.native
}
object Buildspec {
  
  @scala.inline
  def apply(buildspec: String, location: String, `type`: CodeBuildSourceLocationType): Buildspec = {
    val __obj = js.Dynamic.literal(buildspec = buildspec.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildspec]
  }
  
  @scala.inline
  implicit class BuildspecMutableBuilder[Self <: Buildspec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildspec(value: String): Self = StObject.set(x, "buildspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeBuildSourceLocationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
