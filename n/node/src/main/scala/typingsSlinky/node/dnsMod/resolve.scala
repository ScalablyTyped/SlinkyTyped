package typingsSlinky.node.dnsMod

import typingsSlinky.node.NodeJS.ErrnoException
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

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("dns", "resolve")
@js.native
object resolve extends js.Object {
  def apply(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  def apply(
    hostname: String,
    rrtype: TXT,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
  def __promisify__(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  @JSName("__promisify__")
  def __promisify___A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("__promisify__")
  def __promisify___SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}

