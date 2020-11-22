package typingsSlinky.node.anon

import typingsSlinky.node.dnsMod.AnyRecord
import typingsSlinky.node.dnsMod.MxRecord
import typingsSlinky.node.dnsMod.NaptrRecord
import typingsSlinky.node.dnsMod.SoaRecord
import typingsSlinky.node.dnsMod.SrvRecord
import typingsSlinky.node.nodeStrings.A
import typingsSlinky.node.nodeStrings.AAAA
import typingsSlinky.node.nodeStrings.ANY
import typingsSlinky.node.nodeStrings.CNAME
import typingsSlinky.node.nodeStrings.MX
import typingsSlinky.node.nodeStrings.NAPTR
import typingsSlinky.node.nodeStrings.NS
import typingsSlinky.node.nodeStrings.PTR
import typingsSlinky.node.nodeStrings.SOA
import typingsSlinky.node.nodeStrings.SRV
import typingsSlinky.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameRrtype extends js.Object {
  
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  def apply(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}
