package typingsSlinky.rdfLoadersRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoadOptions[T /* <: typingsSlinky.std.Record[java.lang.String, _] */] = T with typingsSlinky.rdfLoadersRegistry.anon.LoaderRegistry
  
  type Loader[T, TOptions] = js.Function2[
    /* node */ typingsSlinky.clownface.mod.GraphPointer[
      typingsSlinky.rdfJs.mod.Term, 
      typingsSlinky.rdfJs.mod.DatasetCore[typingsSlinky.rdfJs.mod.Quad, typingsSlinky.rdfJs.mod.Quad]
    ], 
    /* options */ typingsSlinky.rdfLoadersRegistry.mod.LoadOptions[TOptions], 
    T | js.Promise[T]
  ]
}
