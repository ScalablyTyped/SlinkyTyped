package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object domainsTypesMod {
  type AlterDomain = js.Function2[
    /* domainName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* domainOptions */ typingsSlinky.nodePgMigrate.domainsTypesMod.DomainOptionsAlter, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateDomain = typingsSlinky.nodePgMigrate.domainsTypesMod.CreateDomainFn with typingsSlinky.nodePgMigrate.anon.Reverse
  type CreateDomainFn = js.Function3[
    /* domainName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* type */ typingsSlinky.nodePgMigrate.generalTypesMod.Type, 
    /* domainOptions */ js.UndefOr[
      typingsSlinky.nodePgMigrate.domainsTypesMod.DomainOptionsCreate with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropDomain = js.Function2[
    /* domainName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameDomain = typingsSlinky.nodePgMigrate.domainsTypesMod.RenameDomainFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameDomainFn
  type RenameDomainFn = js.Function2[
    /* oldDomainName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newDomainName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
