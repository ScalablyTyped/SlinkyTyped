package typingsSlinky.easeljs.global.createjs

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteSheetUtils")
@js.native
class SpriteSheetUtils ()
  extends typingsSlinky.easeljs.createjs.SpriteSheetUtils

/* static members */
@JSGlobal("createjs.SpriteSheetUtils")
@js.native
object SpriteSheetUtils extends js.Object {
  /**
    * @deprecated
    */
  def addFlippedFrames(spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet,
    horizontal: js.UndefOr[scala.Nothing],
    vertical: js.UndefOr[scala.Nothing],
    both: Boolean
  ): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet,
    horizontal: js.UndefOr[scala.Nothing],
    vertical: Boolean
  ): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet,
    horizontal: js.UndefOr[scala.Nothing],
    vertical: Boolean,
    both: Boolean
  ): Unit = js.native
  def addFlippedFrames(spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet, horizontal: Boolean): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet,
    horizontal: Boolean,
    vertical: js.UndefOr[scala.Nothing],
    both: Boolean
  ): Unit = js.native
  def addFlippedFrames(spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet, horizontal: Boolean, vertical: Boolean): Unit = js.native
  def addFlippedFrames(
    spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet,
    horizontal: Boolean,
    vertical: Boolean,
    both: Boolean
  ): Unit = js.native
  def extractFrame(spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet, frameOrAnimation: String): HTMLImageElement = js.native
   // deprecated
  def extractFrame(spriteSheet: typingsSlinky.easeljs.createjs.SpriteSheet, frameOrAnimation: Double): HTMLImageElement = js.native
  /**
    * @deprecated
    */
  def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement): HTMLCanvasElement = js.native
  def mergeAlpha(rgbImage: HTMLImageElement, alphaImage: HTMLImageElement, canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
}

