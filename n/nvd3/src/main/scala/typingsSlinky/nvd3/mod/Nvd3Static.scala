package typingsSlinky.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nvd3Static extends js.Object {
  
  def addGraph[TChart /* <: Nvd3Element */](factory: ChartFactory[TChart]): Unit = js.native
  def addGraph[TChart /* <: Nvd3Element */](generate: js.Function0[TChart]): Unit = js.native
  def addGraph[TChart /* <: Nvd3Element */](generate: js.Function0[TChart], callBack: js.Function1[/* chart */ TChart, Unit]): Unit = js.native
  
  /*stores all the ready to use charts*/
  var charts: js.Any = js.native
  
  /*set to false in production*/
  var dev: Boolean = js.native
  
  //returns last argument
  def log(arg: js.Array[_]): js.Any = js.native
  def log(topic: String): String = js.native
  def log(topic: String, value: String): String = js.native
  
  /*stores some statistics and potential error messages*/
  var logs: js.Any = js.native
  
  var models: Models = js.native
  
  var tooltip: Nvd3TooltipStatic = js.native
  
  var utils: Utils = js.native
}
