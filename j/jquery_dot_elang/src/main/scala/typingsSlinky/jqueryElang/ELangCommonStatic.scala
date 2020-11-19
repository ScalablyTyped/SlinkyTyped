package typingsSlinky.jqueryElang

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ELangCommonStatic extends js.Object {
  
  def getLabel(labelid: String): String = js.native
  def getLabel(labelid: String, langid: String): String = js.native
  
  var resource: IPageResource = js.native
  
  def setLang(langid: String): Unit = js.native
  def setLang(langid: String, node: JQuery[HTMLElement]): Unit = js.native
}
