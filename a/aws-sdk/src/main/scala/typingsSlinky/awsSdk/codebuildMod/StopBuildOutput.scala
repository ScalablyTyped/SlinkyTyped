package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopBuildOutput extends StObject {
  
  /**
    * Information about the build.
    */
  var build: js.UndefOr[Build] = js.native
}
object StopBuildOutput {
  
  @scala.inline
  def apply(): StopBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBuildOutput]
  }
  
  @scala.inline
  implicit class StopBuildOutputMutableBuilder[Self <: StopBuildOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
