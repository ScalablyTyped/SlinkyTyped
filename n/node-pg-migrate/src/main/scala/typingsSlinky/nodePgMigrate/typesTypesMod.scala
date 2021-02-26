package typingsSlinky.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodePgMigrate.anon.ReverseAddTypeAttributeFn
import typingsSlinky.nodePgMigrate.anon.ReverseCreateTypeFn
import typingsSlinky.nodePgMigrate.anon.ReverseRenameTypeAttributeFn
import typingsSlinky.nodePgMigrate.anon.ReverseRenameTypeFn
import typingsSlinky.nodePgMigrate.anon.ReverseRenameTypeValueFn
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption
import typingsSlinky.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typingsSlinky.nodePgMigrate.generalTypesMod.Name
import typingsSlinky.nodePgMigrate.generalTypesMod.Type
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesMod {
  
  type AddTypeAttribute = AddTypeAttributeFn with ReverseAddTypeAttributeFn
  
  type AddTypeAttributeFn = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* attributeType */ Type with IfExistsOption, 
    String | js.Array[String]
  ]
  
  type AddTypeValue = js.Function3[
    /* typeName */ Name, 
    /* value */ Value, 
    /* options */ js.UndefOr[AddTypeValueOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait AddTypeValueOptions extends IfNotExistsOption {
    
    var after: js.UndefOr[String] = js.native
    
    var before: js.UndefOr[String] = js.native
  }
  object AddTypeValueOptions {
    
    @scala.inline
    def apply(): AddTypeValueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddTypeValueOptions]
    }
    
    @scala.inline
    implicit class AddTypeValueOptionsMutableBuilder[Self <: AddTypeValueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  type CreateType = CreateTypeFn with ReverseCreateTypeFn
  
  type CreateTypeFn = js.Function2[
    /* typeName */ Name, 
    /* values */ (js.Array[Value] | StringDictionary[Type]) with DropOptions, 
    String | js.Array[String]
  ]
  
  type DropType = js.Function2[
    /* typeName */ Name, 
    /* dropOptions */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  type DropTypeAttribute = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* options */ IfExistsOption, 
    String | js.Array[String]
  ]
  
  type RenameType = RenameTypeFn with ReverseRenameTypeFn
  
  type RenameTypeAttribute = RenameTypeAttributeFn with ReverseRenameTypeAttributeFn
  
  type RenameTypeAttributeFn = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* newAttributeName */ String, 
    String | js.Array[String]
  ]
  
  type RenameTypeFn = js.Function2[/* typeName */ Name, /* newTypeName */ Name, String | js.Array[String]]
  
  type RenameTypeValue = RenameTypeValueFn with ReverseRenameTypeValueFn
  
  type RenameTypeValueFn = js.Function3[
    /* typeName */ Name, 
    /* value */ String, 
    /* newValue */ String, 
    String | js.Array[String]
  ]
  
  type SetTypeAttribute = js.Function3[
    /* typeName */ Name, 
    /* attributeName */ String, 
    /* attributeType */ Type, 
    String | js.Array[String]
  ]
}
