package typingsSlinky.reactIntl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typingsSlinky.reactIntl.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions with (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig * / js.Any) with typingsSlinky.reactIntl.anon.`0` because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig * / js.Any because couldn't resolve ClassTree.) */
object FormattedNumber {
  
  @JSImport("react-intl", "FormattedNumber")
  @js.native
  object component extends js.Object
  
  def apply(
    p: NumberFormatOptions with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig */ js.Any) with `0`
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FormattedNumber.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
