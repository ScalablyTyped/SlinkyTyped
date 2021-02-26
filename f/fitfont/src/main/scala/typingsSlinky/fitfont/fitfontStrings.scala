package typingsSlinky.fitfont

import typingsSlinky.fitfont.mod.HorizontalAlign
import typingsSlinky.fitfont.mod.VerticalAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fitfontStrings {
  
  @js.native
  sealed trait baseline extends VerticalAlign
  @scala.inline
  def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait bottom extends VerticalAlign
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait end extends HorizontalAlign
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait middle
    extends HorizontalAlign
       with VerticalAlign
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait start extends HorizontalAlign
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait top extends VerticalAlign
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}
