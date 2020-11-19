package typingsSlinky.amapJsApiStationSearch

import typingsSlinky.amapJsApiStationSearch.AMap.StationSearch.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiStationSearchStrings {
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
}
