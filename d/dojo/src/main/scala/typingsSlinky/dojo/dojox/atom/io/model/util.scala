package typingsSlinky.dojo.dojox.atom.io.model

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/model.util.html
  *
  *
  */
@js.native
trait util extends js.Object {
  /**
    * Utility function to create a date from a DOM node's text content.
    *
    * @param node The DOM node to inspect.
    */
  def createDate(node: HTMLElement): js.Any = js.native
  /**
    * Utility function to escape XML special characters in an HTML string.
    *
    * @param str The string to escape
    */
  def escapeHtml(str: String): js.Any = js.native
  /**
    * Utility function to get a node name and deal with IE's bad handling of namespaces
    * on tag names.
    *
    * @param node The DOM node whose name to retrieve.
    */
  def getNodename(node: HTMLElement): String = js.native
  /**
    * Utility function to un-escape XML special characters in an HTML string.
    *
    * @param str The string to un-escape.
    */
  def unEscapeHtml(str: String): js.Any = js.native
}

object util {
  @scala.inline
  def apply(
    createDate: HTMLElement => js.Any,
    escapeHtml: String => js.Any,
    getNodename: HTMLElement => String,
    unEscapeHtml: String => js.Any
  ): util = {
    val __obj = js.Dynamic.literal(createDate = js.Any.fromFunction1(createDate), escapeHtml = js.Any.fromFunction1(escapeHtml), getNodename = js.Any.fromFunction1(getNodename), unEscapeHtml = js.Any.fromFunction1(unEscapeHtml))
    __obj.asInstanceOf[util]
  }
  @scala.inline
  implicit class utilOps[Self <: util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDate(value: HTMLElement => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEscapeHtml(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeHtml")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodename(value: HTMLElement => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodename")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnEscapeHtml(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unEscapeHtml")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

