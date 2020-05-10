package typingsSlinky.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/css.html
  *
  *
  */
@js.native
trait css_ extends js.Object {
  /**
    *
    */
  var rules: js.Object = js.native
  /**
    *
    * @param initialStylesheets
    */
  def determineContext(initialStylesheets: js.Any): js.Array[_] = js.native
  /**
    *
    * @param sheet
    */
  def findStyleSheet(sheet: js.Any): js.Array[_] = js.native
  /**
    *
    * @param sheets
    */
  def findStyleSheets(sheets: js.Any): js.Array[_] = js.native
}

object css_ {
  @scala.inline
  def apply(
    determineContext: js.Any => js.Array[_],
    findStyleSheet: js.Any => js.Array[_],
    findStyleSheets: js.Any => js.Array[_],
    rules: js.Object
  ): css_ = {
    val __obj = js.Dynamic.literal(determineContext = js.Any.fromFunction1(determineContext), findStyleSheet = js.Any.fromFunction1(findStyleSheet), findStyleSheets = js.Any.fromFunction1(findStyleSheets), rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[css_]
  }
  @scala.inline
  implicit class css_Ops[Self <: css_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetermineContext(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determineContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindStyleSheet(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findStyleSheet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindStyleSheets(value: js.Any => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findStyleSheets")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRules(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

