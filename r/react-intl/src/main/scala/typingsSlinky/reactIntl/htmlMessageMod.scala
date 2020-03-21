package typingsSlinky.reactIntl

import typingsSlinky.intlMessageformat.mod.PrimitiveType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/components/html-message", JSImport.Namespace)
@js.native
object htmlMessageMod extends js.Object {
  @js.native
  trait FormattedHTMLMessage
    extends typingsSlinky.reactIntl.messageMod.default[Record[String, PrimitiveType]]
  
  @js.native
  class default () extends FormattedHTMLMessage
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonTagName = js.native
    var displayName: String = js.native
  }
  
}

