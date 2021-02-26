package typingsSlinky.easyJsend

import typingsSlinky.easyJsend.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Express {
  
  @js.native
  trait MakePartialInput extends StObject {
    
    var model: js.Any = js.native
    
    var opts: Limit = js.native
    
    var result: js.Any = js.native
    
    var search: js.Object = js.native
  }
  object MakePartialInput {
    
    @scala.inline
    def apply(model: js.Any, opts: Limit, result: js.Any, search: js.Object): MakePartialInput = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakePartialInput]
    }
    
    @scala.inline
    implicit class MakePartialInputMutableBuilder[Self <: MakePartialInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: Limit): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PartialInput extends StObject {
    
    var count: Double = js.native
    
    var data: js.Any = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var offset: Double = js.native
  }
  object PartialInput {
    
    @scala.inline
    def apply(count: Double, data: js.Any, offset: Double): PartialInput = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialInput]
    }
    
    @scala.inline
    implicit class PartialInputMutableBuilder[Self <: PartialInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    def error(err: js.Any): Unit = js.native
    def error(err: js.Any, status: Double): Unit = js.native
    
    def fail(data: js.Any): Unit = js.native
    def fail(data: js.Any, status: Double): Unit = js.native
    
    var makePartial: js.UndefOr[js.Function1[/* data */ MakePartialInput, Unit]] = js.native
    
    var partial: js.UndefOr[js.Function2[/* data */ PartialInput, /* status */ js.UndefOr[Double], Unit]] = js.native
    
    def success(): Unit = js.native
    def success(data: js.UndefOr[scala.Nothing], status: Double): Unit = js.native
    def success(data: js.Any): Unit = js.native
    def success(data: js.Any, status: Double): Unit = js.native
  }
}
