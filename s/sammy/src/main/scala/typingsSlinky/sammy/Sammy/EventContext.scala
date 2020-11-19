package typingsSlinky.sammy.Sammy

import org.scalablytyped.runtime.Instantiable5
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import typingsSlinky.sammy.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventContext
  extends Object
     with Instantiable5[
      /* app */ js.Any, 
      /* verb */ js.Any, 
      /* path */ js.Any, 
      /* params */ js.Any, 
      /* target */ js.Any, 
      js.Any
    ] {
  
  @JSName("$element")
  def $element(): JQuery[HTMLElement] = js.native
  
  def engineFor(engine: js.Any): js.Any = js.native
  
  def eventNamespace(): String = js.native
  
  def interpolate(content: js.Any, data: js.Any, engine: js.Any): EventContext = js.native
  def interpolate(content: js.Any, data: js.Any, engine: js.Any, partials: js.Any): EventContext = js.native
  
  def json(str: String): js.Any = js.native
  def json(str: js.Any): js.Any = js.native
  
  def load(location: js.Any): js.Any = js.native
  def load(location: js.Any, options: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  def load(location: js.Any, options: js.Any): js.Any = js.native
  def load(location: js.Any, options: js.Any, callback: js.Function): js.Any = js.native
  
  def loadPartials(): js.Any = js.native
  def loadPartials(partials: js.Any): js.Any = js.native
  
  // Provided by common sammy modules:
  var name: js.Any = js.native
  
  def notFound(): js.Any = js.native
  
  var params: js.Any = js.native
  
  def partial(location: String): RenderContext = js.native
  def partial(
    location: String,
    data: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    partials: js.Any
  ): RenderContext = js.native
  def partial(location: String, data: js.UndefOr[scala.Nothing], callback: js.Function): RenderContext = js.native
  def partial(location: String, data: js.UndefOr[scala.Nothing], callback: js.Function, partials: js.Any): RenderContext = js.native
  def partial(location: String, data: js.Any): RenderContext = js.native
  def partial(location: String, data: js.Any, callback: js.UndefOr[scala.Nothing], partials: js.Any): RenderContext = js.native
  def partial(location: String, data: js.Any, callback: js.Function): RenderContext = js.native
  def partial(location: String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
  
  var partials: js.Any = js.native
  
  def redirect(params: js.Any*): Unit = js.native
  
  def render(location: String): RenderContext = js.native
  def render(
    location: String,
    data: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    partials: js.Any
  ): RenderContext = js.native
  def render(location: String, data: js.UndefOr[scala.Nothing], callback: js.Function): RenderContext = js.native
  def render(location: String, data: js.UndefOr[scala.Nothing], callback: js.Function, partials: js.Any): RenderContext = js.native
  def render(location: String, data: js.Any): RenderContext = js.native
  def render(location: String, data: js.Any, callback: js.UndefOr[scala.Nothing], partials: js.Any): RenderContext = js.native
  def render(location: String, data: js.Any, callback: js.Function): RenderContext = js.native
  def render(location: String, data: js.Any, callback: js.Function, partials: js.Any): RenderContext = js.native
  
  def renderEach(location: js.Any): RenderContext = js.native
  def renderEach(location: js.Any, data: js.UndefOr[scala.Nothing], callback: js.Function): RenderContext = js.native
  def renderEach(location: js.Any, data: js.Array[Data]): RenderContext = js.native
  def renderEach(location: js.Any, data: js.Array[Data], callback: js.Function): RenderContext = js.native
  
  def send(params: js.Any*): RenderContext = js.native
  
  def swap(contents: js.Any, callback: js.Function): String = js.native
  
  var title: js.Any = js.native
  
  def trigger(name: String): EventContext = js.native
  def trigger(name: String, data: js.Any): EventContext = js.native
}
