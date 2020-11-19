package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object schemasTypesMod {
  
  type CreateSchema = typingsSlinky.nodePgMigrate.schemasTypesMod.CreateSchemaFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateSchemaFn
  
  type CreateSchemaFn = js.Function2[
    /* schemaName */ java.lang.String, 
    /* schemaOptions */ js.UndefOr[
      typingsSlinky.nodePgMigrate.schemasTypesMod.CreateSchemaOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropSchema = js.Function2[
    /* schemaName */ java.lang.String, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameSchema = typingsSlinky.nodePgMigrate.schemasTypesMod.RenameSchemaFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameSchemaFn
  
  type RenameSchemaFn = js.Function2[
    /* oldSchemaName */ java.lang.String, 
    /* newSchemaName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
