package typingsSlinky.argon2.anon

import typingsSlinky.argon2.argon2Booleans.`false`
import typingsSlinky.argon2.argon2Numbers.`0`
import typingsSlinky.argon2.argon2Numbers.`1`
import typingsSlinky.argon2.argon2Numbers.`2`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined argon2.argon2.Options & {  raw ? :false} */
@js.native
trait Optionsrawfalse extends js.Object {
  var hashLength: js.UndefOr[Double] = js.native
  var memoryCost: js.UndefOr[Double] = js.native
  var parallelism: js.UndefOr[Double] = js.native
  var raw: js.UndefOr[Boolean with `false`] = js.native
  var salt: js.UndefOr[Buffer] = js.native
  var saltLength: js.UndefOr[Double] = js.native
  var timeCost: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.native
  var version: js.UndefOr[Double] = js.native
}

object Optionsrawfalse {
  @scala.inline
  def apply(): Optionsrawfalse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Optionsrawfalse]
  }
  @scala.inline
  implicit class OptionsrawfalseOps[Self <: Optionsrawfalse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryCost")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelism(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallelism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelism")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Boolean with `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
    @scala.inline
    def withSaltLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaltLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCost(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCost")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `0` | `1` | `2`): Self = {
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
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

