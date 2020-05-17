package typingsSlinky.mathjax.MathJax

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

object HTML {
  @scala.inline
  def apply(
    Element: (String, js.Any, js.Any) => js.Any,
    TextNode: String => js.Any,
    addElement: (js.Any, String, js.Any, js.Any) => js.Any,
    addText: (js.Any, String) => js.Any,
    getScript: String => String,
    setScript: (String, String) => Unit
  ): HTML = {
    val __obj = js.Dynamic.literal(Element = js.Any.fromFunction3(Element), TextNode = js.Any.fromFunction1(TextNode), addElement = js.Any.fromFunction4(addElement), addText = js.Any.fromFunction2(addText), getScript = js.Any.fromFunction1(getScript), setScript = js.Any.fromFunction2(setScript))
    __obj.asInstanceOf[HTML]
  }
  @scala.inline
  implicit class HTMLOps[Self <: HTML] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: (String, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Element")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTextNode(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddElement(value: (js.Any, String, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addElement")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAddText(value: (js.Any, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetScript(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScript")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetScript(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScript")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCookie(value: Cookie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cookie")(js.undefined)
        ret
    }
  }
  
}

