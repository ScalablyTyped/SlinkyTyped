package typingsSlinky.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TempFileNaming extends StObject {
  
  /**
    * File name prefix to use.
    *
    * For example: `frida`.
    */
  var prefix: String = js.native
  
  /**
    * File name suffix to use.
    *
    * For example: `dat`.
    */
  var suffix: String = js.native
}
object TempFileNaming {
  
  @scala.inline
  def apply(prefix: String, suffix: String): TempFileNaming = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempFileNaming]
  }
  
  @scala.inline
  implicit class TempFileNamingMutableBuilder[Self <: TempFileNaming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
