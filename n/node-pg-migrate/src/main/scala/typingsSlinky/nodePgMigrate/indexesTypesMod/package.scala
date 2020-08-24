package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object indexesTypesMod {
  type AddIndex = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String], 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateIndex = typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateIndexFn
  type CreateIndexFn = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String], 
    /* options */ js.UndefOr[
      typingsSlinky.nodePgMigrate.indexesTypesMod.CreateIndexOptions with typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndexOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropIndex = js.Function3[
    /* tableName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String], 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.indexesTypesMod.DropIndexOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
}
