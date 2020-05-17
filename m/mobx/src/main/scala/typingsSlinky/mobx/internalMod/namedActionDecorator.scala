package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.anon.Configurable
import typingsSlinky.mobx.anon.Enumerable
import typingsSlinky.mobx.decoratorsMod.BabelDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "namedActionDecorator")
@js.native
object namedActionDecorator extends js.Object {
  def apply(name: String): js.Function3[
    /* target */ js.Any, 
    /* prop */ js.Any, 
    /* descriptor */ BabelDescriptor, 
    Unit | Configurable | Enumerable
  ] = js.native
}

