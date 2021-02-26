package typingsSlinky.antDesignReactNative.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cascader extends StObject {
  
  var cascader: ReactElement = js.native
}
object Cascader {
  
  @scala.inline
  def apply(cascader: ReactElement): Cascader = {
    val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascader]
  }
  
  @scala.inline
  implicit class CascaderMutableBuilder[Self <: Cascader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascader(value: ReactElement): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
  }
}
