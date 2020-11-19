package typingsSlinky.jsfl.global

import typingsSlinky.jsfl.FlashDocument
import typingsSlinky.jsfl.FlashElement
import typingsSlinky.jsfl.FlashFL
import typingsSlinky.jsfl.FlashFLfile
import typingsSlinky.jsfl.FlashLibrary
import typingsSlinky.jsfl.FlashTimeline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object ^ extends js.Object {
  
  var FLfile: FlashFLfile = js.native
  
  // Global variables
  @JSName("$dom")
  var dom: FlashDocument = js.native
  
  var fl: FlashFL = js.native
  
  @JSName("$library")
  var library: FlashLibrary = js.native
  
  @JSName("$selection")
  var selection: js.Array[FlashElement] = js.native
  
  @JSName("$timeline")
  var timeline: FlashTimeline = js.native
  
  var xjsfl: typingsSlinky.jsfl.xjsfl = js.native
}
