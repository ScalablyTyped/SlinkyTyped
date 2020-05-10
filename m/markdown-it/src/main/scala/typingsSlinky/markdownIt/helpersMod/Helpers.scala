package typingsSlinky.markdownIt.helpersMod

import typingsSlinky.markdownIt.parseLinkDestinationMod.ParseResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Helpers extends js.Object {
  @JSName("parseLinkDestination")
  var parseLinkDestination_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult] = js.native
  @JSName("parseLinkLabel")
  var parseLinkLabel_Original: js.Function3[
    /* state */ typingsSlinky.markdownIt.stateInlineMod.^, 
    /* start */ Double, 
    /* disableNested */ js.UndefOr[Boolean], 
    Double
  ] = js.native
  @JSName("parseLinkTitle")
  var parseLinkTitle_Original: js.Function3[/* str */ String, /* pos */ Double, /* max */ Double, ParseResult] = js.native
  def parseLinkDestination(str: String, pos: Double, max: Double): ParseResult = js.native
  def parseLinkLabel(state: typingsSlinky.markdownIt.stateInlineMod.^, start: Double): Double = js.native
  def parseLinkLabel(state: typingsSlinky.markdownIt.stateInlineMod.^, start: Double, disableNested: Boolean): Double = js.native
  def parseLinkTitle(str: String, pos: Double, max: Double): ParseResult = js.native
}

