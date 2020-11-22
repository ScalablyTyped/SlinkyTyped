package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object extensionsTypesMod {
  
  type CreateExtension = typingsSlinky.nodePgMigrate.extensionsTypesMod.CreateExtensionFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateExtensionFn
  
  type CreateExtensionFn = js.Function2[
    /* extension */ typingsSlinky.nodePgMigrate.extensionsTypesMod.StringExtension | js.Array[typingsSlinky.nodePgMigrate.extensionsTypesMod.StringExtension], 
    /* options */ js.UndefOr[
      typingsSlinky.nodePgMigrate.extensionsTypesMod.CreateExtensionOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropExtension = js.Function2[
    /* extension */ typingsSlinky.nodePgMigrate.extensionsTypesMod.StringExtension | js.Array[typingsSlinky.nodePgMigrate.extensionsTypesMod.StringExtension], 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type StringExtension = typingsSlinky.nodePgMigrate.generalTypesMod.LiteralUnion[typingsSlinky.nodePgMigrate.extensionsTypesMod.Extension]
}
