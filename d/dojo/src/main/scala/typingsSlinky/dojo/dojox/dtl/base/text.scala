package typingsSlinky.dojo.dojox.dtl.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.text.html
  *
  *
  */
@js.native
trait text extends js.Object {
  /**
    *
    * @param name
    * @param errorless
    */
  def getFilter(name: js.Any, errorless: js.Any): js.Any = js.native
  /**
    *
    * @param name
    * @param errorless
    */
  def getTag(name: js.Any, errorless: js.Any): js.Any = js.native
  /**
    *
    * @param file
    */
  def getTemplate(file: js.Any): js.Any = js.native
  /**
    *
    * @param file
    */
  def getTemplateString(file: js.Any): String = js.native
  /**
    *
    * @param str
    */
  def tokenize(str: js.Any): js.Any = js.native
}

object text {
  @scala.inline
  def apply(
    getFilter: (js.Any, js.Any) => js.Any,
    getTag: (js.Any, js.Any) => js.Any,
    getTemplate: js.Any => js.Any,
    getTemplateString: js.Any => String,
    tokenize: js.Any => js.Any
  ): text = {
    val __obj = js.Dynamic.literal(getFilter = js.Any.fromFunction2(getFilter), getTag = js.Any.fromFunction2(getTag), getTemplate = js.Any.fromFunction1(getTemplate), getTemplateString = js.Any.fromFunction1(getTemplateString), tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[text]
  }
  @scala.inline
  implicit class textOps[Self <: text] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFilter(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTag(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTag")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTemplate(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTemplateString(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTemplateString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTokenize(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

