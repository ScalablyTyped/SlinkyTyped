package typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSImport("node-forge", "asn1.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait BITSTRING extends Type
  
  @js.native
  sealed trait BMPSTRING extends Type
  
  @js.native
  sealed trait BOOLEAN extends Type
  
  @js.native
  sealed trait EMBEDDED extends Type
  
  @js.native
  sealed trait ENUMERATED extends Type
  
  @js.native
  sealed trait EXTERNAL extends Type
  
  @js.native
  sealed trait GENERALIZEDTIME extends Type
  
  @js.native
  sealed trait IA5STRING extends Type
  
  @js.native
  sealed trait INTEGER extends Type
  
  @js.native
  sealed trait NONE extends Type
  
  @js.native
  sealed trait NULL extends Type
  
  @js.native
  sealed trait OCTETSTRING extends Type
  
  @js.native
  sealed trait ODESC extends Type
  
  @js.native
  sealed trait OID extends Type
  
  @js.native
  sealed trait PRINTABLESTRING extends Type
  
  @js.native
  sealed trait REAL extends Type
  
  @js.native
  sealed trait ROID extends Type
  
  @js.native
  sealed trait SEQUENCE extends Type
  
  @js.native
  sealed trait SET extends Type
  
  @js.native
  sealed trait UTCTIME extends Type
  
  @js.native
  sealed trait UTF8 extends Type
  
  /* 3 */ val BITSTRING: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.BITSTRING with Double = js.native
  /* 30 */ val BMPSTRING: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.BMPSTRING with Double = js.native
  /* 1 */ val BOOLEAN: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.BOOLEAN with Double = js.native
  /* 11 */ val EMBEDDED: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.EMBEDDED with Double = js.native
  /* 10 */ val ENUMERATED: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.ENUMERATED with Double = js.native
  /* 8 */ val EXTERNAL: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.EXTERNAL with Double = js.native
  /* 24 */ val GENERALIZEDTIME: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.GENERALIZEDTIME with Double = js.native
  /* 22 */ val IA5STRING: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.IA5STRING with Double = js.native
  /* 2 */ val INTEGER: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.INTEGER with Double = js.native
  /* 0 */ val NONE: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.NONE with Double = js.native
  /* 5 */ val NULL: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.NULL with Double = js.native
  /* 4 */ val OCTETSTRING: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.OCTETSTRING with Double = js.native
  /* 7 */ val ODESC: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.ODESC with Double = js.native
  /* 6 */ val OID: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.OID with Double = js.native
  /* 19 */ val PRINTABLESTRING: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.PRINTABLESTRING with Double = js.native
  /* 9 */ val REAL: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.REAL with Double = js.native
  /* 13 */ val ROID: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.ROID with Double = js.native
  /* 16 */ val SEQUENCE: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.SEQUENCE with Double = js.native
  /* 17 */ val SET: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.SET with Double = js.native
  /* 23 */ val UTCTIME: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.UTCTIME with Double = js.native
  /* 12 */ val UTF8: typingsSlinky.nodeDashForge.nodeDashForgeMod.asn1.Type.UTF8 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
}

