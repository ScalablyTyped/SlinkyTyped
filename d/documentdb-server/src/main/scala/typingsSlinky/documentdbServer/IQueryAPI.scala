package typingsSlinky.documentdbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryAPI extends StObject {
  
  /**
    * Execute a filter on the input stream of documents, resulting in a subset of the input stream that matches the given filter.
    * When filter is called by itself, the input document stream is the set of all documents in the current document collection. When used in a chained call, the input document stream is the set of documents returned from the previous query function.
    * @param predicate The predicate function for a filter query, which acts as a truth test of whether a document should be filtered or not.
    * @param options Optional query options. Should not be used in a chained call.
    * @param callback Optional callback for the operation. If no callback is provided, any error in the operation will be thrown and the result document set will be written to the Response body. Should not be used in a chained call.
    */
  def filter(predicate: js.Function1[/* document */ js.Object, Boolean]): IQueryResponse = js.native
  def filter(
    predicate: js.Function1[/* document */ js.Object, Boolean],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def filter(
    predicate: js.Function1[/* document */ js.Object, Boolean],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def filter(predicate: js.Function1[/* document */ js.Object, Boolean], options: IFeedOptions): IQueryResponse = js.native
  def filter(
    predicate: js.Function1[/* document */ js.Object, Boolean],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("filter")
  def filter_T[T](predicate: js.Function1[/* document */ js.Object, Boolean]): IQueryResponse = js.native
  @JSName("filter")
  def filter_T[T](
    predicate: js.Function1[/* document */ js.Object, Boolean],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("filter")
  def filter_T[T](predicate: js.Function1[/* document */ js.Object, Boolean], options: IFeedOptions): IQueryResponse = js.native
  @JSName("filter")
  def filter_T[T](
    predicate: js.Function1[/* document */ js.Object, Boolean],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  
  /**
    * Flatten nested arrays from each document in the input document stream.
    * When flatten is called by itself, the input document stream is the set of all documents in the current document collection. When used in a chained call, the input document stream is the set of documents returned from the previous query function.
    * @param isShallow If true, flattens only the first level of nested arrays (false by default)
    * @param options Optional query options. Should not be used in a chained call.
    * @param callback Optional callback for the operation. If no callback is provided, any error in the operation will be thrown and the result document set will be written to the Response body. Should not be used in a chained call.
    */
  def flatten(): IQueryResponse = js.native
  def flatten(
    isShallow: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def flatten(
    isShallow: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def flatten(isShallow: js.UndefOr[scala.Nothing], options: IFeedOptions): IQueryResponse = js.native
  def flatten(
    isShallow: js.UndefOr[scala.Nothing],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def flatten(isShallow: Boolean): IQueryResponse = js.native
  def flatten(
    isShallow: Boolean,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def flatten(
    isShallow: Boolean,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def flatten(isShallow: Boolean, options: IFeedOptions): IQueryResponse = js.native
  def flatten(
    isShallow: Boolean,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](
    isShallow: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](isShallow: js.UndefOr[scala.Nothing], options: IFeedOptions): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](
    isShallow: js.UndefOr[scala.Nothing],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](isShallow: Boolean): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](
    isShallow: Boolean,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](isShallow: Boolean, options: IFeedOptions): IQueryResponse = js.native
  @JSName("flatten")
  def flatten_T[T](
    isShallow: Boolean,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  
  /**
    * Produce a new set of documents by mapping/projecting the properties of the documents in the input document stream through the given mapping predicate.
    * When map is called by itself, the input document stream is the set of all documents in the current document collection. When used in a chained call, the input document stream is the set of documents returned from the previous query function.
    * @param predicate The predicate function for a map/projection, which maps the input document's properties into a new document object.
    * @param options Optional query options. Should not be used in a chained call.
    * @param callback Optional callback for the operation. If no callback is provided, any error in the operation will be thrown and the result document set will be written to the Response body. Should not be used in a chained call.
    */
  def map(predicate: js.Function1[/* document */ js.Object, js.Object]): IQueryResponse = js.native
  def map(
    predicate: js.Function1[/* document */ js.Object, js.Object],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def map(
    predicate: js.Function1[/* document */ js.Object, js.Object],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def map(predicate: js.Function1[/* document */ js.Object, js.Object], options: IFeedOptions): IQueryResponse = js.native
  def map(
    predicate: js.Function1[/* document */ js.Object, js.Object],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("map")
  def map_T[T](predicate: js.Function1[/* document */ js.Object, js.Object]): IQueryResponse = js.native
  @JSName("map")
  def map_T[T](
    predicate: js.Function1[/* document */ js.Object, js.Object],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("map")
  def map_T[T](predicate: js.Function1[/* document */ js.Object, js.Object], options: IFeedOptions): IQueryResponse = js.native
  @JSName("map")
  def map_T[T](
    predicate: js.Function1[/* document */ js.Object, js.Object],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  
  /**
    * Produce a new set of documents by extracting a single property from each document in the input document stream. This is equivalent to a map call that projects only propertyName.
    * When pluck is called by itself, the input document stream is the set of all documents in the current document collection. When used in a chained call, the input document stream is the set of documents returned from the previous query function.
    * @param propertyName Name of the property to pluck from all documents in the current collection
    * @param options Optional query options. Should not be used in a chained call.
    * @param callback Optional callback for the operation. If no callback is provided, any error in the operation will be thrown and the result document set will be written to the Response body. Should not be used in a chained call.
    */
  def pluck(propertyName: String): IQueryResponse = js.native
  def pluck(
    propertyName: String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def pluck(
    propertyName: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def pluck(propertyName: String, options: IFeedOptions): IQueryResponse = js.native
  def pluck(
    propertyName: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("pluck")
  def pluck_T[T](propertyName: String): IQueryResponse = js.native
  @JSName("pluck")
  def pluck_T[T](
    propertyName: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("pluck")
  def pluck_T[T](propertyName: String, options: IFeedOptions): IQueryResponse = js.native
  @JSName("pluck")
  def pluck_T[T](
    propertyName: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  
  /**
    * Produce a new set of documents by sorting the documents in the input document stream in ascending order using the given predicate.
    * When sortBy is called by itself, the input document stream is the set of all documents in the current document collection. When used in a chained call, the input document stream is the set of documents returned from the previous query function.
    * @param predicate Predicate function defining the property to sort by.
    * @param options Optional query options. Should not be used in a chained call.
    * @param Optional callback for the operation. If no callback is provided, any error in the operation will be thrown and the result document set will be written to the Response body. Should not be used in a chained call.
    */
  def sortBy(predicate: js.Function1[/* document */ js.Object, String | Double]): IQueryResponse = js.native
  def sortBy(
    predicate: js.Function1[/* document */ js.Object, String | Double],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def sortBy(
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def sortBy(predicate: js.Function1[/* document */ js.Object, String | Double], options: IFeedOptions): IQueryResponse = js.native
  def sortBy(
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  
  /**
    * Produce a new set of documents by sorting the documents in the input document stream in descending order using the given predicate.
    * When sortByDescending is called by itself, the input document stream is the set of all documents in the current document collection. When used in a chained call, the input document stream is the set of documents returned from the previous query function.
    * @param predicate Predicate function defining the property to sort by.
    * @param options Optional query options. Should not be used in a chained call.
    * @param callback Optional callback for the operation. If no callback is provided, any error in the operation will be thrown and the result document set will be written to the Response body. Should not be used in a chained call.
    */
  def sortByDescending(predicate: js.Function1[/* document */ js.Object, String | Double]): IQueryResponse = js.native
  def sortByDescending(
    predicate: js.Function1[/* document */ js.Object, String | Double],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def sortByDescending(
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def sortByDescending(predicate: js.Function1[/* document */ js.Object, String | Double], options: IFeedOptions): IQueryResponse = js.native
  def sortByDescending(
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("sortByDescending")
  def sortByDescending_T[T](predicate: js.Function1[/* document */ js.Object, String | Double]): IQueryResponse = js.native
  @JSName("sortByDescending")
  def sortByDescending_T[T](
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("sortByDescending")
  def sortByDescending_T[T](predicate: js.Function1[/* document */ js.Object, String | Double], options: IFeedOptions): IQueryResponse = js.native
  @JSName("sortByDescending")
  def sortByDescending_T[T](
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  
  @JSName("sortBy")
  def sortBy_T[T](predicate: js.Function1[/* document */ js.Object, String | Double]): IQueryResponse = js.native
  @JSName("sortBy")
  def sortBy_T[T](
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("sortBy")
  def sortBy_T[T](predicate: js.Function1[/* document */ js.Object, String | Double], options: IFeedOptions): IQueryResponse = js.native
  @JSName("sortBy")
  def sortBy_T[T](
    predicate: js.Function1[/* document */ js.Object, String | Double],
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  
  /**
    * Terminating call for a chained query. Should be used in conjunction with the opening chain call to perform chained queries.
    * When value is called, the query is queued for execution with the given options and callback.
    * @param options Optional query options for the entire chained call.
    * @param callback Optional callback for the operation. If no callback is provided, any error in the operation will be thrown and the result document set will be written to the Response body.
    */
  def value(): IQueryResponse = js.native
  def value(
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def value(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  def value(options: IFeedOptions): IQueryResponse = js.native
  def value(
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("value")
  def value_T[T](): IQueryResponse = js.native
  @JSName("value")
  def value_T[T](
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
  @JSName("value")
  def value_T[T](options: IFeedOptions): IQueryResponse = js.native
  @JSName("value")
  def value_T[T](
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): IQueryResponse = js.native
}
