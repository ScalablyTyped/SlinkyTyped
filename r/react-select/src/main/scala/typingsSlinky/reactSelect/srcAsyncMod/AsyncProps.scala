package typingsSlinky.reactSelect.srcAsyncMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /* If cacheOptions is truthy, then the loaded data will be cached. The cache
    will remain until `cacheOptions` changes value.
    Default: false. */
  var cacheOptions: js.UndefOr[js.Any] = js.native
  /* The default set of options to show before the user starts searching. When
    set to `true`, the results for loadOptions('') will be autoloaded.
    Default: false. */
  var defaultOptions: js.UndefOr[OptionsType[OptionType] | Boolean] = js.native
  /* Function that returns a promise, which is the set of options to be used
    once the promise resolves. */
  def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): js.Promise[_] | Unit = js.native
}

object AsyncProps {
  @scala.inline
  def apply[OptionType](
    loadOptions: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[_] | Unit
  ): AsyncProps[OptionType] = {
    val __obj = js.Dynamic.literal(loadOptions = js.Any.fromFunction2(loadOptions))
    __obj.asInstanceOf[AsyncProps[OptionType]]
  }
  @scala.inline
  implicit class AsyncPropsOps[Self[optiontype] <: AsyncProps[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withLoadOptions(value: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[_] | Unit): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCacheOptions(value: js.Any): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheOptions: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOptions(value: OptionsType[OptionType] | Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
  }
  
}

