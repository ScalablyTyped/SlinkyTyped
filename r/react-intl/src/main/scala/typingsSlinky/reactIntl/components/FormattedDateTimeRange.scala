package typingsSlinky.reactIntl.components

import typingsSlinky.reactIntl.componentsDateTimeRangeMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedDateTimeRange {
  
  @JSImport("react-intl", "FormattedDateTimeRange")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_802140368 = new SharedBuilder_Props_802140368(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    from: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[0] */ js.Any,
    to: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCallStartDateEndDate>[1] */ js.Any
  ): SharedBuilder_Props_802140368 = {
    val __props = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    new SharedBuilder_Props_802140368(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
