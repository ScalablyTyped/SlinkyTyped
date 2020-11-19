package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A PointText item represents a piece of typography in your Paper.js
  * project which starts from a certain point and extends by the amount of
  * characters contained in it.
  */
@JSGlobal("paper.PointText")
@js.native
class PointText protected ()
  extends typingsSlinky.paper.paper.PointText {
  /** 
    * Creates a point text item from the properties described by an object
    * literal.
    * 
    * @param object - an object containing properties describing the
    *     path's attributes
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a point text item
    * 
    * @param point - the position where the text will start
    */
  def this(point: typingsSlinky.paper.paper.Point) = this()
}
