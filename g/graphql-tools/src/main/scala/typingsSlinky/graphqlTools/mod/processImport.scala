package typingsSlinky.graphqlTools.mod

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-tools", "processImport")
@js.native
object processImport extends js.Object {
  
  def apply(filePath: String): DocumentNode = js.native
  def apply(filePath: String, cwd: js.UndefOr[scala.Nothing], predefinedImports: Record[String, String]): DocumentNode = js.native
  def apply(filePath: String, cwd: String): DocumentNode = js.native
  def apply(filePath: String, cwd: String, predefinedImports: Record[String, String]): DocumentNode = js.native
}
