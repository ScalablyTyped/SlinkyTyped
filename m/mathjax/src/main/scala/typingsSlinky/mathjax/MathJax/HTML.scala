package typingsSlinky.mathjax.MathJax

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTML extends js.Object {
  var Cookie: js.UndefOr[typingsSlinky.mathjax.MathJax.Cookie] = js.native
  /*Creates a DOM element of the given type. If attributes is non-null, it is an object that contains key:value
    * pairs of attributes to set for the newly created element. If contents is non-null, it is an HTML snippet that
    * describes the contents to create for the element.
    */
  def Element(`type`: String, attributes: js.Any, contents: js.Any): js.Any = js.native
  /*Creates a DOM text node with the given text as its content.*/
  def TextNode(text: String): js.Any = js.native
  /*Creates a DOM element and appends it to the parent node provided. It is equivalent to:
    * parent.appendChild(MathJax.HTML.Element(type,attributes,content))
    */
  def addElement(parent: js.Any, `type`: String, attributes: js.Any, content: js.Any): js.Any = js.native
  /*Creates a DOM text node with the given text and appends it to the parent node.*/
  def addText(parent: js.Any, text: String): js.Any = js.native
  /*Gets the contents of the script element, properly taking into account the browser limitations and bugs.*/
  def getScript(script: String): String = js.native
  /*Sets the contents of the script element to be the given text, properly taking into account the browser
    * limitations and bugs.
    */
  def setScript(script: String, text: String): Unit = js.native
}

@JSGlobal("MathJax.HTML")
@js.native
object HTML extends TopLevel[HTML]

