package typingsSlinky.apolloServer.exportsMod

import typingsSlinky.graphqlToolsLoadFiles.mod.LoadFilesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server/dist/exports", "loadFilesSync")
@js.native
object loadFilesSync extends js.Object {
  
  def apply[T](pattern: String): js.Array[T] = js.native
  def apply[T](pattern: String, options: LoadFilesOptions): js.Array[T] = js.native
  def apply[T](pattern: js.Array[String]): js.Array[T] = js.native
  def apply[T](pattern: js.Array[String], options: LoadFilesOptions): js.Array[T] = js.native
}
