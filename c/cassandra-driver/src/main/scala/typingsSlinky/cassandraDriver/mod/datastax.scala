package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.graphMod.graph.EnumValue
import typingsSlinky.cassandraDriver.typesMod.types.ResultSet
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "datastax")
@js.native
object datastax extends js.Object {
  
  @js.native
  object graph extends js.Object {
    
    def asDouble(value: Double): js.Object = js.native
    
    def asFloat(value: Double): js.Object = js.native
    
    def asInt(value: Double): js.Object = js.native
    
    def asTimestamp(value: js.Date): js.Object = js.native
    
    def asUdt(value: js.Object): js.Object = js.native
    
    @js.native
    class GraphResultSet protected ()
      extends typingsSlinky.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet {
      def this(rs: ResultSet) = this()
    }
    
    @js.native
    object direction extends js.Object {
      
      val both: EnumValue = js.native
      
      // `in` is a reserved word
      @JSName("in_")
      val in: EnumValue = js.native
      
      val out: EnumValue = js.native
    }
    
    @js.native
    object t extends js.Object {
      
      val id: EnumValue = js.native
      
      val key: EnumValue = js.native
      
      val label: EnumValue = js.native
      
      val value: EnumValue = js.native
    }
  }
  
  @js.native
  object search extends js.Object {
    
    @js.native
    class DateRange protected ()
      extends typingsSlinky.cassandraDriver.datastaxMod.datastax.search.DateRange {
      def this(
        lowerBound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound,
        upperBound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound
      ) = this()
    }
    /* static members */
    @js.native
    object DateRange extends js.Object {
      
      def fromBuffer(value: Buffer): typingsSlinky.cassandraDriver.searchMod.search.DateRange = js.native
      
      def fromString(value: String): typingsSlinky.cassandraDriver.searchMod.search.DateRange = js.native
    }
    
    @js.native
    class DateRangeBound ()
      extends typingsSlinky.cassandraDriver.datastaxMod.datastax.search.DateRangeBound
    /* static members */
    @js.native
    object DateRangeBound extends js.Object {
      
      def fromString(value: String): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
      
      def toLowerBound(bound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
      
      def toUpperBound(bound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
    }
    
    @js.native
    object dateRangePrecision extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision with Double
          ] = js.native
      
      /* 1 */ val day: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.day with Double = js.native
      
      /* 2 */ val hour: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.hour with Double = js.native
      
      /* 5 */ val millisecond: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.millisecond with Double = js.native
      
      /* 3 */ val minute: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.minute with Double = js.native
      
      /* 0 */ val month: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.month with Double = js.native
      
      /* 4 */ val second: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.second with Double = js.native
      
      /* 0 */ val year: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.year with Double = js.native
    }
  }
}
