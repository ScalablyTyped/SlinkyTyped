package typingsSlinky.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rendererMod {
  type RenderRule = js.Function5[
    /* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    /* idx */ scala.Double, 
    /* options */ typingsSlinky.markdownIt.libMod.Options, 
    /* env */ js.Any, 
    /* self */ typingsSlinky.markdownIt.rendererMod.Renderer, 
    java.lang.String
  ]
}
