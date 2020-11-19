package typingsSlinky.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/boom", "internal")
@js.native
object internal extends js.Object {
  
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data, statusCode: Double): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], statusCode: Double): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
  def apply[Data](message: String, data: Data, statusCode: Double): Boom[Data] = js.native
  def apply[Data](message: String, data: js.UndefOr[scala.Nothing], statusCode: Double): Boom[Data] = js.native
}
