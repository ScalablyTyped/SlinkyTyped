package typingsSlinky.amapJsApiCitySearch

import typingsSlinky.amapJsApiCitySearch.AMap.CitySearch.SearchStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiCitySearchStrings {
  
  @js.native
  sealed trait complete extends SearchStatus
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait error extends SearchStatus
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait no_data extends SearchStatus
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
}
