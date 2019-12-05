package typingsSlinky.activexDashStdole

import typingsSlinky.activexDashStdole.activexDashStdoleStrings.FontChanged
import typingsSlinky.activexDashStdole.activexDashStdoleStrings.PropertyName
import typingsSlinky.activexDashStdole.stdole.StdFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: StdFont,
    event: FontChanged,
    argNames: js.Array[PropertyName],
    handler: js.ThisFunction1[/* this */ StdFont, /* parameter */ Anon_PropertyName, Unit]
  ): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[/* this */ StdFont, /* parameter */ Anon_PropertyName, Unit]) => Unit
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4(on))
  
    __obj.asInstanceOf[ActiveXObject]
  }
}

