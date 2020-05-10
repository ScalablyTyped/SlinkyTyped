package typingsSlinky.dojo.dojox.drawing.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/typeset.html
  *
  *
  */
@js.native
trait typeset extends js.Object {
  /**
    *
    * @param inText
    */
  def convertHTML(inText: js.Any): js.Any = js.native
  /**
    *
    * @param inText
    */
  def convertLaTeX(inText: js.Any): js.Any = js.native
}

object typeset {
  @scala.inline
  def apply(convertHTML: js.Any => js.Any, convertLaTeX: js.Any => js.Any): typeset = {
    val __obj = js.Dynamic.literal(convertHTML = js.Any.fromFunction1(convertHTML), convertLaTeX = js.Any.fromFunction1(convertLaTeX))
    __obj.asInstanceOf[typeset]
  }
  @scala.inline
  implicit class typesetOps[Self <: typeset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertHTML(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertHTML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvertLaTeX(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertLaTeX")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

