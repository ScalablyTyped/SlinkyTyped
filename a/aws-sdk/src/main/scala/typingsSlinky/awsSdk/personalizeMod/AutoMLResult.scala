package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the best recipe.
    */
  var bestRecipeArn: js.UndefOr[Arn] = js.native
}
object AutoMLResult {
  
  @scala.inline
  def apply(): AutoMLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLResult]
  }
  
  @scala.inline
  implicit class AutoMLResultMutableBuilder[Self <: AutoMLResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBestRecipeArn(value: Arn): Self = StObject.set(x, "bestRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestRecipeArnUndefined: Self = StObject.set(x, "bestRecipeArn", js.undefined)
  }
}
