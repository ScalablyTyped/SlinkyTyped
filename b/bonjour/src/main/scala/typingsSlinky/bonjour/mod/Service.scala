package typingsSlinky.bonjour.mod

import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends EventEmitter {
  
  var fqdn: String = js.native
  
  var host: String = js.native
  
  var name: String = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  var published: Boolean = js.native
  
  def start(): Unit = js.native
  
  def stop(cb: js.Function0[_]): Unit = js.native
  
  var subtypes: js.Array[String] = js.native
  
  var txt: js.Object = js.native
  
  var `type`: String = js.native
}
