package typingsSlinky.reactTimeago.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTimeagoProps[T /* <: ReactComponentClass[js.Object] */] extends js.Object {
  
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
  implicit class ReactTimeagoPropsOps[Self <: ReactTimeagoProps[_], T /* <: ReactComponentClass[js.Object] */] (val x: Self with ReactTimeagoProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDateDate(value: js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String | Double | js.Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: String | T): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (/* value */ Double, /* unit */ Unit, /* suffix */ Suffix, /* epochMiliseconds */ Double, /* nextFormatter */ js.UndefOr[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
        ]) => ReactElement
    ): Self = this.set("formatter", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setLive(value: Boolean): Self = this.set("live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLive: Self = this.set("live", js.undefined)
    
    @scala.inline
    def setMaxPeriod(value: Double): Self = this.set("maxPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPeriod: Self = this.set("maxPeriod", js.undefined)
    
    @scala.inline
    def setMinPeriod(value: Double): Self = this.set("minPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPeriod: Self = this.set("minPeriod", js.undefined)
    
    @scala.inline
    def setNow(value: () => Double): Self = this.set("now", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
