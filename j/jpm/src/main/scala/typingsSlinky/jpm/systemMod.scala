package typingsSlinky.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Query the add-on's environment and access arguments passed to it
  */
@JSImport("sdk/system", JSImport.Namespace)
@js.native
object systemMod extends js.Object {
  
  val architecture: String = js.native
  
  val build: String = js.native
  
  val compiler: String = js.native
  
  val env: js.Any = js.native
  
  def exit(code: Double): Unit = js.native
  
  val id: String = js.native
  
  val name: String = js.native
  
  def pathFor(id: String): String = js.native
  
  val platform: String = js.native
  
  val platformVersion: String = js.native
  
  val vendor: String = js.native
  
  val version: String = js.native
}
