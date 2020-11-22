package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object indexesTypesMod {
  
  type CreateIndex = typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateIndexFn
  
  type CreateIndexFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | (js.Array[java.lang.String | typingsSlinky.nodePgMigrate.indexesTypesMod.IndexColumn]), 
    /* options */ js.UndefOr[
      typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexOptions with typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndexOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropIndex = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | (js.Array[java.lang.String | typingsSlinky.nodePgMigrate.indexesTypesMod.IndexColumn]), 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndexOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
}
