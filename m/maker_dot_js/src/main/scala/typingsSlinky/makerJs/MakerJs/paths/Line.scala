package typingsSlinky.makerJs.MakerJs.paths

import typingsSlinky.makerJs.MakerJs.IPathLine
import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class for line path.
  */
@js.native
trait Line extends IPathLine
object Line {
  
  @scala.inline
  def apply(end: IPoint, origin: IPoint, `type`: String): Line = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}
