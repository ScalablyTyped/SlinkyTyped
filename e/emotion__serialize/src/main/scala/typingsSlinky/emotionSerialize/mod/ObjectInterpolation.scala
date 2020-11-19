package typingsSlinky.emotionSerialize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectInterpolation[MP]
  extends CSSOthersObject[MP]
     with CSSPropertiesWithMultiValues
     with CSSPseudos[MP]
     with _Interpolation[MP]
object ObjectInterpolation {
  
  @scala.inline
  def apply[MP](): ObjectInterpolation[MP] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectInterpolation[MP]]
  }
}
