package typingsSlinky.humps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HumpsProcessor = js.Function3[
    /* key */ java.lang.String, 
    /* convert */ typingsSlinky.humps.mod.HumpsProcessorParameter, 
    /* options */ js.UndefOr[typingsSlinky.humps.mod.HumpsOptions], 
    java.lang.String
  ]
  type HumpsProcessorParameter = js.Function2[
    /* key */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.humps.mod.HumpsOptions], 
    java.lang.String
  ]
  type OptionOrProcessor = typingsSlinky.humps.mod.HumpsOptions | typingsSlinky.humps.mod.HumpsProcessor
}
