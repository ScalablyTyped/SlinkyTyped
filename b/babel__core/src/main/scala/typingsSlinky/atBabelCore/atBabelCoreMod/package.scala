package typingsSlinky.atBabelCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atBabelCoreMod {
  import typingsSlinky.atBabelCore.atBabelCoreNumbers.`false`
  import typingsSlinky.atBabelTypes.atBabelTypesMod.File
  import typingsSlinky.atBabelTypes.atBabelTypesMod.Program

  type ConfigFunction = js.Function1[/* api */ ConfigAPI, TransformOptions]
  type FileParseCallback = js.Function2[/* err */ js.Error | Null, /* result */ ParseResult | Null, js.Any]
  type FileResultCallback = js.Function2[/* err */ js.Error | Null, /* result */ BabelFileResult | Null, js.Any]
  type Node = typingsSlinky.atBabelTypes.atBabelTypesMod.Node
  type ParseResult = File | Program
  type PluginItem = ConfigItem | PluginObj[js.Any] | PluginTarget | (js.Tuple2[PluginTarget, PluginOptions]) | (js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]])
  type PluginOptions = js.UndefOr[js.Object | `false`]
  type PluginTarget = String | js.Object | (js.Function1[/* repeated */ js.Any, js.Any])
  type SimpleCacheCallback[T /* <: SimpleCacheKey */] = js.Function0[T]
  type SimpleCacheKey = js.UndefOr[String | Boolean | Double | Null]
}
