package typingsSlinky.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cid extends js.Object {
  /**
  			 * The customization id for translate
  			 */
  var cid: js.UndefOr[js.Array[String]] = js.native
  /**
  			 * Selector specifying which fields to include in a partial response.
  			 */
  var fields: js.UndefOr[String] = js.native
  /**
  			 * This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates plain-text
  			 */
  var format: js.UndefOr[String] = js.native
  /**
  			 * If prettyprint=true, the results returned by the server will be human readable (pretty printed).
  			 */
  var prettyprint: js.UndefOr[String] = js.native
  /**
  			 *  The text to translate
  			 */
  var q: js.Array[String] = js.native
  /**
  			 * The source language of the text
  			 */
  var source: js.UndefOr[String] = js.native
  /**
  			 * The target language into which the text should be translated
  			 */
  var target: String = js.native
}

object Cid {
  @scala.inline
  def apply(q: js.Array[String], target: String): Cid = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid]
  }
  @scala.inline
  implicit class CidOps[Self <: Cid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQ(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCid(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyprint")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

