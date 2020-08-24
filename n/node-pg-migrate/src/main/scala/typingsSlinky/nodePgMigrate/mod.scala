package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.dbMod.DBConnection
import typingsSlinky.nodePgMigrate.distTypesMod.Logger
import typingsSlinky.nodePgMigrate.distTypesMod.MigrationBuilderActions
import typingsSlinky.nodePgMigrate.distTypesMod.RunnerOption
import typingsSlinky.nodePgMigrate.migrationMod.CreateOptions
import typingsSlinky.nodePgMigrate.migrationMod.FilenameFormat
import typingsSlinky.nodePgMigrate.migrationMod.RunMigration
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.js_
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.sql
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ts
import typingsSlinky.nodePgMigrate.pgLiteralMod.default
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Migration protected ()
    extends typingsSlinky.nodePgMigrate.migrationMod.Migration {
    def this(db: DBConnection, migrationPath: String, hasUpDown: MigrationBuilderActions, options: RunnerOption) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: ColumnDefinitions
    ) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: js.UndefOr[scala.Nothing],
      logger: Logger
    ) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: ColumnDefinitions,
      logger: Logger
    ) = this()
  }
  
  @js.native
  class PgLiteral protected () extends default {
    def this(str: String) = this()
  }
  
  def default(options: RunnerOption): js.Promise[js.Array[RunMigration]] = js.native
  /* static members */
  @js.native
  object Migration extends js.Object {
    def create(name: String, directory: String): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: js.UndefOr[scala.Nothing],
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    def create(name: String, directory: String, _language: js.UndefOr[scala.Nothing], _ignorePattern: String): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: js.UndefOr[scala.Nothing],
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    def create(name: String, directory: String, _language: CreateOptions): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    def create(name: String, directory: String, _language: CreateOptions, _ignorePattern: String): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_js(name: String, directory: String, _language: js_): js.Promise[String] = js.native
    @JSName("create")
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_js(name: String, directory: String, _language: js_, _ignorePattern: String): js.Promise[String] = js.native
    @JSName("create")
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(name: String, directory: String, _language: sql): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(name: String, directory: String, _language: sql, _ignorePattern: String): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(name: String, directory: String, _language: ts): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(name: String, directory: String, _language: ts, _ignorePattern: String): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
  }
  
  /* static members */
  @js.native
  object PgLiteral extends js.Object {
    def create(str: String): typingsSlinky.nodePgMigrate.pgLiteralMod.PgLiteral = js.native
  }
  
  @js.native
  object PgType extends js.Object {
    /* "bigint" */ val BIGINT: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BIGINT with String = js.native
    /* "bigserial" */ val BIGSERIAL: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BIGSERIAL with String = js.native
    /* "bit" */ val BIT_1: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BIT_1 with String = js.native
    /* "bit varying" */ val BIT_VARYING: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BIT_VARYING with String = js.native
    /* "bool" */ val BOOL: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BOOL with String = js.native
    /* "boolean" */ val BOOLEAN: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BOOLEAN with String = js.native
    /* "box" */ val BOX: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BOX with String = js.native
    /* "bytea" */ val BYTEA: typingsSlinky.nodePgMigrate.distTypesMod.PgType.BYTEA with String = js.native
    /* "char" */ val CHAR: typingsSlinky.nodePgMigrate.distTypesMod.PgType.CHAR with String = js.native
    /* "character" */ val CHARACTER: typingsSlinky.nodePgMigrate.distTypesMod.PgType.CHARACTER with String = js.native
    /* "character varying" */ val CHARACTER_VARYING: typingsSlinky.nodePgMigrate.distTypesMod.PgType.CHARACTER_VARYING with String = js.native
    /* "cidr" */ val CIDR: typingsSlinky.nodePgMigrate.distTypesMod.PgType.CIDR with String = js.native
    /* "circle" */ val CIRCLE: typingsSlinky.nodePgMigrate.distTypesMod.PgType.CIRCLE with String = js.native
    /* "date" */ val DATE: typingsSlinky.nodePgMigrate.distTypesMod.PgType.DATE with String = js.native
    /* "double precision" */ val DOUBLE_PRECISION: typingsSlinky.nodePgMigrate.distTypesMod.PgType.DOUBLE_PRECISION with String = js.native
    /* "float4" */ val FLOAT4: typingsSlinky.nodePgMigrate.distTypesMod.PgType.FLOAT4 with String = js.native
    /* "inet" */ val INET: typingsSlinky.nodePgMigrate.distTypesMod.PgType.INET with String = js.native
    /* "int" */ val INT: typingsSlinky.nodePgMigrate.distTypesMod.PgType.INT with String = js.native
    /* "int2" */ val INT2: typingsSlinky.nodePgMigrate.distTypesMod.PgType.INT2 with String = js.native
    /* "int4" */ val INT4: typingsSlinky.nodePgMigrate.distTypesMod.PgType.INT4 with String = js.native
    /* "int8" */ val INT8: typingsSlinky.nodePgMigrate.distTypesMod.PgType.INT8 with String = js.native
    /* "integer" */ val INTEGER: typingsSlinky.nodePgMigrate.distTypesMod.PgType.INTEGER with String = js.native
    /* "interval" */ val INTERVAL: typingsSlinky.nodePgMigrate.distTypesMod.PgType.INTERVAL with String = js.native
    /* "json" */ val JSON: typingsSlinky.nodePgMigrate.distTypesMod.PgType.JSON with String = js.native
    /* "jsonb" */ val JSONB: typingsSlinky.nodePgMigrate.distTypesMod.PgType.JSONB with String = js.native
    /* "line" */ val LINE: typingsSlinky.nodePgMigrate.distTypesMod.PgType.LINE with String = js.native
    /* "lseg" */ val LSEG: typingsSlinky.nodePgMigrate.distTypesMod.PgType.LSEG with String = js.native
    /* "macaddr" */ val MACADDR: typingsSlinky.nodePgMigrate.distTypesMod.PgType.MACADDR with String = js.native
    /* "money" */ val MONEY: typingsSlinky.nodePgMigrate.distTypesMod.PgType.MONEY with String = js.native
    /* "numeric" */ val NUMERIC: typingsSlinky.nodePgMigrate.distTypesMod.PgType.NUMERIC with String = js.native
    /* "path" */ val PATH: typingsSlinky.nodePgMigrate.distTypesMod.PgType.PATH with String = js.native
    /* "pg_lsn" */ val PG_LSN: typingsSlinky.nodePgMigrate.distTypesMod.PgType.PG_LSN with String = js.native
    /* "point" */ val POINT: typingsSlinky.nodePgMigrate.distTypesMod.PgType.POINT with String = js.native
    /* "polygon" */ val POLYGON: typingsSlinky.nodePgMigrate.distTypesMod.PgType.POLYGON with String = js.native
    /* "real" */ val REAL: typingsSlinky.nodePgMigrate.distTypesMod.PgType.REAL with String = js.native
    /* "serial" */ val SERIAL: typingsSlinky.nodePgMigrate.distTypesMod.PgType.SERIAL with String = js.native
    /* "serial2" */ val SERIAL2: typingsSlinky.nodePgMigrate.distTypesMod.PgType.SERIAL2 with String = js.native
    /* "serial4" */ val SERIAL4: typingsSlinky.nodePgMigrate.distTypesMod.PgType.SERIAL4 with String = js.native
    /* "serial8" */ val SERIAL8: typingsSlinky.nodePgMigrate.distTypesMod.PgType.SERIAL8 with String = js.native
    /* "smallint" */ val SMALLINT: typingsSlinky.nodePgMigrate.distTypesMod.PgType.SMALLINT with String = js.native
    /* "smallserial" */ val SMALLSERIAL: typingsSlinky.nodePgMigrate.distTypesMod.PgType.SMALLSERIAL with String = js.native
    /* "text" */ val TEXT: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TEXT with String = js.native
    /* "time" */ val TIME: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIME with String = js.native
    /* "timestamp" */ val TIMESTAMP: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIMESTAMP with String = js.native
    /* "timestamptz" */ val TIMESTAMPTZ: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIMESTAMPTZ with String = js.native
    /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITHOUT_TIME_ZONE with String = js.native
    /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITH_TIME_ZONE with String = js.native
    /* "timetz" */ val TIMETZ: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIMETZ with String = js.native
    /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIME_WITHOUT_TIME_ZONE with String = js.native
    /* "time with time zone" */ val TIME_WITH_TIME_ZONE: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TIME_WITH_TIME_ZONE with String = js.native
    /* "tsquery" */ val TSQUERY: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TSQUERY with String = js.native
    /* "tsvector" */ val TSVECTOR: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TSVECTOR with String = js.native
    /* "txid_snapshot" */ val TXID_SNAPSHOT: typingsSlinky.nodePgMigrate.distTypesMod.PgType.TXID_SNAPSHOT with String = js.native
    /* "uuid" */ val UUID: typingsSlinky.nodePgMigrate.distTypesMod.PgType.UUID with String = js.native
    /* "varbit" */ val VARBIT: typingsSlinky.nodePgMigrate.distTypesMod.PgType.VARBIT with String = js.native
    /* "varchar" */ val VARCHAR: typingsSlinky.nodePgMigrate.distTypesMod.PgType.VARCHAR with String = js.native
    /* "xml" */ val XML: typingsSlinky.nodePgMigrate.distTypesMod.PgType.XML with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.nodePgMigrate.distTypesMod.PgType with String] = js.native
  }
  
}

