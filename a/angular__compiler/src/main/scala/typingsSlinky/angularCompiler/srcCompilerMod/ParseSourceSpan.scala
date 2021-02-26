package typingsSlinky.angularCompiler.srcCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ParseSourceSpan")
@js.native
class ParseSourceSpan protected ()
  extends typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan {
  /**
    * Create an object that holds information about spans of tokens/nodes captured during
    * lexing/parsing of text.
    *
    * @param start
    * The location of the start of the span (having skipped leading trivia).
    * Skipping leading trivia makes source-spans more "user friendly", since things like HTML
    * elements will appear to begin at the start of the opening tag, rather than at the start of any
    * leading trivia, which could include newlines.
    *
    * @param end
    * The location of the end of the span.
    *
    * @param fullStart
    * The start of the token without skipping the leading trivia.
    * This is used by tooling that splits tokens further, such as extracting Angular interpolations
    * from text tokens. Such tooling creates new source-spans relative to the original token's
    * source-span. If leading trivia characters have been skipped then the new source-spans may be
    * incorrectly offset.
    *
    * @param details
    * Additional information (such as identifier names) that should be associated with the span.
    */
  def this(
    start: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation
  ) = this()
  def this(
    start: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    fullStart: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation
  ) = this()
  def this(
    start: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    fullStart: js.UndefOr[scala.Nothing],
    details: String
  ) = this()
  def this(
    start: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    end: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    fullStart: typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation,
    details: String
  ) = this()
}
