package typingsSlinky.nodeSqlParser.typesMod

import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.alter
import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.delete
import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.insert
import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.replace
import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.select
import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.update
import typingsSlinky.nodeSqlParser.nodeSqlParserStrings.use
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSqlParser.typesMod.Use
  - typingsSlinky.nodeSqlParser.typesMod.Select
  - typingsSlinky.nodeSqlParser.typesMod.InsertReplace
  - typingsSlinky.nodeSqlParser.typesMod.Update
  - typingsSlinky.nodeSqlParser.typesMod.Delete
  - typingsSlinky.nodeSqlParser.typesMod.Alter
*/
trait AST extends StObject
object AST {
  
  @scala.inline
  def Alter(expr: js.Any, table: From, `type`: alter): typingsSlinky.nodeSqlParser.typesMod.Alter = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeSqlParser.typesMod.Alter]
  }
  
  @scala.inline
  def Delete(from: js.Array[From | Dual], table: js.Any, `type`: delete, where: js.Any): typingsSlinky.nodeSqlParser.typesMod.Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeSqlParser.typesMod.Delete]
  }
  
  @scala.inline
  def InsertReplace(table: js.Any, `type`: replace | insert, values: js.Array[InsertReplaceValue]): typingsSlinky.nodeSqlParser.typesMod.InsertReplace = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeSqlParser.typesMod.InsertReplace]
  }
  
  @scala.inline
  def Select(columns: (js.Array[_ | Column]) | Asterisk, `type`: select, where: js.Any): typingsSlinky.nodeSqlParser.typesMod.Select = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeSqlParser.typesMod.Select]
  }
  
  @scala.inline
  def Update(set: js.Array[SetList], `type`: update, where: js.Any): typingsSlinky.nodeSqlParser.typesMod.Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeSqlParser.typesMod.Update]
  }
  
  @scala.inline
  def Use(db: String, `type`: use): typingsSlinky.nodeSqlParser.typesMod.Use = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.nodeSqlParser.typesMod.Use]
  }
}
