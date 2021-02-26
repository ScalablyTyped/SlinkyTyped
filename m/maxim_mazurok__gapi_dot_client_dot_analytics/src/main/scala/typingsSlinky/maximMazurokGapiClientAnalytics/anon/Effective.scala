package typingsSlinky.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effective extends StObject {
  
  /** All the permissions that the user has for this web property. These include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions from the parent account. */
  var effective: js.UndefOr[js.Array[String]] = js.native
}
object Effective {
  
  @scala.inline
  def apply(): Effective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Effective]
  }
  
  @scala.inline
  implicit class EffectiveMutableBuilder[Self <: Effective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffective(value: js.Array[String]): Self = StObject.set(x, "effective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveUndefined: Self = StObject.set(x, "effective", js.undefined)
    
    @scala.inline
    def setEffectiveVarargs(value: String*): Self = StObject.set(x, "effective", js.Array(value :_*))
  }
}
