package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRefresher extends StObject {
  
  /**
    * Time it takes to close the refresher. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var closeDuration: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the refresher will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Emitted while the user is pulling down the content and exposing the refresher.
    */
  var onIonPull: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  /**
    * Emitted when the user lets go of the content and has pulled down further than the `pullMin` or pulls the content down and exceeds the pullMax. Updates the refresher state to `refreshing`. The `complete()` method should be called when the async operation has completed.
    */
  var onIonRefresh: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  /**
    * Emitted when the user begins to start pulling down.
    */
  var onIonStart: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.native
  
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.  Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var pullFactor: js.UndefOr[Double] = js.native
  
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`. Does not apply when  the refresher content uses a spinner, enabling the native refresher.
    */
  var pullMax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var pullMin: js.UndefOr[Double] = js.native
  
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var snapbackDuration: js.UndefOr[String] = js.native
}
object IonRefresher {
  
  @scala.inline
  def apply(): IonRefresher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRefresher]
  }
  
  @scala.inline
  implicit class IonRefresherMutableBuilder[Self <: IonRefresher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseDuration(value: String): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseDurationUndefined: Self = StObject.set(x, "closeDuration", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setOnIonPull(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonPull", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonPullUndefined: Self = StObject.set(x, "onIonPull", js.undefined)
    
    @scala.inline
    def setOnIonRefresh(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonRefreshUndefined: Self = StObject.set(x, "onIonRefresh", js.undefined)
    
    @scala.inline
    def setOnIonStart(value: /* event */ CustomEvent => Unit): Self = StObject.set(x, "onIonStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonStartUndefined: Self = StObject.set(x, "onIonStart", js.undefined)
    
    @scala.inline
    def setPullFactor(value: Double): Self = StObject.set(x, "pullFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullFactorUndefined: Self = StObject.set(x, "pullFactor", js.undefined)
    
    @scala.inline
    def setPullMax(value: Double): Self = StObject.set(x, "pullMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullMaxUndefined: Self = StObject.set(x, "pullMax", js.undefined)
    
    @scala.inline
    def setPullMin(value: Double): Self = StObject.set(x, "pullMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullMinUndefined: Self = StObject.set(x, "pullMin", js.undefined)
    
    @scala.inline
    def setSnapbackDuration(value: String): Self = StObject.set(x, "snapbackDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapbackDurationUndefined: Self = StObject.set(x, "snapbackDuration", js.undefined)
  }
}
