package typingsSlinky.heremaps

import typingsSlinky.heremaps.H.map.SpatialStyle.LineCap
import typingsSlinky.heremaps.H.map.SpatialStyle.LineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heremapsStrings {
  
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait bevel extends LineJoin
  
  @js.native
  sealed trait butt extends LineCap
  
  @js.native
  sealed trait miter extends LineJoin
  
  @js.native
  sealed trait round
    extends LineCap
       with LineJoin
  
  @js.native
  sealed trait square extends LineCap
}
