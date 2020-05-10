package typingsSlinky.mongoose.mod

import typingsSlinky.mongoose.AnonInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelMapReduceOption[T, Key, Val] extends js.Object {
  /** finalize function */
  @JSName("finalize")
  var finalize_FModelMapReduceOption: js.UndefOr[js.Function2[/* key */ Key, /* val */ Val, Val]] = js.native
  /** it is possible to make the execution stay in JS. Provided in MongoDB > 2.0.X default: false */
  var jsMode: js.UndefOr[Boolean] = js.native
  /** keep temporary data default: false */
  var keeptemp: js.UndefOr[Boolean] = js.native
  /** max number of documents */
  var limit: js.UndefOr[Double] = js.native
  var map: js.Function | String = js.native
  /** sets the output target for the map reduce job. default: {inline: 1} */
  var out: js.UndefOr[AnonInline] = js.native
  /** query filter object. */
  var query: js.UndefOr[js.Any] = js.native
  var readPreference: js.UndefOr[String] = js.native
  /** scope variables exposed to map/reduce/finalize during execution */
  var scope: js.UndefOr[js.Any] = js.native
  /** sort input objects using this key */
  var sort: js.UndefOr[js.Any] = js.native
  /** provide statistics on job execution time. default: false */
  var verbose: js.UndefOr[Boolean] = js.native
  def reduce(key: Key, vals: js.Array[T]): Val = js.native
}

object ModelMapReduceOption {
  @scala.inline
  def apply[T, Key, Val](map: js.Function | String, reduce: (Key, js.Array[T]) => Val): ModelMapReduceOption[T, Key, Val] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce))
    __obj.asInstanceOf[ModelMapReduceOption[T, Key, Val]]
  }
  @scala.inline
  implicit class ModelMapReduceOptionOps[Self[t, key, `val`] <: ModelMapReduceOption[t, key, `val`], T, Key, Val] (val x: Self[T, Key, Val]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, Key, Val] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, Key, Val]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, Key, Val]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, Key, Val]) with Other]
    @scala.inline
    def withMap(value: js.Function | String): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReduce(value: (Key, js.Array[T]) => Val): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reduce")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFinalize(value: (/* key */ Key, /* val */ Val) => Val): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFinalize: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalize")(js.undefined)
        ret
    }
    @scala.inline
    def withJsMode(value: Boolean): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsMode: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKeeptemp(value: Boolean): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keeptemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeeptemp: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keeptemp")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withOut(value: AnonInline): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOut: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreference(value: String): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Any): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self[T, Key, Val] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

