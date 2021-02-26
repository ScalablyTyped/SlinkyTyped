package typingsSlinky.next.anon

import typingsSlinky.next.nextBooleans.`false`
import typingsSlinky.next.nextStrings.blocking
import typingsSlinky.next.nextStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FallbackMode extends StObject {
  
  var fallbackMode: static | blocking | `false` = js.native
  
  var staticPaths: js.UndefOr[js.Array[String]] = js.native
}
object FallbackMode {
  
  @scala.inline
  def apply(fallbackMode: static | blocking | `false`): FallbackMode = {
    val __obj = js.Dynamic.literal(fallbackMode = fallbackMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackMode]
  }
  
  @scala.inline
  implicit class FallbackModeMutableBuilder[Self <: FallbackMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackMode(value: static | blocking | `false`): Self = StObject.set(x, "fallbackMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticPaths(value: js.Array[String]): Self = StObject.set(x, "staticPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticPathsUndefined: Self = StObject.set(x, "staticPaths", js.undefined)
    
    @scala.inline
    def setStaticPathsVarargs(value: String*): Self = StObject.set(x, "staticPaths", js.Array(value :_*))
  }
}
