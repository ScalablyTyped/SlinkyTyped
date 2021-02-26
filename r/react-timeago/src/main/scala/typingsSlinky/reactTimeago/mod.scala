package typingsSlinky.reactTimeago

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  class ^[T /* <: ReactComponentClass[js.Object] */] ()
    extends Component[ReactTimeagoProps[T] with ComponentProps[T], js.Object, js.Any]
  
  type Formatter = js.Function5[
    /* value */ Double, 
    /* unit */ Unit, 
    /* suffix */ Suffix, 
    /* epochMiliseconds */ Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    ReactElement
  ]
  
  type ReactTimeago[T /* <: ReactComponentClass[js.Object] */] = ReactComponentClass[ReactTimeagoProps[T] with ComponentProps[T]]
  
  @js.native
  trait ReactTimeagoProps[T /* <: ReactComponentClass[js.Object] */] extends StObject {
    
    val component: js.UndefOr[String | T] = js.native
    
    val date: String | Double | js.Date = js.native
    
    val formatter: js.UndefOr[Formatter] = js.native
    
    val live: js.UndefOr[Boolean] = js.native
    
    val maxPeriod: js.UndefOr[Double] = js.native
    
    val minPeriod: js.UndefOr[Double] = js.native
    
    val now: js.UndefOr[js.Function0[Double]] = js.native
    
    val title: js.UndefOr[String] = js.native
  }
  object ReactTimeagoProps {
    
    @scala.inline
    def apply[T /* <: ReactComponentClass[js.Object] */](date: String | Double | js.Date): ReactTimeagoProps[T] = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactTimeagoProps[T]]
    }
    
    @scala.inline
    implicit class ReactTimeagoPropsMutableBuilder[Self <: ReactTimeagoProps[_], T /* <: ReactComponentClass[js.Object] */] (val x: Self with ReactTimeagoProps[T]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String | T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDate(value: String | Double | js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(
        value: (/* value */ Double, /* unit */ Unit, /* suffix */ Suffix, /* epochMiliseconds */ Double, /* nextFormatter */ js.UndefOr[
              /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
            ]) => ReactElement
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction5(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
      
      @scala.inline
      def setMaxPeriod(value: Double): Self = StObject.set(x, "maxPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPeriodUndefined: Self = StObject.set(x, "maxPeriod", js.undefined)
      
      @scala.inline
      def setMinPeriod(value: Double): Self = StObject.set(x, "minPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPeriodUndefined: Self = StObject.set(x, "minPeriod", js.undefined)
      
      @scala.inline
      def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactTimeago.reactTimeagoStrings.ago
    - typingsSlinky.reactTimeago.reactTimeagoStrings.`from now`
  */
  trait Suffix extends StObject
  object Suffix {
    
    @scala.inline
    def ago: typingsSlinky.reactTimeago.reactTimeagoStrings.ago = "ago".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.ago]
    
    @scala.inline
    def `from now`: typingsSlinky.reactTimeago.reactTimeagoStrings.`from now` = ("from now").asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.`from now`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactTimeago.reactTimeagoStrings.second
    - typingsSlinky.reactTimeago.reactTimeagoStrings.minute
    - typingsSlinky.reactTimeago.reactTimeagoStrings.hour
    - typingsSlinky.reactTimeago.reactTimeagoStrings.day
    - typingsSlinky.reactTimeago.reactTimeagoStrings.week
    - typingsSlinky.reactTimeago.reactTimeagoStrings.month
    - typingsSlinky.reactTimeago.reactTimeagoStrings.year
  */
  trait Unit extends StObject
  object Unit {
    
    @scala.inline
    def day: typingsSlinky.reactTimeago.reactTimeagoStrings.day = "day".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.day]
    
    @scala.inline
    def hour: typingsSlinky.reactTimeago.reactTimeagoStrings.hour = "hour".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.hour]
    
    @scala.inline
    def minute: typingsSlinky.reactTimeago.reactTimeagoStrings.minute = "minute".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.minute]
    
    @scala.inline
    def month: typingsSlinky.reactTimeago.reactTimeagoStrings.month = "month".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.month]
    
    @scala.inline
    def second: typingsSlinky.reactTimeago.reactTimeagoStrings.second = "second".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.second]
    
    @scala.inline
    def week: typingsSlinky.reactTimeago.reactTimeagoStrings.week = "week".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.week]
    
    @scala.inline
    def year: typingsSlinky.reactTimeago.reactTimeagoStrings.year = "year".asInstanceOf[typingsSlinky.reactTimeago.reactTimeagoStrings.year]
  }
}
