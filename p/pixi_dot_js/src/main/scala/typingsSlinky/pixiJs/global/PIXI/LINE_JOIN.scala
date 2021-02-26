package typingsSlinky.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported line joints in `PIXI.LineStyle` for graphics.
  *
  * @see PIXI.Graphics#lineStyle
  * @see https://graphicdesign.stackexchange.com/questions/59018/what-is-a-bevel-join-of-two-lines-exactly-illustrator
  *
  * @name LINE_JOIN
  * @memberof PIXI
  * @static
  * @enum {string}
  * @property {string} MITER - 'miter': make a sharp corner where outer part of lines meet
  * @property {string} BEVEL - 'bevel': add a square butt at each end of line segment and fill the triangle at turn
  * @property {string} ROUND - 'round': add an arc at the joint
  */
@JSGlobal("PIXI.LINE_JOIN")
@js.native
object LINE_JOIN extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.pixiJs.PIXI.LINE_JOIN with Double] = js.native
  
  /* 1 */ val BEVEL: typingsSlinky.pixiJs.PIXI.LINE_JOIN.BEVEL with Double = js.native
  
  /* 0 */ val MITER: typingsSlinky.pixiJs.PIXI.LINE_JOIN.MITER with Double = js.native
  
  /* 2 */ val ROUND: typingsSlinky.pixiJs.PIXI.LINE_JOIN.ROUND with Double = js.native
}
