package typingsSlinky.reactIntl.components

import typingsSlinky.reactIntl.DateTimeFormatOptionsCust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormattedTime {
  @JSImport("react-intl", "FormattedTime")
  @js.native
  object component extends js.Object
  
  def withProps(p: DateTimeFormatOptionsCust): SharedBuilder_DateTimeFormatOptionsCust_1667734163 = new SharedBuilder_DateTimeFormatOptionsCust_1667734163(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormattedTime.type): SharedBuilder_DateTimeFormatOptionsCust_1667734163 = new SharedBuilder_DateTimeFormatOptionsCust_1667734163(js.Array(this.component, js.Dictionary.empty))()
}

