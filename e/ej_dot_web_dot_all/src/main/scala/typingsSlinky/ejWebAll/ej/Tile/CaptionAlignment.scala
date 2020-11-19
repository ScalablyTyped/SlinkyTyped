package typingsSlinky.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptionAlignment extends js.Object
@JSGlobal("ej.Tile.CaptionAlignment")
@js.native
object CaptionAlignment extends js.Object {
  
  ///To set the center alignment of text in tile control
  @js.native
  sealed trait Center extends CaptionAlignment
  
  ///To set the left alignment of text in tile control
  @js.native
  sealed trait Left extends CaptionAlignment
  
  ///To set the normal alignment of text in tile control
  @js.native
  sealed trait Normal extends CaptionAlignment
  
  ///To set the right alignment of text in tile control
  @js.native
  sealed trait Right extends CaptionAlignment
}
