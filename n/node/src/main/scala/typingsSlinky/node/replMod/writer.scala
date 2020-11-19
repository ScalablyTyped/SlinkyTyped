package typingsSlinky.node.replMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the default "writer" value, if none is passed in the REPL options,
  * and it can be overridden by custom print functions.
  */
@JSImport("repl", "writer")
@js.native
object writer extends TopLevel[REPLWriter with Options]
