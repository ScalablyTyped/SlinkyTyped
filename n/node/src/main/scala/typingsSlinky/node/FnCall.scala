package typingsSlinky.node

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
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
    ]) | SoaRecord
  ] = js.native
  def apply(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  def apply(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  def apply(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

