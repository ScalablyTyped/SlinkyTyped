package typingsSlinky.phaser.Phaser.Types.Core

import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldConfig
import typingsSlinky.phaser.Phaser.Types.Physics.Impact.WorldConfig
import typingsSlinky.phaser.Phaser.Types.Physics.Matter.MatterWorldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicsConfig extends js.Object {
  /**
    * Arcade Physics configuration.
    */
  var arcade: js.UndefOr[ArcadeWorldConfig] = js.native
  /**
    * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
    */
  var default: js.UndefOr[String] = js.native
  /**
    * Impact Physics configuration.
    */
  var impact: js.UndefOr[WorldConfig] = js.native
  /**
    * Matter Physics configuration.
    */
  var matter: js.UndefOr[MatterWorldConfig] = js.native
}

object PhysicsConfig {
  @scala.inline
  def apply(): PhysicsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsConfig]
  }
  @scala.inline
  implicit class PhysicsConfigOps[Self <: PhysicsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArcade(value: ArcadeWorldConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArcade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcade")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withImpact(value: WorldConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impact")(js.undefined)
        ret
    }
    @scala.inline
    def withMatter(value: MatterWorldConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matter")(js.undefined)
        ret
    }
  }
  
}

