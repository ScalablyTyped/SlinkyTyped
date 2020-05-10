package typingsSlinky.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The angle in which to launch the confetti, in degrees. 90 is straight up.
    * @default 90
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * An array of color strings, in the HEX format... you know, like #bada55.
    */
  var colors: js.UndefOr[js.Array[String]] = js.native
  /**
    * How quickly the confetti will lose speed. Keep this number between 0 and 1, otherwise the confetti will gain speed. Better yet, just never change it.
    * @default 0.9
    */
  var decay: js.UndefOr[Double] = js.native
  /**
    * Where to start firing confetti from. Feel free to launch off-screen if you'd like.
    */
  var origin: js.UndefOr[Origin] = js.native
  /**
    * The number of confetti to launch. More is always fun... but be cool, there's a lot of math involved.
    * @default 50
    */
  var particleCount: js.UndefOr[Double] = js.native
  /**
    * The possible values are square and circle. The default is to use both shapes in an even mix.
    * @default ['square','circle']
    */
  var shapes: js.UndefOr[js.Array[shape]] = js.native
  /**
    * How far off center the confetti can go, in degrees. 45 means the confetti will launch at the defined angle plus or minus 22.5 degrees.
    * @default 45
    */
  var spread: js.UndefOr[Double] = js.native
  /**
    * How fast the confetti will start going, in pixels.
    * @default 45
    */
  var startVelocity: js.UndefOr[Double] = js.native
  /**
    * How many times the confetti will move. This is abstract... but play with it if the confetti disappear too quickly for you.
    * @default 200
    */
  var ticks: js.UndefOr[Double] = js.native
  /**
    * The confetti should be on top, after all. But if you have a crazy high page, you can set it even higher.
    * @default 100
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withDecay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decay")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: Origin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withParticleCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticleCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("particleCount")(js.undefined)
        ret
    }
    @scala.inline
    def withShapes(value: js.Array[shape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spread")(js.undefined)
        ret
    }
    @scala.inline
    def withStartVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

