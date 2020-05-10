package typingsSlinky.gun

import typingsSlinky.gun.gunNumbers.`2`
import typingsSlinky.gun.mod.Gun.CryptoKeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAck extends js.Object {
  var ack: `2` = js.native
  var get: String = js.native
  var put: AnonAlias = js.native
  var sea: CryptoKeyPair = js.native
  var soul: String = js.native
  def on(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [unknown, unknown, unknown] is not an array type */ args: js.Tuple3[_, _, _]
  ): js.Any = js.native
}

object AnonAck {
  @scala.inline
  def apply(
    ack: `2`,
    get: String,
    on: js.Tuple3[_, _, _] => js.Any,
    put: AnonAlias,
    sea: CryptoKeyPair,
    soul: String
  ): AnonAck = {
    val __obj = js.Dynamic.literal(ack = ack.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], on = js.Any.fromFunction1(on), put = put.asInstanceOf[js.Any], sea = sea.asInstanceOf[js.Any], soul = soul.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAck]
  }
  @scala.inline
  implicit class AnonAckOps[Self <: AnonAck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAck(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: js.Tuple3[_, _, _] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPut(value: AnonAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSea(value: CryptoKeyPair): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoul(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soul")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

