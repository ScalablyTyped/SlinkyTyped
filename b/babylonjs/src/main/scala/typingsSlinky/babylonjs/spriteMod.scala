package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.actionManagerMod.ActionManager
import typingsSlinky.babylonjs.animatableInterfaceMod.IAnimatable
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.spriteManagerMod.ISpriteManager
import typingsSlinky.babylonjs.spriteManagerMod.SpriteManager
import typingsSlinky.babylonjs.thinSpriteMod.ThinSprite
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteMod {
  
  @JSImport("babylonjs/Sprites/sprite", "Sprite")
  @js.native
  class Sprite protected ()
    extends ThinSprite
       with IAnimatable {
    /**
      * Creates a new Sprite
      * @param name defines the name
      * @param manager defines the manager
      */
    def this(/** defines the name */
    name: String, manager: ISpriteManager) = this()
    
    var _endAnimation: js.Any = js.native
    
    var _manager: js.Any = js.native
    
    var _onAnimationEnd: js.Any = js.native
    
    /**
      * Gets or sets the associated action manager
      */
    var actionManager: Nullable[ActionManager] = js.native
    
    /** Gets or sets the main color */
    @JSName("color")
    var color_Sprite: Color4 = js.native
    
    def delay_=(value: Double): Unit = js.native
    
    /** Release associated resources */
    def dispose(): Unit = js.native
    
    /** Gets or sets a boolean indicating that this sprite should be disposed after animation ends */
    var disposeWhenFinishedAnimating: Boolean = js.native
    
    def fromIndex_=(value: Double): Unit = js.native
    
    /**
      * Returns the string "Sprite"
      * @returns "Sprite"
      */
    def getClassName(): String = js.native
    
    /** Gets or sets a boolean indicating if the sprite can be picked */
    var isPickable: Boolean = js.native
    
    def loopAnimation_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the manager of this sprite
      */
    def manager: ISpriteManager = js.native
    
    /** defines the name */
    var name: String = js.native
    
    /**
      * An event triggered when the control has been disposed
      */
    var onDisposeObservable: Observable[Sprite] = js.native
    
    /**
      * Starts an animation
      * @param from defines the initial key
      * @param to defines the end key
      * @param loop defines if the animation must loop
      * @param delay defines the start delay (in ms)
      * @param onAnimationEnd defines a callback to call when animation ends
      */
    def playAnimation(from: Double, to: Double, loop: Boolean, delay: Double): Unit = js.native
    
    /** Gets or sets the current world position */
    @JSName("position")
    var position_Sprite: Vector3 = js.native
    
    /**
      * Serializes the sprite to a JSON object
      * @returns the JSON object
      */
    def serialize(): js.Any = js.native
    
    /**
      * Gets or sets the sprite size
      */
    def size: Double = js.native
    def size_=(value: Double): Unit = js.native
    
    def toIndex_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the unique id of the sprite
      */
    var uniqueId: Double = js.native
    
    /** Gets or sets a boolean indicating that sprite texture alpha will be used for precise picking (false by default) */
    var useAlphaForPicking: Boolean = js.native
  }
  /* static members */
  object Sprite {
    
    /**
      * Parses a JSON object to create a new sprite
      * @param parsedSprite The JSON object to parse
      * @param manager defines the hosting manager
      * @returns the new sprite
      */
    @JSImport("babylonjs/Sprites/sprite", "Sprite.Parse")
    @js.native
    def Parse(parsedSprite: js.Any, manager: SpriteManager): Sprite = js.native
  }
}
