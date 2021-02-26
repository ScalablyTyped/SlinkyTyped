package typingsSlinky.meteor

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.meteor.anon.Canonical
import typingsSlinky.meteor.anon.KeyOrderSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ejsonMod {
  
  object EJSON {
    
    @JSImport("meteor/ejson", "EJSON.addType")
    @js.native
    def addType(
      name: String,
      factory: js.Function1[
          /* val */ typingsSlinky.meteor.ejsonMod.JSONable, 
          typingsSlinky.meteor.ejsonMod.EJSONableCustomType
        ]
    ): Unit = js.native
    
    @JSImport("meteor/ejson", "EJSON.clone")
    @js.native
    def clone_[T](`val`: T): T = js.native
    
    @JSImport("meteor/ejson", "EJSON.equals")
    @js.native
    def equals_(a: typingsSlinky.meteor.ejsonMod.EJSON, b: typingsSlinky.meteor.ejsonMod.EJSON): Boolean = js.native
    @JSImport("meteor/ejson", "EJSON.equals")
    @js.native
    def equals_(
      a: typingsSlinky.meteor.ejsonMod.EJSON,
      b: typingsSlinky.meteor.ejsonMod.EJSON,
      options: KeyOrderSensitive
    ): Boolean = js.native
    
    @JSImport("meteor/ejson", "EJSON.fromJSONValue")
    @js.native
    def fromJSONValue(`val`: typingsSlinky.meteor.ejsonMod.JSONable): js.Any = js.native
    
    @JSImport("meteor/ejson", "EJSON.isBinary")
    @js.native
    def isBinary(x: js.Object): Boolean = js.native
    
    @JSImport("meteor/ejson", "EJSON.newBinary")
    @js.native
    def newBinary(size: Double): js.typedarray.Uint8Array = js.native
    
    @JSImport("meteor/ejson", "EJSON.parse")
    @js.native
    def parse(str: String): typingsSlinky.meteor.ejsonMod.EJSON = js.native
    
    @JSImport("meteor/ejson", "EJSON.stringify")
    @js.native
    def stringify(`val`: typingsSlinky.meteor.ejsonMod.EJSON): String = js.native
    @JSImport("meteor/ejson", "EJSON.stringify")
    @js.native
    def stringify(`val`: typingsSlinky.meteor.ejsonMod.EJSON, options: Canonical): String = js.native
    
    @JSImport("meteor/ejson", "EJSON.toJSONValue")
    @js.native
    def toJSONValue(`val`: typingsSlinky.meteor.ejsonMod.EJSON): typingsSlinky.meteor.ejsonMod.JSONable = js.native
  }
  type EJSON = typingsSlinky.meteor.ejsonMod.EJSONable
  
  type EJSONable = StringDictionary[typingsSlinky.meteor.ejsonMod.EJSONableProperty]
  
  @js.native
  trait EJSONableCustomType extends StObject {
    
    @JSName("clone")
    var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.native
    
    @JSName("equals")
    var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.native
    
    def toJSONValue(): typingsSlinky.meteor.ejsonMod.JSONable = js.native
    
    def typeName(): String = js.native
  }
  object EJSONableCustomType {
    
    @scala.inline
    def apply(toJSONValue: () => typingsSlinky.meteor.ejsonMod.JSONable, typeName: () => String): typingsSlinky.meteor.ejsonMod.EJSONableCustomType = {
      val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
      __obj.asInstanceOf[typingsSlinky.meteor.ejsonMod.EJSONableCustomType]
    }
    
    @scala.inline
    implicit class EJSONableCustomTypeMutableBuilder[Self <: typingsSlinky.meteor.ejsonMod.EJSONableCustomType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClone_(value: () => typingsSlinky.meteor.ejsonMod.EJSONableCustomType): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setEquals_(value: /* other */ js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setToJSONValue(value: () => typingsSlinky.meteor.ejsonMod.JSONable): Self = StObject.set(x, "toJSONValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypeName(value: () => String): Self = StObject.set(x, "typeName", js.Any.fromFunction0(value))
    }
  }
  
  type EJSONableProperty = js.UndefOr[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | js.typedarray.Uint8Array | typingsSlinky.meteor.ejsonMod.EJSONableCustomType | Null
  ]
  
  type JSONable = StringDictionary[
    js.UndefOr[
      Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
    ]
  ]
}
