package typingsSlinky.coinbase.mod

import typingsSlinky.coinbase.AnonMinsize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currencies extends js.Object {
  var data: js.Array[AnonMinsize]
}

object Currencies {
  @scala.inline
  def apply(data: js.Array[AnonMinsize]): Currencies = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Currencies]
  }
}

