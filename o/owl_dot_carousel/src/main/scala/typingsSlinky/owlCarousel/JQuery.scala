package typingsSlinky.owlCarousel

import typingsSlinky.owlCarousel.OwlCarousel.HandlerCallback
import typingsSlinky.owlCarousel.OwlCarousel.OnEvent
import typingsSlinky.owlCarousel.OwlCarousel.Options
import typingsSlinky.owlCarousel.OwlCarousel.TriggerEvent
import typingsSlinky.owlCarousel.owlCarouselStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def on(event: OnEvent, handler: HandlerCallback): JQuery = js.native
  def owlCarousel(): JQuery = js.native
  def owlCarousel(options: Options): JQuery = js.native
  @JSName("owlCarousel")
  def owlCarousel_destroy(options: destroy): JQuery = js.native
  def trigger(event: TriggerEvent): JQuery = js.native
}

