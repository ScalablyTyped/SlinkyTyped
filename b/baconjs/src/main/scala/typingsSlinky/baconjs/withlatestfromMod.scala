package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/withlatestfrom", JSImport.Namespace)
@js.native
object withlatestfromMod extends js.Object {
  
  def default[V, V2, R](
    sampler: typingsSlinky.baconjs.observableMod.default[V],
    samplee: typingsSlinky.baconjs.observableMod.default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): typingsSlinky.baconjs.observableMod.default[R] = js.native
  
  def withLatestFrom[V, V2, R](sampler: default[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): default[R] = js.native
  
  def withLatestFromE[V, V2, R](
    sampler: EventStream[V],
    samplee: default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): EventStream[R] = js.native
  
  def withLatestFromP[V, V2, R](sampler: Property[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): Property[R] = js.native
}
