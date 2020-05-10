package typingsSlinky.reactLinkify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchInfo extends js.Object {
  /**
    * Offset of matched text
    */
  var index: Double = js.native
  /**
    * Index of next char after the end of the matched text
    */
  var lastIndex: Double = js.native
  /**
    * Link schema, can be empty for fuzzy links, or for protocol-neutral links
    */
  var schema: String = js.native
  /**
    * Normalized text
    */
  var text: String = js.native
  /**
    * Link, generated from matched text
    */
  var url: String = js.native
}

object MatchInfo {
  @scala.inline
  def apply(index: Double, lastIndex: Double, schema: String, text: String, url: String): MatchInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchInfo]
  }
  @scala.inline
  implicit class MatchInfoOps[Self <: MatchInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

