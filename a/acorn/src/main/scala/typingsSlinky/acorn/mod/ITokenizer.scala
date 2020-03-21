package typingsSlinky.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenizer extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[js.Iterator[Token]] = js.native
  def getToken(): Token = js.native
}

