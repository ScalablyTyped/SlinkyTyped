package typingsSlinky.amapJsApiDriving

import typingsSlinky.amapJsApiDriving.AMap.Driving.SearchStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amapJsApiDrivingStrings {
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def no_data: no_data = "no_data".asInstanceOf[no_data]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def waypoint: waypoint = "waypoint".asInstanceOf[waypoint]
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait base extends js.Object
  
  @js.native
  sealed trait complete extends SearchStatus
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends SearchStatus
  
  @js.native
  sealed trait no_data extends SearchStatus
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait waypoint extends js.Object
}
