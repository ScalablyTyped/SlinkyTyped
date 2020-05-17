package typingsSlinky.reactIntl.components

import typingsSlinky.reactIntl.anon.DateTimeFormatOptionsCust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedDate {
  @JSImport("react-intl", "FormattedDate")
  @js.native
  object component extends js.Object
  
  def withProps(p: DateTimeFormatOptionsCust): SharedBuilder_DateTimeFormatOptionsCust276893233 = new SharedBuilder_DateTimeFormatOptionsCust276893233(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormattedDate.type): SharedBuilder_DateTimeFormatOptionsCust276893233 = new SharedBuilder_DateTimeFormatOptionsCust276893233(js.Array(this.component, js.Dictionary.empty))()
}

