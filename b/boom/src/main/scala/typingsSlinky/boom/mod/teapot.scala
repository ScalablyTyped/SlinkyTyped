package typingsSlinky.boom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("boom", "teapot")
@js.native
object teapot extends js.Object {
  
  /**
    * Returns a 418 I'm a Teapot error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomteapotmessage-data}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}
