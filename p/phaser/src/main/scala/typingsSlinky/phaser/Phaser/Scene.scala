package typingsSlinky.phaser.Phaser

import typingsSlinky.phaser.Phaser.Animations.AnimationManager
import typingsSlinky.phaser.Phaser.Cache.CacheManager
import typingsSlinky.phaser.Phaser.Cameras.Scene2D.CameraManager
import typingsSlinky.phaser.Phaser.Data.DataManager
import typingsSlinky.phaser.Phaser.Events.EventEmitter
import typingsSlinky.phaser.Phaser.GameObjects.DisplayList
import typingsSlinky.phaser.Phaser.GameObjects.GameObjectCreator
import typingsSlinky.phaser.Phaser.GameObjects.GameObjectFactory
import typingsSlinky.phaser.Phaser.GameObjects.LightsManager
import typingsSlinky.phaser.Phaser.Input.InputPlugin
import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Physics.Arcade.ArcadePhysics
import typingsSlinky.phaser.Phaser.Physics.Impact.ImpactPhysics
import typingsSlinky.phaser.Phaser.Physics.Matter.MatterPhysics
import typingsSlinky.phaser.Phaser.Plugins.PluginManager
import typingsSlinky.phaser.Phaser.Scale.ScaleManager
import typingsSlinky.phaser.Phaser.Scenes.ScenePlugin
import typingsSlinky.phaser.Phaser.Scenes.Systems
import typingsSlinky.phaser.Phaser.Sound.BaseSoundManager
import typingsSlinky.phaser.Phaser.Textures.TextureManager
import typingsSlinky.phaser.Phaser.Time.Clock
import typingsSlinky.phaser.Phaser.Tweens.TweenManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base Phaser.Scene class which can be extended for your own use.
  * 
  * You can also define the optional methods {@link Phaser.Types.Scenes.SceneInitCallback init()}, {@link Phaser.Types.Scenes.ScenePreloadCallback preload()}, and {@link Phaser.Types.Scenes.SceneCreateCallback create()}.
  */
@js.native
trait Scene extends js.Object {
  /**
    * A scene level Game Object Factory.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var add: GameObjectFactory = js.native
  /**
    * A reference to the global Animation Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var anims: AnimationManager = js.native
  /**
    * A reference to the global Cache.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cache: CacheManager = js.native
  /**
    * A scene level Camera System.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var cameras: CameraManager = js.native
  /**
    * A scene level Game Object Display List.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var children: DisplayList = js.native
  /**
    * A scene level Data Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var data: DataManager = js.native
  /**
    * A scene level Event Emitter.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var events: EventEmitter = js.native
  /**
    * A scene level Facebook Instant Games Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var facebook: FacebookInstantGamesPlugin = js.native
  /**
    * A reference to the Phaser.Game instance.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var game: Game = js.native
  /**
    * A scene level Impact Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var impact: ImpactPhysics = js.native
  /**
    * A scene level Input Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var input: InputPlugin = js.native
  /**
    * A scene level Lights Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var lights: LightsManager = js.native
  /**
    * A scene level Loader Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var load: LoaderPlugin = js.native
  /**
    * A scene level Game Object Creator.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var make: GameObjectCreator = js.native
  /**
    * A scene level Matter Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var matter: MatterPhysics = js.native
  /**
    * A scene level Arcade Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  var physics: ArcadePhysics = js.native
  /**
    * A reference to the Plugin Manager.
    * 
    * The Plugin Manager is a global system that allows plugins to register themselves with it, and can then install
    * those plugins into Scenes as required.
    */
  var plugins: PluginManager = js.native
  /**
    * A reference to the game level Data Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var registry: DataManager = js.native
  /**
    * A reference to the global Scale Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scale: ScaleManager = js.native
  /**
    * A reference to the Scene Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var scene: ScenePlugin = js.native
  /**
    * A reference to the Sound Manager.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var sound: BaseSoundManager = js.native
  /**
    * The Scene Systems. You must never overwrite this property, or all hell will break lose.
    */
  var sys: Systems = js.native
  /**
    * A reference to the Texture Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  var textures: TextureManager = js.native
  /**
    * A scene level Time and Clock Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var time: Clock = js.native
  /**
    * A scene level Tween Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  var tweens: TweenManager = js.native
  /**
    * Should be overridden by your own Scenes.
    * This method is called once per game step while the scene is running.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(time: Double, delta: Double): Unit = js.native
}

object Scene {
  @scala.inline
  def apply(
    add: GameObjectFactory,
    anims: AnimationManager,
    cache: CacheManager,
    cameras: CameraManager,
    children: DisplayList,
    data: DataManager,
    events: EventEmitter,
    facebook: FacebookInstantGamesPlugin,
    game: Game,
    impact: ImpactPhysics,
    input: InputPlugin,
    lights: LightsManager,
    load: LoaderPlugin,
    make: GameObjectCreator,
    matter: MatterPhysics,
    physics: ArcadePhysics,
    plugins: PluginManager,
    registry: DataManager,
    scale: ScaleManager,
    scene: ScenePlugin,
    sound: BaseSoundManager,
    sys: Systems,
    textures: TextureManager,
    time: Clock,
    tweens: TweenManager,
    update: (Double, Double) => Unit
  ): Scene = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], anims = anims.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cameras = cameras.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], matter = matter.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tweens = tweens.asInstanceOf[js.Any], update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: GameObjectFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnims(value: AnimationManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCache(value: CacheManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameras(value: CameraManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameras")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: DisplayList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: DataManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: EventEmitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacebook(value: FacebookInstantGamesPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGame(value: Game): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpact(value: ImpactPhysics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: InputPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLights(value: LightsManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: LoaderPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMake(value: GameObjectCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("make")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatter(value: MatterPhysics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysics(value: ArcadePhysics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugins(value: PluginManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistry(value: DataManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: ScaleManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: ScenePlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSound(value: BaseSoundManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSys(value: Systems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextures(value: TextureManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Clock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTweens(value: TweenManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tweens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

