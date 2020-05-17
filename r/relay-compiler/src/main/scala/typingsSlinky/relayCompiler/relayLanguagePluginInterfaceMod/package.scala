package typingsSlinky.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayLanguagePluginInterfaceMod {
  type FormatModule = js.Function1[/* options */ typingsSlinky.relayCompiler.anon.ConcreteText, java.lang.String]
  type GraphQLTagFinder = js.Function2[
    /* text */ java.lang.String, 
    /* filePath */ java.lang.String, 
    js.Array[typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod.GraphQLTag]
  ]
  type PluginInitializer = js.Function0[typingsSlinky.relayCompiler.relayLanguagePluginInterfaceMod.PluginInterface]
}
