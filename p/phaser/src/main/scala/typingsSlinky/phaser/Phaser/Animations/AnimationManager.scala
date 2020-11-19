package typingsSlinky.phaser.Phaser.Animations

import typingsSlinky.phaser.Phaser.Events.EventEmitter
import typingsSlinky.phaser.Phaser.Game
import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.Structs.Map
import typingsSlinky.phaser.Phaser.Textures.TextureManager
import typingsSlinky.phaser.Phaser.Types.Animations.GenerateFrameNames
import typingsSlinky.phaser.Phaser.Types.Animations.GenerateFrameNumbers
import typingsSlinky.phaser.Phaser.Types.Animations.JSONAnimation
import typingsSlinky.phaser.Phaser.Types.Animations.JSONAnimations
import typingsSlinky.phaser.integer
import typingsSlinky.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Animation Manager.
  * 
  * Animations are managed by the global Animation Manager. This is a singleton class that is
  * responsible for creating and delivering animations and their corresponding data to all Game Objects.
  * Unlike plugins it is owned by the Game instance, not the Scene.
  * 
  * Sprites and other Game Objects get the data they need from the AnimationManager.
  */
@js.native
trait AnimationManager extends EventEmitter {
  
  /**
    * Adds an existing Animation to the Animation Manager.
    * @param key The key under which the Animation should be added. The Animation will be updated with it. Must be unique.
    * @param animation The Animation which should be added to the Animation Manager.
    */
  def add(key: String, animation: Animation): this.type = js.native
  
  /**
    * The Animations registered in the Animation Manager.
    * 
    * This map should be modified with the {@link #add} and {@link #create} methods of the Animation Manager.
    */
  var anims: Map[String, Animation] = js.native
  
  /**
    * Registers event listeners after the Game boots.
    */
  def boot(): Unit = js.native
  
  /**
    * Creates a new Animation and adds it to the Animation Manager.
    * 
    * Animations are global. Once created, you can use them in any Scene in your game. They are not Scene specific.
    * 
    * If an invalid key is given this method will return `false`.
    * 
    * If you pass the key of an animation that already exists in the Animation Manager, that animation will be returned.
    * 
    * A brand new animation is only created if the key is valid and not already in use.
    * 
    * If you wish to re-use an existing key, call `AnimationManager.remove` first, then this method.
    * @param config The configuration settings for the Animation.
    */
  def create(config: typingsSlinky.phaser.Phaser.Types.Animations.Animation): Animation | `false` = js.native
  
  /**
    * Checks to see if the given key is already in use within the Animation Manager or not.
    * 
    * Animations are global. Keys created in one scene can be used from any other Scene in your game. They are not Scene specific.
    * @param key The key of the Animation to check.
    */
  def exists(key: String): Boolean = js.native
  
  /**
    * Loads this Animation Manager's Animations and settings from a JSON object.
    * @param data The JSON object to parse.
    * @param clearCurrentAnimations If set to `true`, the current animations will be removed (`anims.clear()`). If set to `false` (default), the animations in `data` will be added. Default false.
    */
  def fromJSON(data: String): js.Array[Animation] = js.native
  def fromJSON(data: String, clearCurrentAnimations: Boolean): js.Array[Animation] = js.native
  def fromJSON(data: JSONAnimation): js.Array[Animation] = js.native
  def fromJSON(data: JSONAnimation, clearCurrentAnimations: Boolean): js.Array[Animation] = js.native
  def fromJSON(data: JSONAnimations): js.Array[Animation] = js.native
  def fromJSON(data: JSONAnimations, clearCurrentAnimations: Boolean): js.Array[Animation] = js.native
  
  /**
    * A reference to the Phaser.Game instance.
    */
  var game: Game = js.native
  
  /**
    * Generate an array of {@link Phaser.Types.Animations.AnimationFrame} objects from a texture key and configuration object.
    * 
    * Generates objects with string based frame names, as configured by the given {@link Phaser.Types.Animations.GenerateFrameNames}.
    * 
    * It's a helper method, designed to make it easier for you to extract all of the frame names from texture atlases.
    * If you're working with a sprite sheet, see the `generateFrameNumbers` method instead.
    * 
    * Example:
    * 
    * If you have a texture atlases loaded called `gems` and it contains 6 frames called `ruby_0001`, `ruby_0002`, and so on,
    * then you can call this method using: `this.anims.generateFrameNames('gems', { prefix: 'ruby_', end: 6, zeroPad: 4 })`.
    * 
    * The `end` value tells it to look for 6 frames, incrementally numbered, all starting with the prefix `ruby_`. The `zeroPad`
    * value tells it how many zeroes pad out the numbers. To create an animation using this method, you can do:
    * 
    * ```javascript
    * this.anims.create({
    *   key: 'ruby',
    *   repeat: -1,
    *   frames: this.anims.generateFrameNames('gems', {
    *     prefix: 'ruby_',
    *     end: 6,
    *     zeroPad: 4
    *   })
    * });
    * ```
    * 
    * Please see the animation examples for further details.
    * @param key The key for the texture containing the animation frames.
    * @param config The configuration object for the animation frame names.
    */
  def generateFrameNames(key: String): js.Array[typingsSlinky.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
  def generateFrameNames(key: String, config: GenerateFrameNames): js.Array[typingsSlinky.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
  
  /**
    * Generate an array of {@link Phaser.Types.Animations.AnimationFrame} objects from a texture key and configuration object.
    * 
    * Generates objects with numbered frame names, as configured by the given {@link Phaser.Types.Animations.GenerateFrameNumbers}.
    * 
    * If you're working with a texture atlas, see the `generateFrameNames` method instead.
    * @param key The key for the texture containing the animation frames.
    * @param config The configuration object for the animation frames.
    */
  def generateFrameNumbers(key: String, config: GenerateFrameNumbers): js.Array[typingsSlinky.phaser.Phaser.Types.Animations.AnimationFrame] = js.native
  
  /**
    * Get an Animation.
    * @param key The key of the Animation to retrieve.
    */
  def get(key: String): Animation = js.native
  
  /**
    * The global time scale of the Animation Manager.
    * 
    * This scales the time delta between two frames, thus influencing the speed of time for the Animation Manager.
    */
  var globalTimeScale: Double = js.native
  
  /**
    * Load an Animation into a Game Object's Animation Component.
    * @param child The Game Object to load the animation into.
    * @param key The key of the animation to load.
    * @param startFrame The name of a start frame to set on the loaded animation.
    */
  def load(child: GameObject, key: String): GameObject = js.native
  def load(child: GameObject, key: String, startFrame: String): GameObject = js.native
  def load(child: GameObject, key: String, startFrame: integer): GameObject = js.native
  
  /**
    * The name of this Animation Manager.
    */
  var name: String = js.native
  
  /**
    * Pause all animations.
    */
  def pauseAll(): this.type = js.native
  
  /**
    * Whether the Animation Manager is paused along with all of its Animations.
    */
  var paused: Boolean = js.native
  
  def play(key: String, child: js.Array[GameObject]): this.type = js.native
  /**
    * Play an animation on the given Game Objects that have an Animation Component.
    * @param key The key of the animation to play on the Game Object.
    * @param child The Game Objects to play the animation on.
    */
  def play(key: String, child: GameObject): this.type = js.native
  
  /**
    * Removes an Animation from this Animation Manager, based on the given key.
    * 
    * This is a global action. Once an Animation has been removed, no Game Objects
    * can carry on using it.
    * @param key The key of the animation to remove.
    */
  def remove(key: String): Animation = js.native
  
  /**
    * Resume all paused animations.
    */
  def resumeAll(): this.type = js.native
  
  def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: js.Array[GameObject]): G = js.native
  def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: js.Array[GameObject], stagger: Double): G = js.native
  /**
    * Takes an array of Game Objects that have an Animation Component and then
    * starts the given animation playing on them, each one offset by the
    * `stagger` amount given to this method.
    * @param key The key of the animation to play on the Game Objects.
    * @param children An array of Game Objects to play the animation on. They must have an Animation Component.
    * @param stagger The amount of time, in milliseconds, to offset each play time by. Default 0.
    */
  def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: GameObject): G = js.native
  def staggerPlay[G /* <: js.Array[GameObject] */](key: String, children: GameObject, stagger: Double): G = js.native
  
  /**
    * A reference to the Texture Manager.
    */
  var textureManager: TextureManager = js.native
  
  /**
    * Returns the Animation data as JavaScript object based on the given key.
    * Or, if not key is defined, it will return the data of all animations as array of objects.
    * @param key The animation to get the JSONAnimation data from. If not provided, all animations are returned as an array.
    */
  def toJSON(): JSONAnimations = js.native
  def toJSON(key: String): JSONAnimations = js.native
}
