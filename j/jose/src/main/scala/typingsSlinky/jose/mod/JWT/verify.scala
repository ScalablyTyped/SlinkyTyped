package typingsSlinky.jose.mod.JWT

import typingsSlinky.jose.mod.ConsumeKeyInputWithNone
import typingsSlinky.jose.mod.NoneKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.verify")
@js.native
object verify extends js.Object {
  def apply(jwt: String, key: ConsumeKeyInputWithNone): js.Object = js.native
  def apply(jwt: String, key: NoneKey): completeResult[NoneKey] = js.native
}

