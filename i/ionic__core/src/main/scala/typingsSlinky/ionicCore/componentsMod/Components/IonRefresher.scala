package typingsSlinky.ionicCore.componentsMod.Components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRefresher extends StObject {
  
  /**
    * Changes the refresher's state from `refreshing` to `cancelling`.
    */
  def cancel(): js.Promise[Unit] = js.native
  
  /**
    * Time it takes to close the refresher. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var closeDuration: String = js.native
  
  /**
    * Call `complete()` when your async operation has completed. For example, the `refreshing` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request. Once the data has been received, you then call this method to signify that the refreshing has completed and to close the refresher. This method also changes the refresher's state from `refreshing` to `completing`.
    */
  def complete(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the refresher will be hidden.
    */
  var disabled: Boolean = js.native
  
  /**
    * A number representing how far down the user has pulled. The number `0` represents the user hasn't pulled down at all. The number `1`, and anything greater than `1`, represents that the user has pulled far enough down that when they let go then the refresh will happen. If they let go and the number is less than `1`, then the refresh will not happen, and the content will return to it's original position.
    */
  def getProgress(): js.Promise[Double] = js.native
  
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.  Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var pullFactor: Double = js.native
  
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`. Does not apply when  the refresher content uses a spinner, enabling the native refresher.
    */
  var pullMax: Double = js.native
  
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var pullMin: Double = js.native
  
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  var snapbackDuration: String = js.native
}
object IonRefresher {
  
  @scala.inline
  def apply(
    cancel: () => js.Promise[Unit],
    closeDuration: String,
    complete: () => js.Promise[Unit],
    disabled: Boolean,
    getProgress: () => js.Promise[Double],
    pullFactor: Double,
    pullMax: Double,
    pullMin: Double,
    snapbackDuration: String
  ): IonRefresher = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), closeDuration = closeDuration.asInstanceOf[js.Any], complete = js.Any.fromFunction0(complete), disabled = disabled.asInstanceOf[js.Any], getProgress = js.Any.fromFunction0(getProgress), pullFactor = pullFactor.asInstanceOf[js.Any], pullMax = pullMax.asInstanceOf[js.Any], pullMin = pullMin.asInstanceOf[js.Any], snapbackDuration = snapbackDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRefresher]
  }
  
  @scala.inline
  implicit class IonRefresherMutableBuilder[Self <: IonRefresher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseDuration(value: String): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: () => js.Promise[Unit]): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetProgress(value: () => js.Promise[Double]): Self = StObject.set(x, "getProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPullFactor(value: Double): Self = StObject.set(x, "pullFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullMax(value: Double): Self = StObject.set(x, "pullMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullMin(value: Double): Self = StObject.set(x, "pullMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapbackDuration(value: String): Self = StObject.set(x, "snapbackDuration", value.asInstanceOf[js.Any])
  }
}
