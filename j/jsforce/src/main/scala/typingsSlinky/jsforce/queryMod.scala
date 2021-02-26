package typingsSlinky.jsforce

import typingsSlinky.jsforce.jsforceStrings.ASC
import typingsSlinky.jsforce.jsforceStrings.DESC
import typingsSlinky.jsforce.recordResultMod.RecordResult
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("jsforce/query", "ExplainInfo")
  @js.native
  class ExplainInfo () extends StObject
  
  @JSImport("jsforce/query", "Query")
  @js.native
  class Query[T] ()
    extends Readable
       with Promise[T] {
    def this(opts: ReadableOptions) = this()
    
    def del(): js.Any = js.native
    def del(callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Any = js.native
    def del(
      `type`: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]
    ): js.Any = js.native
    def del(`type`: String): js.Any = js.native
    def del(`type`: String, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Any = js.native
    
    def delete(): js.Any = js.native
    def delete(callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Any = js.native
    def delete(
      `type`: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]
    ): js.Any = js.native
    def delete(`type`: String): js.Any = js.native
    def delete(`type`: String, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Any = js.native
    
    def destroy(callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Promise[js.Array[RecordResult]] = js.native
    def destroy(
      `type`: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def destroy(`type`: String): js.Promise[js.Array[RecordResult]] = js.native
    def destroy(`type`: String, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Promise[js.Array[RecordResult]] = js.native
    @JSName("destroy")
    def destroy_Promise(): js.Promise[js.Array[RecordResult]] = js.native
    
    def end(): Query[T] = js.native
    
    def exec(): Query[T] = js.native
    def exec(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    def exec(options: ExecuteOptions): Query[T] = js.native
    def exec(
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    
    def execute(): Query[T] = js.native
    def execute(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    def execute(options: ExecuteOptions): Query[T] = js.native
    def execute(
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    
    def explain(): js.Promise[ExplainInfo] = js.native
    def explain(callback: js.Function2[/* err */ js.Error, /* info */ ExplainInfo, Unit]): js.Promise[ExplainInfo] = js.native
    
    def filter(filter: js.Object): Query[T] = js.native
    
    def hint(hint: js.Object): Query[T] = js.native
    
    def include(include: String): Query[T] = js.native
    
    def limit(value: Double): Query[T] = js.native
    
    def map(callback: js.Function1[/* currentValue */ js.Object, Unit]): js.Promise[_] = js.native
    
    def maxFetch(value: Double): Query[T] = js.native
    
    def offset(value: Double): Query[T] = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def run(): Query[T] = js.native
    def run(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    def run(options: ExecuteOptions): Query[T] = js.native
    def run(
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    
    def scanAll(value: Boolean): Query[T] = js.native
    
    def select(fields: String): Query[T] = js.native
    def select(fields: js.Array[String]): Query[T] = js.native
    def select(fields: js.Object): Query[T] = js.native
    
    def skip(value: Double): Query[T] = js.native
    
    def sort(keyOrList: String): Query[T] = js.native
    def sort(keyOrList: String, direction: Double): Query[T] = js.native
    def sort(keyOrList: js.Array[js.Object]): Query[T] = js.native
    def sort(keyOrList: js.Array[js.Object], direction: Double): Query[T] = js.native
    def sort(keyOrList: js.Object): Query[T] = js.native
    def sort(keyOrList: js.Object, direction: Double): Query[T] = js.native
    @JSName("sort")
    def sort_ASC(keyOrList: String, direction: ASC): Query[T] = js.native
    @JSName("sort")
    def sort_ASC(keyOrList: js.Array[js.Object], direction: ASC): Query[T] = js.native
    @JSName("sort")
    def sort_ASC(keyOrList: js.Object, direction: ASC): Query[T] = js.native
    @JSName("sort")
    def sort_DESC(keyOrList: String, direction: DESC): Query[T] = js.native
    @JSName("sort")
    def sort_DESC(keyOrList: js.Array[js.Object], direction: DESC): Query[T] = js.native
    @JSName("sort")
    def sort_DESC(keyOrList: js.Object, direction: DESC): Query[T] = js.native
    
    def thenCall(): Query[T] = js.native
    def thenCall(callback: js.Function2[/* err */ js.Error, /* records */ T, Unit]): Query[T] = js.native
    
    def toSOQL(callback: js.Function2[/* err */ js.Error, /* soql */ String, Unit]): js.Promise[String] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_Query: typingsSlinky.jsforce.jsforceStrings.Promise = js.native
    
    def update(
      mapping: js.Any,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def update(
      mapping: js.Any,
      `type`: String,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    
    def where(conditions: String): Query[T] = js.native
    def where(conditions: js.Object): Query[T] = js.native
  }
  
  @js.native
  trait ExecuteOptions extends StObject {
    
    var autoFetch: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var maxFetch: js.UndefOr[Double] = js.native
    
    var scanAll: js.UndefOr[Boolean] = js.native
  }
  object ExecuteOptions {
    
    @scala.inline
    def apply(): ExecuteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteOptions]
    }
    
    @scala.inline
    implicit class ExecuteOptionsMutableBuilder[Self <: ExecuteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFetch(value: Boolean): Self = StObject.set(x, "autoFetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFetchUndefined: Self = StObject.set(x, "autoFetch", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMaxFetch(value: Double): Self = StObject.set(x, "maxFetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFetchUndefined: Self = StObject.set(x, "maxFetch", js.undefined)
      
      @scala.inline
      def setScanAll(value: Boolean): Self = StObject.set(x, "scanAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScanAllUndefined: Self = StObject.set(x, "scanAll", js.undefined)
    }
  }
  
  @js.native
  trait QueryResult[T] extends StObject {
    
    var done: Boolean = js.native
    
    var nextRecordsUrl: js.UndefOr[String] = js.native
    
    var records: js.Array[T] = js.native
    
    var totalSize: Double = js.native
  }
  object QueryResult {
    
    @scala.inline
    def apply[T](done: Boolean, records: js.Array[T], totalSize: Double): QueryResult[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult[T]]
    }
    
    @scala.inline
    implicit class QueryResultMutableBuilder[Self <: QueryResult[_], T] (val x: Self with QueryResult[T]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRecordsUrl(value: String): Self = StObject.set(x, "nextRecordsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRecordsUrlUndefined: Self = StObject.set(x, "nextRecordsUrl", js.undefined)
      
      @scala.inline
      def setRecords(value: js.Array[T]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: T*): Self = StObject.set(x, "records", js.Array(value :_*))
      
      @scala.inline
      def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    }
  }
}
