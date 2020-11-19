package typingsSlinky.getenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ParseWithEachType = typingsSlinky.getenv.mod.ParseWithType[
    typingsSlinky.getenv.getenvStrings.string | typingsSlinky.getenv.getenvStrings.int | typingsSlinky.getenv.getenvStrings.float | typingsSlinky.getenv.getenvStrings.bool | typingsSlinky.getenv.getenvStrings.boolish | typingsSlinky.getenv.getenvStrings.url
  ]
  
  type ParseWithFallback = js.Tuple2[java.lang.String, java.lang.String]
  
  type ParseWithType[T /* <: typingsSlinky.getenv.mod.ParseTypes */] = js.Tuple3[
    java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
