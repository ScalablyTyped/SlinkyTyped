package typingsSlinky.baconjs.updateMod

import typingsSlinky.baconjs.observableMod.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/update", "update")
@js.native
object update extends js.Object {
  def apply[Out](initial: Out, patterns: UpdatePattern[Out]*): Property[Out] = js.native
}

