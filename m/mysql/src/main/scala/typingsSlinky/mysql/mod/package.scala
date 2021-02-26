package typingsSlinky.mysql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TypeCast = scala.Boolean | (js.Function2[
    /* field */ typingsSlinky.mysql.anon.UntypedFieldInfotypestrin, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ])
  
  @scala.inline
  def createConnection(connectionUri: java.lang.String): typingsSlinky.mysql.mod.Connection = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mysql.mod.Connection]
  @scala.inline
  def createConnection(connectionUri: typingsSlinky.mysql.mod.ConnectionConfig): typingsSlinky.mysql.mod.Connection = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(connectionUri.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mysql.mod.Connection]
  
  @scala.inline
  def createPool(config: java.lang.String): typingsSlinky.mysql.mod.Pool = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mysql.mod.Pool]
  @scala.inline
  def createPool(config: typingsSlinky.mysql.mod.PoolConfig): typingsSlinky.mysql.mod.Pool = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mysql.mod.Pool]
  
  @scala.inline
  def createPoolCluster(): typingsSlinky.mysql.mod.PoolCluster = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")().asInstanceOf[typingsSlinky.mysql.mod.PoolCluster]
  @scala.inline
  def createPoolCluster(config: typingsSlinky.mysql.mod.PoolClusterConfig): typingsSlinky.mysql.mod.PoolCluster = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPoolCluster")(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mysql.mod.PoolCluster]
  
  @scala.inline
  def escape(value: js.Any): java.lang.String = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def escape(value: js.Any, stringifyObjects: js.UndefOr[scala.Nothing], timeZone: java.lang.String): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def escape(value: js.Any, stringifyObjects: scala.Boolean): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def escape(value: js.Any, stringifyObjects: scala.Boolean, timeZone: java.lang.String): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def escapeId(value: java.lang.String): java.lang.String = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def escapeId(value: java.lang.String, forbidQualified: scala.Boolean): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any], forbidQualified.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def format(sql: java.lang.String, values: js.Array[_]): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(
    sql: java.lang.String,
    values: js.Array[_],
    stringifyObjects: js.UndefOr[scala.Nothing],
    timeZone: java.lang.String
  ): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(sql: java.lang.String, values: js.Array[_], stringifyObjects: scala.Boolean): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def format(
    sql: java.lang.String,
    values: js.Array[_],
    stringifyObjects: scala.Boolean,
    timeZone: java.lang.String
  ): java.lang.String = (typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], values.asInstanceOf[js.Any], stringifyObjects.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  type packetCallback = js.Function1[/* packet */ js.Any, scala.Unit]
  
  type queryCallback = js.Function3[
    /* err */ typingsSlinky.mysql.mod.MysqlError | scala.Null, 
    /* results */ js.UndefOr[js.Any], 
    /* fields */ js.UndefOr[js.Array[typingsSlinky.mysql.mod.FieldInfo]], 
    scala.Unit
  ]
  
  @scala.inline
  def raw(sql: java.lang.String): typingsSlinky.mysql.anon.ToSqlString = typingsSlinky.mysql.mod.^.asInstanceOf[js.Dynamic].applyDynamic("raw")(sql.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.mysql.anon.ToSqlString]
}
