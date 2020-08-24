package typingsSlinky.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function2[/* err */ js.Error, /* result */ js.Any, scala.Unit]
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  type OTerm = typingsSlinky.rdfJs.mod.Term | java.lang.String | scala.Null
  type ParseCallback[Q /* <: typingsSlinky.n3.mod.BaseQuad */] = js.Function3[
    /* error */ js.Error, 
    /* quad */ Q, 
    /* prefixes */ typingsSlinky.n3.mod.Prefixes[typingsSlinky.rdfJs.mod.NamedNode[java.lang.String]], 
    scala.Unit
  ]
  type PrefixedToIri = js.Function1[/* suffix */ java.lang.String, typingsSlinky.n3.mod.NamedNode]
  type Prefixes[I] = org.scalablytyped.runtime.StringDictionary[I]
  type QuadCallback[Q /* <: typingsSlinky.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Unit]
  type QuadPredicate[Q /* <: typingsSlinky.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Boolean]
}
