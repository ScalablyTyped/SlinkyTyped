package typingsSlinky.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodSpec extends StObject {
  
  /**
    * Argument types. Defaults to `[]` if omitted.
    */
  var argumentTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Implementation.
    */
  def implementation(params: js.Any*): js.Any = js.native
  /**
    * Implementation.
    */
  @JSName("implementation")
  var implementation_Original: MethodImplementation[js.Object] = js.native
  
  /**
    * Return type. Defaults to `void` if omitted.
    */
  var returnType: js.UndefOr[String] = js.native
}
