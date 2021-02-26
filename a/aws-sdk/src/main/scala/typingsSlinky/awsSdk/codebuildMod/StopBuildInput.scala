package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopBuildInput extends StObject {
  
  /**
    * The ID of the build.
    */
  var id: NonEmptyString = js.native
}
object StopBuildInput {
  
  @scala.inline
  def apply(id: NonEmptyString): StopBuildInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBuildInput]
  }
  
  @scala.inline
  implicit class StopBuildInputMutableBuilder[Self <: StopBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
