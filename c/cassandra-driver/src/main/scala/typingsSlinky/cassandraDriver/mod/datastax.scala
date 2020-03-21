package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.typesMod.types.ResultSet
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "datastax")
@js.native
object datastax extends js.Object {
  @js.native
  object graph extends js.Object {
    @js.native
    class GraphResultSet protected ()
      extends typingsSlinky.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet {
      def this(rs: ResultSet) = this()
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
    
    @js.native
    class DateRangeBound ()
      extends typingsSlinky.cassandraDriver.datastaxMod.datastax.search.DateRangeBound
    
    /* static members */
    @js.native
    object DateRange extends js.Object {
      def fromBuffer(value: Buffer): typingsSlinky.cassandraDriver.searchMod.search.DateRange = js.native
      def fromString(value: String): typingsSlinky.cassandraDriver.searchMod.search.DateRange = js.native
    }
    
    /* static members */
    @js.native
    object DateRangeBound extends js.Object {
      def fromString(value: String): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
      def toLowerBound(bound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
      def toUpperBound(bound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
    }
    
    @js.native
    object dateRangePrecision extends js.Object {
      /* 1 */ val day: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.day with Double = js.native
      /* 2 */ val hour: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.hour with Double = js.native
      /* 5 */ val millisecond: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.millisecond with Double = js.native
      /* 3 */ val minute: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.minute with Double = js.native
      /* 0 */ val month: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.month with Double = js.native
      /* 4 */ val second: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.second with Double = js.native
      /* 0 */ val year: typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.year with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision with Double
          ] = js.native
    }
    
  }
  
}

