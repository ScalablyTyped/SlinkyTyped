package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.createBreakpointsMod.Breakpoint
import typingsSlinky.materialUiCore.mod.PropInjector
import typingsSlinky.materialUiCore.withWidthWithWidthMod.WithWidth
import typingsSlinky.materialUiCore.withWidthWithWidthMod.WithWidthOptions
import typingsSlinky.materialUiCore.withWidthWithWidthMod.WithWidthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/core/withWidth", JSImport.Namespace)
@js.native
object withWidthMod extends js.Object {
  
  def default(): PropInjector[WithWidth, WithWidthProps] = js.native
  def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = js.native
  
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
  
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = js.native
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = js.native
}
