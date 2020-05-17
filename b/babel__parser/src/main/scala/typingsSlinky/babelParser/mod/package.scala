package typingsSlinky.babelParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ParserPluginWithOptions = js.Tuple2[
    typingsSlinky.babelParser.babelParserStrings.decorators | typingsSlinky.babelParser.babelParserStrings.pipelineOperator | typingsSlinky.babelParser.babelParserStrings.flow, 
    typingsSlinky.babelParser.mod.DecoratorsPluginOptions | typingsSlinky.babelParser.mod.FlowPluginOptions | typingsSlinky.babelParser.mod.PipelineOperatorPluginOptions
  ]
}
