package typingsSlinky.dojo.dojox.highlight.languages.xquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xquery.defaultMode.html
  *
  *
  */
@js.native
trait defaultMode extends js.Object {
  /**
    *
    */
  var contains: js.Array[_] = js.native
  /**
    *
    */
  var keywords: js.Object = js.native
  /**
    *
    */
  var lexems: js.Array[_] = js.native
}

object defaultMode {
  @scala.inline
  def apply(contains: js.Array[_], keywords: js.Object, lexems: js.Array[_]): defaultMode = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], lexems = lexems.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultMode]
  }
  @scala.inline
  implicit class defaultModeOps[Self <: defaultMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeywords(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLexems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

