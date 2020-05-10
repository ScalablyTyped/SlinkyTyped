package typingsSlinky.dojo.dijit._editor

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/html.html
  *
  * HTML serialization utility functions used by editor
  * 
  */
@js.native
trait html extends js.Object {
  /**
    * Adds escape sequences for special characters in XML: &<>"'.
    * Optionally skips escapes for single quotes.
    * 
    * @param str             
    * @param noSingleQuotes               Optional            
    */
  def escapeXml(str: String, noSingleQuotes: Boolean): js.Any = js.native
  /**
    * Returns the html content of a DomNode's children
    * 
    * @param node             
    */
  def getChildrenHtml(node: HTMLElement): js.Any = js.native
  /**
    * Pushes the html content of a DomNode's children into out[]
    * 
    * @param dom             
    * @param output an array of arrays of points             
    */
  def getChildrenHtmlHelper(dom: HTMLElement, output: js.Array[String]): Unit = js.native
  /**
    * Return string representing HTML for node and it's children
    * 
    * @param node             
    */
  def getNodeHtml(node: HTMLElement): js.Any = js.native
  /**
    * Pushes array of strings into output[] which represent HTML for node and it's children
    * 
    * @param node             
    * @param output             
    */
  def getNodeHtmlHelper(node: HTMLElement, output: js.Array[String]): String = js.native
}

object html {
  @scala.inline
  def apply(
    escapeXml: (String, Boolean) => js.Any,
    getChildrenHtml: HTMLElement => js.Any,
    getChildrenHtmlHelper: (HTMLElement, js.Array[String]) => Unit,
    getNodeHtml: HTMLElement => js.Any,
    getNodeHtmlHelper: (HTMLElement, js.Array[String]) => String
  ): html = {
    val __obj = js.Dynamic.literal(escapeXml = js.Any.fromFunction2(escapeXml), getChildrenHtml = js.Any.fromFunction1(getChildrenHtml), getChildrenHtmlHelper = js.Any.fromFunction2(getChildrenHtmlHelper), getNodeHtml = js.Any.fromFunction1(getNodeHtml), getNodeHtmlHelper = js.Any.fromFunction2(getNodeHtmlHelper))
    __obj.asInstanceOf[html]
  }
  @scala.inline
  implicit class htmlOps[Self <: html] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEscapeXml(value: (String, Boolean) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeXml")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetChildrenHtml(value: HTMLElement => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildrenHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildrenHtmlHelper(value: (HTMLElement, js.Array[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildrenHtmlHelper")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetNodeHtml(value: HTMLElement => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeHtmlHelper(value: (HTMLElement, js.Array[String]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeHtmlHelper")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

