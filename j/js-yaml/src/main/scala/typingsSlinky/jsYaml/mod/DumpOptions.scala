package typingsSlinky.jsYaml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DumpOptions extends js.Object {
  /**
  	 * if true flow sequences will be condensed, omitting the space between `key: value` or `a, b`. Eg. `'[a,b]'` or `{a:{b:c}}`.
  	 * Can be useful when using yaml for pretty URL query params as spaces are %-encoded. (default: false).
  	 */
  var condenseFlow: js.UndefOr[Boolean] = js.native
  /** specifies level of nesting, when to switch from block to flow style for collections. -1 means block style everwhere */
  var flowLevel: js.UndefOr[Double] = js.native
  /** indentation width to use (in spaces). */
  var indent: js.UndefOr[Double] = js.native
  /** set max line width. (default: 80) */
  var lineWidth: js.UndefOr[Double] = js.native
  /** when true, will not add an indentation level to array elements */
  var noArrayIndent: js.UndefOr[Boolean] = js.native
  /** if true don't try to be compatible with older yaml versions. Currently: don't quote "yes", "no" and so on, as required for YAML 1.1 (default: false) */
  var noCompatMode: js.UndefOr[Boolean] = js.native
  /** if true, don't convert duplicate objects into references (default: false) */
  var noRefs: js.UndefOr[Boolean] = js.native
  /** specifies a schema to use. */
  var schema: js.UndefOr[SchemaDefinition] = js.native
  /** do not throw on invalid types (like function in the safe schema) and skip pairs and single values with such types. */
  var skipInvalid: js.UndefOr[Boolean] = js.native
  /** if true, sort keys when dumping YAML. If a function, use the function to sort the keys. (default: false) */
  var sortKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
  /** Each tag may have own set of styles.	- "tag" => "style" map. */
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object DumpOptions {
  @scala.inline
  def apply(): DumpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DumpOptions]
  }
  @scala.inline
  implicit class DumpOptionsOps[Self <: DumpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondenseFlow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condenseFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondenseFlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condenseFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlowLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlowLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNoArrayIndent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noArrayIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoArrayIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noArrayIndent")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCompatMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompatMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCompatMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCompatMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRefs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRefs")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: SchemaDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withSortKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSortKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

