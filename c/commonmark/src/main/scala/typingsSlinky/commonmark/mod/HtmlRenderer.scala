package typingsSlinky.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("commonmark", "HtmlRenderer")
@js.native
class HtmlRenderer () extends js.Object {
  def this(options: HtmlRenderingOptions) = this()
  
  /**
    * Override the function that will be used to escape (sanitize) the html output. Return value is used to add to the html output
    * @param input the input to escape
    * @param isAttributeValue indicates wheter or not the input value will be used as value of an html attribute.
    */
  def escape(input: String, isAttributeValue: Boolean): String = js.native
  
  def render(root: Node): String = js.native
  
  /**
    * Let's you override the softbreak properties of a renderer. So, to make soft breaks render as hard breaks in HTML:
    * writer.softbreak = "<br />";
    */
  var softbreak: String = js.native
}
