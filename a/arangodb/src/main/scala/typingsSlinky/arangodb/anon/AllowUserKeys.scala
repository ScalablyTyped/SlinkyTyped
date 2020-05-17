package typingsSlinky.arangodb.anon

import typingsSlinky.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowUserKeys extends js.Object {
  var allowUserKeys: js.UndefOr[Boolean] = js.native
  var increment: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[KeyGeneratorType] = js.native
}

object AllowUserKeys {
  @scala.inline
  def apply(): AllowUserKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUserKeys]
  }
  @scala.inline
  implicit class AllowUserKeysOps[Self <: AllowUserKeys] (val x: Self) extends AnyVal {
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
    def withoutAllowUserKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUserKeys")(js.undefined)
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
    @scala.inline
    def withType(value: KeyGeneratorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

