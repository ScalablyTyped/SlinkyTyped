package typingsSlinky.phaser.phaserMod

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
import typingsSlinky.phaser.Phaser.Physics.Matter.MatterPhysics
import typingsSlinky.phaser.Phaser.Plugins.PluginManager
import typingsSlinky.phaser.Phaser.Scale.ScaleManager
import typingsSlinky.phaser.Phaser.Scenes.ScenePlugin
import typingsSlinky.phaser.Phaser.Scenes.Systems
import typingsSlinky.phaser.Phaser.Sound.BaseSoundManager
import typingsSlinky.phaser.Phaser.Textures.TextureManager
import typingsSlinky.phaser.Phaser.Time.Clock
import typingsSlinky.phaser.Phaser.Tweens.TweenManager
import typingsSlinky.phaser.Phaser.Types.Scenes.SettingsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base Phaser.Scene class which can be extended for your own use.
  * 
  * You can also define the optional methods {@link Phaser.Types.Scenes.SceneInitCallback init()}, {@link Phaser.Types.Scenes.ScenePreloadCallback preload()}, and {@link Phaser.Types.Scenes.SceneCreateCallback create()}.
  */
@JSImport("phaser", "Scene")
@js.native
class Scene protected ()
  extends typingsSlinky.phaser.Phaser.Scene {
  /**
    * 
    * @param config Scene specific configuration settings.
    */
  def this(config: String) = this()
  def this(config: SettingsConfig) = this()
  /**
    * A scene level Game Object Factory.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var add: GameObjectFactory = js.native
  /**
    * A reference to the global Animation Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var anims: AnimationManager = js.native
  /**
    * A reference to the global Cache.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var cache: CacheManager = js.native
  /**
    * A scene level Camera System.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var cameras: CameraManager = js.native
  /**
    * A scene level Game Object Display List.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var children: DisplayList = js.native
  /**
    * A scene level Data Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  override var data: DataManager = js.native
  /**
    * A scene level Event Emitter.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var events: EventEmitter = js.native
  /**
    * A scene level Facebook Instant Games Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  /* CompleteClass */
  override var facebook: typingsSlinky.phaser.Phaser.FacebookInstantGamesPlugin = js.native
  /**
    * A reference to the Phaser.Game instance.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var game: typingsSlinky.phaser.Phaser.Game = js.native
  /**
    * A scene level Input Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  override var input: InputPlugin = js.native
  /**
    * A scene level Lights Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  override var lights: LightsManager = js.native
  /**
    * A scene level Loader Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  override var load: LoaderPlugin = js.native
  /**
    * A scene level Game Object Creator.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var make: GameObjectCreator = js.native
  /**
    * A scene level Matter Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  /* CompleteClass */
  override var matter: MatterPhysics = js.native
  /**
    * A scene level Arcade Physics Plugin.
    * This property will only be available if defined in the Scene Injection Map, the plugin is installed and configured.
    */
  /* CompleteClass */
  override var physics: ArcadePhysics = js.native
  /**
    * A reference to the Plugin Manager.
    * 
    * The Plugin Manager is a global system that allows plugins to register themselves with it, and can then install
    * those plugins into Scenes as required.
    */
  /* CompleteClass */
  override var plugins: PluginManager = js.native
  /**
    * A reference to the game level Data Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var registry: DataManager = js.native
  /**
    * A reference to the global Scale Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var scale: ScaleManager = js.native
  /**
    * A reference to the Scene Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var scene: ScenePlugin = js.native
  /**
    * A reference to the Sound Manager.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  override var sound: BaseSoundManager = js.native
  /**
    * The Scene Systems. You must never overwrite this property, or all hell will break lose.
    */
  /* CompleteClass */
  override var sys: Systems = js.native
  /**
    * A reference to the Texture Manager.
    * This property will only be available if defined in the Scene Injection Map.
    */
  /* CompleteClass */
  override var textures: TextureManager = js.native
  /**
    * A scene level Time and Clock Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  override var time: Clock = js.native
  /**
    * A scene level Tween Manager Plugin.
    * This property will only be available if defined in the Scene Injection Map and the plugin is installed.
    */
  /* CompleteClass */
  override var tweens: TweenManager = js.native
  /**
    * Should be overridden by your own Scenes.
    * This method is called once per game step while the scene is running.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  /* CompleteClass */
  override def update(time: Double, delta: Double): Unit = js.native
}

