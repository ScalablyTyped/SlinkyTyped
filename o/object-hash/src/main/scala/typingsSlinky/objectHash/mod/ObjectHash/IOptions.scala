package typingsSlinky.objectHash.mod.ObjectHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var excludeKeys: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.native
  var excludeValues: js.UndefOr[Boolean] = js.native
  var ignoreUnknown: js.UndefOr[Boolean] = js.native
  var replacer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  var respectFunctionNames: js.UndefOr[Boolean] = js.native
  var respectFunctionProperties: js.UndefOr[Boolean] = js.native
  var respectType: js.UndefOr[Boolean] = js.native
  var unorderedArrays: js.UndefOr[Boolean] = js.native
  var unorderedObjects: js.UndefOr[Boolean] = js.native
  var unorderedSets: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeKeys(value: /* key */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExcludeKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUnknown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUnknown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUnknown")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacer(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReplacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacer")(js.undefined)
        ret
    }
    @scala.inline
    def withRespectFunctionNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respectFunctionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespectFunctionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respectFunctionNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRespectFunctionProperties(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respectFunctionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespectFunctionProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respectFunctionProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withRespectType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRespectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respectType")(js.undefined)
        ret
    }
    @scala.inline
    def withUnorderedArrays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedArrays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnorderedArrays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedArrays")(js.undefined)
        ret
    }
    @scala.inline
    def withUnorderedObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnorderedObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withUnorderedSets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnorderedSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unorderedSets")(js.undefined)
        ret
    }
  }
  
}

