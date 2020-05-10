package typingsSlinky.lucene.mod

import typingsSlinky.lucene.AnonEnd
import typingsSlinky.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var boost: Null | Double = js.native
  var field: String | LessthansignimplicitGreaterthansign = js.native
  var fieldLocation: Null = js.native
  var prefix: Null | String = js.native
  var quoted: Boolean = js.native
  var regex: Boolean = js.native
  var similarity: Null = js.native
  var term: String = js.native
  var termLocation: AnonEnd = js.native
}

object Node {
  @scala.inline
  def apply(
    field: String | LessthansignimplicitGreaterthansign,
    fieldLocation: Null,
    quoted: Boolean,
    regex: Boolean,
    similarity: Null,
    term: String,
    termLocation: AnonEnd
  ): Node = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldLocation = fieldLocation.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], similarity = similarity.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String | LessthansignimplicitGreaterthansign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldLocation(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuoted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimilarity(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("similarity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTermLocation(value: AnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoostNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(null)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(null)
        ret
    }
  }
  
}

