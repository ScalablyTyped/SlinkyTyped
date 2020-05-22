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
trait Optionsrawfalse extends js.Object {
  var hashLength: js.UndefOr[Double] = js.undefined
  var memoryCost: js.UndefOr[Double] = js.undefined
  var parallelism: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean with `false`] = js.undefined
  var salt: js.UndefOr[Buffer] = js.undefined
  var saltLength: js.UndefOr[Double] = js.undefined
  var timeCost: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Optionsrawfalse {
  @scala.inline
  def apply(
    hashLength: js.UndefOr[Double] = js.undefined,
    memoryCost: js.UndefOr[Double] = js.undefined,
    parallelism: js.UndefOr[Double] = js.undefined,
    raw: js.UndefOr[Boolean with `false`] = js.undefined,
    salt: Buffer = null,
    saltLength: js.UndefOr[Double] = js.undefined,
    timeCost: js.UndefOr[Double] = js.undefined,
    `type`: `0` | `1` | `2` = null,
    version: js.UndefOr[Double] = js.undefined
  ): Optionsrawfalse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hashLength)) __obj.updateDynamic("hashLength")(hashLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryCost)) __obj.updateDynamic("memoryCost")(memoryCost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelism)) __obj.updateDynamic("parallelism")(parallelism.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (!js.isUndefined(saltLength)) __obj.updateDynamic("saltLength")(saltLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeCost)) __obj.updateDynamic("timeCost")(timeCost.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsrawfalse]
  }
}

