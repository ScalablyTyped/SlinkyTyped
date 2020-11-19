package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object operatorsTypesMod {
  
  type AddToOperatorFamily = typingsSlinky.nodePgMigrate.operatorsTypesMod.AddToOperatorFamilyFn with typingsSlinky.nodePgMigrate.anon.ReverseAddToOperatorFamilyFn
  
  type AddToOperatorFamilyFn = js.Function3[
    /* operatorFamilyName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* operatorList */ js.Array[typingsSlinky.nodePgMigrate.operatorsTypesMod.OperatorListDefinition], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateOperator = typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateOperatorFn
  
  type CreateOperatorClass = typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorClassFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateOperatorClassFn
  
  type CreateOperatorClassFn = js.Function5[
    /* operatorClassName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* type */ typingsSlinky.nodePgMigrate.generalTypesMod.Type, 
    /* indexMethod */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* operatorList */ js.Array[typingsSlinky.nodePgMigrate.operatorsTypesMod.OperatorListDefinition], 
    /* options */ typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorClassOptions with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateOperatorFamily = typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorFamilyFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateOperatorFamilyFn
  
  type CreateOperatorFamilyFn = js.Function3[
    /* operatorFamilyName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateOperatorFn = js.Function2[
    /* operatorName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorOptions with typingsSlinky.nodePgMigrate.operatorsTypesMod.DropOperatorOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropOperator = js.Function2[
    /* operatorName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.operatorsTypesMod.DropOperatorOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropOperatorClass = js.Function3[
    /* operatorClassName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropOperatorFamily = js.Function3[
    /* operatorFamilyName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newSchemaName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RemoveFromOperatorFamily = js.Function3[
    /* operatorFamilyName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* operatorList */ js.Array[typingsSlinky.nodePgMigrate.operatorsTypesMod.OperatorListDefinition], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameOperatorClass = typingsSlinky.nodePgMigrate.operatorsTypesMod.RenameOperatorClassFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameOperatorClassFn
  
  type RenameOperatorClassFn = js.Function3[
    /* oldOperatorClassName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newOperatorClassName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameOperatorFamily = typingsSlinky.nodePgMigrate.operatorsTypesMod.RenameOperatorFamilyFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameOperatorFamilyFn
  
  type RenameOperatorFamilyFn = js.Function3[
    /* oldOperatorFamilyName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* indexMethod */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newOperatorFamilyName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
