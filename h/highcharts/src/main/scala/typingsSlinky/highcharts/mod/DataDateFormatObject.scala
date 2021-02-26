package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Structure for alternative date formats to parse.
  */
@js.native
trait DataDateFormatObject extends StObject {
  
  var alternative: js.UndefOr[String] = js.native
  
  def parser(`match`: js.Array[Double]): Double = js.native
  @JSName("parser")
  var parser_Original: typingsSlinky.highcharts.dataMod.highchartsAugmentingMod.DataDateFormatCallbackFunction = js.native
  
  var regex: js.RegExp = js.native
}
