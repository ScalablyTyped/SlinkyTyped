package typingsSlinky.jose.mod

import typingsSlinky.jose.joseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JWKOctKey
  extends _ProduceKeyInput
     with BasicParameters
     with JSONWebKey {
  var k: js.UndefOr[String] = js.native
  // no x5c
  var kty: oct = js.native
}

object JWKOctKey {
  @scala.inline
  def apply(kty: oct): JWKOctKey = {
    val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOctKey]
  }
  @scala.inline
  implicit class JWKOctKeyOps[Self <: JWKOctKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKty(value: oct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withK(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(js.undefined)
        ret
    }
  }
  
}

