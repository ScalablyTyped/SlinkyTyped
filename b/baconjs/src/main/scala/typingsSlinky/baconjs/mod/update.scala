package typingsSlinky.baconjs.mod

import typingsSlinky.baconjs.updateMod.UpdatePattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "update")
@js.native
object update extends js.Object {
  def apply[Out](initial: Out, patterns: UpdatePattern[Out]*): typingsSlinky.baconjs.observableMod.Property[Out] = js.native
}

