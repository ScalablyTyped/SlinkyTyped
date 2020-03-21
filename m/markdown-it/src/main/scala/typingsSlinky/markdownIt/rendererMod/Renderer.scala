package typingsSlinky.markdownIt.rendererMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.markdownIt.libMod.TokenRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var rules: StringDictionary[TokenRender]
  def render(tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String
  def renderAttrs(token: typingsSlinky.markdownIt.tokenMod.^): String
  def renderInline(tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^], options: js.Any, env: js.Any): String
  def renderToken(tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^], idx: Double, options: js.Any): String
}

object Renderer {
  @scala.inline
  def apply(
    render: (js.Array[typingsSlinky.markdownIt.tokenMod.^], js.Any, js.Any) => String,
    renderAttrs: typingsSlinky.markdownIt.tokenMod.^ => String,
    renderInline: (js.Array[typingsSlinky.markdownIt.tokenMod.^], js.Any, js.Any) => String,
    renderToken: (js.Array[typingsSlinky.markdownIt.tokenMod.^], Double, js.Any) => String,
    rules: StringDictionary[TokenRender]
  ): Renderer = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction3(render), renderAttrs = js.Any.fromFunction1(renderAttrs), renderInline = js.Any.fromFunction3(renderInline), renderToken = js.Any.fromFunction3(renderToken), rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Renderer]
  }
}

