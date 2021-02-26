package typingsSlinky.googleCloudDatastore

import typingsSlinky.googleCloudDatastore.entityMod.DatastoreKey
import typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_CURSOR
import typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_LIMIT
import typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.NO_MORE_RESULTS
import typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.eventual
import typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.strong
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("@google-cloud/datastore/query", "Query")
  @js.native
  class Query protected () extends StObject {
    def this(scope: String, kinds: String, namespace: String) = this()
    
    def end(cursorToken: String): this.type = js.native
    
    def filter(property: String, operator: QueryFilterOperator, value: js.Any): this.type = js.native
    def filter(property: String, value: js.Any): this.type = js.native
    
    def groupBy(properties: String): this.type = js.native
    def groupBy(properties: js.Array[String]): this.type = js.native
    
    def hasAncestor(key: DatastoreKey): this.type = js.native
    
    def limit(n: Double): this.type = js.native
    
    def offset(n: Double): this.type = js.native
    
    def order(property: String): this.type = js.native
    def order(property: String, options: OrderOptions): this.type = js.native
    
    def run(): js.Promise[QueryResult] = js.native
    def run(callback: QueryCallback): Unit = js.native
    def run(options: QueryOptions): js.Promise[QueryResult] = js.native
    def run(options: QueryOptions, callback: QueryCallback): Unit = js.native
    
    def runStream(): ReadableStream = js.native
    
    def select(properties: String): this.type = js.native
    def select(properties: js.Array[String]): this.type = js.native
    
    def start(cursorToken: String): this.type = js.native
  }
  
  type MoreResultsAfterCursor = MORE_RESULTS_AFTER_CURSOR
  
  type MoreResultsAfterLimit = MORE_RESULTS_AFTER_LIMIT
  
  type NoMoreResults = NO_MORE_RESULTS
  
  @js.native
  trait OrderOptions extends StObject {
    
    var descending: Boolean = js.native
  }
  object OrderOptions {
    
    @scala.inline
    def apply(descending: Boolean): OrderOptions = {
      val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrderOptions]
    }
    
    @scala.inline
    implicit class OrderOptionsMutableBuilder[Self <: OrderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryCallback = js.Function3[/* err */ js.Error, /* entities */ js.Array[js.Object], /* info */ QueryInfo, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign
    - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign
    - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign
    - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign
    - typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign
  */
  trait QueryFilterOperator extends StObject
  object QueryFilterOperator {
    
    @scala.inline
    def Equalssign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign = "=".asInstanceOf[typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign]
    
    @scala.inline
    def Greaterthansign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign = ">".asInstanceOf[typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignEqualssign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign]
    
    @scala.inline
    def Lessthansign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign = "<".asInstanceOf[typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign]
    
    @scala.inline
    def LessthansignEqualssign: typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign]
  }
  
  @js.native
  trait QueryInfo extends StObject {
    
    var endCursor: js.UndefOr[String] = js.native
    
    val moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults = js.native
  }
  object QueryInfo {
    
    @scala.inline
    def apply(moreResults: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults): QueryInfo = {
      val __obj = js.Dynamic.literal(moreResults = moreResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryInfo]
    }
    
    @scala.inline
    implicit class QueryInfoMutableBuilder[Self <: QueryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
      
      @scala.inline
      def setMoreResults(value: MoreResultsAfterCursor | MoreResultsAfterLimit | NoMoreResults): Self = StObject.set(x, "moreResults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryOptions extends StObject {
    
    var consistency: js.UndefOr[strong | eventual] = js.native
    
    var maxApiCalls: js.UndefOr[Double] = js.native
  }
  object QueryOptions {
    
    @scala.inline
    def apply(): QueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsistency(value: strong | eventual): Self = StObject.set(x, "consistency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsistencyUndefined: Self = StObject.set(x, "consistency", js.undefined)
      
      @scala.inline
      def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
    }
  }
  
  type QueryResult = js.Tuple2[js.Array[js.Object], QueryInfo]
}
