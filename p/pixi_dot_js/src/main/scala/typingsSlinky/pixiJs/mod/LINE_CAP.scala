package typingsSlinky.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Support line caps in `PIXI.LineStyle` for graphics.
  *
  * @see PIXI.Graphics#lineStyle
  *
  * @name LINE_CAP
  * @memberof PIXI
  * @static
  * @enum {string}
  * @property {string} BUTT - 'butt': don't add any cap at line ends (leaves orthogonal edges)
  * @property {string} ROUND - 'round': add semicircle at ends
  * @property {string} SQUARE - 'square': add square at end (like `BUTT` except more length at end)
  */
@JSImport("pixi.js", "LINE_CAP")
@js.native
object LINE_CAP extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.LINE_CAP with Double] = js.native
  
  /* 0 */ val BUTT: typingsSlinky.pixiJs.PIXI.LINE_CAP.BUTT with Double = js.native
  
  /* 1 */ val ROUND: typingsSlinky.pixiJs.PIXI.LINE_CAP.ROUND with Double = js.native
  
  /* 2 */ val SQUARE: typingsSlinky.pixiJs.PIXI.LINE_CAP.SQUARE with Double = js.native
}
