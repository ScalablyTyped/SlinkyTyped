package typingsSlinky.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  /**
    *  This method returns a string containing the result of applying the
    * template using the data object as the context.
    * @param template The template to render. If this is a function this is
    * treated as a pre-compiled template and does not try to compile it again. This
    * allows any view that supports a template parameter to specify a pre-compiled
    * template function as the template setting. The template function does not
    * have to be any specific template engine. It only needs to be a function
    * that returns valid HTML as a string from the data parameter passed to
    * the function.
    */
  @JSImport("backbone.marionette", "Renderer.render")
  @js.native
  def render(template: js.Any, data: js.Any): String = js.native
}
