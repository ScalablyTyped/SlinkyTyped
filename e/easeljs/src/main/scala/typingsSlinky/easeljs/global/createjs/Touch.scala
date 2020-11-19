package typingsSlinky.easeljs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.Touch")
@js.native
class Touch ()
  extends typingsSlinky.easeljs.createjs.Touch
/* static members */
@JSGlobal("createjs.Touch")
@js.native
object Touch extends js.Object {
  
  // methods
  def disable(stage: typingsSlinky.easeljs.createjs.Stage): Unit = js.native
  
  def enable(stage: typingsSlinky.easeljs.createjs.Stage): Boolean = js.native
  def enable(
    stage: typingsSlinky.easeljs.createjs.Stage,
    singleTouch: js.UndefOr[scala.Nothing],
    allowDefault: Boolean
  ): Boolean = js.native
  def enable(stage: typingsSlinky.easeljs.createjs.Stage, singleTouch: Boolean): Boolean = js.native
  def enable(stage: typingsSlinky.easeljs.createjs.Stage, singleTouch: Boolean, allowDefault: Boolean): Boolean = js.native
  
  def isSupported(): Boolean = js.native
}
