package typingsSlinky.nodeJose.mod.JWS

import typingsSlinky.node.Buffer
import typingsSlinky.nodeJose.mod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseResult extends js.Object {
  /**
    * the combined 'protected' and 'unprotected' header members
    */
  var header: js.Object = js.native
  /**
    * The key used to verify the signature
    */
  var key: Key = js.native
  /**
    * the signed content
    */
  var payload: Buffer = js.native
  var `protected`: js.Array[String] = js.native
}

object BaseResult {
  @scala.inline
  def apply(header: js.Object, key: Key, payload: Buffer, `protected`: js.Array[String]): BaseResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResult]
  }
  @scala.inline
  implicit class BaseResultOps[Self <: BaseResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

