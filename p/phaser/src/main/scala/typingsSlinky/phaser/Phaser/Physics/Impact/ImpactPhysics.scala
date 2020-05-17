package typingsSlinky.phaser.Phaser.Physics.Impact

import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.Phaser.Scenes.Systems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@js.native
trait ImpactPhysics extends js.Object {
  /**
    * [description]
    */
  var add: Factory = js.native
  /**
    * [description]
    */
  var config: js.Object = js.native
  /**
    * [description]
    */
  var scene: Scene = js.native
  /**
    * [description]
    */
  var systems: Systems = js.native
  /**
    * [description]
    */
  var world: World = js.native
  /**
    * [description]
    */
  def getConfig(): js.Object = js.native
  /**
    * [description]
    */
  def pause(): World = js.native
  /**
    * [description]
    */
  def resume(): World = js.native
}

object ImpactPhysics {
  @scala.inline
  def apply(
    add: Factory,
    config: js.Object,
    getConfig: () => js.Object,
    pause: () => World,
    resume: () => World,
    scene: Scene,
    systems: Systems,
    world: World
  ): ImpactPhysics = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], getConfig = js.Any.fromFunction0(getConfig), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), scene = scene.asInstanceOf[js.Any], systems = systems.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpactPhysics]
  }
  @scala.inline
  implicit class ImpactPhysicsOps[Self <: ImpactPhysics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Factory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetConfig(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPause(value: () => World): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResume(value: () => World): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystems(value: Systems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorld(value: World): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("world")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

