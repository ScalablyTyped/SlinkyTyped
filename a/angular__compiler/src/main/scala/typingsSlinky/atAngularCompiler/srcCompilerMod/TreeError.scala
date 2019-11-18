package typingsSlinky.atAngularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TreeError")
@js.native
class TreeError protected ()
  extends typingsSlinky.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.TreeError {
  def this(
    elementName: String,
    span: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
  def this(
    elementName: Null,
    span: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/src/compiler", "TreeError")
@js.native
object TreeError extends js.Object {
  def create(
    elementName: String,
    span: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ): typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
  def create(
    elementName: Null,
    span: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan,
    msg: String
  ): typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
}

