package typingsSlinky.askmethatRating.mod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MutationRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("askmethat-rating", "AskmethatRating")
@js.native
class AskmethatRating protected () extends js.Object {
  /**
    * constructor with div element, default rating value & default options
    *
    * @param element This is the html container for the rating elements
    * @param defaultValue Default value set when the plugin render the rating
    * @param options Default option base on AskmethatRatingOptions type
    */
  def this(element: HTMLDivElement) = this()
  def this(element: HTMLDivElement, defaultValue: Double) = this()
  def this(element: HTMLDivElement, defaultValue: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(element: HTMLDivElement, defaultValue: Double, options: js.Any) = this()
  
  /**
    * Default option base on @type IAskmethatRatingOptions
    */
  var _defaultOptions: js.Any = js.native
  
  var changeEvent: js.Any = js.native
  
  /**
    * @function get the default option for the rating
    *
    * @return  options based on @type AskmethatRatingOptions
    */
  /**
    * @function set the default option for the rating
    *
    * @return  options based on @type AskmethatRatingOptions
    */
  var defaultOptions: AskmethatRatingOptions = js.native
  
  /**
    * @function Calculate the value according to the step provided in options
    * @param  {Number} value:number the current value
    * @return {Number} the new value according to step
    */
  /* protected */ def getValueAccordingToStep(value: Double): Double = js.native
  
  /**
    * Init popover if needed
    */
  /* private */ def initPopover(): js.Any = js.native
  
  var mouseMove: js.Any = js.native
  
  /**
    * This is fired by mutation observer when an attribute changed in the hidden input
    * Is protected to have some unit tests
    *
    * @param mutations list of mutations record
    */
  /* protected */ def mutationDisableEvent(mutations: js.Array[MutationRecord]): Unit = js.native
  
  /**
    * Check if disabled attribute is added or removed from the input
    * Update readonly status if needed for the rating
    */
  /* private */ def mutationEvent(): js.Any = js.native
  
  /**
    * @function mouse out event in rating
    * @param  {type} event?: Event {event}
    */
  /* private */ def onMouseLeave(event: js.Any): js.Any = js.native
  
  /**
    * @function mouse event enter in rating
    * @param  {type} event?: Event {event}
    */
  /* private */ def onMouseMove(event: js.Any): js.Any = js.native
  
  /**
    * @function when a rating is clicked
    * @param  {type} event : Event {event object}
    */
  /* private */ def onRatingClick(event: js.Any): js.Any = js.native
  
  var pValue: js.Any = js.native
  
  var parentElement: js.Any = js.native
  
  var ratingClick: js.Any = js.native
  
  /**
    * render a new rating, by default value is the minRating
    *
    * @param value this is the default value set when the plugin is rendered, by default IAskmethatRatingOptions.minRating
    */
  def render(): Unit = js.native
  def render(value: Double): Unit = js.native
  
  /**
    * @function set or unset the active class and color
    * @param  {HTMLSpanElement} current :  current span element
    * @param  {number} current :  value needed for the if
    */
  /* protected */ def setOrUnsetActive(value: Double): Unit = js.native
  
  var styleSheet: js.Any = js.native
  
  /**
    * @function get the current value for the rating
    */
  /**
    * @function set a new value for the rating
    *
    * @param _value this is the new value you want to set to the rating
    * @returns the current number
    */
  var value: Double = js.native
}
/* static members */
@JSImport("askmethat-rating", "AskmethatRating")
@js.native
object AskmethatRating extends js.Object {
  
  /**
    * @function static method to retrieve with identifier the value
    * @param  {string} identifier: string container identifier
    * @return {number} current rating
    */
  def value(identifier: String): Double = js.native
}
