package typingsSlinky.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcadeWorldDefaults extends js.Object {
  /**
    * The color of dynamic body outlines when rendered to the debug display.
    */
  var bodyDebugColor: Double = js.native
  /**
    * Set to `true` to render dynamic body outlines to the debug display.
    */
  var debugShowBody: Boolean = js.native
  /**
    * Set to `true` to render static body outlines to the debug display.
    */
  var debugShowStaticBody: Boolean = js.native
  /**
    * Set to `true` to render body velocity markers to the debug display.
    */
  var debugShowVelocity: Boolean = js.native
  /**
    * The color of static body outlines when rendered to the debug display.
    */
  var staticBodyDebugColor: Double = js.native
  /**
    * The color of the velocity markers when rendered to the debug display.
    */
  var velocityDebugColor: Double = js.native
}

object ArcadeWorldDefaults {
  @scala.inline
  def apply(
    bodyDebugColor: Double,
    debugShowBody: Boolean,
    debugShowStaticBody: Boolean,
    debugShowVelocity: Boolean,
    staticBodyDebugColor: Double,
    velocityDebugColor: Double
  ): ArcadeWorldDefaults = {
    val __obj = js.Dynamic.literal(bodyDebugColor = bodyDebugColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowStaticBody = debugShowStaticBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], staticBodyDebugColor = staticBodyDebugColor.asInstanceOf[js.Any], velocityDebugColor = velocityDebugColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcadeWorldDefaults]
  }
  @scala.inline
  implicit class ArcadeWorldDefaultsOps[Self <: ArcadeWorldDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyDebugColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyDebugColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugShowBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugShowStaticBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowStaticBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugShowVelocity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugShowVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticBodyDebugColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticBodyDebugColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocityDebugColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityDebugColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

