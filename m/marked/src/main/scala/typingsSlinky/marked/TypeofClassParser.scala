package typingsSlinky.marked

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.marked.markedMod.MarkedOptions
import typingsSlinky.marked.markedMod.Parser
import typingsSlinky.marked.markedMod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassParser
  extends Instantiable0[Parser]
     with Instantiable1[/* options */ MarkedOptions, Parser] {
  def parse(src: TokensList): String = js.native
  def parse(src: TokensList, options: MarkedOptions): String = js.native
}

