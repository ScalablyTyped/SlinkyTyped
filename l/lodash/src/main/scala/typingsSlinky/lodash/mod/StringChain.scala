package typingsSlinky.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringChain
  extends LoDashExplicitWrapper[java.lang.String]
     with _ExpChain[js.Any] {
  
  /**
    * @see _.castArray
    */
  def castArray(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.countBy
    */
  def countBy(): ObjectChain[Dictionary[Double]] = js.native
  def countBy(iteratee: ValueIteratee[java.lang.String]): ObjectChain[Dictionary[Double]] = js.native
  
  /**
    * @see _.each
    */
  def each(): StringChain = js.native
  def each(iteratee: StringIterator[_]): StringChain = js.native
  
  /**
    * @see _.eachRight
    */
  def eachRight(): StringChain = js.native
  def eachRight(iteratee: StringIterator[_]): StringChain = js.native
  /**
    * @see _.eachRight
    */
  @JSName("eachRight")
  var eachRight_Original: js.Function1[/* iteratee */ js.UndefOr[StringIterator[_]], StringChain] = js.native
  
  /**
    * @see _.each
    */
  @JSName("each")
  var each_Original: js.Function1[/* iteratee */ js.UndefOr[StringIterator[_]], StringChain] = js.native
  
  /**
    * @see _.filter
    */
  def filter(): CollectionChain[java.lang.String] = js.native
  def filter(predicate: StringIterator[Boolean]): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.first
    */
  def first(): StringNullableChain = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): CollectionChain[java.lang.String] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[TResult](iteratee: StringIterator[Many[TResult]]): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(): CollectionChain[java.lang.String] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[TResult](iteratee: StringIterator[ListOfRecursiveArraysOrValues[TResult] | TResult]): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(): CollectionChain[java.lang.String] = js.native
  def flatMapDepth(depth: Double): CollectionChain[java.lang.String] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[TResult](iteratee: StringIterator[ListOfRecursiveArraysOrValues[TResult] | TResult]): CollectionChain[TResult] = js.native
  def flatMapDepth[TResult](iteratee: StringIterator[ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): CollectionChain[TResult] = js.native
  
  /**
    * @see _.flatten
    */
  def flatten(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(): StringChain = js.native
  def forEach(iteratee: StringIterator[_]): StringChain = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(): StringChain = js.native
  def forEachRight(iteratee: StringIterator[_]): StringChain = js.native
  
  def get(path: js.Array[Double]): StringChain = js.native
  def get(path: js.Array[Double], defaultValue: java.lang.String): StringChain = js.native
  /**
    * @see _.get
    */
  def get(path: Double): StringChain = js.native
  /**
    * @see _.get
    */
  def get(path: Double, defaultValue: java.lang.String): StringChain = js.native
  
  /**
    * @see _.groupBy
    */
  def groupBy(): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  def groupBy(iteratee: ValueIteratee[java.lang.String]): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.head
    */
  def head(): StringNullableChain = js.native
  
  /**
    * @see _.includes
    */
  def includes(target: java.lang.String): PrimitiveChain[Boolean] = js.native
  def includes(target: java.lang.String, fromIndex: Double): PrimitiveChain[Boolean] = js.native
  
  /**
    * @see _.invertBy
    */
  def invertBy(): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  def invertBy(iteratee: ValueIteratee[java.lang.String]): ObjectChain[Dictionary[js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): FunctionChain[js.Function1[/* o */ js.Object, _]] = js.native
  
  /**
    * @see _.join
    */
  def join(): StringChain = js.native
  def join(separator: java.lang.String): StringChain = js.native
  
  /**
    * @see _.keyBy
    */
  def keyBy(): ObjectChain[Dictionary[java.lang.String]] = js.native
  def keyBy(iteratee: ValueIterateeCustom[java.lang.String, PropertyName]): ObjectChain[Dictionary[java.lang.String]] = js.native
  
  /**
    * @see _.last
    */
  def last(): StringNullableChain = js.native
  
  /**
    * @see _.map
    */
  def map(): CollectionChain[java.lang.String] = js.native
  /**
    * @see _.map
    */
  def map[TResult](iteratee: StringIterator[TResult]): CollectionChain[TResult] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): ObjectChain[NumericDictionary[java.lang.String]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](callback: StringIterator[TResult]): ObjectChain[NumericDictionary[TResult]] = js.native
  
  /**
    * @see _.partition
    */
  def partition(callback: StringIterator[NotVoid]): LoDashExplicitWrapper[js.Tuple2[js.Array[java.lang.String], js.Array[java.lang.String]]] = js.native
  
  /**
    * @see _.reject
    */
  def reject(): CollectionChain[java.lang.String] = js.native
  def reject(predicate: StringIterator[Boolean]): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.sample
    */
  def sample(): StringNullableChain = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize(): CollectionChain[java.lang.String] = js.native
  def sampleSize(n: Double): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.values
    */
  def values(): CollectionChain[java.lang.String] = js.native
  
  /**
    * @see _.valuesIn
    */
  def valuesIn(): CollectionChain[java.lang.String] = js.native
}
