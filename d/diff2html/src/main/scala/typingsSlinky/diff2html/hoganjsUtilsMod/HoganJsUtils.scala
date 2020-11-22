package typingsSlinky.diff2html.hoganjsUtilsMod

import typingsSlinky.hoganJs.mod.Context
import typingsSlinky.hoganJs.mod.Partials
import typingsSlinky.hoganJs.mod.Template_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoganJsUtils extends js.Object {
  
  var preCompiledTemplates: js.Any = js.native
  
  def render(namespace: String, view: String, params: Context): String = js.native
  def render(
    namespace: String,
    view: String,
    params: Context,
    partials: js.UndefOr[scala.Nothing],
    indent: String
  ): String = js.native
  def render(namespace: String, view: String, params: Context, partials: Partials): String = js.native
  def render(namespace: String, view: String, params: Context, partials: Partials, indent: String): String = js.native
  
  def template(namespace: String, view: String): Template_ = js.native
  
  var templateKey: js.Any = js.native
}
