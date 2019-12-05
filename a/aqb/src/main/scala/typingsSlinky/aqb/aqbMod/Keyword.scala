package typingsSlinky.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyword
  extends Expression
     with Instantiable1[/* value */ js.Any, Expression] {
  var _value: String = js.native
  var re: js.RegExp = js.native
  def toAQL(): String = js.native
}

