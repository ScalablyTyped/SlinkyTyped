package typingsSlinky.airbnbPropTypes.mod

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("airbnb-prop-types", "restrictedProp")
@js.native
object restrictedProp extends js.Object {
  
  def apply[T](): Requireable[T] = js.native
  def apply[T](
    messageFunction: js.Function5[
      /* props */ js.Object, 
      /* propName */ String, 
      /* componentName */ String, 
      /* location */ String, 
      /* propFullName */ String, 
      js.UndefOr[String | js.Error]
    ]
  ): Requireable[T] = js.native
}
