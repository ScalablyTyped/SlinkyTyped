package typingsSlinky.jqueryDotAppear.jqueryDotAppearMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jqueryDotAppear.jqueryDotAppearMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait JQuery extends js.Object {
    /**
      * Initialize appear plugin
      */
    def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit]): JQuery = js.native
    def appear[T](callback: js.Function2[/* element */ HTMLElement, /* data */ T, Unit], options: Options[T]): JQuery = js.native
  }
  
}

