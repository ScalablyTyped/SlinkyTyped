package typingsSlinky.cassandraDriver.datastaxMod.datastax

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/datastax", "datastax.search")
@js.native
object search extends js.Object {
  
  @js.native
  class DateRange protected () extends js.Object {
    def this(
      lowerBound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound,
      upperBound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound
    ) = this()
    
    def equals(other: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): Boolean = js.native
    
    var lowerBound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
    
    var upperBound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
  }
  /* static members */
  @js.native
  object DateRange extends js.Object {
    
    def fromBuffer(value: Buffer): typingsSlinky.cassandraDriver.searchMod.search.DateRange = js.native
    
    def fromString(value: String): typingsSlinky.cassandraDriver.searchMod.search.DateRange = js.native
  }
  
  @js.native
  class DateRangeBound () extends js.Object {
    
    var date: js.Date = js.native
    
    def equals(other: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): Boolean = js.native
    
    var precision: Double = js.native
  }
  /* static members */
  @js.native
  object DateRangeBound extends js.Object {
    
    def fromString(value: String): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
    
    def toLowerBound(bound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
    
    def toUpperBound(bound: typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound): typingsSlinky.cassandraDriver.searchMod.search.DateRangeBound = js.native
  }
  
  @js.native
  sealed trait dateRangePrecision extends js.Object
  @js.native
  object dateRangePrecision extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[dateRangePrecision with Double] = js.native
    
    @js.native
    sealed trait day extends dateRangePrecision
    /* 1 */ @js.native
    object day extends TopLevel[day with Double]
    
    @js.native
    sealed trait hour extends dateRangePrecision
    /* 2 */ @js.native
    object hour extends TopLevel[hour with Double]
    
    @js.native
    sealed trait millisecond extends dateRangePrecision
    /* 5 */ @js.native
    object millisecond extends TopLevel[millisecond with Double]
    
    @js.native
    sealed trait minute extends dateRangePrecision
    /* 3 */ @js.native
    object minute extends TopLevel[minute with Double]
    
    @js.native
    sealed trait month extends dateRangePrecision
    /* 0 */ @js.native
    object month extends TopLevel[month with Double]
    
    @js.native
    sealed trait second extends dateRangePrecision
    /* 4 */ @js.native
    object second extends TopLevel[second with Double]
    
    @js.native
    sealed trait year extends dateRangePrecision
    /* 0 */ @js.native
    object year extends TopLevel[year with Double]
  }
}
