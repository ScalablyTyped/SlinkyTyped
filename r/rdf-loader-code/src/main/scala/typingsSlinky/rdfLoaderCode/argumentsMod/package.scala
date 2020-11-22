package typingsSlinky.rdfLoaderCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object argumentsMod {
  
  type Arguments = js.Array[js.Any | (typingsSlinky.std.Record[java.lang.String, js.Any])]
  
  type ArgumentsLoader = (typingsSlinky.rdfLoadersRegistry.mod.Loader[
    typingsSlinky.rdfLoaderCode.argumentsMod.Arguments, 
    typingsSlinky.rdfLoaderCode.argumentsMod.Options
  ]) with typingsSlinky.rdfLoaderCode.anon.Register
}
