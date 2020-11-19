package typingsSlinky.reactBytesizeIcons

import typingsSlinky.reactBytesizeIcons.mod.StrokeLinecap
import typingsSlinky.reactBytesizeIcons.mod.StrokeLinejoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBytesizeIconsStrings {
  
  @scala.inline
  def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @scala.inline
  def butt: butt = "butt".asInstanceOf[butt]
  
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @scala.inline
  def miter: miter = "miter".asInstanceOf[miter]
  
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait bevel extends StrokeLinejoin
  
  @js.native
  sealed trait butt extends StrokeLinecap
  
  @js.native
  sealed trait inherit
    extends StrokeLinecap
       with StrokeLinejoin
  
  @js.native
  sealed trait miter extends StrokeLinejoin
  
  @js.native
  sealed trait round
    extends StrokeLinecap
       with StrokeLinejoin
  
  @js.native
  sealed trait square extends StrokeLinecap
}
