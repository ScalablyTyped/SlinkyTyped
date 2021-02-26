package typingsSlinky.reactIntl.components

import slinky.core.facade.ReactElement
import typingsSlinky.formatjsIntl.srcTypesMod.FormatDateOptions
import typingsSlinky.reactIntl.anon.Children
import typingsSlinky.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedDateParts {
  
  @scala.inline
  def apply(
    children: js.Array[DateTimeFormatPart] => ReactElement | Null,
    value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
  ): SharedBuilder_FormatDateOptionsChildren1965677642 = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    new SharedBuilder_FormatDateOptionsChildren1965677642(js.Array(this.component, __props.asInstanceOf[FormatDateOptions with Children]))
  }
  
  @JSImport("react-intl", "FormattedDateParts")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormatDateOptions with Children): SharedBuilder_FormatDateOptionsChildren1965677642 = new SharedBuilder_FormatDateOptionsChildren1965677642(js.Array(this.component, p.asInstanceOf[js.Any]))
}
