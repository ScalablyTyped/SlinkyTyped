package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object viewsMaterializedTypesMod {
  
  type AlterMaterializedView = js.Function2[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.AlterMaterializedViewOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateMaterializedView = typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateMaterializedViewFn
  
  type CreateMaterializedViewFn = js.Function3[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropMaterializedView = js.Function2[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RefreshMaterializedView = typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewFn with typingsSlinky.nodePgMigrate.anon.ReverseRefreshMaterializedViewFn
  
  type RefreshMaterializedViewFn = js.Function2[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[
      typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameMaterializedView = typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameMaterializedViewFn
  
  type RenameMaterializedViewColumn = typingsSlinky.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumnFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameMaterializedViewColumnFn
  
  type RenameMaterializedViewColumnFn = js.Function3[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columnName */ java.lang.String, 
    /* newColumnName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameMaterializedViewFn = js.Function2[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newViewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type StorageParameters = org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double]
}
