package typingsSlinky.moonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentOptions[Props /* <: java.lang.String */, Data, Methods] = (typingsSlinky.moonjs.mod.ComponentOptionsProperties[Props, js.Function0[Data], Methods]) with (typingsSlinky.std.ThisType[
    typingsSlinky.moonjs.mod.Instance[Data with Methods with (typingsSlinky.std.Record[Props, _])]
  ])
  type ConstructorOptions[Props /* <: java.lang.String */, Data, Methods] = (typingsSlinky.moonjs.mod.ComponentOptionsProperties[Props, js.Function0[Data] | Data, Methods]) with (typingsSlinky.std.ThisType[
    typingsSlinky.moonjs.mod.Instance[Data with Methods with (typingsSlinky.std.Record[Props, _])]
  ])
}
