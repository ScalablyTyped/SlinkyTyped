package typingsSlinky.hapiJoi.mod

import typingsSlinky.hapiJoi.anon.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceOptions extends HierarchySeparatorOptions {
  /**
    * a function with the signature `function(value)` where `value` is the resolved reference value and the return value is the adjusted value to use.
    * Note that the adjust feature will not perform any type validation on the adjusted value and it must match the value expected by the rule it is used in.
    * Cannot be used with `map`.
    *
    * @example `(value) => value + 5`
    */
  var adjust: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  /**
    * If set to a number, sets the reference relative starting point.
    * Cannot be combined with separator prefix characters.
    * Defaults to the reference key prefix (or 1 if none present)
    */
  var ancestor: js.UndefOr[Double] = js.native
  /**
    * creates an in-reference.
    */
  var in: js.UndefOr[Boolean] = js.native
  /**
    * when true, the reference resolves by reaching into maps and sets.
    */
  var iterables: js.UndefOr[Boolean] = js.native
  /**
    * an array of array pairs using the format `[[key, value], [key, value]]` used to maps the resolved reference value to another value.
    * If the resolved value is not in the map, it is returned as-is.
    * Cannot be used with `adjust`.
    */
  var map: js.UndefOr[js.Array[js.Tuple2[_, _]]] = js.native
  /**
    * overrides default prefix characters.
    */
  var prefix: js.UndefOr[Global] = js.native
}

object ReferenceOptions {
  @scala.inline
  def apply(): ReferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceOptions]
  }
  @scala.inline
  implicit class ReferenceOptionsOps[Self <: ReferenceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjust(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAdjust: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjust")(js.undefined)
        ret
    }
    @scala.inline
    def withAncestor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestor")(js.undefined)
        ret
    }
    @scala.inline
    def withIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.undefined)
        ret
    }
    @scala.inline
    def withIterables(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterables")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Array[js.Tuple2[_, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Global): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
  }
  
}

