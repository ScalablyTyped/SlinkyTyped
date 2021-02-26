package typingsSlinky.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderLiteral extends ReaderArgument {
  
  val kind: String = js.native
  
  // 'Literal';
  val name: String = js.native
  
  val value: js.Any = js.native
}
object ReaderLiteral {
  
  @scala.inline
  def apply(kind: String, name: String, value: js.Any): ReaderLiteral = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderLiteral]
  }
  
  @scala.inline
  implicit class ReaderLiteralMutableBuilder[Self <: ReaderLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
