package typingsSlinky.extenso

import typingsSlinky.extenso.extensoStrings.BRL
import typingsSlinky.extenso.extensoStrings.EUR
import typingsSlinky.extenso.extensoStrings.f
import typingsSlinky.extenso.extensoStrings.formal
import typingsSlinky.extenso.extensoStrings.informal
import typingsSlinky.extenso.extensoStrings.m
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Decimal extends StObject {
    
    var decimal: js.UndefOr[formal | informal] = js.native
    
    var gender: js.UndefOr[m | f] = js.native
  }
  object Decimal {
    
    @scala.inline
    def apply(): Decimal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Decimal]
    }
    
    @scala.inline
    implicit class DecimalMutableBuilder[Self <: Decimal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: formal | informal): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setGender(value: m | f): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: js.UndefOr[BRL | EUR] = js.native
  }
  object Type {
    
    @scala.inline
    def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: BRL | EUR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
