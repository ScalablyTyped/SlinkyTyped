package typingsSlinky.phaser.Phaser.Physics.Impact.Components

import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Debug component.
  * Should be applied as a mixin.
  */
@js.native
trait Debug extends js.Object {
  /**
    * [description]
    */
  var debugBodyColor: Double = js.native
  /**
    * [description]
    */
  var debugShowBody: Boolean = js.native
  /**
    * [description]
    */
  var debugShowVelocity: Boolean = js.native
  /**
    * [description]
    * @param showBody [description]
    * @param showVelocity [description]
    * @param bodyColor [description]
    */
  def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): GameObject = js.native
  /**
    * [description]
    * @param value [description]
    */
  def setDebugBodyColor(value: Double): GameObject = js.native
}

object Debug {
  @scala.inline
  def apply(
    debugBodyColor: Double,
    debugShowBody: Boolean,
    debugShowVelocity: Boolean,
    setDebug: (Boolean, Boolean, Double) => GameObject,
    setDebugBodyColor: Double => GameObject
  ): Debug = {
    val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], setDebug = js.Any.fromFunction3(setDebug), setDebugBodyColor = js.Any.fromFunction1(setDebugBodyColor))
    __obj.asInstanceOf[Debug]
  }
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugBodyColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugBodyColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugShowBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugShowVelocity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDebug(value: (Boolean, Boolean, Double) => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDebug")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetDebugBodyColor(value: Double => GameObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDebugBodyColor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

