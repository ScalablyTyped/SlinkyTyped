package typingsSlinky.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "Observable")
@js.native
abstract class Observable[V] protected ()
  extends typingsSlinky.baconjs.observableMod.Observable[V] {
  def this(desc: typingsSlinky.baconjs.describeMod.Desc) = this()
}
