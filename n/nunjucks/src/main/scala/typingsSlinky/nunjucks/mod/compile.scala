package typingsSlinky.nunjucks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nunjucks", "compile")
@js.native
object compile extends js.Object {
  
  def apply(src: String): Template = js.native
  def apply(src: String, env: js.UndefOr[scala.Nothing], callback: TemplateCallback[Template]): Template = js.native
  def apply(src: String, env: Environment): Template = js.native
  def apply(src: String, env: Environment, callback: TemplateCallback[Template]): Template = js.native
}
