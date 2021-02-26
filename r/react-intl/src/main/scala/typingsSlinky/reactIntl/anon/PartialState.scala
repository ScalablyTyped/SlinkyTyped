package typingsSlinky.reactIntl.anon

import typingsSlinky.formatjsIntl.srcTypesMod.IntlCache
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import typingsSlinky.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-intl.react-intl/src/components/provider.State> */
@js.native
trait PartialState extends StObject {
  
  var cache: js.UndefOr[IntlCache] = js.native
  
  var intl: js.UndefOr[IntlShape] = js.native
  
  var prevConfig: js.UndefOr[OptionalIntlConfig] = js.native
}
object PartialState {
  
  @scala.inline
  def apply(): PartialState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialState]
  }
  
  @scala.inline
  implicit class PartialStateMutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: IntlCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntlUndefined: Self = StObject.set(x, "intl", js.undefined)
    
    @scala.inline
    def setPrevConfig(value: OptionalIntlConfig): Self = StObject.set(x, "prevConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevConfigUndefined: Self = StObject.set(x, "prevConfig", js.undefined)
  }
}
