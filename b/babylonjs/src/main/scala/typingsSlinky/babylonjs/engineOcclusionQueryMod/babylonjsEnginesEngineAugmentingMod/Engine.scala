package typingsSlinky.babylonjs.engineOcclusionQueryMod.babylonjsEnginesEngineAugmentingMod

import typingsSlinky.babylonjs.timeTokenMod.TimeToken
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.typesMod.int
import typingsSlinky.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Engine extends js.Object {
  /** @hidden */
  var _currentNonTimestampToken: Nullable[TimeToken] = js.native
  /** @hidden */
  def _createTimeQuery(): WebGLQuery = js.native
  /** @hidden */
  def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
  /** @hidden */
  def _getGlAlgorithmType(algorithmType: Double): Double = js.native
  /** @hidden */
  def _getTimeQueryAvailability(query: WebGLQuery): js.Any = js.native
  /** @hidden */
  def _getTimeQueryResult(query: WebGLQuery): js.Any = js.native
  /**
    * Initiates an occlusion query
    * @param algorithmType defines the algorithm to use
    * @param query defines the query to use
    * @returns the current engine
    * @see http://doc.babylonjs.com/features/occlusionquery
    */
  def beginOcclusionQuery(algorithmType: Double, query: WebGLQuery): Engine = js.native
  /**
    * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
    * @return the new query
    */
  def createQuery(): WebGLQuery = js.native
  /**
    * Delete and release a webGL query
    * @param query defines the query to delete
    * @return the current engine
    */
  def deleteQuery(query: WebGLQuery): Engine = js.native
  /**
    * Ends an occlusion query
    * @see http://doc.babylonjs.com/features/occlusionquery
    * @param algorithmType defines the algorithm to use
    * @returns the current engine
    */
  def endOcclusionQuery(algorithmType: Double): Engine = js.native
  /**
    * Ends a time query
    * @param token defines the token used to measure the time span
    * @returns the time spent (in ns)
    */
  def endTimeQuery(token: TimeToken): int = js.native
  /**
    * Gets the value of a given query
    * @param query defines the query to check
    * @returns the value of the query
    */
  def getQueryResult(query: WebGLQuery): Double = js.native
  /**
    * Check if a given query has resolved and got its value
    * @param query defines the query to check
    * @returns true if the query got its value
    */
  def isQueryResultAvailable(query: WebGLQuery): Boolean = js.native
  /**
    * Starts a time query (used to measure time spent by the GPU on a specific frame)
    * Please note that only one query can be issued at a time
    * @returns a time token used to track the time span
    */
  def startTimeQuery(): Nullable[TimeToken] = js.native
}

object Engine {
  @scala.inline
  def apply(
    _createTimeQuery: () => WebGLQuery,
    _deleteTimeQuery: WebGLQuery => Unit,
    _getGlAlgorithmType: Double => Double,
    _getTimeQueryAvailability: WebGLQuery => js.Any,
    _getTimeQueryResult: WebGLQuery => js.Any,
    beginOcclusionQuery: (Double, WebGLQuery) => Engine,
    createQuery: () => WebGLQuery,
    deleteQuery: WebGLQuery => Engine,
    endOcclusionQuery: Double => Engine,
    endTimeQuery: TimeToken => int,
    getQueryResult: WebGLQuery => Double,
    isQueryResultAvailable: WebGLQuery => Boolean,
    startTimeQuery: () => Nullable[TimeToken]
  ): Engine = {
    val __obj = js.Dynamic.literal(_createTimeQuery = js.Any.fromFunction0(_createTimeQuery), _deleteTimeQuery = js.Any.fromFunction1(_deleteTimeQuery), _getGlAlgorithmType = js.Any.fromFunction1(_getGlAlgorithmType), _getTimeQueryAvailability = js.Any.fromFunction1(_getTimeQueryAvailability), _getTimeQueryResult = js.Any.fromFunction1(_getTimeQueryResult), beginOcclusionQuery = js.Any.fromFunction2(beginOcclusionQuery), createQuery = js.Any.fromFunction0(createQuery), deleteQuery = js.Any.fromFunction1(deleteQuery), endOcclusionQuery = js.Any.fromFunction1(endOcclusionQuery), endTimeQuery = js.Any.fromFunction1(endTimeQuery), getQueryResult = js.Any.fromFunction1(getQueryResult), isQueryResultAvailable = js.Any.fromFunction1(isQueryResultAvailable), startTimeQuery = js.Any.fromFunction0(startTimeQuery))
    __obj.asInstanceOf[Engine]
  }
  @scala.inline
  implicit class EngineOps[Self <: Engine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_createTimeQuery(value: () => WebGLQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_createTimeQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_deleteTimeQuery(value: WebGLQuery => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_deleteTimeQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_getGlAlgorithmType(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getGlAlgorithmType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_getTimeQueryAvailability(value: WebGLQuery => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getTimeQueryAvailability")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_getTimeQueryResult(value: WebGLQuery => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getTimeQueryResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeginOcclusionQuery(value: (Double, WebGLQuery) => Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginOcclusionQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateQuery(value: () => WebGLQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeleteQuery(value: WebGLQuery => Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndOcclusionQuery(value: Double => Engine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOcclusionQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndTimeQuery(value: TimeToken => int): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeQuery")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetQueryResult(value: WebGLQuery => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQueryResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsQueryResultAvailable(value: WebGLQuery => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isQueryResultAvailable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartTimeQuery(value: () => Nullable[TimeToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimeQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_currentNonTimestampToken(value: Nullable[TimeToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentNonTimestampToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_currentNonTimestampTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentNonTimestampToken")(null)
        ret
    }
  }
  
}

