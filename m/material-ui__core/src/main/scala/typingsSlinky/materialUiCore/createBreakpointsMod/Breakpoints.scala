package typingsSlinky.materialUiCore.createBreakpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breakpoints extends js.Object {
  
  def between(start: Breakpoint, end: Breakpoint): String = js.native
  
  def down(key: Double): String = js.native
  def down(key: Breakpoint): String = js.native
  
  var keys: js.Array[Breakpoint] = js.native
  
  def only(key: Breakpoint): String = js.native
  
  def up(key: Double): String = js.native
  def up(key: Breakpoint): String = js.native
  
  var values: BreakpointValues = js.native
  
  def width(key: Breakpoint): Double = js.native
}
