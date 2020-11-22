package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object generalTypesMod {
  
  type DropOptions = typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption with typingsSlinky.nodePgMigrate.generalTypesMod.CascadeOption
  
  type LiteralUnion[T /* <: java.lang.String */] = T | (java.lang.String with typingsSlinky.nodePgMigrate.anon.ZzIGNOREME)
  
  type Name = java.lang.String | typingsSlinky.nodePgMigrate.anon.Name
  
  type Nullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | null}
    */ typingsSlinky.nodePgMigrate.nodePgMigrateStrings.Nullable with org.scalablytyped.runtime.TopLevel[T]
  
  type PublicPart[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typingsSlinky.nodePgMigrate.nodePgMigrateStrings.PublicPart with org.scalablytyped.runtime.TopLevel[T]
  
  type Type = java.lang.String | typingsSlinky.nodePgMigrate.anon.Type
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typingsSlinky.nodePgMigrate.pgLiteralMod.default
    - typingsSlinky.nodePgMigrate.generalTypesMod.PgLiteralValue
    - js.Array[
  / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value * / js.Object]
  */
  type Value = typingsSlinky.nodePgMigrate.generalTypesMod._Value | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-pg-migrate.node-pg-migrate/dist/operations/generalTypes.Value */ js.Object
  ]) | scala.Null | scala.Boolean | java.lang.String | scala.Double
}
