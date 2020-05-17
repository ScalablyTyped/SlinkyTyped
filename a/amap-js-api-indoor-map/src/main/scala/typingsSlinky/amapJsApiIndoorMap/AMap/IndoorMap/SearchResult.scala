package typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap.SearchSuccessResult
  - typingsSlinky.amapJsApiIndoorMap.AMap.IndoorMap.SearchErrorResult
*/
trait SearchResult extends js.Object

object SearchResult {
  @scala.inline
  implicit def apply(value: SearchErrorResult): SearchResult = value.asInstanceOf[SearchResult]
  @scala.inline
  implicit def apply(value: SearchSuccessResult): SearchResult = value.asInstanceOf[SearchResult]
}

