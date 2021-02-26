package typingsSlinky.reactIntl

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.formatjsIntl.srcTypesMod.CustomFormatConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDateTimeRangeMod extends Shortcut {
  
  @JSImport("react-intl/src/components/dateTimeRange", JSImport.Default)
  @js.native
  val default: ReactComponentClass[Props] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormatOptions extends 'localeMatcher' ? never : @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/types/date-time.DateTimeFormatOptions */ @js.native
  trait Props extends CustomFormatConfig {
    
    var children: js.UndefOr[js.Function1[/* value */ ReactElement, ReactElement | Null]] = js.native
    
    var from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any = js.native
    
    var to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
      to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
    ): Props = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* value */ ReactElement => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFrom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any
      ): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
      ): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[Props]
  
  /* This means you don't have to write `default`, but can instead just say `componentsDateTimeRangeMod.foo` */
  override def _to: ReactComponentClass[Props] = default
}
