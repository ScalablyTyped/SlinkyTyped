package typingsSlinky.dotObject

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.dotObject.DotObject.Dot
import typingsSlinky.dotObject.DotObject.DotConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class dot protected () extends Dot {
    def this(separator: String) = this()
  }
  
  @js.native
  object dot extends TopLevel[DotConstructor]
  
}

