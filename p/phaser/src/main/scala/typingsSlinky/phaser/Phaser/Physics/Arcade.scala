package typingsSlinky.phaser.Phaser.Physics

import typingsSlinky.phaser.ArcadePhysicsCallback
import typingsSlinky.phaser.Phaser.Events.EventEmitter
import typingsSlinky.phaser.Phaser.GameObjects.GameObject
import typingsSlinky.phaser.Phaser.GameObjects.Graphics
import typingsSlinky.phaser.Phaser.Geom.Rectangle
import typingsSlinky.phaser.Phaser.Math.Vector2
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Acceleration
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Angular
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Bounce
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Debug
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Drag
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Enable
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Friction
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Gravity
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Immovable
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Mass
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Size
import typingsSlinky.phaser.Phaser.Physics.Arcade.Components.Velocity
import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.Phaser.Scenes.Systems
import typingsSlinky.phaser.Phaser.Structs.ProcessQueue
import typingsSlinky.phaser.Phaser.Structs.RTree
import typingsSlinky.phaser.Phaser.Structs.Set
import typingsSlinky.phaser.Phaser.Textures.Texture
import typingsSlinky.phaser.Phaser.Tilemaps.DynamicTilemapLayer
import typingsSlinky.phaser.Phaser.Tilemaps.StaticTilemapLayer
import typingsSlinky.phaser.Phaser.Tilemaps.Tile
import typingsSlinky.phaser.Phaser.Types.GameObjects.Group.GroupConfig
import typingsSlinky.phaser.Phaser.Types.GameObjects.Group.GroupCreateConfig
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeBodyBounds
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeBodyCollision
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeColliderType
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldDefaults
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ArcadeWorldTreeMinMax
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.CheckCollisionObject
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.GameObjectWithBody
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ImageWithDynamicBody
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.ImageWithStaticBody
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupConfig
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.PhysicsGroupDefaults
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.SpriteWithDynamicBody
import typingsSlinky.phaser.Phaser.Types.Physics.Arcade.SpriteWithStaticBody
import typingsSlinky.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arcade {
  
  /**
    * The Arcade Physics Plugin belongs to a Scene and sets up and manages the Scene's physics simulation.
    * It also holds some useful methods for moving and rotating Arcade Physics Bodies.
    * 
    * You can access it from within a Scene using `this.physics`.
    * 
    * Arcade Physics uses the Projection Method of collision resolution and separation. While it's fast and suitable
    * for 'arcade' style games it lacks stability when multiple objects are in close proximity or resting upon each other.
    * The separation that stops two objects penetrating may create a new penetration against a different object. If you
    * require a high level of stability please consider using an alternative physics system, such as Matter.js.
    */
  @js.native
  trait ArcadePhysics extends StObject {
    
    /**
      * Sets the acceleration.x/y property on the game object so it will move towards the x/y coordinates at the given rate (in pixels per second squared)
      * 
      * You must give a maximum speed value, beyond which the game object won't go any faster.
      * 
      * Note: The game object does not continuously track the target. If the target changes location during transit the game object will not modify its course.
      * Note: The game object doesn't stop moving once it reaches the destination coordinates.
      * @param gameObject Any Game Object with an Arcade Physics body.
      * @param x The x coordinate to accelerate towards.
      * @param y The y coordinate to accelerate towards.
      * @param speed The acceleration (change in speed) in pixels per second squared. Default 60.
      * @param xSpeedMax The maximum x velocity the game object can reach. Default 500.
      * @param ySpeedMax The maximum y velocity the game object can reach. Default 500.
      */
    def accelerateTo(gameObject: GameObject, x: Double, y: Double): Double = js.native
    def accelerateTo(
      gameObject: GameObject,
      x: Double,
      y: Double,
      speed: js.UndefOr[scala.Nothing],
      xSpeedMax: js.UndefOr[scala.Nothing],
      ySpeedMax: Double
    ): Double = js.native
    def accelerateTo(gameObject: GameObject, x: Double, y: Double, speed: js.UndefOr[scala.Nothing], xSpeedMax: Double): Double = js.native
    def accelerateTo(
      gameObject: GameObject,
      x: Double,
      y: Double,
      speed: js.UndefOr[scala.Nothing],
      xSpeedMax: Double,
      ySpeedMax: Double
    ): Double = js.native
    def accelerateTo(gameObject: GameObject, x: Double, y: Double, speed: Double): Double = js.native
    def accelerateTo(
      gameObject: GameObject,
      x: Double,
      y: Double,
      speed: Double,
      xSpeedMax: js.UndefOr[scala.Nothing],
      ySpeedMax: Double
    ): Double = js.native
    def accelerateTo(gameObject: GameObject, x: Double, y: Double, speed: Double, xSpeedMax: Double): Double = js.native
    def accelerateTo(gameObject: GameObject, x: Double, y: Double, speed: Double, xSpeedMax: Double, ySpeedMax: Double): Double = js.native
    
    /**
      * Sets the acceleration.x/y property on the game object so it will move towards the x/y coordinates at the given rate (in pixels per second squared)
      * 
      * You must give a maximum speed value, beyond which the game object won't go any faster.
      * 
      * Note: The game object does not continuously track the target. If the target changes location during transit the game object will not modify its course.
      * Note: The game object doesn't stop moving once it reaches the destination coordinates.
      * @param gameObject Any Game Object with an Arcade Physics body.
      * @param destination The Game Object to move towards. Can be any object but must have visible x/y properties.
      * @param speed The acceleration (change in speed) in pixels per second squared. Default 60.
      * @param xSpeedMax The maximum x velocity the game object can reach. Default 500.
      * @param ySpeedMax The maximum y velocity the game object can reach. Default 500.
      */
    def accelerateToObject(gameObject: GameObject, destination: GameObject): Double = js.native
    def accelerateToObject(
      gameObject: GameObject,
      destination: GameObject,
      speed: js.UndefOr[scala.Nothing],
      xSpeedMax: js.UndefOr[scala.Nothing],
      ySpeedMax: Double
    ): Double = js.native
    def accelerateToObject(
      gameObject: GameObject,
      destination: GameObject,
      speed: js.UndefOr[scala.Nothing],
      xSpeedMax: Double
    ): Double = js.native
    def accelerateToObject(
      gameObject: GameObject,
      destination: GameObject,
      speed: js.UndefOr[scala.Nothing],
      xSpeedMax: Double,
      ySpeedMax: Double
    ): Double = js.native
    def accelerateToObject(gameObject: GameObject, destination: GameObject, speed: Double): Double = js.native
    def accelerateToObject(
      gameObject: GameObject,
      destination: GameObject,
      speed: Double,
      xSpeedMax: js.UndefOr[scala.Nothing],
      ySpeedMax: Double
    ): Double = js.native
    def accelerateToObject(gameObject: GameObject, destination: GameObject, speed: Double, xSpeedMax: Double): Double = js.native
    def accelerateToObject(
      gameObject: GameObject,
      destination: GameObject,
      speed: Double,
      xSpeedMax: Double,
      ySpeedMax: Double
    ): Double = js.native
    
    /**
      * An object holding the Arcade Physics factory methods.
      */
    var add: Factory = js.native
    
    /**
      * Finds the Body or Game Object closest to a source point or object.
      * 
      * If a `targets` argument is passed, this method finds the closest of those.
      * The targets can be Arcade Physics Game Objects, Dynamic Bodies, or Static Bodies.
      * 
      * If no `targets` argument is passed, this method finds the closest Dynamic Body.
      * 
      * If two or more targets are the exact same distance from the source point, only the first target
      * is returned.
      * @param source Any object with public `x` and `y` properties, such as a Game Object or Geometry object.
      * @param targets The targets.
      */
    def closest(source: js.Any): Body | StaticBody | GameObject = js.native
    def closest(source: js.Any, targets: js.Array[Body | GameObject | StaticBody]): Body | StaticBody | GameObject = js.native
    
    /**
      * Performs a collision check and separation between the two physics enabled objects given, which can be single
      * Game Objects, arrays of Game Objects, Physics Groups, arrays of Physics Groups or normal Groups.
      * 
      * If you don't require separation then use {@link #overlap} instead.
      * 
      * If two Groups or arrays are passed, each member of one will be tested against each member of the other.
      * 
      * If **only** one Group is passed (as `object1`), each member of the Group will be collided against the other members.
      * 
      * If **only** one Array is passed, the array is iterated and every element in it is tested against the others.
      * 
      * Two callbacks can be provided. The `collideCallback` is invoked if a collision occurs and the two colliding
      * objects are passed to it.
      * 
      * Arcade Physics uses the Projection Method of collision resolution and separation. While it's fast and suitable
      * for 'arcade' style games it lacks stability when multiple objects are in close proximity or resting upon each other.
      * The separation that stops two objects penetrating may create a new penetration against a different object. If you
      * require a high level of stability please consider using an alternative physics system, such as Matter.js.
      * @param object1 The first object or array of objects to check.
      * @param object2 The second object or array of objects to check, or `undefined`.
      * @param collideCallback An optional callback function that is called if the objects collide.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def collide(object1: ArcadeColliderType): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(object1: ArcadeColliderType, object2: ArcadeColliderType): Boolean = js.native
    
    /**
      * This advanced method is specifically for testing for collision between a single Sprite and an array of Tile objects.
      * 
      * You should generally use the `collide` method instead, with a Sprite vs. a Tilemap Layer, as that will perform
      * tile filtering and culling for you, as well as handle the interesting face collision automatically.
      * 
      * This method is offered for those who would like to check for collision with specific Tiles in a layer, without
      * having to set any collision attributes on the tiles in question. This allows you to perform quick dynamic collisions
      * on small sets of Tiles. As such, no culling or checks are made to the array of Tiles given to this method,
      * you should filter them before passing them to this method.
      * 
      * Important: Use of this method skips the `interesting faces` system that Tilemap Layers use. This means if you have
      * say a row or column of tiles, and you jump into, or walk over them, it's possible to get stuck on the edges of the
      * tiles as the interesting face calculations are skipped. However, for quick-fire small collision set tests on
      * dynamic maps, this method can prove very useful.
      * @param sprite The first object to check for collision.
      * @param tiles An array of Tiles to check for collision against.
      * @param collideCallback An optional callback function that is called if the objects collide.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def collideTiles(sprite: GameObject, tiles: js.Array[Tile]): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collideTiles(sprite: GameObject, tiles: js.Array[Tile], collideCallback: ArcadePhysicsCallback): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    
    /**
      * A configuration object. Union of the `physics.arcade.*` properties of the GameConfig and SceneConfig objects.
      */
    var config: js.Object = js.native
    
    /**
      * The Scene that owns this plugin is being destroyed.
      * We need to shutdown and then kill off all external references.
      */
    def destroy(): Unit = js.native
    
    /**
      * Finds the Body or Game Object farthest from a source point or object.
      * 
      * If a `targets` argument is passed, this method finds the farthest of those.
      * The targets can be Arcade Physics Game Objects, Dynamic Bodies, or Static Bodies.
      * 
      * If no `targets` argument is passed, this method finds the farthest Dynamic Body.
      * 
      * If two or more targets are the exact same distance from the source point, only the first target
      * is returned.
      * @param source Any object with public `x` and `y` properties, such as a Game Object or Geometry object.
      * @param targets The targets.
      */
    def furthest(source: js.Any): Body | StaticBody | GameObject = js.native
    def furthest(source: js.Any, targets: js.Array[Body | GameObject | StaticBody]): Body | StaticBody | GameObject = js.native
    
    /**
      * Creates the physics configuration for the current Scene.
      */
    def getConfig(): js.Object = js.native
    
    /**
      * Move the given display object towards the x/y coordinates at a steady velocity.
      * If you specify a maxTime then it will adjust the speed (over-writing what you set) so it arrives at the destination in that number of seconds.
      * Timings are approximate due to the way browser timers work. Allow for a variance of +- 50ms.
      * Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
      * Note: The display object doesn't stop moving once it reaches the destination coordinates.
      * Note: Doesn't take into account acceleration, maxVelocity or drag (if you've set drag or acceleration too high this object may not move at all)
      * @param gameObject Any Game Object with an Arcade Physics body.
      * @param x The x coordinate to move towards.
      * @param y The y coordinate to move towards.
      * @param speed The speed it will move, in pixels per second (default is 60 pixels/sec) Default 60.
      * @param maxTime Time given in milliseconds (1000 = 1 sec). If set the speed is adjusted so the object will arrive at destination in the given number of ms. Default 0.
      */
    def moveTo(gameObject: GameObject, x: Double, y: Double): Double = js.native
    def moveTo(gameObject: GameObject, x: Double, y: Double, speed: js.UndefOr[scala.Nothing], maxTime: Double): Double = js.native
    def moveTo(gameObject: GameObject, x: Double, y: Double, speed: Double): Double = js.native
    def moveTo(gameObject: GameObject, x: Double, y: Double, speed: Double, maxTime: Double): Double = js.native
    
    /**
      * Move the given display object towards the destination object at a steady velocity.
      * If you specify a maxTime then it will adjust the speed (overwriting what you set) so it arrives at the destination in that number of seconds.
      * Timings are approximate due to the way browser timers work. Allow for a variance of +- 50ms.
      * Note: The display object does not continuously track the target. If the target changes location during transit the display object will not modify its course.
      * Note: The display object doesn't stop moving once it reaches the destination coordinates.
      * Note: Doesn't take into account acceleration, maxVelocity or drag (if you've set drag or acceleration too high this object may not move at all)
      * @param gameObject Any Game Object with an Arcade Physics body.
      * @param destination Any object with public `x` and `y` properties, such as a Game Object or Geometry object.
      * @param speed The speed it will move, in pixels per second (default is 60 pixels/sec) Default 60.
      * @param maxTime Time given in milliseconds (1000 = 1 sec). If set the speed is adjusted so the object will arrive at destination in the given number of ms. Default 0.
      */
    def moveToObject(gameObject: GameObject, destination: js.Object): Double = js.native
    def moveToObject(gameObject: GameObject, destination: js.Object, speed: js.UndefOr[scala.Nothing], maxTime: Double): Double = js.native
    def moveToObject(gameObject: GameObject, destination: js.Object, speed: Double): Double = js.native
    def moveToObject(gameObject: GameObject, destination: js.Object, speed: Double, maxTime: Double): Double = js.native
    
    /**
      * Tests if Game Objects overlap. See {@link Phaser.Physics.Arcade.World#overlap}
      * @param object1 The first object or array of objects to check.
      * @param object2 The second object or array of objects to check, or `undefined`.
      * @param collideCallback An optional callback function that is called if the objects collide.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they overlap. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def overlap(object1: ArcadeColliderType): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(object1: ArcadeColliderType, object2: ArcadeColliderType): Boolean = js.native
    
    /**
      * This method will search the given circular area and return an array of all physics bodies that
      * overlap with it. It can return either Dynamic, Static bodies or a mixture of both.
      * 
      * A body only has to intersect with the search area to be considered, it doesn't have to be fully
      * contained within it.
      * 
      * If Arcade Physics is set to use the RTree (which it is by default) then the search is rather fast,
      * otherwise the search is O(N) for Dynamic Bodies.
      * @param x The x coordinate of the center of the area to search within.
      * @param y The y coordinate of the center of the area to search within.
      * @param radius The radius of the area to search within.
      * @param includeDynamic Should the search include Dynamic Bodies? Default true.
      * @param includeStatic Should the search include Static Bodies? Default false.
      */
    def overlapCirc(x: Double, y: Double, radius: Double): js.Array[Body | StaticBody] = js.native
    def overlapCirc(
      x: Double,
      y: Double,
      radius: Double,
      includeDynamic: js.UndefOr[scala.Nothing],
      includeStatic: Boolean
    ): js.Array[Body | StaticBody] = js.native
    def overlapCirc(x: Double, y: Double, radius: Double, includeDynamic: Boolean): js.Array[Body | StaticBody] = js.native
    def overlapCirc(x: Double, y: Double, radius: Double, includeDynamic: Boolean, includeStatic: Boolean): js.Array[Body | StaticBody] = js.native
    
    /**
      * This method will search the given rectangular area and return an array of all physics bodies that
      * overlap with it. It can return either Dynamic, Static bodies or a mixture of both.
      * 
      * A body only has to intersect with the search area to be considered, it doesn't have to be fully
      * contained within it.
      * 
      * If Arcade Physics is set to use the RTree (which it is by default) then the search for is extremely fast,
      * otherwise the search is O(N) for Dynamic Bodies.
      * @param x The top-left x coordinate of the area to search within.
      * @param y The top-left y coordinate of the area to search within.
      * @param width The width of the area to search within.
      * @param height The height of the area to search within.
      * @param includeDynamic Should the search include Dynamic Bodies? Default true.
      * @param includeStatic Should the search include Static Bodies? Default false.
      */
    def overlapRect(x: Double, y: Double, width: Double, height: Double): js.Array[Body | StaticBody] = js.native
    def overlapRect(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      includeDynamic: js.UndefOr[scala.Nothing],
      includeStatic: Boolean
    ): js.Array[Body | StaticBody] = js.native
    def overlapRect(x: Double, y: Double, width: Double, height: Double, includeDynamic: Boolean): js.Array[Body | StaticBody] = js.native
    def overlapRect(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      includeDynamic: Boolean,
      includeStatic: Boolean
    ): js.Array[Body | StaticBody] = js.native
    
    /**
      * This advanced method is specifically for testing for overlaps between a single Sprite and an array of Tile objects.
      * 
      * You should generally use the `overlap` method instead, with a Sprite vs. a Tilemap Layer, as that will perform
      * tile filtering and culling for you, as well as handle the interesting face collision automatically.
      * 
      * This method is offered for those who would like to check for overlaps with specific Tiles in a layer, without
      * having to set any collision attributes on the tiles in question. This allows you to perform quick dynamic overlap
      * tests on small sets of Tiles. As such, no culling or checks are made to the array of Tiles given to this method,
      * you should filter them before passing them to this method.
      * @param sprite The first object to check for collision.
      * @param tiles An array of Tiles to check for collision against.
      * @param collideCallback An optional callback function that is called if the objects overlap.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def overlapTiles(sprite: GameObject, tiles: js.Array[Tile]): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def overlapTiles(sprite: GameObject, tiles: js.Array[Tile], collideCallback: ArcadePhysicsCallback): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    
    /**
      * Pauses the simulation.
      */
    def pause(): World = js.native
    
    /**
      * Resumes the simulation (if paused).
      */
    def resume(): World = js.native
    
    /**
      * The Scene that this Plugin belongs to.
      */
    var scene: Scene = js.native
    
    /**
      * The Scene that owns this plugin is shutting down.
      * We need to kill and reset all internal properties as well as stop listening to Scene events.
      */
    def shutdown(): Unit = js.native
    
    /**
      * The Scene's Systems.
      */
    var systems: Systems = js.native
    
    /**
      * Given the angle (in degrees) and speed calculate the velocity and return it as a vector, or set it to the given vector object.
      * One way to use this is: velocityFromAngle(angle, 200, sprite.body.velocity) which will set the values directly to the sprite's velocity and not create a new vector object.
      * @param angle The angle in degrees calculated in clockwise positive direction (down = 90 degrees positive, right = 0 degrees positive, up = 90 degrees negative)
      * @param speed The speed it will move, in pixels per second squared. Default 60.
      * @param vec2 The Vector2 in which the x and y properties will be set to the calculated velocity.
      */
    def velocityFromAngle(angle: Double): Vector2 = js.native
    def velocityFromAngle(angle: Double, speed: js.UndefOr[scala.Nothing], vec2: Vector2): Vector2 = js.native
    def velocityFromAngle(angle: Double, speed: Double): Vector2 = js.native
    def velocityFromAngle(angle: Double, speed: Double, vec2: Vector2): Vector2 = js.native
    
    /**
      * Given the rotation (in radians) and speed calculate the velocity and return it as a vector, or set it to the given vector object.
      * One way to use this is: velocityFromRotation(rotation, 200, sprite.body.velocity) which will set the values directly to the sprite's velocity and not create a new vector object.
      * @param rotation The angle in radians.
      * @param speed The speed it will move, in pixels per second squared Default 60.
      * @param vec2 The Vector2 in which the x and y properties will be set to the calculated velocity.
      */
    def velocityFromRotation(rotation: Double): Vector2 = js.native
    def velocityFromRotation(rotation: Double, speed: js.UndefOr[scala.Nothing], vec2: Vector2): Vector2 = js.native
    def velocityFromRotation(rotation: Double, speed: Double): Vector2 = js.native
    def velocityFromRotation(rotation: Double, speed: Double, vec2: Vector2): Vector2 = js.native
    
    /**
      * The physics simulation.
      */
    var world: World = js.native
  }
  
  /**
    * A Dynamic Arcade Body.
    * 
    * Its static counterpart is {@link Phaser.Physics.Arcade.StaticBody}.
    */
  @js.native
  trait Body extends StObject {
    
    /**
      * The Body's change in velocity, in pixels per second squared.
      */
    var acceleration: Vector2 = js.native
    
    /**
      * Whether this Body's velocity is affected by its `drag`.
      */
    var allowDrag: Boolean = js.native
    
    /**
      * Whether this Body's position is affected by gravity (local or world).
      */
    var allowGravity: Boolean = js.native
    
    /**
      * Whether this Body's `rotation` is affected by its angular acceleration and angular velocity.
      */
    var allowRotation: Boolean = js.native
    
    /**
      * The calculated angle of this Body's velocity vector, in radians, during the last step.
      */
    var angle: Double = js.native
    
    /**
      * The Body's angular acceleration (change in angular velocity), in degrees per second squared.
      */
    var angularAcceleration: Double = js.native
    
    /**
      * Loss of angular velocity due to angular movement, in degrees per second.
      * 
      * Angular drag is applied only when angular acceleration is zero.
      */
    var angularDrag: Double = js.native
    
    /**
      * The rate of change of this Body's `rotation`, in degrees per second.
      */
    var angularVelocity: Double = js.native
    
    /**
      * Whether this Body is colliding with a Static Body, a tile, or the world boundary.
      * In a collision with a Static Body, if this Body has zero velocity then `embedded` will be set instead.
      */
    var blocked: ArcadeBodyCollision = js.native
    
    /**
      * The bottom edge of this Body.
      */
    val bottom: Double = js.native
    
    /**
      * Rebound following a collision, relative to 1.
      */
    var bounce: Vector2 = js.native
    
    /**
      * The center of the Body.
      * The midpoint of its `position` (top-left corner) and its bottom-right corner.
      */
    var center: Vector2 = js.native
    
    /**
      * Whether this Body is checked for collisions and for which directions.
      * You can set `checkCollision.none = true` to disable collision checks.
      */
    var checkCollision: ArcadeBodyCollision = js.native
    
    /**
      * Checks for collisions between this Body and the world boundary and separates them.
      */
    def checkWorldBounds(): Boolean = js.native
    
    /**
      * Whether this Body interacts with the world boundary.
      */
    var collideWorldBounds: Boolean = js.native
    
    /**
      * The rectangle used for world boundary collisions.
      * 
      * By default it is set to the world boundary rectangle. Or, if this Body was
      * created by a Physics Group, then whatever rectangle that Group defined.
      * 
      * You can also change it by using the `Body.setBoundsRectangle` method.
      */
    var customBoundsRectangle: Rectangle = js.native
    
    /**
      * A flag disabling the default horizontal separation of colliding bodies.
      * Pass your own `collideCallback` to the collider.
      */
    var customSeparateX: Boolean = js.native
    
    /**
      * A flag disabling the default vertical separation of colliding bodies.
      * Pass your own `collideCallback` to the collider.
      */
    var customSeparateY: Boolean = js.native
    
    /**
      * The color of this Body on the debug display.
      */
    var debugBodyColor: integer = js.native
    
    /**
      * Whether the Body is drawn to the debug display.
      */
    var debugShowBody: Boolean = js.native
    
    /**
      * Whether the Body's velocity is drawn to the debug display.
      */
    var debugShowVelocity: Boolean = js.native
    
    /**
      * The absolute (non-negative) change in this Body's horizontal position from the previous step.
      */
    def deltaAbsX(): Double = js.native
    
    /**
      * The absolute (non-negative) change in this Body's vertical position from the previous step.
      */
    def deltaAbsY(): Double = js.native
    
    /**
      * The Body's absolute maximum change in position, in pixels per step.
      */
    var deltaMax: Vector2 = js.native
    
    /**
      * The change in this Body's horizontal position from the previous step.
      * This value is set during the Body's update phase.
      * 
      * As a Body can update multiple times per step this may not hold the final
      * delta value for the Body. In this case, please see the `deltaXFinal` method.
      */
    def deltaX(): Double = js.native
    
    /**
      * The change in this Body's horizontal position from the previous game update.
      * 
      * This value is set during the `postUpdate` phase and takes into account the
      * `deltaMax` and final position of the Body.
      * 
      * Because this value is not calculated until `postUpdate`, you must listen for it
      * during a Scene `POST_UPDATE` or `RENDER` event, and not in `update`, as it will
      * not be calculated by that point. If you _do_ use these values in `update` they
      * will represent the delta from the _previous_ game frame.
      */
    def deltaXFinal(): Double = js.native
    
    /**
      * The change in this Body's vertical position from the previous step.
      * This value is set during the Body's update phase.
      * 
      * As a Body can update multiple times per step this may not hold the final
      * delta value for the Body. In this case, please see the `deltaYFinal` method.
      */
    def deltaY(): Double = js.native
    
    /**
      * The change in this Body's vertical position from the previous game update.
      * 
      * This value is set during the `postUpdate` phase and takes into account the
      * `deltaMax` and final position of the Body.
      * 
      * Because this value is not calculated until `postUpdate`, you must listen for it
      * during a Scene `POST_UPDATE` or `RENDER` event, and not in `update`, as it will
      * not be calculated by that point. If you _do_ use these values in `update` they
      * will represent the delta from the _previous_ game frame.
      */
    def deltaYFinal(): Double = js.native
    
    /**
      * The change in this Body's rotation from the previous step, in degrees.
      */
    def deltaZ(): Double = js.native
    
    /**
      * Disables this Body and marks it for deletion by the simulation.
      */
    def destroy(): Unit = js.native
    
    /**
      * When `useDamping` is false (the default), this is absolute loss of velocity due to movement, in pixels per second squared.
      * 
      * When `useDamping` is true, this is 1 minus the damping factor.
      * A value of 1 means the Body loses no velocity.
      * A value of 0.95 means the Body loses 5% of its velocity per step.
      * A value of 0.5 means the Body loses 50% of its velocity per step.
      * 
      * The x and y components are applied separately.
      * 
      * Drag is applied only when `acceleration` is zero.
      */
    var drag: Vector2 = js.native
    
    /**
      * Draws this Body and its velocity, if enabled.
      * @param graphic The Graphics object to draw on.
      */
    def drawDebug(graphic: Graphics): Unit = js.native
    
    /**
      * Whether this Body is overlapped with another and both are not moving, on at least one axis.
      */
    var embedded: Boolean = js.native
    
    /**
      * Whether this Body is updated by the physics simulation.
      */
    var enable: Boolean = js.native
    
    /**
      * The direction of the Body's velocity, as calculated during the last step.
      * This is a numeric constant value (FACING_UP, FACING_DOWN, FACING_LEFT, FACING_RIGHT).
      * If the Body is moving on both axes, this describes motion on the vertical axis only.
      */
    var facing: integer = js.native
    
    /**
      * If this Body is `immovable` and in motion, `friction` is the proportion of this Body's motion received by the riding Body on each axis, relative to 1.
      * The horizontal component (x) is applied only when two colliding Bodies are separated vertically.
      * The vertical component (y) is applied only when two colliding Bodies are separated horizontally.
      * The default value (1, 0) moves the riding Body horizontally in equal proportion to this Body and vertically not at all.
      */
    var friction: Vector2 = js.native
    
    /**
      * The Game Object this Body belongs to.
      */
    var gameObject: GameObject = js.native
    
    /**
      * Copies the coordinates of this Body's edges into an object.
      * @param obj An object to copy the values into.
      */
    def getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = js.native
    
    /**
      * Acceleration due to gravity (specific to this Body), in pixels per second squared.
      * Total gravity is the sum of this vector and the simulation's `gravity`.
      */
    var gravity: Vector2 = js.native
    
    /**
      * Half the Body's height, in pixels.
      */
    var halfHeight: Double = js.native
    
    /**
      * Half the Body's width, in pixels.
      */
    var halfWidth: Double = js.native
    
    /**
      * The height of the Body, in pixels.
      * If the Body is circular, this is also the diameter.
      * If you wish to change the height use the `Body.setSize` method.
      */
    val height: Double = js.native
    
    /**
      * Tests if the coordinates are within this Body.
      * @param x The horizontal coordinate.
      * @param y The vertical coordinate.
      */
    def hitTest(x: Double, y: Double): Boolean = js.native
    
    /**
      * Whether this Body can be moved by collisions with another Body.
      */
    var immovable: Boolean = js.native
    
    /**
      * Whether this Body is circular (true) or rectangular (false).
      */
    var isCircle: Boolean = js.native
    
    /**
      * The left edge of the Body. Identical to x.
      */
    val left: Double = js.native
    
    /**
      * The Body's inertia, relative to a default unit (1).
      * With `bounce`, this affects the exchange of momentum (velocities) during collisions.
      */
    var mass: Double = js.native
    
    /**
      * The Body's maximum angular velocity, in degrees per second.
      */
    var maxAngular: Double = js.native
    
    /**
      * The maximum speed this Body is allowed to reach, in pixels per second.
      * 
      * If not negative it limits the scalar value of speed.
      * 
      * Any negative value means no maximum is being applied (the default).
      */
    var maxSpeed: Double = js.native
    
    /**
      * The Body's absolute maximum velocity, in pixels per second.
      * The horizontal and vertical components are applied separately.
      */
    var maxVelocity: Vector2 = js.native
    
    /**
      * Whether the Body's position and rotation are affected by its velocity, acceleration, drag, and gravity.
      */
    var moves: Boolean = js.native
    
    /**
      * The Body's change in position (due to velocity) at the last step, in pixels.
      * 
      * The size of this value depends on the simulation's step rate.
      */
    val newVelocity: Vector2 = js.native
    
    /**
      * The offset of this Body's position from its Game Object's position, in source pixels.
      */
    var offset: Vector2 = js.native
    
    /**
      * Whether this Body is touching a tile or the world boundary while moving up.
      */
    def onCeiling(): Boolean = js.native
    
    /**
      * Whether the simulation emits a `collide` event when this Body collides with another.
      */
    var onCollide: Boolean = js.native
    
    /**
      * Whether this Body is touching a tile or the world boundary while moving down.
      */
    def onFloor(): Boolean = js.native
    
    /**
      * Whether the simulation emits an `overlap` event when this Body overlaps with another.
      */
    var onOverlap: Boolean = js.native
    
    /**
      * Whether this Body is touching a tile or the world boundary while moving left or right.
      */
    def onWall(): Boolean = js.native
    
    /**
      * Whether the simulation emits a `worldbounds` event when this Body collides with the world boundary (and `collideWorldBounds` is also true).
      */
    var onWorldBounds: Boolean = js.native
    
    /**
      * The amount of overlap (before separation), if this Body is circular and colliding with another circular body.
      */
    var overlapR: Double = js.native
    
    /**
      * The amount of horizontal overlap (before separation), if this Body is colliding with another.
      */
    var overlapX: Double = js.native
    
    /**
      * The amount of vertical overlap (before separation), if this Body is colliding with another.
      */
    var overlapY: Double = js.native
    
    /**
      * The Body's physics type (dynamic or static).
      */
    val physicsType: integer = js.native
    
    /**
      * The position of this Body within the simulation.
      */
    var position: Vector2 = js.native
    
    /**
      * Feeds the Body results back into the parent Game Object.
      * 
      * This method is called every game frame, regardless if the world steps or not.
      */
    def postUpdate(): Unit = js.native
    
    /**
      * The Body rotation, in degrees, during the previous step.
      */
    var preRotation: Double = js.native
    
    /**
      * Syncs the position body position with the parent Game Object.
      * 
      * This method is called every game frame, regardless if the world steps or not.
      * @param willStep Will this Body run an update as well?
      * @param delta The delta time, in seconds, elapsed since the last frame.
      */
    def preUpdate(willStep: Boolean, delta: Double): Unit = js.native
    
    /**
      * The position of this Body during the previous step.
      */
    var prev: Vector2 = js.native
    
    /**
      * The position of this Body during the previous frame.
      */
    var prevFrame: Vector2 = js.native
    
    /**
      * If this Body is circular, this is the unscaled radius of the Body, as set by setCircle(), in source pixels.
      * The true radius is equal to `halfWidth`.
      */
    var radius: Double = js.native
    
    /**
      * Resets this Body to the given coordinates. Also positions its parent Game Object to the same coordinates.
      * If the Body had any velocity or acceleration it is lost as a result of calling this.
      * @param x The horizontal position to place the Game Object and Body.
      * @param y The vertical position to place the Game Object and Body.
      */
    def reset(x: Double, y: Double): Unit = js.native
    
    /**
      * Prepares the Body for a physics step by resetting the `wasTouching`, `touching` and `blocked` states.
      * 
      * This method is only called if the physics world is going to run a step this frame.
      */
    def resetFlags(): Unit = js.native
    
    /**
      * The right edge of the Body.
      */
    val right: Double = js.native
    
    /**
      * This body's rotation, in degrees, based on its angular acceleration and angular velocity.
      * The Body's rotation controls the `angle` of its Game Object.
      * It doesn't rotate the Body's own geometry, which is always an axis-aligned rectangle or a circle.
      */
    var rotation: Double = js.native
    
    /**
      * Sets the Body's acceleration.
      * @param x The horizontal component, in pixels per second squared.
      * @param y The vertical component, in pixels per second squared.
      */
    def setAcceleration(x: Double, y: Double): Body = js.native
    
    /**
      * Sets the Body's horizontal acceleration.
      * @param value The acceleration, in pixels per second squared.
      */
    def setAccelerationX(value: Double): Body = js.native
    
    /**
      * Sets the Body's vertical acceleration.
      * @param value The acceleration, in pixels per second squared.
      */
    def setAccelerationY(value: Double): Body = js.native
    
    /**
      * Enables or disables drag.
      * @param value `true` to allow drag on this body, or `false` to disable it. Default true.
      */
    def setAllowDrag(): Body = js.native
    def setAllowDrag(value: Boolean): Body = js.native
    
    /**
      * Enables or disables gravity's effect on this Body.
      * @param value `true` to allow gravity on this body, or `false` to disable it. Default true.
      */
    def setAllowGravity(): Body = js.native
    def setAllowGravity(value: Boolean): Body = js.native
    
    /**
      * Enables or disables rotation.
      * @param value `true` to allow rotation on this body, or `false` to disable it. Default true.
      */
    def setAllowRotation(): Body = js.native
    def setAllowRotation(value: Boolean): Body = js.native
    
    /**
      * Sets the Body's angular acceleration.
      * @param value The acceleration, in degrees per second squared.
      */
    def setAngularAcceleration(value: Double): Body = js.native
    
    /**
      * Sets the Body's angular drag.
      * @param value The drag, in degrees per second squared.
      */
    def setAngularDrag(value: Double): Body = js.native
    
    /**
      * Sets the Body's angular velocity.
      * @param value The velocity, in degrees per second.
      */
    def setAngularVelocity(value: Double): Body = js.native
    
    /**
      * Sets the Body's bounce.
      * @param x The horizontal bounce, relative to 1.
      * @param y The vertical bounce, relative to 1.
      */
    def setBounce(x: Double, y: Double): Body = js.native
    
    /**
      * Sets the Body's horizontal bounce.
      * @param value The bounce, relative to 1.
      */
    def setBounceX(value: Double): Body = js.native
    
    /**
      * Sets the Body's vertical bounce.
      * @param value The bounce, relative to 1.
      */
    def setBounceY(value: Double): Body = js.native
    
    /**
      * Sets a custom collision boundary rectangle. Use if you want to have a custom
      * boundary instead of the world boundaries.
      * @param bounds The new boundary rectangle. Pass `null` to use the World bounds.
      */
    def setBoundsRectangle(): this.type = js.native
    def setBoundsRectangle(bounds: Rectangle): this.type = js.native
    
    /**
      * Sizes and positions this Body, as a circle.
      * @param radius The radius of the Body, in source pixels.
      * @param offsetX The horizontal offset of the Body from its Game Object, in source pixels.
      * @param offsetY The vertical offset of the Body from its Game Object, in source pixels.
      */
    def setCircle(radius: Double): Body = js.native
    def setCircle(radius: Double, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): Body = js.native
    def setCircle(radius: Double, offsetX: Double): Body = js.native
    def setCircle(radius: Double, offsetX: Double, offsetY: Double): Body = js.native
    
    /**
      * Sets whether this Body collides with the world boundary.
      * 
      * Optionally also sets the World Bounce values. If the `Body.worldBounce` is null, it's set to a new Phaser.Math.Vector2 first.
      * @param value `true` if this body should collide with the world bounds, otherwise `false`. Default true.
      * @param bounceX If given this will be replace the `worldBounce.x` value.
      * @param bounceY If given this will be replace the `worldBounce.y` value.
      */
    def setCollideWorldBounds(): Body = js.native
    def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: js.UndefOr[scala.Nothing], bounceY: Double): Body = js.native
    def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: Double): Body = js.native
    def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: Double, bounceY: Double): Body = js.native
    def setCollideWorldBounds(value: Boolean): Body = js.native
    def setCollideWorldBounds(value: Boolean, bounceX: js.UndefOr[scala.Nothing], bounceY: Double): Body = js.native
    def setCollideWorldBounds(value: Boolean, bounceX: Double): Body = js.native
    def setCollideWorldBounds(value: Boolean, bounceX: Double, bounceY: Double): Body = js.native
    
    /**
      * Sets the Body's drag.
      * @param x The horizontal component, in pixels per second squared.
      * @param y The vertical component, in pixels per second squared.
      */
    def setDrag(x: Double, y: Double): Body = js.native
    
    /**
      * Sets the Body's horizontal drag.
      * @param value The drag, in pixels per second squared.
      */
    def setDragX(value: Double): Body = js.native
    
    /**
      * Sets the Body's vertical drag.
      * @param value The drag, in pixels per second squared.
      */
    def setDragY(value: Double): Body = js.native
    
    /**
      * Sets the Body's `enable` property.
      * @param value The value to assign to `enable`. Default true.
      */
    def setEnable(): Body = js.native
    def setEnable(value: Boolean): Body = js.native
    
    /**
      * Sets the Body's friction.
      * @param x The horizontal component, relative to 1.
      * @param y The vertical component, relative to 1.
      */
    def setFriction(x: Double, y: Double): Body = js.native
    
    /**
      * Sets the Body's horizontal friction.
      * @param value The friction value, relative to 1.
      */
    def setFrictionX(value: Double): Body = js.native
    
    /**
      * Sets the Body's vertical friction.
      * @param value The friction value, relative to 1.
      */
    def setFrictionY(value: Double): Body = js.native
    
    /**
      * Sets the Body's gravity.
      * @param x The horizontal component, in pixels per second squared.
      * @param y The vertical component, in pixels per second squared.
      */
    def setGravity(x: Double, y: Double): Body = js.native
    
    /**
      * Sets the Body's horizontal gravity.
      * @param value The gravity, in pixels per second squared.
      */
    def setGravityX(value: Double): Body = js.native
    
    /**
      * Sets the Body's vertical gravity.
      * @param value The gravity, in pixels per second squared.
      */
    def setGravityY(value: Double): Body = js.native
    
    /**
      * Sets the Body's `immovable` property.
      * @param value The value to assign to `immovable`. Default true.
      */
    def setImmovable(): Body = js.native
    def setImmovable(value: Boolean): Body = js.native
    
    /**
      * Sets the Body's mass.
      * @param value The mass value, relative to 1.
      */
    def setMass(value: Double): Body = js.native
    
    /**
      * Sets the maximum speed the Body can move.
      * @param value The maximum speed value, in pixels per second. Set to a negative value to disable.
      */
    def setMaxSpeed(value: Double): Body = js.native
    
    /**
      * Sets the Body's maximum velocity.
      * @param x The horizontal velocity, in pixels per second.
      * @param y The vertical velocity, in pixels per second. Default x.
      */
    def setMaxVelocity(x: Double): Body = js.native
    def setMaxVelocity(x: Double, y: Double): Body = js.native
    
    /**
      * Sets the offset of the Body's position from its Game Object's position.
      * @param x The horizontal offset, in source pixels.
      * @param y The vertical offset, in source pixels. Default x.
      */
    def setOffset(x: Double): Body = js.native
    def setOffset(x: Double, y: Double): Body = js.native
    
    /**
      * Sizes and positions this Body, as a rectangle.
      * Modifies the Body `offset` if `center` is true (the default).
      * Resets the width and height to match current frame, if no width and height provided and a frame is found.
      * @param width The width of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame width.
      * @param height The height of the Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame height.
      * @param center Modify the Body's `offset`, placing the Body's center on its Game Object's center. Only works if the Game Object has the `getCenter` method. Default true.
      */
    def setSize(): Body = js.native
    def setSize(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], center: Boolean): Body = js.native
    def setSize(width: js.UndefOr[scala.Nothing], height: integer): Body = js.native
    def setSize(width: js.UndefOr[scala.Nothing], height: integer, center: Boolean): Body = js.native
    def setSize(width: integer): Body = js.native
    def setSize(width: integer, height: js.UndefOr[scala.Nothing], center: Boolean): Body = js.native
    def setSize(width: integer, height: integer): Body = js.native
    def setSize(width: integer, height: integer, center: Boolean): Body = js.native
    
    /**
      * Sets the Body's velocity.
      * @param x The horizontal velocity, in pixels per second.
      * @param y The vertical velocity, in pixels per second. Default x.
      */
    def setVelocity(x: Double): Body = js.native
    def setVelocity(x: Double, y: Double): Body = js.native
    
    /**
      * Sets the Body's horizontal velocity.
      * @param value The velocity, in pixels per second.
      */
    def setVelocityX(value: Double): Body = js.native
    
    /**
      * Sets the Body's vertical velocity.
      * @param value The velocity, in pixels per second.
      */
    def setVelocityY(value: Double): Body = js.native
    
    /**
      * The unscaled height of the Body, in source pixels, as set by setSize().
      * The default is the height of the Body's Game Object's texture frame.
      */
    var sourceHeight: Double = js.native
    
    /**
      * The unscaled width of the Body, in source pixels, as set by setSize().
      * The default is the width of the Body's Game Object's texture frame.
      */
    var sourceWidth: Double = js.native
    
    /**
      * The calculated magnitude of the Body's velocity, in pixels per second, during the last step.
      */
    var speed: Double = js.native
    
    /**
      * Sets acceleration, velocity, and speed to zero.
      */
    def stop(): Body = js.native
    
    /**
      * Whether to automatically synchronize this Body's dimensions to the dimensions of its Game Object's visual bounds.
      */
    var syncBounds: Boolean = js.native
    
    /**
      * The top edge of the Body. Identical to y.
      */
    val top: Double = js.native
    
    /**
      * Whether this Body is colliding with a Body or Static Body and in which direction.
      * In a collision where both bodies have zero velocity, `embedded` will be set instead.
      */
    var touching: ArcadeBodyCollision = js.native
    
    /**
      * Transformations applied to this Body.
      */
    var transform: js.Object = js.native
    
    /**
      * Performs a single physics step and updates the body velocity, angle, speed and other properties.
      * 
      * This method can be called multiple times per game frame, depending on the physics step rate.
      * 
      * The results are synced back to the Game Object in `postUpdate`.
      * @param delta The delta time, in seconds, elapsed since the last frame.
      */
    def update(delta: Double): Unit = js.native
    
    /**
      * Updates the Body's `transform`, `width`, `height`, and `center` from its Game Object.
      * The Body's `position` isn't changed.
      */
    def updateBounds(): Unit = js.native
    
    /**
      * Updates the Body's `center` from its `position`, `width`, and `height`.
      */
    def updateCenter(): Unit = js.native
    
    /**
      * Updates the Body's `position`, `width`, `height`, and `center` from its Game Object and `offset`.
      * 
      * You don't need to call this for Dynamic Bodies, as it happens automatically during the physics step.
      * But you could use it if you have modified the Body offset or Game Object transform and need to immediately
      * read the Body's new `position` or `center`.
      * 
      * To resynchronize the Body with its Game Object, use `reset()` instead.
      */
    def updateFromGameObject(): Unit = js.native
    
    /**
      * If this Body is using `drag` for deceleration this property controls how the drag is applied.
      * If set to `true` drag will use a damping effect rather than a linear approach. If you are
      * creating a game where the Body moves freely at any angle (i.e. like the way the ship moves in
      * the game Asteroids) then you will get a far smoother and more visually correct deceleration
      * by using damping, avoiding the axis-drift that is prone with linear deceleration.
      * 
      * If you enable this property then you should use far smaller `drag` values than with linear, as
      * they are used as a multiplier on the velocity. Values such as 0.95 will give a nice slow
      * deceleration, where-as smaller values, such as 0.5 will stop an object almost immediately.
      */
    var useDamping: Boolean = js.native
    
    /**
      * The Body's velocity, in pixels per second.
      */
    var velocity: Vector2 = js.native
    
    /**
      * This Body's `touching` value during the previous step.
      */
    var wasTouching: ArcadeBodyCollision = js.native
    
    /**
      * The width of the Body, in pixels.
      * If the Body is circular, this is also the diameter.
      * If you wish to change the width use the `Body.setSize` method.
      */
    val width: Double = js.native
    
    /**
      * Whether this Body will be drawn to the debug display.
      */
    def willDrawDebug(): Boolean = js.native
    
    /**
      * The Arcade Physics simulation this Body belongs to.
      */
    var world: World = js.native
    
    /**
      * Rebound following a collision with the world boundary, relative to 1.
      * If null, `bounce` is used instead.
      */
    var worldBounce: Vector2 = js.native
    
    /**
      * The Body's horizontal position (left edge).
      */
    var x: Double = js.native
    
    /**
      * The Body's vertical position (top edge).
      */
    var y: Double = js.native
  }
  
  /**
    * An Arcade Physics Collider will automatically check for collision, or overlaps, between two objects
    * every step. If a collision, or overlap, occurs it will invoke the given callbacks.
    */
  @js.native
  trait Collider extends StObject {
    
    /**
      * Whether the collider is active.
      */
    var active: Boolean = js.native
    
    /**
      * The context the collideCallback and processCallback will run in.
      */
    var callbackContext: js.Object = js.native
    
    /**
      * The callback to invoke when the two objects collide.
      */
    def collideCallback(object1: GameObjectWithBody, object2: GameObjectWithBody): Unit = js.native
    /**
      * The callback to invoke when the two objects collide.
      */
    @JSName("collideCallback")
    var collideCallback_Original: ArcadePhysicsCallback = js.native
    
    /**
      * Removes Collider from World and disposes of its resources.
      */
    def destroy(): Unit = js.native
    
    /**
      * The name of the collider (unused by Phaser).
      */
    var name: String = js.native
    
    /**
      * The first object to check for collision.
      */
    var object1: ArcadeColliderType = js.native
    
    /**
      * The second object to check for collision.
      */
    var object2: ArcadeColliderType = js.native
    
    /**
      * Whether to check for collisions or overlaps.
      */
    var overlapOnly: Boolean = js.native
    
    /**
      * If a processCallback exists it must return true or collision checking will be skipped.
      */
    def processCallback(object1: GameObjectWithBody, object2: GameObjectWithBody): Unit = js.native
    /**
      * If a processCallback exists it must return true or collision checking will be skipped.
      */
    @JSName("processCallback")
    var processCallback_Original: ArcadePhysicsCallback = js.native
    
    /**
      * A name for the Collider.
      * 
      * Phaser does not use this value, it's for your own reference.
      * @param name The name to assign to the Collider.
      */
    def setName(name: String): Collider = js.native
    
    /**
      * Called by World as part of its step processing, initial operation of collision checking.
      */
    def update(): Unit = js.native
    
    /**
      * The world in which the bodies will collide.
      */
    var world: World = js.native
  }
  
  object Components {
    
    /**
      * Provides methods used for setting the acceleration properties of an Arcade Physics Body.
      */
    @js.native
    trait Acceleration extends StObject {
      
      /**
        * Sets the body's horizontal and vertical acceleration. If the vertical acceleration value is not provided, the vertical acceleration is set to the same value as the horizontal acceleration.
        * @param x The horizontal acceleration
        * @param y The vertical acceleration Default x.
        */
      def setAcceleration(x: Double): this.type = js.native
      def setAcceleration(x: Double, y: Double): this.type = js.native
      
      /**
        * Sets the body's horizontal acceleration.
        * @param value The horizontal acceleration
        */
      def setAccelerationX(value: Double): this.type = js.native
      
      /**
        * Sets the body's vertical acceleration.
        * @param value The vertical acceleration
        */
      def setAccelerationY(value: Double): this.type = js.native
    }
    
    /**
      * Provides methods used for setting the angular acceleration properties of an Arcade Physics Body.
      */
    @js.native
    trait Angular extends StObject {
      
      /**
        * Sets the angular acceleration of the body.
        * 
        * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
        * However, they can have angular motion, which is passed on to the Game Object bound to the body,
        * causing them to visually rotate, even though the body remains axis-aligned.
        * @param value The amount of angular acceleration.
        */
      def setAngularAcceleration(value: Double): this.type = js.native
      
      /**
        * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
        * @param value The amount of drag.
        */
      def setAngularDrag(value: Double): this.type = js.native
      
      /**
        * Sets the angular velocity of the body.
        * 
        * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
        * However, they can have angular motion, which is passed on to the Game Object bound to the body,
        * causing them to visually rotate, even though the body remains axis-aligned.
        * @param value The amount of angular velocity.
        */
      def setAngularVelocity(value: Double): this.type = js.native
    }
    object Angular {
      
      @scala.inline
      def apply(
        setAngularAcceleration: Double => Angular,
        setAngularDrag: Double => Angular,
        setAngularVelocity: Double => Angular
      ): Angular = {
        val __obj = js.Dynamic.literal(setAngularAcceleration = js.Any.fromFunction1(setAngularAcceleration), setAngularDrag = js.Any.fromFunction1(setAngularDrag), setAngularVelocity = js.Any.fromFunction1(setAngularVelocity))
        __obj.asInstanceOf[Angular]
      }
      
      @scala.inline
      implicit class AngularMutableBuilder[Self <: Angular] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetAngularAcceleration(value: Double => Angular): Self = StObject.set(x, "setAngularAcceleration", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAngularDrag(value: Double => Angular): Self = StObject.set(x, "setAngularDrag", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAngularVelocity(value: Double => Angular): Self = StObject.set(x, "setAngularVelocity", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Provides methods used for setting the bounce properties of an Arcade Physics Body.
      */
    @js.native
    trait Bounce extends StObject {
      
      /**
        * Sets the bounce values of this body.
        * 
        * Bounce is the amount of restitution, or elasticity, the body has when it collides with another object.
        * A value of 1 means that it will retain its full velocity after the rebound. A value of 0 means it will not rebound at all.
        * @param x The amount of horizontal bounce to apply on collision. A float, typically between 0 and 1.
        * @param y The amount of vertical bounce to apply on collision. A float, typically between 0 and 1. Default x.
        */
      def setBounce(x: Double): this.type = js.native
      def setBounce(x: Double, y: Double): this.type = js.native
      
      /**
        * Sets the horizontal bounce value for this body.
        * @param value The amount of horizontal bounce to apply on collision. A float, typically between 0 and 1.
        */
      def setBounceX(value: Double): this.type = js.native
      
      /**
        * Sets the vertical bounce value for this body.
        * @param value The amount of vertical bounce to apply on collision. A float, typically between 0 and 1.
        */
      def setBounceY(value: Double): this.type = js.native
      
      /**
        * Sets whether this Body collides with the world boundary.
        * 
        * Optionally also sets the World Bounce values. If the `Body.worldBounce` is null, it's set to a new Phaser.Math.Vector2 first.
        * @param value `true` if this body should collide with the world bounds, otherwise `false`. Default true.
        * @param bounceX If given this will be replace the `worldBounce.x` value.
        * @param bounceY If given this will be replace the `worldBounce.y` value.
        */
      def setCollideWorldBounds(): this.type = js.native
      def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: js.UndefOr[scala.Nothing], bounceY: Double): this.type = js.native
      def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: Double): this.type = js.native
      def setCollideWorldBounds(value: js.UndefOr[scala.Nothing], bounceX: Double, bounceY: Double): this.type = js.native
      def setCollideWorldBounds(value: Boolean): this.type = js.native
      def setCollideWorldBounds(value: Boolean, bounceX: js.UndefOr[scala.Nothing], bounceY: Double): this.type = js.native
      def setCollideWorldBounds(value: Boolean, bounceX: Double): this.type = js.native
      def setCollideWorldBounds(value: Boolean, bounceX: Double, bounceY: Double): this.type = js.native
    }
    
    /**
      * Provides methods used for setting the debug properties of an Arcade Physics Body.
      */
    @js.native
    trait Debug extends StObject {
      
      /**
        * The color of the body outline when it renders to the debug display.
        */
      var debugBodyColor: Double = js.native
      
      /**
        * Set to `true` to have this body render its outline to the debug display.
        */
      var debugShowBody: Boolean = js.native
      
      /**
        * Set to `true` to have this body render a velocity marker to the debug display.
        */
      var debugShowVelocity: Boolean = js.native
      
      /**
        * Sets the debug values of this body.
        * 
        * Bodies will only draw their debug if debug has been enabled for Arcade Physics as a whole.
        * Note that there is a performance cost in drawing debug displays. It should never be used in production.
        * @param showBody Set to `true` to have this body render its outline to the debug display.
        * @param showVelocity Set to `true` to have this body render a velocity marker to the debug display.
        * @param bodyColor The color of the body outline when rendered to the debug display.
        */
      def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): this.type = js.native
      
      /**
        * Sets the color of the body outline when it renders to the debug display.
        * @param value The color of the body outline when rendered to the debug display.
        */
      def setDebugBodyColor(value: Double): this.type = js.native
    }
    object Debug {
      
      @scala.inline
      def apply(
        debugBodyColor: Double,
        debugShowBody: Boolean,
        debugShowVelocity: Boolean,
        setDebug: (Boolean, Boolean, Double) => Debug,
        setDebugBodyColor: Double => Debug
      ): Debug = {
        val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], setDebug = js.Any.fromFunction3(setDebug), setDebugBodyColor = js.Any.fromFunction1(setDebugBodyColor))
        __obj.asInstanceOf[Debug]
      }
      
      @scala.inline
      implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDebugBodyColor(value: Double): Self = StObject.set(x, "debugBodyColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugShowBody(value: Boolean): Self = StObject.set(x, "debugShowBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugShowVelocity(value: Boolean): Self = StObject.set(x, "debugShowVelocity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetDebug(value: (Boolean, Boolean, Double) => Debug): Self = StObject.set(x, "setDebug", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetDebugBodyColor(value: Double => Debug): Self = StObject.set(x, "setDebugBodyColor", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Provides methods used for setting the drag properties of an Arcade Physics Body.
      */
    @js.native
    trait Drag extends StObject {
      
      /**
        * If this Body is using `drag` for deceleration this function controls how the drag is applied.
        * If set to `true` drag will use a damping effect rather than a linear approach. If you are
        * creating a game where the Body moves freely at any angle (i.e. like the way the ship moves in
        * the game Asteroids) then you will get a far smoother and more visually correct deceleration
        * by using damping, avoiding the axis-drift that is prone with linear deceleration.
        * 
        * If you enable this property then you should use far smaller `drag` values than with linear, as
        * they are used as a multiplier on the velocity. Values such as 0.95 will give a nice slow
        * deceleration, where-as smaller values, such as 0.5 will stop an object almost immediately.
        * @param value `true` to use damping for deceleration, or `false` to use linear deceleration.
        */
      def setDamping(value: Boolean): this.type = js.native
      
      /**
        * Sets the body's horizontal and vertical drag. If the vertical drag value is not provided, the vertical drag is set to the same value as the horizontal drag.
        * 
        * Drag can be considered as a form of deceleration that will return the velocity of a body back to zero over time.
        * It is the absolute loss of velocity due to movement, in pixels per second squared.
        * The x and y components are applied separately.
        * 
        * When `useDamping` is true, this is 1 minus the damping factor.
        * A value of 1 means the Body loses no velocity.
        * A value of 0.95 means the Body loses 5% of its velocity per step.
        * A value of 0.5 means the Body loses 50% of its velocity per step.
        * 
        * Drag is applied only when `acceleration` is zero.
        * @param x The amount of horizontal drag to apply.
        * @param y The amount of vertical drag to apply. Default x.
        */
      def setDrag(x: Double): this.type = js.native
      def setDrag(x: Double, y: Double): this.type = js.native
      
      /**
        * Sets the body's horizontal drag.
        * 
        * Drag can be considered as a form of deceleration that will return the velocity of a body back to zero over time.
        * It is the absolute loss of velocity due to movement, in pixels per second squared.
        * The x and y components are applied separately.
        * 
        * When `useDamping` is true, this is 1 minus the damping factor.
        * A value of 1 means the Body loses no velocity.
        * A value of 0.95 means the Body loses 5% of its velocity per step.
        * A value of 0.5 means the Body loses 50% of its velocity per step.
        * 
        * Drag is applied only when `acceleration` is zero.
        * @param value The amount of horizontal drag to apply.
        */
      def setDragX(value: Double): this.type = js.native
      
      /**
        * Sets the body's vertical drag.
        * 
        * Drag can be considered as a form of deceleration that will return the velocity of a body back to zero over time.
        * It is the absolute loss of velocity due to movement, in pixels per second squared.
        * The x and y components are applied separately.
        * 
        * When `useDamping` is true, this is 1 minus the damping factor.
        * A value of 1 means the Body loses no velocity.
        * A value of 0.95 means the Body loses 5% of its velocity per step.
        * A value of 0.5 means the Body loses 50% of its velocity per step.
        * 
        * Drag is applied only when `acceleration` is zero.
        * @param value The amount of vertical drag to apply.
        */
      def setDragY(value: Double): this.type = js.native
    }
    
    /**
      * Provides methods used for setting the enable properties of an Arcade Physics Body.
      */
    @js.native
    trait Enable extends StObject {
      
      /**
        * Stops and disables this Game Object's Body.
        * @param disableGameObject Also deactivate this Game Object. Default false.
        * @param hideGameObject Also hide this Game Object. Default false.
        */
      def disableBody(): this.type = js.native
      def disableBody(disableGameObject: js.UndefOr[scala.Nothing], hideGameObject: Boolean): this.type = js.native
      def disableBody(disableGameObject: Boolean): this.type = js.native
      def disableBody(disableGameObject: Boolean, hideGameObject: Boolean): this.type = js.native
      
      /**
        * Enables this Game Object's Body.
        * @param reset Also reset the Body and place it at (x, y).
        * @param x The horizontal position to place the Game Object and Body.
        * @param y The horizontal position to place the Game Object and Body.
        * @param enableGameObject Also activate this Game Object.
        * @param showGameObject Also show this Game Object.
        */
      def enableBody(reset: Boolean, x: Double, y: Double, enableGameObject: Boolean, showGameObject: Boolean): this.type = js.native
      
      /**
        * Syncs the Body's position and size with its parent Game Object.
        * You don't need to call this for Dynamic Bodies, as it happens automatically.
        * But for Static bodies it's a useful way of modifying the position of a Static Body
        * in the Physics World, based on its Game Object.
        */
      def refreshBody(): this.type = js.native
    }
    
    /**
      * Methods for setting the friction of an Arcade Physics Body.
      * 
      * In Arcade Physics, friction is a special case of motion transfer from an "immovable" body to a riding body.
      */
    @js.native
    trait Friction extends StObject {
      
      /**
        * Sets the friction of this game object's physics body.
        * In Arcade Physics, friction is a special case of motion transfer from an "immovable" body to a riding body.
        * @param x The amount of horizontal friction to apply, [0, 1].
        * @param y The amount of vertical friction to apply, [0, 1]. Default x.
        */
      def setFriction(x: Double): this.type = js.native
      def setFriction(x: Double, y: Double): this.type = js.native
      
      /**
        * Sets the horizontal friction of this game object's physics body.
        * This can move a riding body horizontally when it collides with this one on the vertical axis.
        * @param x The amount of friction to apply, [0, 1].
        */
      def setFrictionX(x: Double): this.type = js.native
      
      /**
        * Sets the vertical friction of this game object's physics body.
        * This can move a riding body vertically when it collides with this one on the horizontal axis.
        * @param y The amount of friction to apply, [0, 1].
        */
      def setFrictionY(y: Double): this.type = js.native
    }
    
    /**
      * Provides methods for setting the gravity properties of an Arcade Physics Game Object.
      * Should be applied as a mixin and not used directly.
      */
    @js.native
    trait Gravity extends StObject {
      
      /**
        * Set the X and Y values of the gravitational pull to act upon this Arcade Physics Game Object. Values can be positive or negative. Larger values result in a stronger effect.
        * 
        * If only one value is provided, this value will be used for both the X and Y axis.
        * @param x The gravitational force to be applied to the X-axis.
        * @param y The gravitational force to be applied to the Y-axis. If this is not specified, the X value will be used. Default x.
        */
      def setGravity(x: Double): this.type = js.native
      def setGravity(x: Double, y: Double): this.type = js.native
      
      /**
        * Set the gravitational force to be applied to the X axis. Value can be positive or negative. Larger values result in a stronger effect.
        * @param x The gravitational force to be applied to the X-axis.
        */
      def setGravityX(x: Double): this.type = js.native
      
      /**
        * Set the gravitational force to be applied to the Y axis. Value can be positive or negative. Larger values result in a stronger effect.
        * @param y The gravitational force to be applied to the Y-axis.
        */
      def setGravityY(y: Double): this.type = js.native
    }
    
    /**
      * Provides methods used for setting the immovable properties of an Arcade Physics Body.
      */
    @js.native
    trait Immovable extends StObject {
      
      /**
        * Sets Whether this Body can be moved by collisions with another Body.
        * @param value Sets if this body can be moved by collisions with another Body. Default true.
        */
      def setImmovable(): this.type = js.native
      def setImmovable(value: Boolean): this.type = js.native
    }
    
    /**
      * Provides methods used for setting the mass properties of an Arcade Physics Body.
      */
    @js.native
    trait Mass extends StObject {
      
      /**
        * Sets the mass of the physics body
        * @param value New value for the mass of the body.
        */
      def setMass(value: Double): this.type = js.native
    }
    object Mass {
      
      @scala.inline
      def apply(setMass: Double => Mass): Mass = {
        val __obj = js.Dynamic.literal(setMass = js.Any.fromFunction1(setMass))
        __obj.asInstanceOf[Mass]
      }
      
      @scala.inline
      implicit class MassMutableBuilder[Self <: Mass] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetMass(value: Double => Mass): Self = StObject.set(x, "setMass", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * This method will search the given circular area and return an array of all physics bodies that
      * overlap with it. It can return either Dynamic, Static bodies or a mixture of both.
      * 
      * A body only has to intersect with the search area to be considered, it doesn't have to be fully
      * contained within it.
      * 
      * If Arcade Physics is set to use the RTree (which it is by default) then the search is rather fast,
      * otherwise the search is O(N) for Dynamic Bodies.
      */
    @js.native
    trait OverlapCirc extends StObject
    
    /**
      * This method will search the given rectangular area and return an array of all physics bodies that
      * overlap with it. It can return either Dynamic, Static bodies or a mixture of both.
      * 
      * A body only has to intersect with the search area to be considered, it doesn't have to be fully
      * contained within it.
      * 
      * If Arcade Physics is set to use the RTree (which it is by default) then the search for is extremely fast,
      * otherwise the search is O(N) for Dynamic Bodies.
      */
    @js.native
    trait OverlapRect extends StObject
    
    /**
      * Provides methods for setting the size of an Arcade Physics Game Object.
      * Should be applied as a mixin and not used directly.
      */
    @js.native
    trait Size extends StObject {
      
      /**
        * Sets the size of this physics body. Setting the size does not adjust the dimensions of the parent Game Object.
        * @param width The new width of the physics body, in pixels.
        * @param height The new height of the physics body, in pixels.
        * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
        */
      def setBodySize(width: Double, height: Double): this.type = js.native
      def setBodySize(width: Double, height: Double, center: Boolean): this.type = js.native
      
      /**
        * Sets this physics body to use a circle for collision instead of a rectangle.
        * @param radius The radius of the physics body, in pixels.
        * @param offsetX The amount to offset the body from the parent Game Object along the x-axis.
        * @param offsetY The amount to offset the body from the parent Game Object along the y-axis.
        */
      def setCircle(radius: Double): this.type = js.native
      def setCircle(radius: Double, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): this.type = js.native
      def setCircle(radius: Double, offsetX: Double): this.type = js.native
      def setCircle(radius: Double, offsetX: Double, offsetY: Double): this.type = js.native
      
      /**
        * Sets the body offset. This allows you to adjust the difference between the center of the body
        * and the x and y coordinates of the parent Game Object.
        * @param x The amount to offset the body from the parent Game Object along the x-axis.
        * @param y The amount to offset the body from the parent Game Object along the y-axis. Defaults to the value given for the x-axis. Default x.
        */
      def setOffset(x: Double): this.type = js.native
      def setOffset(x: Double, y: Double): this.type = js.native
      
      /**
        * **DEPRECATED**: Please use `setBodySize` instead.
        * 
        * Sets the size of this physics body. Setting the size does not adjust the dimensions of the parent Game Object.
        * @param width The new width of the physics body, in pixels.
        * @param height The new height of the physics body, in pixels.
        * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
        */
      def setSize(width: Double, height: Double): this.type = js.native
      def setSize(width: Double, height: Double, center: Boolean): this.type = js.native
    }
    
    /**
      * Provides methods for modifying the velocity of an Arcade Physics body.
      * 
      * Should be applied as a mixin and not used directly.
      */
    @js.native
    trait Velocity extends StObject {
      
      /**
        * Sets the maximum velocity of the body.
        * @param x The new maximum horizontal velocity.
        * @param y The new maximum vertical velocity. Default x.
        */
      def setMaxVelocity(x: Double): this.type = js.native
      def setMaxVelocity(x: Double, y: Double): this.type = js.native
      
      /**
        * Sets the velocity of the Body.
        * @param x The horizontal velocity of the body. Positive values move the body to the right, while negative values move it to the left.
        * @param y The vertical velocity of the body. Positive values move the body down, while negative values move it up. Default x.
        */
      def setVelocity(x: Double): this.type = js.native
      def setVelocity(x: Double, y: Double): this.type = js.native
      
      /**
        * Sets the horizontal component of the body's velocity.
        * 
        * Positive values move the body to the right, while negative values move it to the left.
        * @param x The new horizontal velocity.
        */
      def setVelocityX(x: Double): this.type = js.native
      
      /**
        * Sets the vertical component of the body's velocity.
        * 
        * Positive values move the body down, while negative values move it up.
        * @param y The new vertical velocity of the body.
        */
      def setVelocityY(y: Double): this.type = js.native
    }
  }
  
  /**
    * The Arcade Physics Factory allows you to easily create Arcade Physics enabled Game Objects.
    * Objects that are created by this Factory are automatically added to the physics world.
    */
  @js.native
  trait Factory extends StObject {
    
    /**
      * Creates a new Arcade Physics Collider object.
      * @param object1 The first object to check for collision.
      * @param object2 The second object to check for collision.
      * @param collideCallback The callback to invoke when the two objects collide.
      * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
      * @param callbackContext The scope in which to call the callbacks.
      */
    def collider(
      object1: GameObject | (js.Array[GameObject | typingsSlinky.phaser.Phaser.GameObjects.Group]) | typingsSlinky.phaser.Phaser.GameObjects.Group,
      object2: GameObject | (js.Array[GameObject | typingsSlinky.phaser.Phaser.GameObjects.Group]) | typingsSlinky.phaser.Phaser.GameObjects.Group,
      collideCallback: js.UndefOr[ArcadePhysicsCallback],
      processCallback: js.UndefOr[ArcadePhysicsCallback],
      callbackContext: js.UndefOr[js.Any]
    ): Collider = js.native
    
    /**
      * Destroys this Factory.
      */
    def destroy(): Unit = js.native
    
    /**
      * Adds an Arcade Physics Body to the given Game Object.
      * @param gameObject A Game Object.
      * @param isStatic Create a Static body (true) or Dynamic body (false). Default false.
      */
    def existing(gameObject: GameObject): GameObjectWithBody = js.native
    def existing(gameObject: GameObject, isStatic: Boolean): GameObjectWithBody = js.native
    
    /**
      * Creates a Physics Group object.
      * All Game Objects created by this Group will automatically be dynamic Arcade Physics objects.
      * @param children Game Objects to add to this group; or the `config` argument.
      * @param config Settings for this group.
      */
    def group(): Group = js.native
    def group(children: js.UndefOr[scala.Nothing], config: GroupCreateConfig): Group = js.native
    def group(children: js.UndefOr[scala.Nothing], config: PhysicsGroupConfig): Group = js.native
    def group(children: js.Array[GameObject]): Group = js.native
    def group(children: js.Array[GameObject], config: GroupCreateConfig): Group = js.native
    def group(children: js.Array[GameObject], config: PhysicsGroupConfig): Group = js.native
    def group(children: GroupCreateConfig): Group = js.native
    def group(children: GroupCreateConfig, config: GroupCreateConfig): Group = js.native
    def group(children: GroupCreateConfig, config: PhysicsGroupConfig): Group = js.native
    def group(children: PhysicsGroupConfig): Group = js.native
    def group(children: PhysicsGroupConfig, config: GroupCreateConfig): Group = js.native
    def group(children: PhysicsGroupConfig, config: PhysicsGroupConfig): Group = js.native
    
    /**
      * Creates a new Arcade Image object with a Dynamic body.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def image(x: Double, y: Double, texture: String): ImageWithDynamicBody = js.native
    def image(x: Double, y: Double, texture: String, frame: String): ImageWithDynamicBody = js.native
    def image(x: Double, y: Double, texture: String, frame: integer): ImageWithDynamicBody = js.native
    def image(x: Double, y: Double, texture: Texture): ImageWithDynamicBody = js.native
    def image(x: Double, y: Double, texture: Texture, frame: String): ImageWithDynamicBody = js.native
    def image(x: Double, y: Double, texture: Texture, frame: integer): ImageWithDynamicBody = js.native
    
    /**
      * Creates a new Arcade Physics Collider Overlap object.
      * @param object1 The first object to check for overlap.
      * @param object2 The second object to check for overlap.
      * @param collideCallback The callback to invoke when the two objects collide.
      * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
      * @param callbackContext The scope in which to call the callbacks.
      */
    def overlap(
      object1: GameObject | (js.Array[GameObject | typingsSlinky.phaser.Phaser.GameObjects.Group]) | typingsSlinky.phaser.Phaser.GameObjects.Group,
      object2: GameObject | (js.Array[GameObject | typingsSlinky.phaser.Phaser.GameObjects.Group]) | typingsSlinky.phaser.Phaser.GameObjects.Group,
      collideCallback: js.UndefOr[ArcadePhysicsCallback],
      processCallback: js.UndefOr[ArcadePhysicsCallback],
      callbackContext: js.UndefOr[js.Any]
    ): Collider = js.native
    
    /**
      * A reference to the Scene this Arcade Physics instance belongs to.
      */
    var scene: Scene = js.native
    
    /**
      * Creates a new Arcade Sprite object with a Dynamic body.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param key The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def sprite(x: Double, y: Double, key: String): SpriteWithDynamicBody = js.native
    def sprite(x: Double, y: Double, key: String, frame: String): SpriteWithDynamicBody = js.native
    def sprite(x: Double, y: Double, key: String, frame: integer): SpriteWithDynamicBody = js.native
    
    /**
      * Creates a Static Physics Group object.
      * All Game Objects created by this Group will automatically be static Arcade Physics objects.
      * @param children Game Objects to add to this group; or the `config` argument.
      * @param config Settings for this group.
      */
    def staticGroup(): StaticGroup = js.native
    def staticGroup(children: js.UndefOr[scala.Nothing], config: GroupConfig): StaticGroup = js.native
    def staticGroup(children: js.UndefOr[scala.Nothing], config: GroupCreateConfig): StaticGroup = js.native
    def staticGroup(children: js.Array[GameObject]): StaticGroup = js.native
    def staticGroup(children: js.Array[GameObject], config: GroupConfig): StaticGroup = js.native
    def staticGroup(children: js.Array[GameObject], config: GroupCreateConfig): StaticGroup = js.native
    def staticGroup(children: GroupConfig): StaticGroup = js.native
    def staticGroup(children: GroupConfig, config: GroupConfig): StaticGroup = js.native
    def staticGroup(children: GroupConfig, config: GroupCreateConfig): StaticGroup = js.native
    def staticGroup(children: GroupCreateConfig): StaticGroup = js.native
    def staticGroup(children: GroupCreateConfig, config: GroupConfig): StaticGroup = js.native
    def staticGroup(children: GroupCreateConfig, config: GroupCreateConfig): StaticGroup = js.native
    
    /**
      * Creates a new Arcade Image object with a Static body.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def staticImage(x: Double, y: Double, texture: String): ImageWithStaticBody = js.native
    def staticImage(x: Double, y: Double, texture: String, frame: String): ImageWithStaticBody = js.native
    def staticImage(x: Double, y: Double, texture: String, frame: integer): ImageWithStaticBody = js.native
    def staticImage(x: Double, y: Double, texture: Texture): ImageWithStaticBody = js.native
    def staticImage(x: Double, y: Double, texture: Texture, frame: String): ImageWithStaticBody = js.native
    def staticImage(x: Double, y: Double, texture: Texture, frame: integer): ImageWithStaticBody = js.native
    
    /**
      * Creates a new Arcade Sprite object with a Static body.
      * @param x The horizontal position of this Game Object in the world.
      * @param y The vertical position of this Game Object in the world.
      * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      * @param frame An optional frame from the Texture this Game Object is rendering with.
      */
    def staticSprite(x: Double, y: Double, texture: String): SpriteWithStaticBody = js.native
    def staticSprite(x: Double, y: Double, texture: String, frame: String): SpriteWithStaticBody = js.native
    def staticSprite(x: Double, y: Double, texture: String, frame: integer): SpriteWithStaticBody = js.native
    def staticSprite(x: Double, y: Double, texture: Texture): SpriteWithStaticBody = js.native
    def staticSprite(x: Double, y: Double, texture: Texture, frame: String): SpriteWithStaticBody = js.native
    def staticSprite(x: Double, y: Double, texture: Texture, frame: integer): SpriteWithStaticBody = js.native
    
    /**
      * A reference to the Scene.Systems this Arcade Physics instance belongs to.
      */
    var sys: Systems = js.native
    
    /**
      * A reference to the Arcade Physics World.
      */
    var world: World = js.native
  }
  
  /**
    * An Arcade Physics Group object.
    * 
    * All Game Objects created by or added to this Group will automatically be given dynamic Arcade Physics bodies, if they have no body.
    * 
    * Its static counterpart is {@link Phaser.Physics.Arcade.StaticGroup}.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
  trait Group
    extends typingsSlinky.phaser.Phaser.GameObjects.Group {
    
    /**
      * Enables a Game Object's Body and assigns `defaults`. Called when a Group member is added or created.
      * @param child The Game Object being added.
      */
    def createCallbackHandler(child: GameObject): Unit = js.native
    
    /**
      * Default physics properties applied to Game Objects added to the Group or created by the Group. Derived from the `config` argument.
      */
    var defaults: PhysicsGroupDefaults = js.native
    
    /**
      * The physics type of the Group's members.
      */
    var physicsType: integer = js.native
    
    /**
      * Disables a Game Object's Body. Called when a Group member is removed.
      * @param child The Game Object being removed.
      */
    def removeCallbackHandler(child: GameObject): Unit = js.native
    
    /**
      * Sets the velocity of each Group member.
      * @param x The horizontal velocity.
      * @param y The vertical velocity.
      * @param step The velocity increment. When set, the first member receives velocity (x, y), the second (x + step, y + step), and so on. Default 0.
      */
    def setVelocity(x: Double, y: Double): Group = js.native
    def setVelocity(x: Double, y: Double, step: Double): Group = js.native
    
    /**
      * Sets the horizontal velocity of each Group member.
      * @param value The velocity value.
      * @param step The velocity increment. When set, the first member receives velocity (x), the second (x + step), and so on. Default 0.
      */
    def setVelocityX(value: Double): Group = js.native
    def setVelocityX(value: Double, step: Double): Group = js.native
    
    /**
      * Sets the vertical velocity of each Group member.
      * @param value The velocity value.
      * @param step The velocity increment. When set, the first member receives velocity (y), the second (y + step), and so on. Default 0.
      */
    def setVelocityY(value: Double): Group = js.native
    def setVelocityY(value: Double, step: Double): Group = js.native
    
    /**
      * The physics simulation.
      */
    var world: World = js.native
  }
  
  /**
    * An Arcade Physics Image is an Image with an Arcade Physics body and related components.
    * The body can be dynamic or static.
    * 
    * The main difference between an Arcade Image and an Arcade Sprite is that you cannot animate an Arcade Image.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited
  - typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @js.native
  trait Image
    extends typingsSlinky.phaser.Phaser.GameObjects.Image
       with Acceleration
       with Angular
       with Bounce
       with Debug
       with Drag
       with Enable
       with Friction
       with Gravity
       with Immovable
       with Mass
       with Size
       with Velocity {
    
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* InferMemberOverrides */
    override def setSize(width: Double, height: Double): this.type = js.native
  }
  
  /**
    * An Arcade Physics Sprite is a Sprite with an Arcade Physics body and related components.
    * The body can be dynamic or static.
    * 
    * The main difference between an Arcade Sprite and an Arcade Image is that you cannot animate an Arcade Image.
    * If you do not require animation then you can safely use Arcade Images instead of Arcade Sprites.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited
  - typingsSlinky.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @js.native
  trait Sprite
    extends typingsSlinky.phaser.Phaser.GameObjects.Sprite
       with Acceleration
       with Angular
       with Bounce
       with Debug
       with Drag
       with Enable
       with Friction
       with Gravity
       with Immovable
       with Mass
       with Size
       with Velocity {
    
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* InferMemberOverrides */
    override def setSize(width: Double, height: Double): this.type = js.native
  }
  
  /**
    * A Static Arcade Physics Body.
    * 
    * A Static Body never moves, and isn't automatically synchronized with its parent Game Object.
    * That means if you make any change to the parent's origin, position, or scale after creating or adding the body, you'll need to update the Static Body manually.
    * 
    * A Static Body can collide with other Bodies, but is never moved by collisions.
    * 
    * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Body}.
    */
  @js.native
  trait StaticBody extends StObject {
    
    /**
      * A constant `false` value expected by the Arcade Physics simulation.
      */
    val allowGravity: Boolean = js.native
    
    /**
      * Whether this StaticBody has ever collided with a tile or the world boundary.
      */
    var blocked: ArcadeBodyCollision = js.native
    
    /**
      * The lowest y coordinate of the area of the StaticBody. (y + height)
      */
    val bottom: Double = js.native
    
    /**
      * Rebound, or restitution, following a collision, relative to 1. Always zero for a Static Body.
      */
    val bounce: Vector2 = js.native
    
    /**
      * The center of the Static Body's boundary.
      * This is the midpoint of its `position` (top-left corner) and its bottom-right corner.
      */
    var center: Vector2 = js.native
    
    /**
      * Whether this StaticBody is checked for collisions and for which directions. You can set `checkCollision.none = false` to disable collision checks.
      */
    var checkCollision: ArcadeBodyCollision = js.native
    
    /**
      * Whether this StaticBody interacts with the world boundary.
      * Always false for a Static Body. (Static Bodies never collide with the world boundary.)
      */
    val collideWorldBounds: Boolean = js.native
    
    /**
      * A flag disabling the default horizontal separation of colliding bodies. Pass your own `collideHandler` to the collider.
      */
    var customSeparateX: Boolean = js.native
    
    /**
      * A flag disabling the default vertical separation of colliding bodies. Pass your own `collideHandler` to the collider.
      */
    var customSeparateY: Boolean = js.native
    
    /**
      * The color of this Static Body on the debug display.
      */
    var debugBodyColor: integer = js.native
    
    /**
      * Whether the Static Body's boundary is drawn to the debug display.
      */
    var debugShowBody: Boolean = js.native
    
    /**
      * The absolute (non-negative) change in this StaticBody's horizontal position from the previous step. Always zero.
      */
    def deltaAbsX(): Double = js.native
    
    /**
      * The absolute (non-negative) change in this StaticBody's vertical position from the previous step. Always zero.
      */
    def deltaAbsY(): Double = js.native
    
    /**
      * The change in this StaticBody's horizontal position from the previous step. Always zero.
      */
    def deltaX(): Double = js.native
    
    /**
      * The change in this StaticBody's vertical position from the previous step. Always zero.
      */
    def deltaY(): Double = js.native
    
    /**
      * The change in this StaticBody's rotation from the previous step. Always zero.
      */
    def deltaZ(): Double = js.native
    
    /**
      * Disables this Body and marks it for destruction during the next step.
      */
    def destroy(): Unit = js.native
    
    /**
      * Draws a graphical representation of the StaticBody for visual debugging purposes.
      * @param graphic The Graphics object to use for the debug drawing of the StaticBody.
      */
    def drawDebug(graphic: Graphics): Unit = js.native
    
    /**
      * Whether this StaticBody has ever overlapped with another while both were not moving.
      */
    var embedded: Boolean = js.native
    
    /**
      * Whether this Static Body is updated by the physics simulation.
      */
    var enable: Boolean = js.native
    
    /**
      * The Game Object this Static Body belongs to.
      */
    var gameObject: GameObject = js.native
    
    /**
      * Returns the x and y coordinates of the top left and bottom right points of the StaticBody.
      * @param obj The object which will hold the coordinates of the bounds.
      */
    def getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = js.native
    
    /**
      * Gravitational force applied specifically to this Body. Values are in pixels per second squared. Always zero for a Static Body.
      */
    val gravity: Vector2 = js.native
    
    /**
      * Half the Static Body's height, in pixels.
      * If the Static Body is circular, this is also the Static Body's radius.
      */
    var halfHeight: Double = js.native
    
    /**
      * Half the Static Body's width, in pixels.
      * If the Static Body is circular, this is also the Static Body's radius.
      */
    var halfWidth: Double = js.native
    
    /**
      * The height of the Static Body's boundary, in pixels.
      * If the Static Body is circular, this is also the Static Body's diameter.
      */
    var height: Double = js.native
    
    /**
      * Checks to see if a given x,y coordinate is colliding with this Static Body.
      * @param x The x coordinate to check against this body.
      * @param y The y coordinate to check against this body.
      */
    def hitTest(x: Double, y: Double): Boolean = js.native
    
    /**
      * Whether this object can be moved by collisions with another body.
      */
    var immovable: Boolean = js.native
    
    /**
      * Whether this Static Body's boundary is circular (`true`) or rectangular (`false`).
      */
    var isCircle: Boolean = js.native
    
    /**
      * Returns the left-most x coordinate of the area of the StaticBody.
      */
    val left: Double = js.native
    
    /**
      * The StaticBody's inertia, relative to a default unit (1). With `bounce`, this affects the exchange of momentum (velocities) during collisions.
      */
    var mass: Double = js.native
    
    /**
      * The offset set by {@link Phaser.Physics.Arcade.StaticBody#setCircle} or {@link Phaser.Physics.Arcade.StaticBody#setSize}.
      * 
      * This doesn't affect the Static Body's position, because a Static Body does not follow its Game Object.
      */
    val offset: Vector2 = js.native
    
    /**
      * Whether the simulation emits a `collide` event when this StaticBody collides with another.
      */
    var onCollide: Boolean = js.native
    
    /**
      * Whether the simulation emits an `overlap` event when this StaticBody overlaps with another.
      */
    var onOverlap: Boolean = js.native
    
    /**
      * Whether the simulation emits a `worldbounds` event when this StaticBody collides with the world boundary.
      * Always false for a Static Body. (Static Bodies never collide with the world boundary and never trigger a `worldbounds` event.)
      */
    val onWorldBounds: Boolean = js.native
    
    /**
      * The amount of overlap (before separation), if this StaticBody is circular and colliding with another circular body.
      */
    var overlapR: Double = js.native
    
    /**
      * The amount of horizontal overlap (before separation), if this Body is colliding with another.
      */
    var overlapX: Double = js.native
    
    /**
      * The amount of vertical overlap (before separation), if this Body is colliding with another.
      */
    var overlapY: Double = js.native
    
    /**
      * The StaticBody's physics type (static by default).
      */
    var physicsType: integer = js.native
    
    /**
      * The position of this Static Body within the simulation.
      */
    var position: Vector2 = js.native
    
    /**
      * NOOP
      */
    def postUpdate(): Unit = js.native
    
    /**
      * If this Static Body is circular, this is the radius of the boundary, as set by {@link Phaser.Physics.Arcade.StaticBody#setCircle}, in pixels.
      * Equal to `halfWidth`.
      */
    var radius: Double = js.native
    
    /**
      * Resets this Body to the given coordinates. Also positions its parent Game Object to the same coordinates.
      * @param x The x coordinate to reset the body to. If not given will use the parent Game Object's coordinate.
      * @param y The y coordinate to reset the body to. If not given will use the parent Game Object's coordinate.
      */
    def reset(): Unit = js.native
    def reset(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
    def reset(x: Double): Unit = js.native
    def reset(x: Double, y: Double): Unit = js.native
    
    /**
      * The right-most x coordinate of the area of the StaticBody.
      */
    val right: Double = js.native
    
    /**
      * Sets this Static Body to have a circular body and sets its size and position.
      * @param radius The radius of the StaticBody, in pixels.
      * @param offsetX The horizontal offset of the StaticBody from its Game Object, in pixels.
      * @param offsetY The vertical offset of the StaticBody from its Game Object, in pixels.
      */
    def setCircle(radius: Double): StaticBody = js.native
    def setCircle(radius: Double, offsetX: js.UndefOr[scala.Nothing], offsetY: Double): StaticBody = js.native
    def setCircle(radius: Double, offsetX: Double): StaticBody = js.native
    def setCircle(radius: Double, offsetX: Double, offsetY: Double): StaticBody = js.native
    
    /**
      * Changes the Game Object this Body is bound to.
      * First it removes its reference from the old Game Object, then sets the new one.
      * You can optionally update the position and dimensions of this Body to reflect that of the new Game Object.
      * @param gameObject The new Game Object that will own this Body.
      * @param update Reposition and resize this Body to match the new Game Object? Default true.
      */
    def setGameObject(gameObject: GameObject): StaticBody = js.native
    def setGameObject(gameObject: GameObject, update: Boolean): StaticBody = js.native
    
    /**
      * Sets the Mass of the StaticBody. Will set the Mass to 0.1 if the value passed is less than or equal to zero.
      * @param value The value to set the Mass to. Values of zero or less are changed to 0.1.
      */
    def setMass(value: Double): StaticBody = js.native
    
    /**
      * Positions the Static Body at an offset from its Game Object.
      * @param x The horizontal offset of the Static Body from the Game Object's `x`.
      * @param y The vertical offset of the Static Body from the Game Object's `y`.
      */
    def setOffset(x: Double, y: Double): StaticBody = js.native
    
    /**
      * Sets the size of the Static Body.
      * When `center` is true, also repositions it.
      * Resets the width and height to match current frame, if no width and height provided and a frame is found.
      * @param width The width of the Static Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame width.
      * @param height The height of the Static Body in pixels. Cannot be zero. If not given, and the parent Game Object has a frame, it will use the frame height.
      * @param center Place the Static Body's center on its Game Object's center. Only works if the Game Object has the `getCenter` method. Default true.
      */
    def setSize(): StaticBody = js.native
    def setSize(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], center: Boolean): StaticBody = js.native
    def setSize(width: js.UndefOr[scala.Nothing], height: integer): StaticBody = js.native
    def setSize(width: js.UndefOr[scala.Nothing], height: integer, center: Boolean): StaticBody = js.native
    def setSize(width: integer): StaticBody = js.native
    def setSize(width: integer, height: js.UndefOr[scala.Nothing], center: Boolean): StaticBody = js.native
    def setSize(width: integer, height: integer): StaticBody = js.native
    def setSize(width: integer, height: integer, center: Boolean): StaticBody = js.native
    
    /**
      * NOOP function. A Static Body cannot be stopped.
      */
    def stop(): StaticBody = js.native
    
    /**
      * The highest y coordinate of the area of the StaticBody.
      */
    val top: Double = js.native
    
    /**
      * Whether this StaticBody has ever collided with another body and in which direction.
      */
    var touching: ArcadeBodyCollision = js.native
    
    /**
      * Updates the StaticBody's `center` from its `position` and dimensions.
      */
    def updateCenter(): Unit = js.native
    
    /**
      * Syncs the Static Body's position and size with its parent Game Object.
      */
    def updateFromGameObject(): StaticBody = js.native
    
    /**
      * A constant zero velocity used by the Arcade Physics simulation for calculations.
      */
    val velocity: Vector2 = js.native
    
    /**
      * Whether this StaticBody was colliding with another body during the last step or any previous step, and in which direction.
      */
    var wasTouching: ArcadeBodyCollision = js.native
    
    /**
      * The width of the Static Body's boundary, in pixels.
      * If the Static Body is circular, this is also the Static Body's diameter.
      */
    var width: Double = js.native
    
    /**
      * Indicates whether the StaticBody is going to be showing a debug visualization during postUpdate.
      */
    def willDrawDebug(): Boolean = js.native
    
    /**
      * The Arcade Physics simulation this Static Body belongs to.
      */
    var world: World = js.native
    
    /**
      * The x coordinate of the StaticBody.
      */
    var x: Double = js.native
    
    /**
      * The y coordinate of the StaticBody.
      */
    var y: Double = js.native
  }
  
  /**
    * An Arcade Physics Static Group object.
    * 
    * All Game Objects created by or added to this Group will automatically be given static Arcade Physics bodies, if they have no body.
    * 
    * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Group}.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
  trait StaticGroup
    extends typingsSlinky.phaser.Phaser.GameObjects.Group {
    
    /**
      * Adds a static physics body to the new group member (if it lacks one) and adds it to the simulation.
      * @param child The new group member.
      */
    def createCallbackHandler(child: GameObject): Unit = js.native
    
    /**
      * Refreshes the group.
      * @param entries The newly created group members.
      */
    def createMultipleCallbackHandler(entries: js.Array[GameObject]): Unit = js.native
    
    /**
      * The scene this group belongs to.
      */
    var physicsType: integer = js.native
    
    /**
      * Resets each Body to the position of its parent Game Object.
      * Body sizes aren't changed (use {@link Phaser.Physics.Arcade.Components.Enable#refreshBody} for that).
      */
    def refresh(): StaticGroup = js.native
    
    /**
      * Disables the group member's physics body, removing it from the simulation.
      * @param child The group member being removed.
      */
    def removeCallbackHandler(child: GameObject): Unit = js.native
    
    /**
      * The physics simulation.
      */
    var world: World = js.native
  }
  
  /**
    * The Arcade Physics World.
    * 
    * The World is responsible for creating, managing, colliding and updating all of the bodies within it.
    * 
    * An instance of the World belongs to a Phaser.Scene and is accessed via the property `physics.world`.
    */
  @js.native
  trait World extends EventEmitter {
    
    /**
      * The maximum absolute difference of a Body's per-step velocity and its overlap with another Body that will result in separation on *each axis*.
      * Larger values favor separation.
      * Smaller values favor no separation.
      */
    var OVERLAP_BIAS: Double = js.native
    
    /**
      * The maximum absolute value of a Body's overlap with a tile that will result in separation on *each axis*.
      * Larger values favor separation.
      * Smaller values favor no separation.
      * The optimum value may be similar to the tile size.
      */
    var TILE_BIAS: Double = js.native
    
    /**
      * Adds an existing Arcade Physics Body or StaticBody to the simulation.
      * 
      * The body is enabled and added to the local search trees.
      * @param body The Body to be added to the simulation.
      */
    def add(body: Body): Body | StaticBody = js.native
    def add(body: StaticBody): Body | StaticBody = js.native
    
    /**
      * Creates a new Collider object and adds it to the simulation.
      * 
      * A Collider is a way to automatically perform collision checks between two objects,
      * calling the collide and process callbacks if they occur.
      * 
      * Colliders are run as part of the World update, after all of the Bodies have updated.
      * 
      * By creating a Collider you don't need then call `World.collide` in your `update` loop,
      * as it will be handled for you automatically.
      * @param object1 The first object to check for collision.
      * @param object2 The second object to check for collision.
      * @param collideCallback The callback to invoke when the two objects collide.
      * @param processCallback The callback to invoke when the two objects collide. Must return a boolean.
      * @param callbackContext The scope in which to call the callbacks.
      */
    def addCollider(object1: ArcadeColliderType, object2: ArcadeColliderType): Collider = js.native
    def addCollider(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Collider = js.native
    def addCollider(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Collider = js.native
    def addCollider(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Collider = js.native
    def addCollider(object1: ArcadeColliderType, object2: ArcadeColliderType, collideCallback: ArcadePhysicsCallback): Collider = js.native
    def addCollider(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Collider = js.native
    def addCollider(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Collider = js.native
    def addCollider(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Collider = js.native
    
    /**
      * Creates a new Overlap Collider object and adds it to the simulation.
      * 
      * A Collider is a way to automatically perform overlap checks between two objects,
      * calling the collide and process callbacks if they occur.
      * 
      * Colliders are run as part of the World update, after all of the Bodies have updated.
      * 
      * By creating a Collider you don't need then call `World.overlap` in your `update` loop,
      * as it will be handled for you automatically.
      * @param object1 The first object to check for overlap.
      * @param object2 The second object to check for overlap.
      * @param collideCallback The callback to invoke when the two objects overlap.
      * @param processCallback The callback to invoke when the two objects overlap. Must return a boolean.
      * @param callbackContext The scope in which to call the callbacks.
      */
    def addOverlap(object1: ArcadeColliderType, object2: ArcadeColliderType): Collider = js.native
    def addOverlap(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Collider = js.native
    def addOverlap(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Collider = js.native
    def addOverlap(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Collider = js.native
    def addOverlap(object1: ArcadeColliderType, object2: ArcadeColliderType, collideCallback: ArcadePhysicsCallback): Collider = js.native
    def addOverlap(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Collider = js.native
    def addOverlap(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Collider = js.native
    def addOverlap(
      object1: ArcadeColliderType,
      object2: ArcadeColliderType,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Collider = js.native
    
    /**
      * Dynamic Bodies in this simulation.
      */
    var bodies: Set[Body] = js.native
    
    /**
      * A boundary constraining Bodies.
      */
    var bounds: Rectangle = js.native
    
    /**
      * The boundary edges that Bodies can collide with.
      */
    var checkCollision: CheckCollisionObject = js.native
    
    /**
      * Tests if a circular Body intersects with another Body.
      * @param circle The circular body to test.
      * @param body The rectangular body to test.
      */
    def circleBodyIntersects(circle: Body, body: Body): Boolean = js.native
    
    /**
      * Performs a collision check and separation between the two physics enabled objects given, which can be single
      * Game Objects, arrays of Game Objects, Physics Groups, arrays of Physics Groups or normal Groups.
      * 
      * If you don't require separation then use {@link Phaser.Physics.Arcade.World#overlap} instead.
      * 
      * If two Groups or arrays are passed, each member of one will be tested against each member of the other.
      * 
      * If **only** one Group is passed (as `object1`), each member of the Group will be collided against the other members.
      * 
      * If **only** one Array is passed, the array is iterated and every element in it is tested against the others.
      * 
      * Two callbacks can be provided; they receive the colliding game objects as arguments.
      * If an overlap is detected, the `processCallback` is called first. It can cancel the collision by returning false.
      * Next the objects are separated and `collideCallback` is invoked.
      * 
      * Arcade Physics uses the Projection Method of collision resolution and separation. While it's fast and suitable
      * for 'arcade' style games it lacks stability when multiple objects are in close proximity or resting upon each other.
      * The separation that stops two objects penetrating may create a new penetration against a different object. If you
      * require a high level of stability please consider using an alternative physics system, such as Matter.js.
      * @param object1 The first object or array of objects to check.
      * @param object2 The second object or array of objects to check, or `undefined`.
      * @param collideCallback An optional callback function that is called if the objects collide.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def collide(object1: ArcadeColliderType): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collide(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collide(object1: ArcadeColliderType, object2: ArcadeColliderType): Boolean = js.native
    
    /**
      * Internal handler for Sprite vs. Tilemap collisions.
      * Please use Phaser.Physics.Arcade.World#collide instead.
      * @param sprite The first object to check for collision.
      * @param tilemapLayer The second object to check for collision.
      * @param collideCallback An optional callback function that is called if the objects collide.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      * @param overlapOnly Whether this is a collision or overlap check.
      */
    def collideSpriteVsTilemapLayer(sprite: GameObject, tilemapLayer: DynamicTilemapLayer): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(sprite: GameObject, tilemapLayer: DynamicTilemapLayer, collideCallback: ArcadePhysicsCallback): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: DynamicTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(sprite: GameObject, tilemapLayer: StaticTilemapLayer): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(sprite: GameObject, tilemapLayer: StaticTilemapLayer, collideCallback: ArcadePhysicsCallback): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collideSpriteVsTilemapLayer(
      sprite: GameObject,
      tilemapLayer: StaticTilemapLayer,
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    
    /**
      * This advanced method is specifically for testing for collision between a single Sprite and an array of Tile objects.
      * 
      * You should generally use the `collide` method instead, with a Sprite vs. a Tilemap Layer, as that will perform
      * tile filtering and culling for you, as well as handle the interesting face collision automatically.
      * 
      * This method is offered for those who would like to check for collision with specific Tiles in a layer, without
      * having to set any collision attributes on the tiles in question. This allows you to perform quick dynamic collisions
      * on small sets of Tiles. As such, no culling or checks are made to the array of Tiles given to this method,
      * you should filter them before passing them to this method.
      * 
      * Important: Use of this method skips the `interesting faces` system that Tilemap Layers use. This means if you have
      * say a row or column of tiles, and you jump into, or walk over them, it's possible to get stuck on the edges of the
      * tiles as the interesting face calculations are skipped. However, for quick-fire small collision set tests on
      * dynamic maps, this method can prove very useful.
      * @param sprite The first object to check for collision.
      * @param tiles An array of Tiles to check for collision against.
      * @param collideCallback An optional callback function that is called if the objects collide.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def collideTiles(sprite: GameObject, tiles: js.Array[Tile]): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def collideTiles(sprite: GameObject, tiles: js.Array[Tile], collideCallback: ArcadePhysicsCallback): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def collideTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    
    /**
      * This simulation's collision processors.
      */
    var colliders: ProcessQueue[Collider] = js.native
    
    /**
      * Calculates a Body's angular velocity.
      * @param body The Body to compute the velocity for.
      * @param delta The delta value to be used in the calculation, in seconds.
      */
    def computeAngularVelocity(body: Body, delta: Double): Unit = js.native
    
    /**
      * Calculates a Body's per-axis velocity.
      * @param body The Body to compute the velocity for.
      * @param delta The delta value to be used in the calculation, in seconds.
      */
    def computeVelocity(body: Body, delta: Double): Unit = js.native
    
    /**
      * Creates a Graphics Game Object that the world will use to render the debug display to.
      * 
      * This is called automatically when the World is instantiated if the `debug` config property
      * was set to `true`. However, you can call it at any point should you need to display the
      * debug Graphic from a fixed point.
      * 
      * You can control which objects are drawn to the Graphics object, and the colors they use,
      * by setting the debug properties in the physics config.
      * 
      * You should not typically use this in a production game. Use it to aid during debugging.
      */
    def createDebugGraphic(): Graphics = js.native
    
    /**
      * The graphics object drawing the debug display.
      */
    var debugGraphic: Graphics = js.native
    
    /**
      * Default debug display settings for new Bodies.
      */
    var defaults: ArcadeWorldDefaults = js.native
    
    def disable(`object`: js.Array[GameObject | typingsSlinky.phaser.Phaser.GameObjects.Group]): Unit = js.native
    /**
      * Disables the Arcade Physics Body of a Game Object, an array of Game Objects, or the children of a Group.
      * 
      * The difference between this and the `disableBody` method is that you can pass arrays or Groups
      * to this method.
      * 
      * The body itself is not deleted, it just has its `enable` property set to false, which
      * means you can re-enable it again at any point by passing it to enable `World.enable` or `World.add`.
      * @param object The object, or objects, on which to disable the bodies.
      */
    def disable(`object`: GameObject): Unit = js.native
    def disable(`object`: typingsSlinky.phaser.Phaser.GameObjects.Group): Unit = js.native
    
    /**
      * Disables an existing Arcade Physics Body or StaticBody and removes it from the simulation.
      * 
      * The body is disabled and removed from the local search trees.
      * 
      * The body itself is not deleted, it just has its `enable` property set to false, which
      * means you can re-enable it again at any point by passing it to enable `World.enable` or `World.add`.
      * @param body The Body to be disabled.
      */
    def disableBody(body: Body): Unit = js.native
    def disableBody(body: StaticBody): Unit = js.native
    
    /**
      * Enables the debug display.
      */
    var drawDebug: Boolean = js.native
    
    def enable(`object`: js.Array[GameObject | typingsSlinky.phaser.Phaser.GameObjects.Group]): Unit = js.native
    def enable(`object`: js.Array[GameObject | typingsSlinky.phaser.Phaser.GameObjects.Group], bodyType: integer): Unit = js.native
    /**
      * Adds an Arcade Physics Body to a Game Object, an array of Game Objects, or the children of a Group.
      * 
      * The difference between this and the `enableBody` method is that you can pass arrays or Groups
      * to this method.
      * 
      * You can specify if the bodies are to be Dynamic or Static. A dynamic body can move via velocity and
      * acceleration. A static body remains fixed in place and as such is able to use an optimized search
      * tree, making it ideal for static elements such as level objects. You can still collide and overlap
      * with static bodies.
      * 
      * Normally, rather than calling this method directly, you'd use the helper methods available in the
      * Arcade Physics Factory, such as:
      * 
      * ```javascript
      * this.physics.add.image(x, y, textureKey);
      * this.physics.add.sprite(x, y, textureKey);
      * ```
      * 
      * Calling factory methods encapsulates the creation of a Game Object and the creation of its
      * body at the same time. If you are creating custom classes then you can pass them to this
      * method to have their bodies created.
      * @param object The object, or objects, on which to create the bodies.
      * @param bodyType The type of Body to create. Either `DYNAMIC_BODY` or `STATIC_BODY`.
      */
    def enable(`object`: GameObject): Unit = js.native
    def enable(`object`: GameObject, bodyType: integer): Unit = js.native
    def enable(`object`: typingsSlinky.phaser.Phaser.GameObjects.Group): Unit = js.native
    def enable(`object`: typingsSlinky.phaser.Phaser.GameObjects.Group, bodyType: integer): Unit = js.native
    
    /**
      * Creates an Arcade Physics Body on a single Game Object.
      * 
      * If the Game Object already has a body, this method will simply add it back into the simulation.
      * 
      * You can specify if the body is Dynamic or Static. A dynamic body can move via velocity and
      * acceleration. A static body remains fixed in place and as such is able to use an optimized search
      * tree, making it ideal for static elements such as level objects. You can still collide and overlap
      * with static bodies.
      * 
      * Normally, rather than calling this method directly, you'd use the helper methods available in the
      * Arcade Physics Factory, such as:
      * 
      * ```javascript
      * this.physics.add.image(x, y, textureKey);
      * this.physics.add.sprite(x, y, textureKey);
      * ```
      * 
      * Calling factory methods encapsulates the creation of a Game Object and the creation of its
      * body at the same time. If you are creating custom classes then you can pass them to this
      * method to have their bodies created.
      * @param object The Game Object on which to create the body.
      * @param bodyType The type of Body to create. Either `DYNAMIC_BODY` or `STATIC_BODY`.
      */
    def enableBody(`object`: GameObject): GameObject = js.native
    def enableBody(`object`: GameObject, bodyType: integer): GameObject = js.native
    
    /**
      * Should Physics use a fixed update time-step (true) or sync to the render fps (false)?.
      * False value of this property disables fps and timeScale properties.
      */
    var fixedStep: Boolean = js.native
    
    /**
      * Always separate overlapping Bodies horizontally before vertically.
      * False (the default) means Bodies are first separated on the axis of greater gravity, or the vertical axis if neither is greater.
      */
    var forceX: Boolean = js.native
    
    /**
      * The number of physics steps to be taken per second.
      * 
      * This property is read-only. Use the `setFPS` method to modify it at run-time.
      */
    val fps: Double = js.native
    
    /**
      * Acceleration of Bodies due to gravity, in pixels per second.
      */
    var gravity: Vector2 = js.native
    
    /**
      * Checks to see if two Bodies intersect at all.
      * @param body1 The first body to check.
      * @param body2 The second body to check.
      */
    def intersects(body1: Body, body2: Body): Boolean = js.native
    
    /**
      * Whether the simulation advances with the game loop.
      */
    var isPaused: Boolean = js.native
    
    /**
      * The maximum number of items per node on the RTree.
      * 
      * This is ignored if `useTree` is `false`. If you have a large number of bodies in
      * your world then you may find search performance improves by increasing this value,
      * to allow more items per node and less node division.
      */
    var maxEntries: integer = js.native
    
    /**
      * Tests if Game Objects overlap.
      * 
      * See details in {@link Phaser.Physics.Arcade.World#collide}.
      * @param object1 The first object or array of objects to check.
      * @param object2 The second object or array of objects to check, or `undefined`.
      * @param overlapCallback An optional callback function that is called if the objects overlap.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they overlap. If this is set then `overlapCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def overlap(object1: ArcadeColliderType): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      overlapCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      overlapCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      overlapCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      overlapCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      overlapCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      overlapCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlap(
      object1: ArcadeColliderType,
      object2: js.UndefOr[ArcadeColliderType],
      overlapCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def overlap(object1: ArcadeColliderType, object2: ArcadeColliderType): Boolean = js.native
    
    /**
      * This advanced method is specifically for testing for overlaps between a single Sprite and an array of Tile objects.
      * 
      * You should generally use the `overlap` method instead, with a Sprite vs. a Tilemap Layer, as that will perform
      * tile filtering and culling for you, as well as handle the interesting face collision automatically.
      * 
      * This method is offered for those who would like to check for overlaps with specific Tiles in a layer, without
      * having to set any collision attributes on the tiles in question. This allows you to perform quick dynamic overlap
      * tests on small sets of Tiles. As such, no culling or checks are made to the array of Tiles given to this method,
      * you should filter them before passing them to this method.
      * @param sprite The first object to check for collision.
      * @param tiles An array of Tiles to check for collision against.
      * @param collideCallback An optional callback function that is called if the objects overlap.
      * @param processCallback An optional callback function that lets you perform additional checks against the two objects if they collide. If this is set then `collideCallback` will only be called if this callback returns `true`.
      * @param callbackContext The context in which to run the callbacks.
      */
    def overlapTiles(sprite: GameObject, tiles: js.Array[Tile]): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: js.UndefOr[scala.Nothing],
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    def overlapTiles(sprite: GameObject, tiles: js.Array[Tile], collideCallback: ArcadePhysicsCallback): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback
    ): Boolean = js.native
    def overlapTiles(
      sprite: GameObject,
      tiles: js.Array[Tile],
      collideCallback: ArcadePhysicsCallback,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any
    ): Boolean = js.native
    
    /**
      * Pauses the simulation.
      * 
      * A paused simulation does not update any existing bodies, or run any Colliders.
      * 
      * However, you can still enable and disable bodies within it, or manually run collide or overlap
      * checks.
      */
    def pause(): World = js.native
    
    /**
      * Static Bodies marked for deletion.
      */
    var pendingDestroy: Set[Body | StaticBody] = js.native
    
    /**
      * Updates bodies, draws the debug display, and handles pending queue operations.
      */
    def postUpdate(): Unit = js.native
    
    /**
      * Removes an existing Arcade Physics Body or StaticBody from the simulation.
      * 
      * The body is disabled and removed from the local search trees.
      * 
      * The body itself is not deleted, it just has its `enabled` property set to false, which
      * means you can re-enable it again at any point by passing it to enable `enable` or `add`.
      * @param body The body to be removed from the simulation.
      */
    def remove(body: Body): Unit = js.native
    def remove(body: StaticBody): Unit = js.native
    
    /**
      * Removes a Collider from the simulation so it is no longer processed.
      * 
      * This method does not destroy the Collider. If you wish to add it back at a later stage you can call
      * `World.colliders.add(Collider)`.
      * 
      * If you no longer need the Collider you can call the `Collider.destroy` method instead, which will
      * automatically clear all of its references and then remove it from the World. If you call destroy on
      * a Collider you _don't_ need to pass it to this method too.
      * @param collider The Collider to remove from the simulation.
      */
    def removeCollider(collider: Collider): World = js.native
    
    /**
      * Resumes the simulation, if paused.
      */
    def resume(): World = js.native
    
    /**
      * The Scene this simulation belongs to.
      */
    var scene: Scene = js.native
    
    /**
      * Separates two Bodies.
      * @param body1 The first Body to be separated.
      * @param body2 The second Body to be separated.
      * @param processCallback The process callback.
      * @param callbackContext The context in which to invoke the callback.
      * @param overlapOnly If this a collide or overlap check?
      * @param intersects Assert that the bodies intersect and should not be tested before separation.
      */
    def separate(body1: Body, body2: Body): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: js.UndefOr[scala.Nothing],
      intersects: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean,
      intersects: Boolean
    ): Boolean = js.native
    def separate(body1: Body, body2: Body, processCallback: js.UndefOr[scala.Nothing], callbackContext: js.Any): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any,
      overlapOnly: js.UndefOr[scala.Nothing],
      intersects: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: js.UndefOr[scala.Nothing],
      callbackContext: js.Any,
      overlapOnly: Boolean,
      intersects: Boolean
    ): Boolean = js.native
    def separate(body1: Body, body2: Body, processCallback: ArcadePhysicsCallback): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: js.UndefOr[scala.Nothing],
      intersects: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.UndefOr[scala.Nothing],
      overlapOnly: Boolean,
      intersects: Boolean
    ): Boolean = js.native
    def separate(body1: Body, body2: Body, processCallback: ArcadePhysicsCallback, callbackContext: js.Any): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any,
      overlapOnly: js.UndefOr[scala.Nothing],
      intersects: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any,
      overlapOnly: Boolean
    ): Boolean = js.native
    def separate(
      body1: Body,
      body2: Body,
      processCallback: ArcadePhysicsCallback,
      callbackContext: js.Any,
      overlapOnly: Boolean,
      intersects: Boolean
    ): Boolean = js.native
    
    /**
      * Separates two Bodies, when both are circular.
      * @param body1 The first Body to be separated.
      * @param body2 The second Body to be separated.
      * @param overlapOnly If this a collide or overlap check?
      * @param bias A small value added to the calculations.
      */
    def separateCircle(body1: Body, body2: Body): Boolean = js.native
    def separateCircle(body1: Body, body2: Body, overlapOnly: js.UndefOr[scala.Nothing], bias: Double): Boolean = js.native
    def separateCircle(body1: Body, body2: Body, overlapOnly: Boolean): Boolean = js.native
    def separateCircle(body1: Body, body2: Body, overlapOnly: Boolean, bias: Double): Boolean = js.native
    
    /**
      * Sets the position, size and properties of the World boundary.
      * 
      * The World boundary is an invisible rectangle that defines the edges of the World.
      * If a Body is set to collide with the world bounds then it will automatically stop
      * when it reaches any of the edges. You can optionally set which edges of the boundary
      * should be checked against.
      * @param x The top-left x coordinate of the boundary.
      * @param y The top-left y coordinate of the boundary.
      * @param width The width of the boundary.
      * @param height The height of the boundary.
      * @param checkLeft Should bodies check against the left edge of the boundary?
      * @param checkRight Should bodies check against the right edge of the boundary?
      * @param checkUp Should bodies check against the top edge of the boundary?
      * @param checkDown Should bodies check against the bottom edge of the boundary?
      */
    def setBounds(x: Double, y: Double, width: Double, height: Double): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: js.UndefOr[scala.Nothing],
      checkRight: js.UndefOr[scala.Nothing],
      checkUp: js.UndefOr[scala.Nothing],
      checkDown: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: js.UndefOr[scala.Nothing],
      checkRight: js.UndefOr[scala.Nothing],
      checkUp: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: js.UndefOr[scala.Nothing],
      checkRight: js.UndefOr[scala.Nothing],
      checkUp: Boolean,
      checkDown: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: js.UndefOr[scala.Nothing],
      checkRight: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: js.UndefOr[scala.Nothing],
      checkRight: Boolean,
      checkUp: js.UndefOr[scala.Nothing],
      checkDown: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: js.UndefOr[scala.Nothing],
      checkRight: Boolean,
      checkUp: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: js.UndefOr[scala.Nothing],
      checkRight: Boolean,
      checkUp: Boolean,
      checkDown: Boolean
    ): World = js.native
    def setBounds(x: Double, y: Double, width: Double, height: Double, checkLeft: Boolean): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: Boolean,
      checkRight: js.UndefOr[scala.Nothing],
      checkUp: js.UndefOr[scala.Nothing],
      checkDown: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: Boolean,
      checkRight: js.UndefOr[scala.Nothing],
      checkUp: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: Boolean,
      checkRight: js.UndefOr[scala.Nothing],
      checkUp: Boolean,
      checkDown: Boolean
    ): World = js.native
    def setBounds(x: Double, y: Double, width: Double, height: Double, checkLeft: Boolean, checkRight: Boolean): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: Boolean,
      checkRight: Boolean,
      checkUp: js.UndefOr[scala.Nothing],
      checkDown: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: Boolean,
      checkRight: Boolean,
      checkUp: Boolean
    ): World = js.native
    def setBounds(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      checkLeft: Boolean,
      checkRight: Boolean,
      checkUp: Boolean,
      checkDown: Boolean
    ): World = js.native
    
    /**
      * Enables or disables collisions on each edge of the World boundary.
      * @param left Should bodies check against the left edge of the boundary? Default true.
      * @param right Should bodies check against the right edge of the boundary? Default true.
      * @param up Should bodies check against the top edge of the boundary? Default true.
      * @param down Should bodies check against the bottom edge of the boundary? Default true.
      */
    def setBoundsCollision(): World = js.native
    def setBoundsCollision(
      left: js.UndefOr[scala.Nothing],
      right: js.UndefOr[scala.Nothing],
      up: js.UndefOr[scala.Nothing],
      down: Boolean
    ): World = js.native
    def setBoundsCollision(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], up: Boolean): World = js.native
    def setBoundsCollision(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], up: Boolean, down: Boolean): World = js.native
    def setBoundsCollision(left: js.UndefOr[scala.Nothing], right: Boolean): World = js.native
    def setBoundsCollision(left: js.UndefOr[scala.Nothing], right: Boolean, up: js.UndefOr[scala.Nothing], down: Boolean): World = js.native
    def setBoundsCollision(left: js.UndefOr[scala.Nothing], right: Boolean, up: Boolean): World = js.native
    def setBoundsCollision(left: js.UndefOr[scala.Nothing], right: Boolean, up: Boolean, down: Boolean): World = js.native
    def setBoundsCollision(left: Boolean): World = js.native
    def setBoundsCollision(left: Boolean, right: js.UndefOr[scala.Nothing], up: js.UndefOr[scala.Nothing], down: Boolean): World = js.native
    def setBoundsCollision(left: Boolean, right: js.UndefOr[scala.Nothing], up: Boolean): World = js.native
    def setBoundsCollision(left: Boolean, right: js.UndefOr[scala.Nothing], up: Boolean, down: Boolean): World = js.native
    def setBoundsCollision(left: Boolean, right: Boolean): World = js.native
    def setBoundsCollision(left: Boolean, right: Boolean, up: js.UndefOr[scala.Nothing], down: Boolean): World = js.native
    def setBoundsCollision(left: Boolean, right: Boolean, up: Boolean): World = js.native
    def setBoundsCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean): World = js.native
    
    /**
      * Sets the frame rate to run the simulation at.
      * 
      * The frame rate value is used to simulate a fixed update time step. This fixed
      * time step allows for a straightforward implementation of a deterministic game state.
      * 
      * This frame rate is independent of the frequency at which the game is rendering. The
      * higher you set the fps, the more physics simulation steps will occur per game step.
      * Conversely, the lower you set it, the less will take place.
      * 
      * You can optionally advance the simulation directly yourself by calling the `step` method.
      * @param framerate The frame rate to advance the simulation at.
      */
    def setFPS(framerate: integer): this.type = js.native
    
    /**
      * Static Bodies in this simulation.
      */
    var staticBodies: Set[StaticBody] = js.native
    
    /**
      * The spatial index of Static Bodies.
      */
    var staticTree: RTree = js.native
    
    /**
      * Advances the simulation by a time increment.
      * @param delta The delta time amount, in seconds, by which to advance the simulation.
      */
    def step(delta: Double): Unit = js.native
    
    /**
      * The number of steps that took place in the last frame.
      */
    val stepsLastFrame: Double = js.native
    
    /**
      * Scaling factor applied to the frame rate.
      * 
      * - 1.0 = normal speed
      * - 2.0 = half speed
      * - 0.5 = double speed
      */
    var timeScale: Double = js.native
    
    /**
      * The spatial index of Dynamic Bodies.
      */
    var tree: RTree = js.native
    
    /**
      * Recycled input for tree searches.
      */
    var treeMinMax: ArcadeWorldTreeMinMax = js.native
    
    /**
      * Advances the simulation based on the elapsed time and fps rate.
      * 
      * This is called automatically by your Scene and does not need to be invoked directly.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      * @param delta The delta time, in ms, elapsed since the last frame.
      */
    /* protected */ def update(time: Double, delta: Double): Unit = js.native
    
    /**
      * Calculates a Body's velocity and updates its position.
      * @param body The Body to be updated.
      * @param delta The delta value to be used in the motion calculations, in seconds.
      */
    def updateMotion(body: Body, delta: Double): Unit = js.native
    
    /**
      * Should this Arcade Physics World use an RTree for Dynamic bodies?
      * 
      * An RTree is a fast way of spatially sorting of all the bodies in the world.
      * However, at certain limits, the cost of clearing and inserting the bodies into the
      * tree every frame becomes more expensive than the search speed gains it provides.
      * 
      * If you have a large number of dynamic bodies in your world then it may be best to
      * disable the use of the RTree by setting this property to `false` in the physics config.
      * 
      * The number it can cope with depends on browser and device, but a conservative estimate
      * of around 5,000 bodies should be considered the max before disabling it.
      * 
      * This only applies to dynamic bodies. Static bodies are always kept in an RTree,
      * because they don't have to be cleared every frame, so you benefit from the
      * massive search speeds all the time.
      */
    var useTree: Boolean = js.native
    
    /**
      * Wrap an object's coordinates (or several objects' coordinates) within {@link Phaser.Physics.Arcade.World#bounds}.
      * 
      * If the object is outside any boundary edge (left, top, right, bottom), it will be moved to the same offset from the opposite edge (the interior).
      * @param object A Game Object, a Group, an object with `x` and `y` coordinates, or an array of such objects.
      * @param padding An amount added to each boundary edge during the operation. Default 0.
      */
    def wrap(`object`: js.Any): Unit = js.native
    def wrap(`object`: js.Any, padding: Double): Unit = js.native
    
    /**
      * Wrap each object's coordinates within {@link Phaser.Physics.Arcade.World#bounds}.
      * @param objects An array of objects to be wrapped.
      * @param padding An amount added to the boundary. Default 0.
      */
    def wrapArray(objects: js.Array[_]): Unit = js.native
    def wrapArray(objects: js.Array[_], padding: Double): Unit = js.native
    
    /**
      * Wrap an object's coordinates within {@link Phaser.Physics.Arcade.World#bounds}.
      * @param object A Game Object, a Physics Body, or any object with `x` and `y` coordinates
      * @param padding An amount added to the boundary. Default 0.
      */
    def wrapObject(`object`: js.Any): Unit = js.native
    def wrapObject(`object`: js.Any, padding: Double): Unit = js.native
  }
}
