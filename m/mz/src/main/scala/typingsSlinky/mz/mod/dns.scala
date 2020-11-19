package typingsSlinky.mz.mod

import typingsSlinky.mz.mzStrings.A
import typingsSlinky.mz.mzStrings.AAAA
import typingsSlinky.mz.mzStrings.ANY
import typingsSlinky.mz.mzStrings.CNAME
import typingsSlinky.mz.mzStrings.MX
import typingsSlinky.mz.mzStrings.NAPTR
import typingsSlinky.mz.mzStrings.NS
import typingsSlinky.mz.mzStrings.PTR
import typingsSlinky.mz.mzStrings.SOA
import typingsSlinky.mz.mzStrings.SRV
import typingsSlinky.mz.mzStrings.TXT
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Hostname
import typingsSlinky.node.dnsMod.AnyRecord
import typingsSlinky.node.dnsMod.LookupAddress
import typingsSlinky.node.dnsMod.LookupAllOptions
import typingsSlinky.node.dnsMod.LookupOneOptions
import typingsSlinky.node.dnsMod.LookupOptions
import typingsSlinky.node.dnsMod.MxRecord
import typingsSlinky.node.dnsMod.NaptrRecord
import typingsSlinky.node.dnsMod.RecordWithTtl
import typingsSlinky.node.dnsMod.ResolveOptions
import typingsSlinky.node.dnsMod.ResolveWithTtlOptions
import typingsSlinky.node.dnsMod.SoaRecord
import typingsSlinky.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "dns")
@js.native
object dns extends js.Object {
  
  // Supported getaddrinfo flags.
  val ADDRCONFIG: Double = js.native
  
  val ADDRGETNETWORKPARAMS: String = js.native
  
  /**
    * If `dns.V4MAPPED` is specified, return resolved IPv6 addresses as
    * well as IPv4 mapped IPv6 addresses.
    */
  val ALL: Double = js.native
  
  val BADFAMILY: String = js.native
  
  val BADFLAGS: String = js.native
  
  val BADHINTS: String = js.native
  
  val BADNAME: String = js.native
  
  val BADQUERY: String = js.native
  
  val BADRESP: String = js.native
  
  val BADSTR: String = js.native
  
  val CANCELLED: String = js.native
  
  val CONNREFUSED: String = js.native
  
  val DESTRUCTION: String = js.native
  
  val EOF: String = js.native
  
  val FILE: String = js.native
  
  val FORMERR: String = js.native
  
  val LOADIPHLPAPI: String = js.native
  
  // Error codes
  val NODATA: String = js.native
  
  val NOMEM: String = js.native
  
  val NONAME: String = js.native
  
  val NOTFOUND: String = js.native
  
  val NOTIMP: String = js.native
  
  val NOTINITIALIZED: String = js.native
  
  val REFUSED: String = js.native
  
  val SERVFAIL: String = js.native
  
  val TIMEOUT: String = js.native
  
  val V4MAPPED: Double = js.native
  
  def getServers(): js.Array[String] = js.native
  
  def lookup(hostname: String): js.Promise[js.Tuple2[String, Double]] = js.native
  def lookup(
    hostname: String,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def lookup(
    hostname: String,
    family: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def lookup(hostname: String, options: Double): js.Promise[js.Tuple2[String, Double]] = js.native
  def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  def lookup(
    hostname: String,
    options: LookupAllOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
  ): Unit = js.native
  def lookup(hostname: String, options: LookupOneOptions): js.Promise[js.Tuple2[String, Double]] = js.native
  def lookup(
    hostname: String,
    // `options` can't be mixed into `family`
  // tslint:disable-next-line: unified-signatures
  options: LookupOneOptions,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def lookup(hostname: String, options: LookupOptions): js.Promise[(js.Tuple2[String, Double]) | js.Array[LookupAddress]] = js.native
  def lookup(
    hostname: String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  
  def lookupService(address: String, port: Double): js.Promise[js.Tuple2[String, String]] = js.native
  def lookupService(
    address: String,
    port: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
  ): Unit = js.native
  
  def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  def resolve(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  
  def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve4(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def resolve4(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = js.native
  def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolve4(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  
  def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve6(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def resolve6(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = js.native
  def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolve6(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  
  def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
  def resolveAny(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  
  def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolveCname(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  
  def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
  def resolveMx(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  
  def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
  def resolveNaptr(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  
  def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolveNs(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  
  def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolvePtr(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  
  def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
  def resolveSoa(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  
  def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
  def resolveSrv(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  
  def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
  def resolveTxt(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  
  @JSName("resolve")
  def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_A(
    hostname: String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_AAAA(
    hostname: String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("resolve")
  def resolve_ANY(
    hostname: String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_CNAME(
    hostname: String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("resolve")
  def resolve_MX(
    hostname: String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("resolve")
  def resolve_NAPTR(
    hostname: String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_NS(
    hostname: String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_PTR(
    hostname: String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("resolve")
  def resolve_SOA(
    hostname: String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("resolve")
  def resolve_SRV(
    hostname: String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
  @JSName("resolve")
  def resolve_TXT(
    hostname: String,
    rrtype: TXT,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  
  def reverse(ip: String): js.Promise[js.Array[String]] = js.native
  def reverse(
    ip: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* domains */ js.Array[String], Unit]
  ): Unit = js.native
  
  def setServers(servers: js.Array[String]): Unit = js.native
  
  @js.native
  class Resolver ()
    extends typingsSlinky.node.dnsMod.Resolver
  
  @js.native
  object promises extends js.Object {
    
    def getServers(): js.Array[String] = js.native
    
    def lookup(hostname: String): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
    def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
    
    def lookupService(address: String, port: Double): js.Promise[Hostname] = js.native
    
    def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = js.native
    
    def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
    
    def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
    
    def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
    
    def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
    
    def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
    
    def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
    
    def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
    
    def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
    
    def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
    
    @JSName("resolve")
    def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolve")
    def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolve")
    def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolve")
    def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
    
    def reverse(ip: String): js.Promise[js.Array[String]] = js.native
    
    def setServers(servers: js.Array[String]): Unit = js.native
    
    @js.native
    class Resolver ()
      extends typingsSlinky.node.dnsMod.promises.Resolver
  }
}
