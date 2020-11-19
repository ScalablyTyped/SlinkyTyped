package typingsSlinky.materialUiCore.transitionsMod

import typingsSlinky.materialUiCore.anon.Partialdurationnumberstri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transitions extends js.Object {
  
  def create(props: String): String = js.native
  def create(props: String, options: Partialdurationnumberstri): String = js.native
  def create(props: js.Array[String]): String = js.native
  def create(props: js.Array[String], options: Partialdurationnumberstri): String = js.native
  
  var duration: Duration_ = js.native
  
  var easing: Easing_ = js.native
  
  def getAutoHeightDuration(height: Double): Double = js.native
}
