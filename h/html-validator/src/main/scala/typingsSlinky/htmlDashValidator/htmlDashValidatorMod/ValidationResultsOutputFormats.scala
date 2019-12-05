package typingsSlinky.htmlDashValidator.htmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValidationResultsOutputFormats extends js.Object

// Could be used to avoid string literals
@JSImport("html-validator", "ValidationResultsOutputFormats")
@js.native
object ValidationResultsOutputFormats extends js.Object {
  @js.native
  sealed trait gnu extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait html extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait json extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait text extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait xhtml extends ValidationResultsOutputFormats
  
  @js.native
  sealed trait xml extends ValidationResultsOutputFormats
  
  /* "gnu" */ val gnu: typingsSlinky.htmlDashValidator.htmlDashValidatorMod.ValidationResultsOutputFormats.gnu with String = js.native
  /* "html" */ val html: typingsSlinky.htmlDashValidator.htmlDashValidatorMod.ValidationResultsOutputFormats.html with String = js.native
  /* "json" */ val json: typingsSlinky.htmlDashValidator.htmlDashValidatorMod.ValidationResultsOutputFormats.json with String = js.native
  /* "text" */ val text: typingsSlinky.htmlDashValidator.htmlDashValidatorMod.ValidationResultsOutputFormats.text with String = js.native
  /* "xhtml" */ val xhtml: typingsSlinky.htmlDashValidator.htmlDashValidatorMod.ValidationResultsOutputFormats.xhtml with String = js.native
  /* "xml" */ val xml: typingsSlinky.htmlDashValidator.htmlDashValidatorMod.ValidationResultsOutputFormats.xml with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ValidationResultsOutputFormats with String] = js.native
}

