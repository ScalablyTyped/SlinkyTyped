package typingsSlinky.getenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getenvMod {
  type ParseWithEachType = ParseWithType[
    typingsSlinky.getenv.getenvStrings.string | typingsSlinky.getenv.getenvStrings.int | typingsSlinky.getenv.getenvStrings.float | typingsSlinky.getenv.getenvStrings.bool | typingsSlinky.getenv.getenvStrings.boolish | typingsSlinky.getenv.getenvStrings.url
  ]
  type ParseWithFallback = js.Tuple2[String, String]
  type ParseWithType[T /* <: ParseTypes */] = js.Tuple3[
    String, 
    /* import warning: importer.ImportType#apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
