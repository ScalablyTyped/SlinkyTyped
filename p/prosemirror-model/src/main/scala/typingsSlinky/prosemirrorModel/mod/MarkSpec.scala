package typingsSlinky.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkSpec
  extends /**
  * Allow specifying arbitrary fields on a NodeSpec.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * The attributes that marks of this type get.
    */
  var attrs: js.UndefOr[StringDictionary[AttributeSpec] | Null] = js.native
  /**
    * Determines which other marks this mark can coexist with. Should
    * be a space-separated strings naming other marks or groups of marks.
    * When a mark is [added](#model.Mark.addToSet) to a set, all marks
    * that it excludes are removed in the process. If the set contains
    * any mark that excludes the new mark but is not, itself, excluded
    * by the new mark, the mark can not be added an the set. You can
    * use the value `"_"` to indicate that the mark excludes all
    * marks in the schema.
    *
    * Defaults to only being exclusive with marks of the same type. You
    * can set it to an empty string (or any string not containing the
    * mark's own name) to allow multiple marks of a given type to
    * coexist (as long as they have different attributes).
    */
  var excludes: js.UndefOr[String | Null] = js.native
  /**
    * The group or space-separated groups to which this mark belongs.
    */
  var group: js.UndefOr[String | Null] = js.native
  /**
    * Whether this mark should be active when the cursor is positioned
    * at its end (or at its start when that is also the start of the
    * parent node). Defaults to true.
    */
  var inclusive: js.UndefOr[Boolean | Null] = js.native
  /**
    * Associates DOM parser information with this mark (see the
    * corresponding [node spec field](#model.NodeSpec.parseDOM)). The
    * `mark` field in the rules is implied.
    */
  var parseDOM: js.UndefOr[js.Array[ParseRule] | Null] = js.native
  /**
    * Determines whether marks of this type can span multiple adjacent
    * nodes when serialized to DOM/HTML. Defaults to true.
    */
  var spanning: js.UndefOr[Boolean | Null] = js.native
  /**
    * Defines the default way marks of this type should be serialized
    * to DOM/HTML.
    */
  var toDOM: js.UndefOr[(js.Function2[/* mark */ Mark[_], /* inline */ Boolean, DOMOutputSpec]) | Null] = js.native
}

object MarkSpec {
  @scala.inline
  def apply(): MarkSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkSpec]
  }
  @scala.inline
  implicit class MarkSpecOps[Self <: MarkSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: StringDictionary[AttributeSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(null)
        ret
    }
    @scala.inline
    def withExcludes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludes")(null)
        ret
    }
    @scala.inline
    def withGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(null)
        ret
    }
    @scala.inline
    def withInclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusiveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusive")(null)
        ret
    }
    @scala.inline
    def withParseDOM(value: js.Array[ParseRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withParseDOMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDOM")(null)
        ret
    }
    @scala.inline
    def withSpanning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpanning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanning")(js.undefined)
        ret
    }
    @scala.inline
    def withSpanningNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanning")(null)
        ret
    }
    @scala.inline
    def withToDOM(value: (/* mark */ Mark[_], /* inline */ Boolean) => DOMOutputSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDOM")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutToDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withToDOMNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDOM")(null)
        ret
    }
  }
  
}

