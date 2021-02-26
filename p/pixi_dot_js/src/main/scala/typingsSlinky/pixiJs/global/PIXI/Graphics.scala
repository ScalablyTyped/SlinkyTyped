package typingsSlinky.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Graphics class contains methods used to draw primitive shapes such as lines, circles and
  * rectangles to the display, and to color and fill them.
  *
  * Note that because Graphics can share a GraphicsGeometry with other instances,
  * it is necessary to call `destroy()` to properly dereference the underlying
  * GraphicsGeometry and avoid a memory leak. Alternatively, keep using the same
  * Graphics instance and call `clear()` between redraws.
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@JSGlobal("PIXI.Graphics")
@js.native
class Graphics ()
  extends typingsSlinky.pixiJs.PIXI.Graphics {
  def this(geometry: typingsSlinky.pixiJs.PIXI.GraphicsGeometry) = this()
}
