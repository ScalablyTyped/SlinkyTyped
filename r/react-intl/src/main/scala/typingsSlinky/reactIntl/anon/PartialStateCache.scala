package typingsSlinky.reactIntl.anon

import typingsSlinky.reactIntl.providerMod.OptionalIntlConfig
import typingsSlinky.reactIntl.typesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-intl.react-intl/lib/src/components/provider.State> */
@js.native
trait PartialStateCache extends js.Object {
  
  var cache: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlCache */ js.Any
  ] = js.native
  
  var intl: js.UndefOr[IntlShape] = js.native
  
  var prevConfig: js.UndefOr[OptionalIntlConfig] = js.native
}
object PartialStateCache {
  
  @scala.inline
  def apply(): PartialStateCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateCache]
  }
  
  @scala.inline
  implicit class PartialStateCacheOps[Self <: PartialStateCache] (val x: Self) extends AnyVal {
    
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
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setIntl(value: IntlShape): Self = this.set("intl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntl: Self = this.set("intl", js.undefined)
    
    @scala.inline
    def setPrevConfig(value: OptionalIntlConfig): Self = this.set("prevConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevConfig: Self = this.set("prevConfig", js.undefined)
  }
}
