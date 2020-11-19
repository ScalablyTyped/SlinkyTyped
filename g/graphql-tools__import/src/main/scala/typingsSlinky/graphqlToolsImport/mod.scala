package typingsSlinky.graphqlToolsImport

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphqlToolsImport.anon.From
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@graphql-tools/import", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parseImportLine(importLine: String): From = js.native
  
  def processImport(filePath: String): DocumentNode = js.native
  def processImport(filePath: String, cwd: js.UndefOr[scala.Nothing], predefinedImports: Record[String, String]): DocumentNode = js.native
  def processImport(filePath: String, cwd: String): DocumentNode = js.native
  def processImport(filePath: String, cwd: String, predefinedImports: Record[String, String]): DocumentNode = js.native
}
