package typingsSlinky.linguiMacro

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.linguiCore.i18nMod.MessageDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @js.native
  trait PluralForms extends /* exact */ NumberDictionary[String | MessageDescriptor] {
    
    var few: js.UndefOr[String | MessageDescriptor] = js.native
    
    var many: js.UndefOr[String | MessageDescriptor] = js.native
    
    var one: js.UndefOr[String | MessageDescriptor] = js.native
    
    var other: String | MessageDescriptor = js.native
    
    var two: js.UndefOr[String | MessageDescriptor] = js.native
    
    var zero: js.UndefOr[String | MessageDescriptor] = js.native
  }
  object PluralForms {
    
    @scala.inline
    def apply(other: String | MessageDescriptor): PluralForms = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralForms]
    }
    
    @scala.inline
    implicit class PluralFormsMutableBuilder[Self <: PluralForms] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFew(value: String | MessageDescriptor): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      @scala.inline
      def setMany(value: String | MessageDescriptor): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      @scala.inline
      def setOne(value: String | MessageDescriptor): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      @scala.inline
      def setOther(value: String | MessageDescriptor): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwo(value: String | MessageDescriptor): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      @scala.inline
      def setZero(value: String | MessageDescriptor): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  @js.native
  trait PluralProps extends PluralForms {
    
    var offset: js.UndefOr[Double] = js.native
    
    var value: Double = js.native
  }
  object PluralProps {
    
    @scala.inline
    def apply(other: String | MessageDescriptor, value: Double): PluralProps = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralProps]
    }
    
    @scala.inline
    implicit class PluralPropsMutableBuilder[Self <: PluralProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelectProps extends /* selectForm */ StringDictionary[String | MessageDescriptor] {
    
    var other: String | MessageDescriptor = js.native
    
    var value: String = js.native
  }
  object SelectProps {
    
    @scala.inline
    def apply(other: String | MessageDescriptor, value: String): SelectProps = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
    
    @scala.inline
    implicit class SelectPropsMutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOther(value: String | MessageDescriptor): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
