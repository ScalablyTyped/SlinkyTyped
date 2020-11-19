package typingsSlinky.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * <ul>
  *     <li><b>issue</b> a issue occurred on a server, we are going to attempt a retry next.</li>
  *     <li><b>failure</b> a server has been marked as failure or dead.</li>
  *     <li><b>reconnecting</b> we are going to attempt to reconnect the to the failed server.</li>
  *     <li><b>reconnect</b> successfully reconnected to the memcached server.</li>
  *     <li><b>remove</b> removing the server from our consistent hashing.</li>
  * </ul>
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.memcached.memcachedStrings.issue
  - typingsSlinky.memcached.memcachedStrings.failure
  - typingsSlinky.memcached.memcachedStrings.reconnecting
  - typingsSlinky.memcached.memcachedStrings.reconnect
  - typingsSlinky.memcached.memcachedStrings.remove
*/
trait EventNames extends js.Object
object EventNames {
  
  @scala.inline
  def failure: typingsSlinky.memcached.memcachedStrings.failure = "failure".asInstanceOf[typingsSlinky.memcached.memcachedStrings.failure]
  
  @scala.inline
  def issue: typingsSlinky.memcached.memcachedStrings.issue = "issue".asInstanceOf[typingsSlinky.memcached.memcachedStrings.issue]
  
  @scala.inline
  def reconnect: typingsSlinky.memcached.memcachedStrings.reconnect = "reconnect".asInstanceOf[typingsSlinky.memcached.memcachedStrings.reconnect]
  
  @scala.inline
  def reconnecting: typingsSlinky.memcached.memcachedStrings.reconnecting = "reconnecting".asInstanceOf[typingsSlinky.memcached.memcachedStrings.reconnecting]
  
  @scala.inline
  def remove: typingsSlinky.memcached.memcachedStrings.remove = "remove".asInstanceOf[typingsSlinky.memcached.memcachedStrings.remove]
}
