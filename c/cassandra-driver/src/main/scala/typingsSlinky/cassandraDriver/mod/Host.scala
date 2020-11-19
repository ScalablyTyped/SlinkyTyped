package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.typesMod.types.Uuid
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Host extends EventEmitter {
  
  var address: String = js.native
  
  def canBeConsideredAsUp(): Boolean = js.native
  
  var cassandraVersion: String = js.native
  
  var datacenter: String = js.native
  
  def getCassandraVersion(): js.Array[Double] = js.native
  
  var hostId: Uuid = js.native
  
  def isUp(): Boolean = js.native
  
  var rack: String = js.native
  
  var tokens: js.Array[String] = js.native
}
