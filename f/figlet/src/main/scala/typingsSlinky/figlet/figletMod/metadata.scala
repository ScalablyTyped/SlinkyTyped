package typingsSlinky.figlet.figletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("figlet", "metadata")
@js.native
object metadata extends js.Object {
  def apply(
    font: Fonts,
    cb: js.Function3[
      /* error */ js.Error | Null, 
      /* fontOptions */ js.UndefOr[FontOptions], 
      /* headerComment */ js.UndefOr[String], 
      Unit
    ]
  ): Unit = js.native
}

