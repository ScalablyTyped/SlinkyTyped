package typingsSlinky.nunjucks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nunjucks", "Template")
@js.native
class Template protected () extends js.Object {
  def this(src: String) = this()
  def this(src: String, env: Environment) = this()
  def this(src: String, env: js.UndefOr[scala.Nothing], eagerCompile: Boolean) = this()
  def this(src: String, env: Environment, eagerCompile: Boolean) = this()
  
  def render(): String = js.native
  def render(context: js.UndefOr[scala.Nothing], callback: TemplateCallback[String]): Unit = js.native
  def render(context: js.Object): String = js.native
  def render(context: js.Object, callback: TemplateCallback[String]): Unit = js.native
  @JSName("render")
  def render_Unit(): Unit = js.native
  @JSName("render")
  def render_Unit(context: js.Object): Unit = js.native
}
