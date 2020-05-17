package typingsSlinky.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigFunction = js.Function1[
    /* api */ typingsSlinky.babelCore.mod.ConfigAPI, 
    typingsSlinky.babelCore.mod.TransformOptions
  ]
  type FileParseCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsSlinky.babelCore.mod.ParseResult | scala.Null, 
    js.Any
  ]
  type FileResultCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* result */ typingsSlinky.babelCore.mod.BabelFileResult | scala.Null, 
    js.Any
  ]
  type Node = typingsSlinky.babelTypes.mod.Node
  type SimpleCacheCallback[T /* <: typingsSlinky.babelCore.mod.SimpleCacheKey */] = js.Function0[T]
}
