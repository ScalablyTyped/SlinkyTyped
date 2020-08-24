package typingsSlinky.octokitCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnyFunction = js.Function1[/* args */ js.Any, js.Any]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type OctokitPlugin = js.Function2[
    /* octokit */ typingsSlinky.octokitCore.mod.Octokit, 
    /* options */ typingsSlinky.octokitCore.typesMod.OctokitOptions, 
    org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Unit
  ]
  type RequestParameters = typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
  type ReturnTypeOf[T /* <: typingsSlinky.octokitCore.typesMod.AnyFunction | js.Array[typingsSlinky.octokitCore.typesMod.AnyFunction] */] = (typingsSlinky.octokitCore.typesMod.UnionToIntersection[
    typingsSlinky.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
    ]
  ]) | typingsSlinky.std.ReturnType[T]
  type UnionToIntersection[Union] = js.Any
}
