package typingsSlinky.node.NodeJS

import typingsSlinky.node.nodeStrings.get
import typingsSlinky.node.nodeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectOptions extends js.Object {
  var breakLength: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[Boolean] = js.native
  /**
    * Setting this to `false` causes each object key
    * to be displayed on a new line. It will also add new lines to text that is
    * longer than `breakLength`. If set to a number, the most `n` inner elements
    * are united on a single line as long as all properties fit into
    * `breakLength`. Short array elements are also grouped together. Note that no
    * text will be reduced below 16 characters, no matter the `breakLength` size.
    * For more information, see the example below.
    * @default `true`
    */
  var compact: js.UndefOr[Boolean | Double] = js.native
  var customInspect: js.UndefOr[Boolean] = js.native
  /**
    * @default 2
    */
  var depth: js.UndefOr[Double | Null] = js.native
  /**
    * If set to `true`, getters are going to be
    * inspected as well. If set to `'get'` only getters without setter are going
    * to be inspected. If set to `'set'` only getters having a corresponding
    * setter are going to be inspected. This might cause side effects depending on
    * the getter function.
    * @default `false`
    */
  var getters: js.UndefOr[get | set | Boolean] = js.native
  var maxArrayLength: js.UndefOr[Double | Null] = js.native
  /**
    * Specifies the maximum number of characters to
    * include when formatting. Set to `null` or `Infinity` to show all elements.
    * Set to `0` or negative to show no characters.
    * @default Infinity
    */
  var maxStringLength: js.UndefOr[Double | Null] = js.native
  var showHidden: js.UndefOr[Boolean] = js.native
  var showProxy: js.UndefOr[Boolean] = js.native
  var sorted: js.UndefOr[Boolean | (js.Function2[/* a */ String, /* b */ String, Double])] = js.native
}

object InspectOptions {
  @scala.inline
  def apply(): InspectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectOptions]
  }
  @scala.inline
  implicit class InspectOptionsOps[Self <: InspectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLength")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withCompact(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compact")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomInspect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInspect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomInspect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInspect")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(null)
        ret
    }
    @scala.inline
    def withGetters(value: get | set | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxArrayLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxArrayLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxArrayLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxArrayLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxArrayLengthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxArrayLength")(null)
        ret
    }
    @scala.inline
    def withMaxStringLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStringLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStringLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStringLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStringLengthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStringLength")(null)
        ret
    }
    @scala.inline
    def withShowHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withShowProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withSortedFunction2(value: (/* a */ String, /* b */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSorted(value: Boolean | (js.Function2[/* a */ String, /* b */ String, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSorted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(js.undefined)
        ret
    }
  }
  
}

