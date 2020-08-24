package typingsSlinky.nodePgMigrate.migrationMod

import typingsSlinky.nodePgMigrate.dbMod.DBConnection
import typingsSlinky.nodePgMigrate.distTypesMod.Logger
import typingsSlinky.nodePgMigrate.distTypesMod.MigrationAction
import typingsSlinky.nodePgMigrate.distTypesMod.MigrationBuilderActions
import typingsSlinky.nodePgMigrate.distTypesMod.MigrationDirection
import typingsSlinky.nodePgMigrate.distTypesMod.RunnerOption
import typingsSlinky.nodePgMigrate.migrationBuilderMod.default
import typingsSlinky.nodePgMigrate.nodePgMigrateBooleans.`false`
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.js_
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.sql
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.ts
import typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import typingsSlinky.pg.mod.QueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/migration", "Migration")
@js.native
class Migration protected () extends RunMigration {
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
  val db: DBConnection = js.native
  var down: js.UndefOr[`false` | MigrationAction] = js.native
  val logger: Logger = js.native
  val options: RunnerOption = js.native
  val typeShorthands: js.UndefOr[ColumnDefinitions] = js.native
  var up: js.UndefOr[`false` | MigrationAction] = js.native
  def _apply(action: MigrationAction, pgm: default): js.Promise[_] = js.native
  def _getAction(direction: MigrationDirection): MigrationAction = js.native
  def _getMarkAsRun(action: MigrationAction): String = js.native
  @JSName("apply")
  def apply(direction: MigrationDirection): js.Promise[_] = js.native
  def markAsRun(direction: MigrationDirection): js.Promise[QueryResult[_]] = js.native
}

/* static members */
@JSImport("node-pg-migrate/dist/migration", "Migration")
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

