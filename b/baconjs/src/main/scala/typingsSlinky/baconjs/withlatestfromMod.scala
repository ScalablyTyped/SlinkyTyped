package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withlatestfromMod {
  
  @JSImport("baconjs/types/withlatestfrom", JSImport.Default)
  @js.native
  def default[V, V2, R](
    sampler: typingsSlinky.baconjs.observableMod.default[V],
    samplee: typingsSlinky.baconjs.observableMod.default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): typingsSlinky.baconjs.observableMod.default[R] = js.native
  
  @JSImport("baconjs/types/withlatestfrom", "withLatestFrom")
  @js.native
  def withLatestFrom[V, V2, R](sampler: default[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): default[R] = js.native
  
  @JSImport("baconjs/types/withlatestfrom", "withLatestFromE")
  @js.native
  def withLatestFromE[V, V2, R](
    sampler: EventStream[V],
    samplee: default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): EventStream[R] = js.native
  
  @JSImport("baconjs/types/withlatestfrom", "withLatestFromP")
  @js.native
  def withLatestFromP[V, V2, R](sampler: Property[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): Property[R] = js.native
}
