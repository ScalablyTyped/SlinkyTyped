package typingsSlinky.arangodb.anon

import typingsSlinky.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Increment extends js.Object {
  var allowUserKeys: Boolean = js.native
  var increment: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var `type`: KeyGeneratorType = js.native
}

object Increment {
  @scala.inline
  def apply(allowUserKeys: Boolean, `type`: KeyGeneratorType): Increment = {
    val __obj = js.Dynamic.literal(allowUserKeys = allowUserKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
  @scala.inline
  implicit class IncrementOps[Self <: Increment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUserKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: KeyGeneratorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncrement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increment")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

