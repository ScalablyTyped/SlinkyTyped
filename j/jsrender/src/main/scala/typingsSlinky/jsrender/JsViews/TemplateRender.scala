package typingsSlinky.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateRender extends js.Object {
  
  /**
  	 * Template render method: render the template as a string, using the specified data and helpers/context
  	 * var htmlString = template(data, myHelpersObject);
  	 * var htmlString = template.render(data, myHelpersObject);
  	 *
  	 * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
  	 *
  	 * @param {any}        data
  	 * @param {hash}       [helpersOrContext]
  	 * @param {boolean}    [noIteration]
  	 * @returns {string}   rendered template
  	 */
  def apply(): String = js.native
  def apply(data: js.UndefOr[scala.Nothing], helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
  def apply(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_]): String = js.native
  def apply(data: js.UndefOr[scala.Nothing], helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
  def apply(data: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
  def apply(data: js.Any): String = js.native
  def apply(data: js.Any, helpersOrContext: js.UndefOr[scala.Nothing], noIteration: Boolean): String = js.native
  def apply(data: js.Any, helpersOrContext: Hash[_]): String = js.native
  def apply(data: js.Any, helpersOrContext: Hash[_], noIteration: Boolean): String = js.native
  def apply(data: js.Any, noIteration: Boolean): String = js.native
}
