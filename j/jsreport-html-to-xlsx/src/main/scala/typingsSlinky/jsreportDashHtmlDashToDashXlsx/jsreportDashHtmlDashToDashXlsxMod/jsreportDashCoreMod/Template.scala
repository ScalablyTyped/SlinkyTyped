package typingsSlinky.jsreportDashHtmlDashToDashXlsx.jsreportDashHtmlDashToDashXlsxMod.jsreportDashCoreMod

import typingsSlinky.jsreportDashHtmlDashToDashXlsx.Anon_HtmlEngine
import typingsSlinky.jsreportDashHtmlDashToDashXlsx.jsreportDashHtmlDashToDashXlsxStrings.`html-to-xlsx`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var htmlToXlsx: Anon_HtmlEngine
  var recipe: `html-to-xlsx` | String
}

object Template {
  @scala.inline
  def apply(htmlToXlsx: Anon_HtmlEngine, recipe: `html-to-xlsx` | String): Template = {
    val __obj = js.Dynamic.literal(htmlToXlsx = htmlToXlsx.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Template]
  }
}

