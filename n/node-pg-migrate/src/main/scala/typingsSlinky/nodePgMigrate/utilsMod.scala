package typingsSlinky.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodePgMigrate.anon.PublicPartPgLiteral
import typingsSlinky.nodePgMigrate.distTypesMod.Literal
import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.distTypesMod.RunnerOption
import typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParam
import typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParamType
import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.generalTypesMod.Type
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import typingsSlinky.nodePgMigrate.mod.PgLiteral
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinition
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def applyType(`type`: Type): ColumnDefinition with FunctionParamType = js.native
  def applyType(`type`: Type, extendingTypeShorthands: ColumnDefinitions): ColumnDefinition with FunctionParamType = js.native
  
  def applyTypeAdapters(`type`: String): String = js.native
  
  def createSchemalize(shouldDecamelize: Boolean, shouldQuote: Boolean): js.Function1[/* v */ Name, String] = js.native
  
  def createTransformer(literal: Literal): js.Function2[
    /* s */ String, 
    /* d */ js.UndefOr[
      StringDictionary[
        String | Double | Boolean | PgLiteral | PublicPartPgLiteral | js.Array[Value] | typingsSlinky.nodePgMigrate.anon.Name | Null
      ]
    ], 
    String
  ] = js.native
  
  def escapeValue(`val`: Value): String | Double = js.native
  
  def formatLines(lines: js.Array[String]): String = js.native
  def formatLines(lines: js.Array[String], replace: js.UndefOr[scala.Nothing], separator: String): String = js.native
  def formatLines(lines: js.Array[String], replace: String): String = js.native
  def formatLines(lines: js.Array[String], replace: String, separator: String): String = js.native
  
  def formatParams(params: js.UndefOr[scala.Nothing], mOptions: MigrationOptions): String = js.native
  def formatParams(params: js.Array[FunctionParam], mOptions: MigrationOptions): String = js.native
  
  def getMigrationTableSchema(options: RunnerOption): String = js.native
  
  def getSchemas(): js.Array[String] = js.native
  def getSchemas(schema: String): js.Array[String] = js.native
  def getSchemas(schema: js.Array[String]): js.Array[String] = js.native
  
  def makeComment(`object`: String, name: String): String = js.native
  def makeComment(`object`: String, name: String, text: String): String = js.native
  
  @js.native
  class StringIdGenerator () extends js.Object {
    def this(chars: String) = this()
    
    val chars: js.Any = js.native
    
    var ids: js.Any = js.native
    
    var increment: js.Any = js.native
    
    def next(): String = js.native
  }
}
