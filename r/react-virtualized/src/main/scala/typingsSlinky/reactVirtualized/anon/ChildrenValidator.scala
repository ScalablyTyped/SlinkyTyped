package typingsSlinky.reactVirtualized.anon

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenValidator extends StObject {
  
  var children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactElement]] = js.native
}
object ChildrenValidator {
  
  @scala.inline
  def apply(children: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactElement]]): ChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValidator]
  }
  
  @scala.inline
  implicit class ChildrenValidatorMutableBuilder[Self <: ChildrenValidator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Validator[js.Function1[/* props */ ScrollSyncChildProps, ReactElement]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
