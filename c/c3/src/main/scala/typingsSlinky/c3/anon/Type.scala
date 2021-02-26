package typingsSlinky.c3.anon

import typingsSlinky.c3.c3Strings.`basis-closed`
import typingsSlinky.c3.c3Strings.`basis-open`
import typingsSlinky.c3.c3Strings.`cardinal-closed`
import typingsSlinky.c3.c3Strings.`cardinal-open`
import typingsSlinky.c3.c3Strings.`linear-closed`
import typingsSlinky.c3.c3Strings.`step-after`
import typingsSlinky.c3.c3Strings.`step-before`
import typingsSlinky.c3.c3Strings.basis
import typingsSlinky.c3.c3Strings.bundle
import typingsSlinky.c3.c3Strings.cardinal
import typingsSlinky.c3.c3Strings.linear
import typingsSlinky.c3.c3Strings.monotone
import typingsSlinky.c3.c3Strings.step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  /**
    * Set custom spline interpolation
    */
  var `type`: js.UndefOr[
    linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone | step | `step-before` | `step-after`
  ] = js.native
}
object Type {
  
  @scala.inline
  def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(
      value: linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone | step | `step-before` | `step-after`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
