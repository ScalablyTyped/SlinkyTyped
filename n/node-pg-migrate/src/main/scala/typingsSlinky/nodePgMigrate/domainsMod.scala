package typingsSlinky.nodePgMigrate

import typingsSlinky.nodePgMigrate.distTypesMod.MigrationOptions
import typingsSlinky.nodePgMigrate.domainsTypesMod.AlterDomain
import typingsSlinky.nodePgMigrate.domainsTypesMod.CreateDomain
import typingsSlinky.nodePgMigrate.domainsTypesMod.DropDomain
import typingsSlinky.nodePgMigrate.domainsTypesMod.RenameDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/domains", JSImport.Namespace)
@js.native
object domainsMod extends js.Object {
  def alterDomain(mOptions: MigrationOptions): AlterDomain = js.native
  def createDomain(mOptions: MigrationOptions): CreateDomain = js.native
  def dropDomain(mOptions: MigrationOptions): DropDomain = js.native
  def renameDomain(mOptions: MigrationOptions): RenameDomain = js.native
}

