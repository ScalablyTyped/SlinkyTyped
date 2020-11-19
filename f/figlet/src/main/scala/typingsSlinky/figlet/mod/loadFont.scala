package typingsSlinky.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("figlet", "loadFont")
@js.native
object loadFont extends js.Object {
  
  def apply(
    font: Fonts_,
    cb: js.Function2[/* error */ js.Error | Null, /* fontOptions */ js.UndefOr[FontOptions], Unit]
  ): Unit = js.native
}
