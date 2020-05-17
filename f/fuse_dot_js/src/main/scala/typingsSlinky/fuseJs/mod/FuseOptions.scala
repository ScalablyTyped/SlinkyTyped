package typingsSlinky.fuseJs.mod

import typingsSlinky.fuseJs.anon.Name
import typingsSlinky.fuseJs.anon.Score
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuseOptions[T] extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var distance: js.UndefOr[Double] = js.native
  var findAllMatches: js.UndefOr[Boolean] = js.native
  var getFn: js.UndefOr[js.Function2[/* obj */ js.Any, /* path */ String, _]] = js.native
  var id: js.UndefOr[/* keyof T */ String] = js.native
  var includeMatches: js.UndefOr[Boolean] = js.native
  var includeScore: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[js.Array[Name[T] | (/* keyof T */ String)]] = js.native
  var location: js.UndefOr[Double] = js.native
  var matchAllTokens: js.UndefOr[Boolean] = js.native
  var maxPatternLength: js.UndefOr[Double] = js.native
  var minMatchCharLength: js.UndefOr[Double] = js.native
  var shouldSort: js.UndefOr[Boolean] = js.native
  var sortFn: js.UndefOr[js.Function2[/* a */ Score, /* b */ Score, Double]] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var tokenSeparator: js.UndefOr[js.RegExp] = js.native
  var tokenize: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object FuseOptions {
  @scala.inline
  def apply[T](): FuseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FuseOptions[T]]
  }
  @scala.inline
  implicit class FuseOptionsOps[Self[t] <: FuseOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withFindAllMatches(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAllMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindAllMatches: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAllMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFn(value: (/* obj */ js.Any, /* path */ String) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetFn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFn")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: /* keyof T */ String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeMatches(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeMatches: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeScore(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeScore: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeScore")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[Name[T] | (/* keyof T */ String)]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchAllTokens(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAllTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchAllTokens: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchAllTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPatternLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPatternLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPatternLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPatternLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMatchCharLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMatchCharLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMatchCharLength: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMatchCharLength")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldSort(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldSort: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldSort")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFn(value: (/* a */ Score, /* b */ Score) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortFn: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFn")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenSeparator(value: js.RegExp): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenSeparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withTokenize(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokenize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenize")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

