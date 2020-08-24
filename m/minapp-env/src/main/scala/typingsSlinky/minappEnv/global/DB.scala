package typingsSlinky.minappEnv.global

import typingsSlinky.minappEnv.DB.IServerDateOptions
import typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL
import typingsSlinky.minappEnv.IAPIParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// === Database ===
@JSGlobal("DB")
@js.native
object DB extends js.Object {
  @js.native
  class APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] ()
    extends typingsSlinky.minappEnv.DB.APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]
  
  @js.native
  class Batch ()
    extends typingsSlinky.minappEnv.DB.Batch
  
  @js.native
  class CollectionReference protected ()
    extends typingsSlinky.minappEnv.DB.CollectionReference {
    protected def this(name: java.lang.String, database: typingsSlinky.minappEnv.DB.Database) = this()
  }
  
  @js.native
  class Database protected ()
    extends typingsSlinky.minappEnv.DB.Database
  
  @js.native
  class DatabaseLogicCommand ()
    extends typingsSlinky.minappEnv.DB.DatabaseLogicCommand
  
  @js.native
  class DatabaseQueryCommand ()
    extends typingsSlinky.minappEnv.DB.DatabaseQueryCommand
  
  @js.native
  class DatabaseUpdateCommand protected ()
    extends typingsSlinky.minappEnv.DB.DatabaseUpdateCommand {
    def this(operator: UPDATE_COMMANDS_LITERAL, operands: typingsSlinky.minappEnv.Array[_]) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typingsSlinky.minappEnv.Array[_],
      fieldName: java.lang.String
    ) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typingsSlinky.minappEnv.Array[_],
      fieldName: typingsSlinky.minappEnv.InternalSymbol
    ) = this()
  }
  
  @js.native
  class DocumentReference protected ()
    extends typingsSlinky.minappEnv.DB.DocumentReference {
    protected def this(docId: java.lang.String, database: typingsSlinky.minappEnv.DB.Database) = this()
    protected def this(docId: Double, database: typingsSlinky.minappEnv.DB.Database) = this()
  }
  
  @js.native
  abstract class GeoPoint protected ()
    extends typingsSlinky.minappEnv.DB.GeoPoint {
    def this(longitude: Double, latitude: Double) = this()
  }
  
  @js.native
  class Query ()
    extends typingsSlinky.minappEnv.DB.Query
  
  @js.native
  abstract class ServerDate ()
    extends typingsSlinky.minappEnv.DB.ServerDate {
    def this(options: IServerDateOptions) = this()
  }
  
  @js.native
  object LOGIC_COMMANDS_LITERAL extends js.Object {
    /* "and" */ val AND: typingsSlinky.minappEnv.DB.LOGIC_COMMANDS_LITERAL.AND with java.lang.String = js.native
    /* "nor" */ val NOR: typingsSlinky.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOR with java.lang.String = js.native
    /* "not" */ val NOT: typingsSlinky.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOT with java.lang.String = js.native
    /* "or" */ val OR: typingsSlinky.minappEnv.DB.LOGIC_COMMANDS_LITERAL.OR with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typingsSlinky.minappEnv.DB.LOGIC_COMMANDS_LITERAL with java.lang.String] = js.native
  }
  
  @js.native
  object QUERY_COMMANDS_LITERAL extends js.Object {
    /* "eq" */ val EQ: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.EQ with java.lang.String = js.native
    /* "gt" */ val GT: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.GT with java.lang.String = js.native
    /* "gte" */ val GTE: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.GTE with java.lang.String = js.native
    /* "in" */ val IN: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.IN with java.lang.String = js.native
    /* "lt" */ val LT: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.LT with java.lang.String = js.native
    /* "lte" */ val LTE: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.LTE with java.lang.String = js.native
    /* "neq" */ val NEQ: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.NEQ with java.lang.String = js.native
    /* "nin" */ val NIN: typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL.NIN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typingsSlinky.minappEnv.DB.QUERY_COMMANDS_LITERAL with java.lang.String] = js.native
  }
  
  @js.native
  object UPDATE_COMMANDS_LITERAL extends js.Object {
    /* "inc" */ val INC: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.INC with java.lang.String = js.native
    /* "mul" */ val MUL: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.MUL with java.lang.String = js.native
    /* "pop" */ val POP: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.POP with java.lang.String = js.native
    /* "push" */ val PUSH: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.PUSH with java.lang.String = js.native
    /* "remove" */ val REMOVE: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.REMOVE with java.lang.String = js.native
    /* "set" */ val SET: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SET with java.lang.String = js.native
    /* "shift" */ val SHIFT: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SHIFT with java.lang.String = js.native
    /* "unshift" */ val UNSHIFT: typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typingsSlinky.minappEnv.DB.UPDATE_COMMANDS_LITERAL with java.lang.String] = js.native
  }
  
}

