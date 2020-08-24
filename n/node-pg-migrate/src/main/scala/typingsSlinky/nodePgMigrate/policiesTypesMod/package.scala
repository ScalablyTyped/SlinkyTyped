package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object policiesTypesMod {
  type AlterPolicy = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* options */ typingsSlinky.nodePgMigrate.policiesTypesMod.PolicyOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreatePolicy = typingsSlinky.nodePgMigrate.policiesTypesMod.CreatePolicyFn with typingsSlinky.nodePgMigrate.anon.ReverseCreatePolicyFn
  type CreatePolicyFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* options */ js.UndefOr[
      typingsSlinky.nodePgMigrate.policiesTypesMod.CreatePolicyOptions with typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreatePolicyOptions = typingsSlinky.nodePgMigrate.policiesTypesMod.CreatePolicyOptionsEn with typingsSlinky.nodePgMigrate.policiesTypesMod.PolicyOptions
  type DropPolicy = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenamePolicy = typingsSlinky.nodePgMigrate.policiesTypesMod.RenamePolicyFn with typingsSlinky.nodePgMigrate.anon.ReverseRenamePolicyFn
  type RenamePolicyFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* policyName */ java.lang.String, 
    /* newPolicyName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
