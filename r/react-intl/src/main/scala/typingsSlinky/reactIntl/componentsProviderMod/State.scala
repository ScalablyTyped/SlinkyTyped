package typingsSlinky.reactIntl.componentsProviderMod

import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  /**
    * Explicit intl cache to prevent memory leaks
    */
  var cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ js.Any = js.native
  
  /**
    * Intl object we created
    */
  var intl: js.UndefOr[IntlShape] = js.native
  
  /**
    * list of memoized config we care about.
    * This is important since creating intl is
    * very expensive
    */
  var prevConfig: OptionalIntlConfig = js.native
}
object State {
  
  @scala.inline
  def apply(
    cache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ js.Any,
    prevConfig: OptionalIntlConfig
  ): State = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], prevConfig = prevConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setCache(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ js.Any
    ): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevConfig(value: OptionalIntlConfig): Self = this.set("prevConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntl(value: IntlShape): Self = this.set("intl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntl: Self = this.set("intl", js.undefined)
  }
}
