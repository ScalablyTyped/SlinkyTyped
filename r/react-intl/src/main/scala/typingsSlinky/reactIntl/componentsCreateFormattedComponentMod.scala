package typingsSlinky.reactIntl

import slinky.core.ReactComponentClass
import typingsSlinky.formatjsIntl.srcTypesMod.FormatDateOptions
import typingsSlinky.formatjsIntl.srcTypesMod.FormatDisplayNameOptions
import typingsSlinky.formatjsIntl.srcTypesMod.FormatListOptions
import typingsSlinky.formatjsIntl.srcTypesMod.FormatNumberOptions
import typingsSlinky.reactIntl.anon.Value
import typingsSlinky.reactIntl.anon.`0`
import typingsSlinky.reactIntl.anon.`1`
import typingsSlinky.reactIntl.anon.`2`
import typingsSlinky.reactIntl.anon.`3`
import typingsSlinky.reactIntl.anon.`4`
import typingsSlinky.reactIntl.reactIntlStrings.formatDate
import typingsSlinky.reactIntl.reactIntlStrings.formatDisplayName
import typingsSlinky.reactIntl.reactIntlStrings.formatList
import typingsSlinky.reactIntl.reactIntlStrings.formatNumber
import typingsSlinky.reactIntl.reactIntlStrings.formatTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCreateFormattedComponentMod {
  
  @JSImport("react-intl/src/components/createFormattedComponent", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: ReactComponentClass[FormatNumberOptions with Value] = js.native
  
  @JSImport("react-intl/src/components/createFormattedComponent", "createFormattedComponent")
  @js.native
  def createFormattedComponent_formatDate(name: formatDate): ReactComponentClass[FormatDateOptions with `0`] = js.native
  @JSImport("react-intl/src/components/createFormattedComponent", "createFormattedComponent")
  @js.native
  def createFormattedComponent_formatDisplayName(name: formatDisplayName): ReactComponentClass[FormatDisplayNameOptions with `3`] = js.native
  @JSImport("react-intl/src/components/createFormattedComponent", "createFormattedComponent")
  @js.native
  def createFormattedComponent_formatList(name: formatList): ReactComponentClass[FormatListOptions with `2`] = js.native
  @JSImport("react-intl/src/components/createFormattedComponent", "createFormattedComponent")
  @js.native
  def createFormattedComponent_formatNumber(name: formatNumber): ReactComponentClass[FormatNumberOptions with `1`] = js.native
  @JSImport("react-intl/src/components/createFormattedComponent", "createFormattedComponent")
  @js.native
  def createFormattedComponent_formatTime(name: formatTime): ReactComponentClass[FormatDateOptions with `0`] = js.native
  
  @JSImport("react-intl/src/components/createFormattedComponent", "createFormattedDateTimePartsComponent")
  @js.native
  def createFormattedDateTimePartsComponent[Name /* <: formatDate | formatTime */](name: Name): ReactComponentClass[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter[Name] */ js.Any) with `4`[Name]
  ] = js.native
  
  @js.native
  trait Formatter extends StObject {
    
    var formatDate: FormatDateOptions = js.native
    
    var formatDisplayName: FormatDisplayNameOptions = js.native
    
    var formatList: FormatListOptions = js.native
    
    var formatNumber: FormatNumberOptions = js.native
    
    var formatTime: FormatDateOptions = js.native
  }
  object Formatter {
    
    @scala.inline
    def apply(
      formatDate: FormatDateOptions,
      formatDisplayName: FormatDisplayNameOptions,
      formatList: FormatListOptions,
      formatNumber: FormatNumberOptions,
      formatTime: FormatDateOptions
    ): Formatter = {
      val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatDisplayName = formatDisplayName.asInstanceOf[js.Any], formatList = formatList.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatter]
    }
    
    @scala.inline
    implicit class FormatterMutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatDate(value: FormatDateOptions): Self = StObject.set(x, "formatDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatDisplayName(value: FormatDisplayNameOptions): Self = StObject.set(x, "formatDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatList(value: FormatListOptions): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatNumber(value: FormatNumberOptions): Self = StObject.set(x, "formatNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatTime(value: FormatDateOptions): Self = StObject.set(x, "formatTime", value.asInstanceOf[js.Any])
    }
  }
}
