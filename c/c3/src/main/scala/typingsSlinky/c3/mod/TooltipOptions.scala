package typingsSlinky.c3.mod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.c3.anon.Left
import typingsSlinky.c3.anon.Name
import typingsSlinky.c3.anon.PositionShow
import typingsSlinky.c3.c3Strings.asc
import typingsSlinky.c3.c3Strings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipOptions extends StObject {
  
  /**
    * Set custom HTML for the tooltip.
    * @param data If `tooltip.grouped` is true, data includes multiple data points.
    */
  var contents: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ js.Array[DataPoint], 
      /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
      /* color */ js.Function1[/* repeated */ js.Any, _], 
      String
    ]
  ] = js.native
  
  var format: js.UndefOr[Name] = js.native
  
  /**
    * Set if tooltip is grouped or not for the data points.
    * Defaults to `true`.
    */
  var grouped: js.UndefOr[Boolean] = js.native
  
  /** Show the tooltips based on the horizontal position of the mouse. */
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var init: js.UndefOr[PositionShow] = js.native
  
  /**
    * Set tooltip values order.
    */
  var order: js.UndefOr[
    desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double]) | Null
  ] = js.native
  
  /**
    * Set custom position for the tooltip. This option can be used to modify the tooltip position by returning object that has top and left.
    */
  var position: js.UndefOr[
    js.ThisFunction4[
      /* this */ ChartInternal, 
      /* data */ Primitive, 
      /* width */ Double, 
      /* height */ Double, 
      /* element */ SVGElement, 
      Left
    ]
  ] = js.native
  
  /**
    * Show or hide tooltip.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}
object TooltipOptions {
  
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsMutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ js.Array[DataPoint], 
          /* defaultTitleFormat */ js.Function1[/* repeated */ js.Any, _], 
          /* defaultValueFormat */ js.Function1[/* repeated */ js.Any, _], 
          /* color */ js.Function1[/* repeated */ js.Any, _], 
          String
        ]
    ): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setFormat(value: Name): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setInit(value: PositionShow): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setOrder(value: desc | asc | js.Array[_] | (js.Function2[/* data1 */ js.Any, /* data2 */ js.Any, Double])): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderFunction2(value: (/* data1 */ js.Any, /* data2 */ js.Any) => Double): Self = StObject.set(x, "order", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: js.Any*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setPosition(
      value: js.ThisFunction4[
          /* this */ ChartInternal, 
          /* data */ Primitive, 
          /* width */ Double, 
          /* height */ Double, 
          /* element */ SVGElement, 
          Left
        ]
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
