package typingsSlinky.heremaps.H.map

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.heremaps.H.map.Imprint.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates the brand, copyright and terms of use elements on the map.
  */
@js.native
trait Imprint_ extends js.Object {
  
  /**
    * Method adds a callback which will be triggered when the object is disposed
    * @param callback {Function}
    * @param opt_scope {Object=}
    */
  def addOnDisposeCallback(callback: js.Function0[Unit]): Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method is used to capture the element view
    * @param canvas {HTMLCanvasElement} - HTML Canvas element to draw the view of the capturable element
    * @param pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
    * @param callback {function(HTMLCanvasElement=)} - Callback function to call once result of the capturing is ready
    * @param opt_errback {function(string)=} - Callback function to call if error occurred during capturing
    */
  def capture(canvas: HTMLCanvasElement, pixelRatio: Double): Unit = js.native
  def capture(
    canvas: HTMLCanvasElement,
    pixelRatio: Double,
    callback: js.UndefOr[scala.Nothing],
    opt_errback: js.Function1[/* s */ String, Unit]
  ): Unit = js.native
  def capture(
    canvas: HTMLCanvasElement,
    pixelRatio: Double,
    callback: js.Function1[/* canvas */ HTMLCanvasElement, Unit]
  ): Unit = js.native
  def capture(
    canvas: HTMLCanvasElement,
    pixelRatio: Double,
    callback: js.Function1[/* canvas */ HTMLCanvasElement, Unit],
    opt_errback: js.Function1[/* s */ String, Unit]
  ): Unit = js.native
  
  /**
    * This method retrieves the copyright string for the current view of the map.
    * @returns {string} - The copyright string for the current map view
    */
  def getCopyrights(): String = js.native
  
  /**
    * To get the CSS style declaration of the imprint DOM element
    * @returns {CSSStyleDeclaration}
    */
  def getStyle(): CSSStyleDeclaration = js.native
  
  /**
    * To set the imprint options. If no opt_options argument is defined then all values are reset to their defaults.
    * @param opt_options {H.map.Imprint.Options=} - The options to style the imprint
    */
  def setOptions(): Unit = js.native
  def setOptions(opt_options: Options): Unit = js.native
}
