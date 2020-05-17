package typingsSlinky.falcorJsonGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * JavaScript Object Notation Graph (JSONGraph) is a notation for expressing graphs in JSON. For more information, see the [JSONGraph Guide]{@link http://netflix.github.io/falcor/documentation/jsongraph.html}.
    **/
  type JSONGraph = js.Any
  /**
    * An ordered list of {@link Key}s that point to a value in a {@link JSONGraph}.
    **/
  type Path = js.Array[typingsSlinky.falcorJsonGraph.mod.Key]
  /**
    * An ordered list of {@link KeySet}s that point to location(s) in the {@link JSONGraph}. It enables pointing to multiple locations in a more terse format than a set of {@link Path}s and is generally more efficient to evaluate.
    **/
  type PathSet = js.Array[typingsSlinky.falcorJsonGraph.mod.KeySet]
}
