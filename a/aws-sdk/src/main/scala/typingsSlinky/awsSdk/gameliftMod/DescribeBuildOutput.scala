package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBuildOutput extends StObject {
  
  /**
    * Set of properties describing the requested build.
    */
  var Build: js.UndefOr[typingsSlinky.awsSdk.gameliftMod.Build] = js.native
}
object DescribeBuildOutput {
  
  @scala.inline
  def apply(): DescribeBuildOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBuildOutput]
  }
  
  @scala.inline
  implicit class DescribeBuildOutputMutableBuilder[Self <: DescribeBuildOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Build): Self = StObject.set(x, "Build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildUndefined: Self = StObject.set(x, "Build", js.undefined)
  }
}
