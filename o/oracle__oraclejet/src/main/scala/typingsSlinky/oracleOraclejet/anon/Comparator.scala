package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparator
  extends /* key */ StringDictionary[js.Any] {
  var comparator: js.UndefOr[
    Null | String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])
  ] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.native
  var model: js.UndefOr[Model] = js.native
  var modelLimit: js.UndefOr[Double] = js.native
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var url: js.UndefOr[String] = js.native
}

object Comparator {
  @scala.inline
  def apply(): Comparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comparator]
  }
  @scala.inline
  implicit class ComparatorOps[Self <: Comparator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComparatorFunction2(value: (/* model1 */ Model, /* model2 */ js.UndefOr[Model]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComparator(value: String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
    @scala.inline
    def withComparatorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(null)
        ret
    }
    @scala.inline
    def withFetchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: (/* models */ js.Array[Model], /* options */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: Model): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withModelLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

