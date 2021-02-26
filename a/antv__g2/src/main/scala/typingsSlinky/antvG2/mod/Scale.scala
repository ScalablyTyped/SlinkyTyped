package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Strings.cat
import typingsSlinky.antvG2.antvG2Strings.identity
import typingsSlinky.antvG2.antvG2Strings.linear
import typingsSlinky.antvG2.antvG2Strings.log
import typingsSlinky.antvG2.antvG2Strings.pow
import typingsSlinky.antvG2.antvG2Strings.time
import typingsSlinky.antvG2.antvG2Strings.timeCat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * config interface
  */
@JSImport("@antv/g2", "Scale")
@js.native
class Scale[T] () extends StObject {
  
  var alias: js.UndefOr[String | Double] = js.native
  
  var formatter: js.UndefOr[js.Function1[/* value */ T, String]] = js.native
  
  var getText: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.native
  
  var getTicks: js.UndefOr[js.Function0[js.Array[_]]] = js.native
  
  var invert: js.UndefOr[js.Function1[/* n */ Double, T]] = js.native
  
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var scale: js.UndefOr[js.Function1[/* value */ T, Double]] = js.native
  
  var tickCount: js.UndefOr[Double] = js.native
  
  var ticks: js.UndefOr[js.Array[_]] = js.native
  
  var `type`: js.UndefOr[identity | linear | cat | time | timeCat | log | pow] = js.native
}
