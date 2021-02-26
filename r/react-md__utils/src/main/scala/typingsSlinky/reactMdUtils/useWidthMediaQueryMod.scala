package typingsSlinky.reactMdUtils

import typingsSlinky.reactMdUtils.reactMdUtilsStrings.max
import typingsSlinky.reactMdUtils.reactMdUtilsStrings.min
import typingsSlinky.reactMdUtils.sizingConstantsMod.QuerySize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useWidthMediaQueryMod {
  
  @JSImport("@react-md/utils/types/sizing/useWidthMediaQuery", "toWidthPart")
  @js.native
  def toWidthPart_max(v: js.UndefOr[QuerySize], prefix: max): String = js.native
  @JSImport("@react-md/utils/types/sizing/useWidthMediaQuery", "toWidthPart")
  @js.native
  def toWidthPart_min(v: js.UndefOr[QuerySize], prefix: min): String = js.native
  
  @JSImport("@react-md/utils/types/sizing/useWidthMediaQuery", "useWidthMediaQuery")
  @js.native
  def useWidthMediaQuery(hasMinMax: WidthMediaQuery with WidthMediaQuerys): Boolean = js.native
  
  @js.native
  trait WidthMediaQuery extends StObject {
    
    var max: js.UndefOr[QuerySize] = js.native
    
    var min: js.UndefOr[QuerySize] = js.native
  }
  object WidthMediaQuery {
    
    @scala.inline
    def apply(): WidthMediaQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidthMediaQuery]
    }
    
    @scala.inline
    implicit class WidthMediaQueryMutableBuilder[Self <: WidthMediaQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: QuerySize): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: QuerySize): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdUtils.anon.Min
    - typingsSlinky.reactMdUtils.anon.Max
    - typingsSlinky.reactMdUtils.anon.MaxMin
  */
  trait WidthMediaQuerys extends StObject
  object WidthMediaQuerys {
    
    @scala.inline
    def Max(max: QuerySize): typingsSlinky.reactMdUtils.anon.Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactMdUtils.anon.Max]
    }
    
    @scala.inline
    def MaxMin(max: QuerySize, min: QuerySize): typingsSlinky.reactMdUtils.anon.MaxMin = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactMdUtils.anon.MaxMin]
    }
    
    @scala.inline
    def Min(min: QuerySize): typingsSlinky.reactMdUtils.anon.Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactMdUtils.anon.Min]
    }
  }
}
