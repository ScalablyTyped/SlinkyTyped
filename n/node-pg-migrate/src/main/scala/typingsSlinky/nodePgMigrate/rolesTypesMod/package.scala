package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rolesTypesMod {
  
  type AlterRole = js.Function2[
    /* roleName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* roleOptions */ typingsSlinky.nodePgMigrate.rolesTypesMod.RoleOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateRole = typingsSlinky.nodePgMigrate.rolesTypesMod.CreateRoleFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateRoleFn
  
  type CreateRoleFn = js.Function2[
    /* roleName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* roleOptions */ js.UndefOr[
      typingsSlinky.nodePgMigrate.rolesTypesMod.RoleOptions with typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropRole = js.Function2[
    /* roleName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameRole = typingsSlinky.nodePgMigrate.rolesTypesMod.RenameRoleFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameRoleFn
  
  type RenameRoleFn = js.Function2[
    /* oldRoleName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newRoleName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
