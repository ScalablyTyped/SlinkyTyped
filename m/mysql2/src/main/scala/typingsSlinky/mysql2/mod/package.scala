package typingsSlinky.mysql2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type authPlugins = js.Function1[
    /* pluginMetadata */ typingsSlinky.mysql2.anon.Command, 
    js.Function1[/* pluginData */ typingsSlinky.node.Buffer, js.Promise[java.lang.String]]
  ]
}
