package typingsSlinky.n3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type PrefixedToIri = js.Function1[/* suffix */ java.lang.String, typingsSlinky.n3.mod.NamedNode[java.lang.String]]
  
  type Prefixes[I] = org.scalablytyped.runtime.StringDictionary[I]
  
  type QuadCallback[Q /* <: typingsSlinky.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.n3.mod.DefaultGraph
    - typingsSlinky.n3.mod.NamedNode[java.lang.String]
    - typingsSlinky.n3.mod.BlankNode
    - typingsSlinky.n3.mod.Variable
  */
  type QuadGraph = typingsSlinky.n3.mod._QuadGraph | typingsSlinky.n3.mod.NamedNode[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.n3.mod.NamedNode[java.lang.String]
    - typingsSlinky.n3.mod.Literal
    - typingsSlinky.n3.mod.BlankNode
    - typingsSlinky.n3.mod.Variable
  */
  type QuadObject = typingsSlinky.n3.mod._QuadObject | typingsSlinky.n3.mod.NamedNode[java.lang.String]
  
  type QuadPredicate[Q /* <: typingsSlinky.n3.mod.BaseQuad */] = js.Function1[/* result */ Q, scala.Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.n3.mod.NamedNode[java.lang.String]
    - typingsSlinky.n3.mod.BlankNode
    - typingsSlinky.n3.mod.Variable
  */
  type QuadSubject = typingsSlinky.n3.mod._QuadSubject | typingsSlinky.n3.mod.NamedNode[java.lang.String]
  
  type Quad_Predicate = typingsSlinky.n3.mod.NamedNode[java.lang.String] | typingsSlinky.n3.mod.Variable
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.n3.mod.NamedNode[java.lang.String]
    - typingsSlinky.n3.mod.BlankNode
    - typingsSlinky.n3.mod.Literal
    - typingsSlinky.n3.mod.Variable
    - typingsSlinky.n3.mod.DefaultGraph
  */
  type Term = typingsSlinky.n3.mod._Term | typingsSlinky.n3.mod.NamedNode[java.lang.String]
}
