package typingsSlinky.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait consistencies extends StObject
@JSImport("cassandra-driver/lib/types", "types.consistencies")
@js.native
object consistencies extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[consistencies with Double] = js.native
  
  @js.native
  sealed trait all extends consistencies
  /* 0x05 */ val all: typingsSlinky.cassandraDriver.typesMod.types.consistencies.all with Double = js.native
  
  @js.native
  sealed trait any extends consistencies
  /* 0x00 */ val any: typingsSlinky.cassandraDriver.typesMod.types.consistencies.any with Double = js.native
  
  @js.native
  sealed trait eachQuorum extends consistencies
  /* 0x07 */ val eachQuorum: typingsSlinky.cassandraDriver.typesMod.types.consistencies.eachQuorum with Double = js.native
  
  @js.native
  sealed trait localOne extends consistencies
  /* 0x0a */ val localOne: typingsSlinky.cassandraDriver.typesMod.types.consistencies.localOne with Double = js.native
  
  @js.native
  sealed trait localQuorum extends consistencies
  /* 0x06 */ val localQuorum: typingsSlinky.cassandraDriver.typesMod.types.consistencies.localQuorum with Double = js.native
  
  @js.native
  sealed trait localSerial extends consistencies
  /* 0x09 */ val localSerial: typingsSlinky.cassandraDriver.typesMod.types.consistencies.localSerial with Double = js.native
  
  @js.native
  sealed trait one extends consistencies
  /* 0x01 */ val one: typingsSlinky.cassandraDriver.typesMod.types.consistencies.one with Double = js.native
  
  @js.native
  sealed trait quorum extends consistencies
  /* 0x04 */ val quorum: typingsSlinky.cassandraDriver.typesMod.types.consistencies.quorum with Double = js.native
  
  @js.native
  sealed trait serial extends consistencies
  /* 0x08 */ val serial: typingsSlinky.cassandraDriver.typesMod.types.consistencies.serial with Double = js.native
  
  @js.native
  sealed trait three extends consistencies
  /* 0x03 */ val three: typingsSlinky.cassandraDriver.typesMod.types.consistencies.three with Double = js.native
  
  @js.native
  sealed trait two extends consistencies
  /* 0x02 */ val two: typingsSlinky.cassandraDriver.typesMod.types.consistencies.two with Double = js.native
}
