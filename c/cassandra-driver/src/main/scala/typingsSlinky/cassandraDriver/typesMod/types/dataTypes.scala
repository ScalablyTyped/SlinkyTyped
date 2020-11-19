package typingsSlinky.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dataTypes extends js.Object
@JSImport("cassandra-driver/lib/types", "types.dataTypes")
@js.native
object dataTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dataTypes with Double] = js.native
  
  @js.native
  sealed trait ascii extends dataTypes
  /* 0x0001 */ @js.native
  object ascii extends TopLevel[ascii with Double]
  
  @js.native
  sealed trait bigint extends dataTypes
  /* 0x0002 */ @js.native
  object bigint extends TopLevel[bigint with Double]
  
  @js.native
  sealed trait blob extends dataTypes
  /* 0x0003 */ @js.native
  object blob extends TopLevel[blob with Double]
  
  @js.native
  sealed trait boolean extends dataTypes
  /* 0x0004 */ @js.native
  object boolean extends TopLevel[boolean with Double]
  
  @js.native
  sealed trait counter extends dataTypes
  /* 0x0005 */ @js.native
  object counter extends TopLevel[counter with Double]
  
  @js.native
  sealed trait custom extends dataTypes
  /* 0x0000 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  @js.native
  sealed trait date extends dataTypes
  /* 0x0011 */ @js.native
  object date extends TopLevel[date with Double]
  
  @js.native
  sealed trait decimal extends dataTypes
  /* 0x0006 */ @js.native
  object decimal extends TopLevel[decimal with Double]
  
  @js.native
  sealed trait double extends dataTypes
  /* 0x0007 */ @js.native
  object double extends TopLevel[double with Double]
  
  @js.native
  sealed trait duration extends dataTypes
  /* 0x0015 */ @js.native
  object duration extends TopLevel[duration with Double]
  
  @js.native
  sealed trait float extends dataTypes
  /* 0x0008 */ @js.native
  object float extends TopLevel[float with Double]
  
  @js.native
  sealed trait inet extends dataTypes
  /* 0x0010 */ @js.native
  object inet extends TopLevel[inet with Double]
  
  @js.native
  sealed trait int extends dataTypes
  /* 0x0009 */ @js.native
  object int extends TopLevel[int with Double]
  
  @js.native
  sealed trait list extends dataTypes
  /* 0x0020 */ @js.native
  object list extends TopLevel[list with Double]
  
  @js.native
  sealed trait map extends dataTypes
  /* 0x0021 */ @js.native
  object map extends TopLevel[map with Double]
  
  @js.native
  sealed trait set extends dataTypes
  /* 0x0022 */ @js.native
  object set extends TopLevel[set with Double]
  
  @js.native
  sealed trait smallint extends dataTypes
  /* 0x0013 */ @js.native
  object smallint extends TopLevel[smallint with Double]
  
  @js.native
  sealed trait text extends dataTypes
  /* 0x000a */ @js.native
  object text extends TopLevel[text with Double]
  
  @js.native
  sealed trait time extends dataTypes
  /* 0x0012 */ @js.native
  object time extends TopLevel[time with Double]
  
  @js.native
  sealed trait timestamp extends dataTypes
  /* 0x000b */ @js.native
  object timestamp extends TopLevel[timestamp with Double]
  
  @js.native
  sealed trait timeuuid extends dataTypes
  /* 0x000f */ @js.native
  object timeuuid extends TopLevel[timeuuid with Double]
  
  @js.native
  sealed trait tinyint extends dataTypes
  /* 0x0014 */ @js.native
  object tinyint extends TopLevel[tinyint with Double]
  
  @js.native
  sealed trait tuple extends dataTypes
  /* 0x0031 */ @js.native
  object tuple extends TopLevel[tuple with Double]
  
  @js.native
  sealed trait udt extends dataTypes
  /* 0x0030 */ @js.native
  object udt extends TopLevel[udt with Double]
  
  @js.native
  sealed trait uuid extends dataTypes
  /* 0x000c */ @js.native
  object uuid extends TopLevel[uuid with Double]
  
  @js.native
  sealed trait varchar extends dataTypes
  /* 0x000d */ @js.native
  object varchar extends TopLevel[varchar with Double]
  
  @js.native
  sealed trait varint extends dataTypes
  /* 0x000e */ @js.native
  object varint extends TopLevel[varint with Double]
}
