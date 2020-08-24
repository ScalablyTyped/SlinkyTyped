package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewsTypesMod {
  type AlterView = js.Function2[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typingsSlinky.nodePgMigrate.viewsTypesMod.AlterViewOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type AlterViewColumn = js.Function3[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* columnName */ java.lang.String, 
    /* options */ typingsSlinky.nodePgMigrate.viewsTypesMod.AlterViewColumnOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateView = typingsSlinky.nodePgMigrate.viewsTypesMod.CreateViewFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateViewFn
  type CreateViewFn = js.Function3[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typingsSlinky.nodePgMigrate.viewsTypesMod.CreateViewOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropView = js.Function2[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameView = typingsSlinky.nodePgMigrate.viewsTypesMod.RenameViewFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameViewFn
  type RenameViewFn = js.Function2[
    /* viewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newViewName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type ViewOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String]
}
