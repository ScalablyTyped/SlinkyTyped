package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`waiting-for-target`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.finished
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.running
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewAnimation
  extends Accessor
     with corePromise {
  
  /**
    * Finishes the view animation by immediately going to the target and sets the state of the animation to `finished`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#finish)
    */
  def finish(): Unit = js.native
  
  /**
    * The state of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#state)
    */
  val state: running | finished | stopped | `waiting-for-target` = js.native
  
  /**
    * Stops the view animation at its current state and sets the state of the animation to `stopped`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#stop)
    */
  def stop(): Unit = js.native
  
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#target)
    */
  var target: Viewpoint = js.native
}
