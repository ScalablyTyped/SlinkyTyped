package typingsSlinky.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/boom", "boomify")
@js.native
object boomify extends js.Object {
  
  def apply[Data, Decoration](err: js.Error): Boom[Data] with Decoration = js.native
  def apply[Data, Decoration](err: js.Error, options: Options[Data] with Decorate[Decoration]): Boom[Data] with Decoration = js.native
}
