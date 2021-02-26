package typingsSlinky.antvDataSet

import typingsSlinky.antvDataSet.antvDataSetStrings.group
import typingsSlinky.antvDataSet.antvDataSetStrings.order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillRowsMod {
  
  @js.native
  trait Options extends StObject {
    
    var fillBy: js.UndefOr[group | order] = js.native
    
    var groupBy: js.UndefOr[js.Array[String]] = js.native
    
    var orderBy: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillBy(value: group | order): Self = StObject.set(x, "fillBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillByUndefined: Self = StObject.set(x, "fillBy", js.undefined)
      
      @scala.inline
      def setGroupBy(value: js.Array[String]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value :_*))
      
      @scala.inline
      def setOrderBy(value: js.Array[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      @scala.inline
      def setOrderByVarargs(value: String*): Self = StObject.set(x, "orderBy", js.Array(value :_*))
    }
  }
}
