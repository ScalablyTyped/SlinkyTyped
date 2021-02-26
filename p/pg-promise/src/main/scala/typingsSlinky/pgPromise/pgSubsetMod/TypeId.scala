package typingsSlinky.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeId extends StObject
// Type id-s supported by PostgreSQL, copied from:
// http://github.com/brianc/node-pg-types/blob/master/lib/builtins.js
@JSImport("pg-promise/typescript/pg-subset", "TypeId")
@js.native
object TypeId extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId with Double] = js.native
  
  @js.native
  sealed trait ABSTIME extends TypeId
  /* 702 */ val ABSTIME: typingsSlinky.pgPromise.pgSubsetMod.TypeId.ABSTIME with Double = js.native
  
  @js.native
  sealed trait ACLITEM extends TypeId
  /* 1033 */ val ACLITEM: typingsSlinky.pgPromise.pgSubsetMod.TypeId.ACLITEM with Double = js.native
  
  @js.native
  sealed trait BIT extends TypeId
  /* 1560 */ val BIT: typingsSlinky.pgPromise.pgSubsetMod.TypeId.BIT with Double = js.native
  
  @js.native
  sealed trait BOOL extends TypeId
  /* 16 */ val BOOL: typingsSlinky.pgPromise.pgSubsetMod.TypeId.BOOL with Double = js.native
  
  @js.native
  sealed trait BPCHAR extends TypeId
  /* 1042 */ val BPCHAR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.BPCHAR with Double = js.native
  
  @js.native
  sealed trait BYTEA extends TypeId
  /* 17 */ val BYTEA: typingsSlinky.pgPromise.pgSubsetMod.TypeId.BYTEA with Double = js.native
  
  @js.native
  sealed trait CHAR extends TypeId
  /* 18 */ val CHAR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.CHAR with Double = js.native
  
  @js.native
  sealed trait CID extends TypeId
  /* 29 */ val CID: typingsSlinky.pgPromise.pgSubsetMod.TypeId.CID with Double = js.native
  
  @js.native
  sealed trait CIDR extends TypeId
  /* 650 */ val CIDR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.CIDR with Double = js.native
  
  @js.native
  sealed trait CIRCLE extends TypeId
  /* 718 */ val CIRCLE: typingsSlinky.pgPromise.pgSubsetMod.TypeId.CIRCLE with Double = js.native
  
  @js.native
  sealed trait DATE extends TypeId
  /* 1082 */ val DATE: typingsSlinky.pgPromise.pgSubsetMod.TypeId.DATE with Double = js.native
  
  @js.native
  sealed trait FLOAT4 extends TypeId
  /* 700 */ val FLOAT4: typingsSlinky.pgPromise.pgSubsetMod.TypeId.FLOAT4 with Double = js.native
  
  @js.native
  sealed trait FLOAT8 extends TypeId
  /* 701 */ val FLOAT8: typingsSlinky.pgPromise.pgSubsetMod.TypeId.FLOAT8 with Double = js.native
  
  @js.native
  sealed trait GTSVECTOR extends TypeId
  /* 3642 */ val GTSVECTOR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.GTSVECTOR with Double = js.native
  
  @js.native
  sealed trait INET extends TypeId
  /* 869 */ val INET: typingsSlinky.pgPromise.pgSubsetMod.TypeId.INET with Double = js.native
  
  @js.native
  sealed trait INT2 extends TypeId
  /* 21 */ val INT2: typingsSlinky.pgPromise.pgSubsetMod.TypeId.INT2 with Double = js.native
  
  @js.native
  sealed trait INT4 extends TypeId
  /* 23 */ val INT4: typingsSlinky.pgPromise.pgSubsetMod.TypeId.INT4 with Double = js.native
  
  @js.native
  sealed trait INT8 extends TypeId
  /* 20 */ val INT8: typingsSlinky.pgPromise.pgSubsetMod.TypeId.INT8 with Double = js.native
  
  @js.native
  sealed trait INTERVAL extends TypeId
  /* 1186 */ val INTERVAL: typingsSlinky.pgPromise.pgSubsetMod.TypeId.INTERVAL with Double = js.native
  
  @js.native
  sealed trait JSON extends TypeId
  /* 114 */ val JSON: typingsSlinky.pgPromise.pgSubsetMod.TypeId.JSON with Double = js.native
  
  @js.native
  sealed trait JSONB extends TypeId
  /* 3802 */ val JSONB: typingsSlinky.pgPromise.pgSubsetMod.TypeId.JSONB with Double = js.native
  
  @js.native
  sealed trait MACADDR extends TypeId
  /* 829 */ val MACADDR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.MACADDR with Double = js.native
  
  @js.native
  sealed trait MACADDR8 extends TypeId
  /* 774 */ val MACADDR8: typingsSlinky.pgPromise.pgSubsetMod.TypeId.MACADDR8 with Double = js.native
  
  @js.native
  sealed trait MONEY extends TypeId
  /* 790 */ val MONEY: typingsSlinky.pgPromise.pgSubsetMod.TypeId.MONEY with Double = js.native
  
  @js.native
  sealed trait NUMERIC extends TypeId
  /* 1700 */ val NUMERIC: typingsSlinky.pgPromise.pgSubsetMod.TypeId.NUMERIC with Double = js.native
  
  @js.native
  sealed trait OID extends TypeId
  /* 26 */ val OID: typingsSlinky.pgPromise.pgSubsetMod.TypeId.OID with Double = js.native
  
  @js.native
  sealed trait PATH extends TypeId
  /* 602 */ val PATH: typingsSlinky.pgPromise.pgSubsetMod.TypeId.PATH with Double = js.native
  
  @js.native
  sealed trait PG_DEPENDENCIES extends TypeId
  /* 3402 */ val PG_DEPENDENCIES: typingsSlinky.pgPromise.pgSubsetMod.TypeId.PG_DEPENDENCIES with Double = js.native
  
  @js.native
  sealed trait PG_LSN extends TypeId
  /* 3220 */ val PG_LSN: typingsSlinky.pgPromise.pgSubsetMod.TypeId.PG_LSN with Double = js.native
  
  @js.native
  sealed trait PG_NDISTINCT extends TypeId
  /* 3361 */ val PG_NDISTINCT: typingsSlinky.pgPromise.pgSubsetMod.TypeId.PG_NDISTINCT with Double = js.native
  
  @js.native
  sealed trait PG_NODE_TREE extends TypeId
  /* 194 */ val PG_NODE_TREE: typingsSlinky.pgPromise.pgSubsetMod.TypeId.PG_NODE_TREE with Double = js.native
  
  @js.native
  sealed trait POLYGON extends TypeId
  /* 604 */ val POLYGON: typingsSlinky.pgPromise.pgSubsetMod.TypeId.POLYGON with Double = js.native
  
  @js.native
  sealed trait REFCURSOR extends TypeId
  /* 1790 */ val REFCURSOR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REFCURSOR with Double = js.native
  
  @js.native
  sealed trait REGCLASS extends TypeId
  /* 2205 */ val REGCLASS: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGCLASS with Double = js.native
  
  @js.native
  sealed trait REGCONFIG extends TypeId
  /* 3734 */ val REGCONFIG: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGCONFIG with Double = js.native
  
  @js.native
  sealed trait REGDICTIONARY extends TypeId
  /* 3769 */ val REGDICTIONARY: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGDICTIONARY with Double = js.native
  
  @js.native
  sealed trait REGNAMESPACE extends TypeId
  /* 4089 */ val REGNAMESPACE: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGNAMESPACE with Double = js.native
  
  @js.native
  sealed trait REGOPER extends TypeId
  /* 2203 */ val REGOPER: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGOPER with Double = js.native
  
  @js.native
  sealed trait REGOPERATOR extends TypeId
  /* 2204 */ val REGOPERATOR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGOPERATOR with Double = js.native
  
  @js.native
  sealed trait REGPROC extends TypeId
  /* 24 */ val REGPROC: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGPROC with Double = js.native
  
  @js.native
  sealed trait REGPROCEDURE extends TypeId
  /* 2202 */ val REGPROCEDURE: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGPROCEDURE with Double = js.native
  
  @js.native
  sealed trait REGROLE extends TypeId
  /* 4096 */ val REGROLE: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGROLE with Double = js.native
  
  @js.native
  sealed trait REGTYPE extends TypeId
  /* 2206 */ val REGTYPE: typingsSlinky.pgPromise.pgSubsetMod.TypeId.REGTYPE with Double = js.native
  
  @js.native
  sealed trait RELTIME extends TypeId
  /* 703 */ val RELTIME: typingsSlinky.pgPromise.pgSubsetMod.TypeId.RELTIME with Double = js.native
  
  @js.native
  sealed trait SMGR extends TypeId
  /* 210 */ val SMGR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.SMGR with Double = js.native
  
  @js.native
  sealed trait TEXT extends TypeId
  /* 25 */ val TEXT: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TEXT with Double = js.native
  
  @js.native
  sealed trait TID extends TypeId
  /* 27 */ val TID: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TID with Double = js.native
  
  @js.native
  sealed trait TIME extends TypeId
  /* 1083 */ val TIME: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TIME with Double = js.native
  
  @js.native
  sealed trait TIMESTAMP extends TypeId
  /* 1114 */ val TIMESTAMP: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TIMESTAMP with Double = js.native
  
  @js.native
  sealed trait TIMESTAMPTZ extends TypeId
  /* 1184 */ val TIMESTAMPTZ: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TIMESTAMPTZ with Double = js.native
  
  @js.native
  sealed trait TIMETZ extends TypeId
  /* 1266 */ val TIMETZ: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TIMETZ with Double = js.native
  
  @js.native
  sealed trait TINTERVAL extends TypeId
  /* 704 */ val TINTERVAL: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TINTERVAL with Double = js.native
  
  @js.native
  sealed trait TSQUERY extends TypeId
  /* 3615 */ val TSQUERY: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TSQUERY with Double = js.native
  
  @js.native
  sealed trait TSVECTOR extends TypeId
  /* 3614 */ val TSVECTOR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TSVECTOR with Double = js.native
  
  @js.native
  sealed trait TXID_SNAPSHOT extends TypeId
  /* 2970 */ val TXID_SNAPSHOT: typingsSlinky.pgPromise.pgSubsetMod.TypeId.TXID_SNAPSHOT with Double = js.native
  
  @js.native
  sealed trait UUID extends TypeId
  /* 2950 */ val UUID: typingsSlinky.pgPromise.pgSubsetMod.TypeId.UUID with Double = js.native
  
  @js.native
  sealed trait VARBIT extends TypeId
  /* 1562 */ val VARBIT: typingsSlinky.pgPromise.pgSubsetMod.TypeId.VARBIT with Double = js.native
  
  @js.native
  sealed trait VARCHAR extends TypeId
  /* 1043 */ val VARCHAR: typingsSlinky.pgPromise.pgSubsetMod.TypeId.VARCHAR with Double = js.native
  
  @js.native
  sealed trait XID extends TypeId
  /* 28 */ val XID: typingsSlinky.pgPromise.pgSubsetMod.TypeId.XID with Double = js.native
  
  @js.native
  sealed trait XML extends TypeId
  /* 142 */ val XML: typingsSlinky.pgPromise.pgSubsetMod.TypeId.XML with Double = js.native
}
