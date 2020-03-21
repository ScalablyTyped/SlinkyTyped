package typingsSlinky.homeworks

import typingsSlinky.homeworks.homeworks.CheckboxOptions
import typingsSlinky.homeworks.homeworks.ConverterOptions
import typingsSlinky.homeworks.homeworks.DropdownOptions
import typingsSlinky.homeworks.homeworks.InputOptions
import typingsSlinky.homeworks.homeworks.RippleEvent
import typingsSlinky.homeworks.homeworks.RippleStartEventType
import typingsSlinky.homeworks.homeworks.SpinnerOptions
import typingsSlinky.homeworks.homeworks.StepEvent
import typingsSlinky.homeworks.homeworks.StepMoveEventType
import typingsSlinky.homeworks.homeworks.StepOptions
import typingsSlinky.homeworks.homeworks.TabEvent
import typingsSlinky.homeworks.homeworks.TabMoveEventType
import typingsSlinky.homeworks.homeworks.TabOptions
import typingsSlinky.homeworks.homeworks.ToggleOptions
import typingsSlinky.homeworks.homeworks.UploadOptions
import typingsSlinky.jquery.JQuery_.EventHandlerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * @since 1.0.0
    * @summary dropdown method
    */
  def addHandler(target: JQuery): JQuery = js.native
  /**
    * jQuery homeworks chaining functions
    */
  /**
    * @since 1.0.0
    */
  def bind(eventType: String, handler: js.Function1[/* repeated */ js.Any, Unit]): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def checkbox(): JQuery = js.native
  def checkbox(options: CheckboxOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def converter(): JQuery = js.native
  def converter(options: ConverterOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def dropdown(): JQuery = js.native
  def dropdown(options: DropdownOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def input(): JQuery = js.native
  def input(options: InputOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def knock(): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def modal(): JQuery = js.native
  def modal(method: String): JQuery = js.native
  def modal(method: String, options: js.Any): JQuery = js.native
  def modal(options: js.Any): JQuery = js.native
  /**
    * jQuery homeworks events
    */
  /**
    * @since 1.0.44
    */
  def on(event: StepMoveEventType | TabMoveEventType, handler: EventHandlerBase[_, StepEvent | TabEvent]): JQuery = js.native
  /**
    * @since 1.0.44
    */
  def on(event: RippleStartEventType, handler: EventHandlerBase[_, RippleEvent]): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def ripple(): JQuery = js.native
  def ripple(options: js.Any): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def spinner(): JQuery = js.native
  def spinner(options: SpinnerOptions): JQuery = js.native
  /**
    * @since 1.0.0
    * @summary ripple method
    */
  def start(): JQuery = js.native
  def start(event: RippleEvent): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def step(): JQuery = js.native
  def step(method: String): JQuery = js.native
  def step(options: StepOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def tab(): JQuery = js.native
  def tab(method: String): JQuery = js.native
  def tab(options: TabOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def toggle(options: ToggleOptions): JQuery = js.native
  /**
    * @since 1.0.0
    */
  def upload(): JQuery = js.native
  def upload(options: UploadOptions): JQuery = js.native
}

