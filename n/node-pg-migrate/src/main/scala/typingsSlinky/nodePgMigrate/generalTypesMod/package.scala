package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object generalTypesMod {
  
  type DropOptions = typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption with typingsSlinky.nodePgMigrate.generalTypesMod.CascadeOption
  
  type LiteralUnion[T /* <: U */, U] = T | (U with typingsSlinky.nodePgMigrate.anon.ZzIGNOREME)
  
  type Name = java.lang.String | typingsSlinky.nodePgMigrate.anon.Name
  
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typingsSlinky.nodePgMigrate.nodePgMigrateStrings.Nullable with org.scalablytyped.runtime.TopLevel[T]
  
  type Type = java.lang.String | typingsSlinky.nodePgMigrate.anon.Type
  
  type Value = scala.Null | scala.Boolean | java.lang.String | scala.Double | typingsSlinky.nodePgMigrate.pgLiteralMod.default | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object
  ])
}
