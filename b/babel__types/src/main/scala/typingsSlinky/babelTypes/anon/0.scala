package typingsSlinky.babelTypes.anon

import typingsSlinky.babelTypes.mod.BlockStatement_
import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var body: BlockStatement_ | Statement | Expression = js.native
}
object `0` {
  
  @scala.inline
  def apply(body: BlockStatement_ | Statement | Expression): `0` = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_ | Statement | Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
