package typingsSlinky.babelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type MatchPattern = java.lang.String | js.RegExp | (js.Function2[
    /* filename */ js.UndefOr[java.lang.String], 
    /* context */ typingsSlinky.babelCore.mod.MatchPatternContext, 
    scala.Boolean
  ])
  
  type Node = typingsSlinky.babelTypes.mod.Node
  
  type ParseResult = typingsSlinky.babelTypes.mod.File_ | typingsSlinky.babelTypes.mod.Program_
  
  type PluginItem = typingsSlinky.babelCore.mod.ConfigItem | typingsSlinky.babelCore.mod.PluginObj[js.Any] | typingsSlinky.babelCore.mod.PluginTarget | (js.Tuple2[
    typingsSlinky.babelCore.mod.PluginTarget, 
    typingsSlinky.babelCore.mod.PluginOptions
  ]) | (js.Tuple3[
    typingsSlinky.babelCore.mod.PluginTarget, 
    typingsSlinky.babelCore.mod.PluginOptions, 
    js.UndefOr[java.lang.String]
  ])
  
  type PluginOptions = js.UndefOr[js.Object | typingsSlinky.babelCore.babelCoreBooleans.`false`]
  
  type PluginTarget = java.lang.String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
  
  type SimpleCacheCallback[T /* <: typingsSlinky.babelCore.mod.SimpleCacheKey */] = js.Function0[T]
  
  type SimpleCacheKey = js.UndefOr[java.lang.String | scala.Boolean | scala.Double | scala.Null]
}
