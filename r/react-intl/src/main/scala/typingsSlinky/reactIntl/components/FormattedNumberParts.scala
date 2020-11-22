package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactIntl.anon.ChildrenValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatNumber'] * / js.Any) with typingsSlinky.reactIntl.anon.ChildrenValue because: IArray(Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatNumber'] * / js.Any because couldn't resolve ClassTree.) */
object FormattedNumberParts {
  
  @JSImport("react-intl", "FormattedNumberParts")
  @js.native
  object component extends js.Object
  
  def apply(
    p: (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatNumber'] */ js.Any) with ChildrenValue
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormattedNumberParts.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
