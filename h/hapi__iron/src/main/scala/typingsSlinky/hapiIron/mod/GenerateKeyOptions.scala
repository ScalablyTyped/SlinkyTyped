package typingsSlinky.hapiIron.mod

import typingsSlinky.hapiIron.hapiIronStrings.`aes-128-ctr`
import typingsSlinky.hapiIron.hapiIronStrings.`aes-256-cbc`
import typingsSlinky.hapiIron.hapiIronStrings.sha256
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@hapi/iron.@hapi/iron.SealOptionsSub, 'algorithm' | 'iterations' | 'minPasswordlength'> */
@js.native
trait GenerateKeyOptions extends js.Object {
  var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256 = js.native
  var iterations: Double = js.native
  var iv: js.UndefOr[Buffer] = js.native
  var minPasswordlength: Double = js.native
  var salt: js.UndefOr[String] = js.native
  var saltBits: js.UndefOr[Double] = js.native
}

object GenerateKeyOptions {
  @scala.inline
  def apply(algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256, iterations: Double, minPasswordlength: Double): GenerateKeyOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateKeyOptions]
  }
  @scala.inline
  implicit class GenerateKeyOptionsOps[Self <: GenerateKeyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: `aes-128-ctr` | `aes-256-cbc` | sha256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinPasswordlength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPasswordlength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIv(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iv")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: String): Self = {
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
    def withSaltBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaltBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltBits")(js.undefined)
        ret
    }
  }
  
}

