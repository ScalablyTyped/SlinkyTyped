package typingsSlinky.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object n3Mod {
  import org.scalablytyped.runtime.StringDictionary

  type ErrorCallback = js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  type OTerm = typingsSlinky.rdfDashJs.rdfDashJsMod.Term | String | Null
  type ParseCallback[Q /* <: BaseQuad */] = js.Function3[
    /* error */ js.Error, 
    /* quad */ Q, 
    /* prefixes */ Prefixes[typingsSlinky.rdfDashJs.rdfDashJsMod.NamedNode], 
    Unit
  ]
  type PrefixedToIri = js.Function1[/* suffix */ String, NamedNode]
  type Prefixes[I] = StringDictionary[I]
  type QuadCallback[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Unit]
  type QuadPredicate[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Boolean]
}
