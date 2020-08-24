package typingsSlinky.postcssValueParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomStringifierCallback = js.Function1[
    /* nodes */ typingsSlinky.postcssValueParser.mod.Node, 
    js.UndefOr[java.lang.String]
  ]
  type WalkCallback = js.Function3[
    /* node */ typingsSlinky.postcssValueParser.mod.Node, 
    /* index */ scala.Double, 
    /* nodes */ js.Array[typingsSlinky.postcssValueParser.mod.Node], 
    scala.Unit | scala.Boolean
  ]
}
