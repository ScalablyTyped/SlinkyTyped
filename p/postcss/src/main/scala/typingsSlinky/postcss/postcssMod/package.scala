package typingsSlinky.postcss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postcssMod {
  import typingsSlinky.postcss.Anon_ToString
  import typingsSlinky.postcss.postcssStrings.end
  import typingsSlinky.postcss.postcssStrings.from
  import typingsSlinky.postcss.postcssStrings.map
  import typingsSlinky.postcss.postcssStrings.start
  import typingsSlinky.std.Pick

  /* Rewritten from type alias, can be one of: 
    - typings.postcss.postcssMod.Plugin[js.Any]
    - typings.postcss.postcssMod.Transformer
    - typings.postcss.Anon_Postcss
    - typings.postcss.postcssMod.Processor
  */
  type AcceptedPlugin = _AcceptedPlugin | Plugin[js.Any]
  type Builder = js.Function3[
    /* part */ String, 
    /* node */ js.UndefOr[Node], 
    /* type */ js.UndefOr[start | end], 
    Unit
  ]
  type JsonComment = JsonNode
  type JsonRoot = JsonContainer
  type Parser = js.Function2[/* css */ ParserInput, /* opts */ js.UndefOr[Pick[ProcessOptions, map | from]], Root]
  type ParserInput = String | Anon_ToString
  type PluginInitializer[T] = js.Function1[/* pluginOptions */ js.UndefOr[T], Transformer]
  type RootNewProps = ContainerNewProps
  type Stringifier = js.Function2[/* node */ Node, /* builder */ Builder, Unit]
  type TransformCallback = js.Function2[/* root */ Root, /* result */ Result, js.Promise[js.Any] | js.Any]
}
