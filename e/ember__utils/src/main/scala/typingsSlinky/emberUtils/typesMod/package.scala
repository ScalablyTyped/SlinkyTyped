package typingsSlinky.emberUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type KeysOfType[Base, Condition] = /* keyof std.Pick<Base, {[ Key in keyof Base ]: Base[Key] extends Condition? Key : never}[keyof Base]> */ java.lang.String
}
