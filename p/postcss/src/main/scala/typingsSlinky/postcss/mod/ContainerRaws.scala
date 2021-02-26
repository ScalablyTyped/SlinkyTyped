package typingsSlinky.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerRaws extends NodeRaws {
  
  var indent: js.UndefOr[String] = js.native
}
object ContainerRaws {
  
  @scala.inline
  def apply(): ContainerRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerRaws]
  }
  
  @scala.inline
  implicit class ContainerRawsMutableBuilder[Self <: ContainerRaws] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
  }
}
