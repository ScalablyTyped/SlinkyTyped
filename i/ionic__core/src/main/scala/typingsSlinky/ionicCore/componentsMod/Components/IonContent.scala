package typingsSlinky.ionicCore.componentsMod.Components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonContent extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * If `true` and the content does not cause an overflow scroll, the scroll interaction will cause a bounce. If the content exceeds the bounds of ionContent, nothing will change. Note, the does not disable the system bounce on iOS. That is an OS level setting.
    */
  var forceOverscroll: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the content will scroll behind the headers and footers. This effect can easily be seen by setting the toolbar to transparent.
    */
  var fullscreen: Boolean = js.native
  
  /**
    * Get the element where the actual scrolling takes place. This element can be used to subscribe to `scroll` events or manually modify `scrollTop`. However, it's recommended to use the API provided by `ion-content`:  i.e. Using `ionScroll`, `ionScrollStart`, `ionScrollEnd` for scrolling events and `scrollToPoint()` to scroll the content into a certain point.
    */
  def getScrollElement(): js.Promise[HTMLElement] = js.native
  
  /**
    * Scroll by a specified X/Y distance in the component.
    * @param x The amount to scroll by on the horizontal axis.
    * @param y The amount to scroll by on the vertical axis.
    * @param duration The amount of time to take scrolling by that amount.
    */
  def scrollByPoint(x: Double, y: Double, duration: Double): js.Promise[Unit] = js.native
  
  /**
    * Because of performance reasons, ionScroll events are disabled by default, in order to enable them and start listening from (ionScroll), set this property to `true`.
    */
  var scrollEvents: Boolean = js.native
  
  /**
    * Scroll to the bottom of the component.
    * @param duration The amount of time to take scrolling to the bottom. Defaults to `0`.
    */
  def scrollToBottom(): js.Promise[Unit] = js.native
  def scrollToBottom(duration: Double): js.Promise[Unit] = js.native
  
  /**
    * Scroll to a specified X/Y location in the component.
    * @param x The point to scroll to on the horizontal axis.
    * @param y The point to scroll to on the vertical axis.
    * @param duration The amount of time to take scrolling to that point. Defaults to `0`.
    */
  def scrollToPoint(): js.Promise[Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: Double, duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: js.UndefOr[scala.Nothing], y: Null, duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Double, y: js.UndefOr[scala.Nothing], duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Double, y: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Double, y: Double, duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Double, y: Null, duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Null, y: js.UndefOr[scala.Nothing], duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Null, y: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Null, y: Double, duration: Double): js.Promise[Unit] = js.native
  def scrollToPoint(x: Null, y: Null, duration: Double): js.Promise[Unit] = js.native
  
  /**
    * Scroll to the top of the component.
    * @param duration The amount of time to take scrolling to the top. Defaults to `0`.
    */
  def scrollToTop(): js.Promise[Unit] = js.native
  def scrollToTop(duration: Double): js.Promise[Unit] = js.native
  
  /**
    * If you want to enable the content scrolling in the X axis, set this property to `true`.
    */
  var scrollX: Boolean = js.native
  
  /**
    * If you want to disable the content scrolling in the Y axis, set this property to `false`.
    */
  var scrollY: Boolean = js.native
}
