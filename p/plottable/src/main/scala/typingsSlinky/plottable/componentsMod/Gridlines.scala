package typingsSlinky.plottable.componentsMod

import typingsSlinky.plottable.scaleMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/components", "Gridlines")
@js.native
/**
  * @constructor
  * @param {Scale} xScale The scale to base the x gridlines on. Pass null if no gridlines are desired.
  * @param {Scale} yScale The scale to base the y gridlines on. Pass null if no gridlines are desired.
  */
class Gridlines ()
  extends typingsSlinky.plottable.gridlinesMod.Gridlines {
  def this(xScale: Scale[_, _]) = this()
  def this(xScale: Null, yScale: Scale[_, _]) = this()
  def this(xScale: Scale[_, _], yScale: Scale[_, _]) = this()
}
