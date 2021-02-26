package typingsSlinky.jqueryFullscreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extends JqueryStatic ($)
  * i.e: To use $.fullscreen.functionName()
  */
@js.native
trait JQueryStatic extends StObject {
  
  var fullscreen: JQueryFullscreen = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(fullscreen: JQueryFullscreen): JQueryStatic = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullscreen(value: JQueryFullscreen): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
  }
}
