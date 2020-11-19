package typingsSlinky.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesTypesMod {
  
  type AddTypeAttribute = typingsSlinky.nodePgMigrate.typesTypesMod.AddTypeAttributeFn with typingsSlinky.nodePgMigrate.anon.ReverseAddTypeAttributeFn
  
  type AddTypeAttributeFn = js.Function3[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* attributeType */ typingsSlinky.nodePgMigrate.generalTypesMod.Type with typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type AddTypeValue = js.Function3[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* value */ typingsSlinky.nodePgMigrate.generalTypesMod.Value, 
    /* options */ js.UndefOr[typingsSlinky.nodePgMigrate.typesTypesMod.AddTypeValueOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateType = typingsSlinky.nodePgMigrate.typesTypesMod.CreateTypeFn with typingsSlinky.nodePgMigrate.anon.ReverseCreateTypeFn
  
  type CreateTypeFn = js.Function2[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* values */ (js.Array[typingsSlinky.nodePgMigrate.generalTypesMod.Value] | org.scalablytyped.runtime.StringDictionary[typingsSlinky.nodePgMigrate.generalTypesMod.Type]) with typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropType = js.Function2[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropTypeAttribute = js.Function3[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* options */ typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameType = typingsSlinky.nodePgMigrate.typesTypesMod.RenameTypeFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameTypeFn
  
  type RenameTypeAttribute = typingsSlinky.nodePgMigrate.typesTypesMod.RenameTypeAttributeFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameTypeAttributeFn
  
  type RenameTypeAttributeFn = js.Function3[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* newAttributeName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameTypeFn = js.Function2[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* newTypeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameTypeValue = typingsSlinky.nodePgMigrate.typesTypesMod.RenameTypeValueFn with typingsSlinky.nodePgMigrate.anon.ReverseRenameTypeValueFn
  
  type RenameTypeValueFn = js.Function3[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* value */ java.lang.String, 
    /* newValue */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type SetTypeAttribute = js.Function3[
    /* typeName */ typingsSlinky.nodePgMigrate.generalTypesMod.Name, 
    /* attributeName */ java.lang.String, 
    /* attributeType */ typingsSlinky.nodePgMigrate.generalTypesMod.Type, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
