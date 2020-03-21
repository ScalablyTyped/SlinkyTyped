package typingsSlinky.postcssUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomFilterFunction = js.Function1[/* file */ java.lang.String, scala.Boolean]
  type CustomHashFunction = js.Function1[/* file */ typingsSlinky.node.Buffer, java.lang.String]
  type CustomTransformFunction = js.Function2[
    /* asset */ typingsSlinky.postcssUrl.AnonAbsolutePath, 
    /* dir */ typingsSlinky.postcssUrl.AnonFile, 
    java.lang.String
  ]
  type Url = typingsSlinky.postcss.mod.Plugin_[
    typingsSlinky.postcssUrl.mod.Options | js.Array[typingsSlinky.postcssUrl.mod.Options]
  ]
}
