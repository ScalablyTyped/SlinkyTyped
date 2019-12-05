package typingsSlinky.markdownDashIt.libRendererMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.markdownDashIt.libMod.TokenRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var rules: StringDictionary[TokenRender]
  def render(tokens: js.Array[typingsSlinky.markdownDashIt.libTokenMod.^], options: js.Any, env: js.Any): String
  def renderAttrs(token: typingsSlinky.markdownDashIt.libTokenMod.^): String
  def renderInline(tokens: js.Array[typingsSlinky.markdownDashIt.libTokenMod.^], options: js.Any, env: js.Any): String
  def renderToken(tokens: js.Array[typingsSlinky.markdownDashIt.libTokenMod.^], idx: Double, options: js.Any): String
}

object Renderer {
  @scala.inline
  def apply(
    render: (js.Array[typingsSlinky.markdownDashIt.libTokenMod.^], js.Any, js.Any) => String,
    renderAttrs: typingsSlinky.markdownDashIt.libTokenMod.^ => String,
    renderInline: (js.Array[typingsSlinky.markdownDashIt.libTokenMod.^], js.Any, js.Any) => String,
    renderToken: (js.Array[typingsSlinky.markdownDashIt.libTokenMod.^], Double, js.Any) => String,
    rules: StringDictionary[TokenRender]
  ): Renderer = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction3(render), renderAttrs = js.Any.fromFunction1(renderAttrs), renderInline = js.Any.fromFunction3(renderInline), renderToken = js.Any.fromFunction3(renderToken), rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Renderer]
  }
}

