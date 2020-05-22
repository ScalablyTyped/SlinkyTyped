package typingsSlinky.postcss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.postcss.mod.Plugin_[js.Any]
    - typingsSlinky.postcss.mod.Transformer
    - typingsSlinky.postcss.anon.Postcss
    - typingsSlinky.postcss.mod.Processor
  */
  type AcceptedPlugin = typingsSlinky.postcss.mod._AcceptedPlugin | typingsSlinky.postcss.mod.Plugin_[js.Any]
  type Builder = js.Function3[
    /* part */ java.lang.String, 
    /* node */ js.UndefOr[typingsSlinky.postcss.mod.Node], 
    /* type */ js.UndefOr[
      typingsSlinky.postcss.postcssStrings.start | typingsSlinky.postcss.postcssStrings.end
    ], 
    scala.Unit
  ]
  type JsonComment = typingsSlinky.postcss.mod.JsonNode
  type JsonRoot = typingsSlinky.postcss.mod.JsonContainer
  type Parser = js.Function2[
    /* css */ typingsSlinky.postcss.mod.ParserInput, 
    /* opts */ js.UndefOr[typingsSlinky.postcss.anon.PickProcessOptionsmapfrom], 
    typingsSlinky.postcss.mod.Root_
  ]
  type ParserInput = java.lang.String | typingsSlinky.postcss.anon.ToString
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], typingsSlinky.postcss.mod.Transformer]
  type RootNewProps = typingsSlinky.postcss.mod.ContainerNewProps
  type Stringifier = js.Function2[
    /* node */ typingsSlinky.postcss.mod.Node, 
    /* builder */ typingsSlinky.postcss.mod.Builder, 
    scala.Unit
  ]
  type TransformCallback = js.Function2[
    /* root */ typingsSlinky.postcss.mod.Root_, 
    /* result */ typingsSlinky.postcss.mod.Result, 
    js.Promise[js.Any] | js.Any
  ]
}
