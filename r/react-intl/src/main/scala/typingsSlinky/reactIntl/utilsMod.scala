package typingsSlinky.reactIntl

import slinky.core.facade.ReactElement
import typingsSlinky.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl/lib/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def assignUniqueKeysToParts(
    formatXMLElementFn: FormatXMLElementFn[ReactElement, String | ReactElement | (js.Array[String | ReactElement])]
  ): FormatXMLElementFn[ReactElement, String | ReactElement | (js.Array[String | ReactElement])] = js.native
  
  def invariantIntlContext(): /* asserts intl */ Boolean = js.native
  def invariantIntlContext(intl: js.Any): /* asserts intl */ Boolean = js.native
  
  @js.native
  object DEFAULT_INTL_CONFIG extends js.Object {
    
    var defaultFormats: js.UndefOr[js.Any] = js.native
    
    var defaultLocale: js.UndefOr[js.Any] = js.native
    
    var formats: js.UndefOr[js.Any] = js.native
    
    var messages: js.UndefOr[js.Any] = js.native
    
    var onError: js.UndefOr[js.Any] = js.native
    
    var textComponent: js.UndefOr[js.Any] = js.native
    
    var timeZone: js.UndefOr[js.Any] = js.native
  }
}
