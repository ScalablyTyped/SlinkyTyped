package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TQueries represent a collection of individual TQuery objects tracked in a given view. Most of the
  * methods on this interface are simple proxy methods to the corresponding functionality on TQuery.
  */
@js.native
trait TQueries extends StObject {
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementEnd` on each and every TQuery.
    * @param tNode
    */
  def elementEnd(tNode: TNode): Unit = js.native
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `elementStart` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def elementStart(tView: TView, tNode: TNode): Unit = js.native
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `embeddedTView` on each and every TQuery.
    * @param tNode
    */
  def embeddedTView(tNode: TNode): TQueries | Null = js.native
  
  /**
    * Returns a TQuery instance for at the given index  in the queries array.
    * @param index
    */
  def getByIndex(index: Double): TQuery = js.native
  
  /**
    * Returns the number of queries tracked in a given view.
    */
  var length: Double = js.native
  
  /**
    * A proxy method that iterates over all the TQueries in a given TView and calls the corresponding
    * `template` on each and every TQuery.
    * @param tView
    * @param tNode
    */
  def template(tView: TView, tNode: TNode): Unit = js.native
  
  /**
    * Adds a new TQuery to a collection of queries tracked in a given view.
    * @param tQuery
    */
  def track(tQuery: TQuery): Unit = js.native
}
object TQueries {
  
  @scala.inline
  def apply(
    elementEnd: TNode => Unit,
    elementStart: (TView, TNode) => Unit,
    embeddedTView: TNode => TQueries | Null,
    getByIndex: Double => TQuery,
    length: Double,
    template: (TView, TNode) => Unit,
    track: TQuery => Unit
  ): TQueries = {
    val __obj = js.Dynamic.literal(elementEnd = js.Any.fromFunction1(elementEnd), elementStart = js.Any.fromFunction2(elementStart), embeddedTView = js.Any.fromFunction1(embeddedTView), getByIndex = js.Any.fromFunction1(getByIndex), length = length.asInstanceOf[js.Any], template = js.Any.fromFunction2(template), track = js.Any.fromFunction1(track))
    __obj.asInstanceOf[TQueries]
  }
  
  @scala.inline
  implicit class TQueriesMutableBuilder[Self <: TQueries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementEnd(value: TNode => Unit): Self = StObject.set(x, "elementEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementStart(value: (TView, TNode) => Unit): Self = StObject.set(x, "elementStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEmbeddedTView(value: TNode => TQueries | Null): Self = StObject.set(x, "embeddedTView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByIndex(value: Double => TQuery): Self = StObject.set(x, "getByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: (TView, TNode) => Unit): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrack(value: TQuery => Unit): Self = StObject.set(x, "track", js.Any.fromFunction1(value))
  }
}
