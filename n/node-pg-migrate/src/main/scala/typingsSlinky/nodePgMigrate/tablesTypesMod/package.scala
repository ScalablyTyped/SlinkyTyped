package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tablesTypesMod {
  
  type AddColumns = typingsSlinky.nodePgMigrate.tablesTypesMod.AddColumnsFn with typingsSlinky.nodePgMigrate.anon.ReverseAddColumnsFn
  
  type AddColumnsFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newColumns */ typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions, 
    /* addOptions */ js.UndefOr[
      typingsSlinky.nodePgMigrate.generalTypesMod.IfNotExistsOption with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type AlterColumn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columnName */ java.lang.String, 
    /* options */ typingsSlinky.nodePgMigrate.tablesTypesMod.AlterColumnOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type AlterTable = js.Function2[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* alterOptions */ typingsSlinky.nodePgMigrate.tablesTypesMod.AlterTableOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type ColumnDefinitions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinition | java.lang.String]
  
  type CreateConstraint = typingsSlinky.nodePgMigrate.tablesTypesMod.CreateConstraintFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateConstraintFn
  
  type CreateConstraintFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* constraintName */ java.lang.String | scala.Null, 
    /* expression */ (java.lang.String | typingsSlinky.nodePgMigrate.tablesTypesMod.ConstraintOptions) with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateTable = typingsSlinky.nodePgMigrate.tablesTypesMod.CreateTableFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateTableFn
  
  type CreateTableFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ typingsSlinky.nodePgMigrate.tablesTypesMod.ColumnDefinitions, 
    /* options */ js.UndefOr[
      typingsSlinky.nodePgMigrate.tablesTypesMod.TableOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropColumns = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropConstraint = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* constraintName */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropTable = js.Function2[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameColumn = typingsSlinky.nodePgMigrate.tablesTypesMod.RenameColumnFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameColumnFn
  
  type RenameColumnFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* oldColumnName */ java.lang.String, 
    /* newColumnName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameConstraint = typingsSlinky.nodePgMigrate.tablesTypesMod.RenameConstraintFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameConstraintFn
  
  type RenameConstraintFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* oldConstraintName */ java.lang.String, 
    /* newConstraintName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameTable = typingsSlinky.nodePgMigrate.tablesTypesMod.RenameTableFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameTableFn
  
  type RenameTableFn = js.Function2[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newtableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
