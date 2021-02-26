package typingsSlinky.d3Collection

import typingsSlinky.d3Collection.mod.NestedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Key[T] extends StObject {
    
    var key: String = js.native
    
    var value: T = js.native
  }
  object Key {
    
    @scala.inline
    def apply[T](key: String, value: T): Key[T] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[T]]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key[_], T] (val x: Self with Key[T]) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyValue[RollupType] extends StObject {
    
    var key: String = js.native
    
    var value: js.UndefOr[RollupType] = js.native
    
    var values: js.Any = js.native
  }
  object KeyValue {
    
    @scala.inline
    def apply[RollupType](key: String, values: js.Any): KeyValue[RollupType] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyValue[RollupType]]
    }
    
    @scala.inline
    implicit class KeyValueMutableBuilder[Self <: KeyValue[_], RollupType] (val x: Self with KeyValue[RollupType]) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: RollupType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var key: String = js.native
    
    var value: js.Any = js.native
  }
  object Value {
    
    @scala.inline
    def apply(key: String, value: js.Any): Value = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Values[Datum, RollupType] extends StObject {
    
    var key: String = js.native
    
    var value: js.UndefOr[RollupType] = js.native
    
    var values: js.UndefOr[(NestedArray[Datum, RollupType]) | js.Array[Datum]] = js.native
  }
  object Values {
    
    @scala.inline
    def apply[Datum, RollupType](key: String): Values[Datum, RollupType] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values[Datum, RollupType]]
    }
    
    @scala.inline
    implicit class ValuesMutableBuilder[Self <: Values[_, _], Datum, RollupType] (val x: Self with (Values[Datum, RollupType])) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: RollupType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValues(value: (NestedArray[Datum, RollupType]) | js.Array[Datum]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: Datum*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
