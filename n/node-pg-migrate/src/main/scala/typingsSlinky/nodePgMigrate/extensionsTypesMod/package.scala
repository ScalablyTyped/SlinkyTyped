package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionsTypesMod {
  type CreateExtension = typingsSlinky.nodePgMigrate.extensionsTypesMod.CreateExtensionFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateExtensionFn
  type CreateExtensionFn = js.Function2[
    /* extension */ (typingsSlinky.nodePgMigrate.generalTypesMod.LiteralUnion[typingsSlinky.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]) | (js.Array[
      typingsSlinky.nodePgMigrate.generalTypesMod.LiteralUnion[typingsSlinky.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]
    ]), 
    /* options */ js.UndefOr[
      typingsSlinky.nodePgMigrate.extensionsTypesMod.CreateExtensionOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropExtension = js.Function2[
    /* extension */ (typingsSlinky.nodePgMigrate.generalTypesMod.LiteralUnion[typingsSlinky.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]) | (js.Array[
      typingsSlinky.nodePgMigrate.generalTypesMod.LiteralUnion[typingsSlinky.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]
    ]), 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
}
