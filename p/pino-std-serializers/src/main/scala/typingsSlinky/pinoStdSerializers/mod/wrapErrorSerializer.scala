package typingsSlinky.pinoStdSerializers.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pino-std-serializers", "wrapErrorSerializer")
@js.native
object wrapErrorSerializer extends js.Object {
  
  def apply(customSerializer: CustomErrorSerializer): js.Function1[/* err */ js.Error, Record[String, _]] = js.native
}
