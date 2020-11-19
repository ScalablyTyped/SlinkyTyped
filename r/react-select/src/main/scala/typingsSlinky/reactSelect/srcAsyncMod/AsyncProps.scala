package typingsSlinky.reactSelect.srcAsyncMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply[OptionType /* <: OptionTypeBase */](
    loadOptions: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[_] | Unit
  ): AsyncProps[OptionType] = {
    val __obj = js.Dynamic.literal(loadOptions = js.Any.fromFunction2(loadOptions))
    __obj.asInstanceOf[AsyncProps[OptionType]]
  }
  
  @scala.inline
  implicit class AsyncPropsOps[Self <: AsyncProps[_], OptionType /* <: OptionTypeBase */] (val x: Self with AsyncProps[OptionType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadOptions(value: (String, js.Function1[/* options */ OptionsType[OptionType], Unit]) => js.Promise[_] | Unit): Self = this.set("loadOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCacheOptions(value: js.Any): Self = this.set("cacheOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheOptions: Self = this.set("cacheOptions", js.undefined)
    
    @scala.inline
    def setDefaultOptionsVarargs(value: OptionType*): Self = this.set("defaultOptions", js.Array(value :_*))
    
    @scala.inline
    def setDefaultOptions(value: OptionsType[OptionType] | Boolean): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOptions: Self = this.set("defaultOptions", js.undefined)
  }
}
