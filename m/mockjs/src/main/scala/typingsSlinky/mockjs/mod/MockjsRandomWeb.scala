package typingsSlinky.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockjsRandomWeb extends js.Object {
  
  // Random.domain
  def domain(): S = js.native
  
  // Random.tld
  def dtl(): S = js.native
  
  // Random.email
  def email(): S = js.native
  def email(domain: S): S = js.native
  
  // Random.ip
  def ip(): S = js.native
  
  // Random.protocol
  def protocal(): RandomWebProtocal = js.native
  
  // Random.url
  def url(): S = js.native
  def url(protocol: js.UndefOr[scala.Nothing], host: S): S = js.native
  def url(protocol: S): S = js.native
  def url(protocol: S, host: S): S = js.native
}
