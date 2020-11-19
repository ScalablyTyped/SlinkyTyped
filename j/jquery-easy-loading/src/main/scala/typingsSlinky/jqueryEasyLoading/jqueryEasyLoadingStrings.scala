package typingsSlinky.jqueryEasyLoading

import typingsSlinky.jqueryEasyLoading.JQueryEasyLoading.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jqueryEasyLoadingStrings {
  
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
  
  @js.native
  sealed trait resize extends Command
  
  @js.native
  sealed trait start extends Command
  
  @js.native
  sealed trait stop extends Command
  
  @js.native
  sealed trait toggle extends Command
}
