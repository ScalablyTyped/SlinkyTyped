package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBuildOutput extends StObject {
  
  /**
    * The updated build resource.
    */
  var Build: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.Build] = js.native
}
object UpdateBuildOutput {
  
  @scala.inline
  def apply(): UpdateBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBuildOutput]
  }
  
  @scala.inline
  implicit class UpdateBuildOutputMutableBuilder[Self <: UpdateBuildOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "Build", js.undefined)
  }
}
