package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.octokitTypesStrings.switcheroo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends StObject {
  
  var previews: Array[switcheroo | String] = js.native
}
object `12` {
  
  @scala.inline
  def apply(previews: Array[switcheroo | String]): `12` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviews(value: Array[switcheroo | String]): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
  }
}
