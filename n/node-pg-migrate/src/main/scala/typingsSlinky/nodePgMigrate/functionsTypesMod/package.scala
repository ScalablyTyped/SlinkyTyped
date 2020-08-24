package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object functionsTypesMod {
  type CreateFunction = typingsSlinky.nodePgMigrate.functionsTypesMod.CreateFunctionFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateFunctionFn
  type CreateFunctionFn = js.Function4[
    /* functionName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* functionParams */ js.Array[typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParam], 
    /* functionOptions */ typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ typingsSlinky.nodePgMigrate.generalTypesMod.Value, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropFunction = js.Function3[
    /* functionName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* functionParams */ js.Array[typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParam], 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type FunctionParam = java.lang.String | typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParamType
  type RenameFunction = typingsSlinky.nodePgMigrate.functionsTypesMod.RenameFunctionFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameFunctionFn
  type RenameFunctionFn = js.Function3[
    /* oldFunctionName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* functionParams */ js.Array[typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParam], 
    /* newFunctionName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
