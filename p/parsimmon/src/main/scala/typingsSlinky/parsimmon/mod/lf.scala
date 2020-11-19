package typingsSlinky.parsimmon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Equivalent to Parsimmon.string("\n").
  *
  * This parser checks for the "line feed" character, which is used as the line
  * terminator for Linux and macOS text files.
  */
@JSImport("parsimmon", "lf")
@js.native
object lf extends TopLevel[Parser[String]]
