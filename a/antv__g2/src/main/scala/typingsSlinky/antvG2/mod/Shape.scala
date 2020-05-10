package typingsSlinky.antvG2.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.antvG2.AnonDraw
import typingsSlinky.antvG2.AnonDrawShape
import typingsSlinky.antvG2.AnonParsePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var getLinearValue: js.UndefOr[js.Function1[/* percent */ js.Any, _]] = js.native
  var registerShape: js.UndefOr[
    js.Function3[
      /* chartType */ String, 
      /* shapeName */ String, 
      /* config */ AnonDraw | AnonDrawShape, 
      AnonParsePath
    ]
  ] = js.native
}

@JSImport("@antv/g2", "Shape")
@js.native
object Shape extends TopLevel[Shape]

