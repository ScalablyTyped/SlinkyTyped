package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `17` extends StObject {
  
  def attached(param0: String): Unit = js.native
}
object `17` {
  
  @scala.inline
  def apply(attached: String => Unit): `17` = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttached(value: String => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction1(value))
  }
}
