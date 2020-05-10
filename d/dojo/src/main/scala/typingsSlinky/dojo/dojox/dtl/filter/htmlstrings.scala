package typingsSlinky.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/htmlstrings.html
  *
  *
  */
@js.native
trait htmlstrings extends js.Object {
  /**
    * Converts newlines into <p> and <br />s
    *
    * @param value
    */
  def linebreaks(value: js.Any): js.Any = js.native
  /**
    * Converts newlines into <br />s
    *
    * @param value
    */
  def linebreaksbr(value: js.Any): js.Any = js.native
  /**
    * Removes a space separated list of [X]HTML tags from the output"
    *
    * @param value
    * @param arg
    */
  def removetags(value: js.Any, arg: js.Any): js.Any = js.native
  /**
    * Strips all [X]HTML tags
    *
    * @param value
    */
  def striptags(value: js.Any): js.Any = js.native
}

object htmlstrings {
  @scala.inline
  def apply(
    linebreaks: js.Any => js.Any,
    linebreaksbr: js.Any => js.Any,
    removetags: (js.Any, js.Any) => js.Any,
    striptags: js.Any => js.Any
  ): htmlstrings = {
    val __obj = js.Dynamic.literal(linebreaks = js.Any.fromFunction1(linebreaks), linebreaksbr = js.Any.fromFunction1(linebreaksbr), removetags = js.Any.fromFunction2(removetags), striptags = js.Any.fromFunction1(striptags))
    __obj.asInstanceOf[htmlstrings]
  }
  @scala.inline
  implicit class htmlstringsOps[Self <: htmlstrings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinebreaks(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linebreaks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLinebreaksbr(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linebreaksbr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemovetags(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removetags")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStriptags(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("striptags")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

