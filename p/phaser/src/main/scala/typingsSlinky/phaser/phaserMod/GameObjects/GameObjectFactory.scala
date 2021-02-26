package typingsSlinky.phaser.phaserMod.GameObjects

import typingsSlinky.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Game Object Factory is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and have them automatically registered with the Scene.
  * 
  * Game Objects directly register themselves with the Factory and inject their own creation
  * methods into the class.
  */
@JSImport("phaser", "GameObjects.GameObjectFactory")
@js.native
class GameObjectFactory protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.GameObjectFactory {
  /**
    * 
    * @param scene The Scene to which this Game Object Factory belongs.
    */
  def this(scene: Scene) = this()
}
object GameObjectFactory {
  
  /**
    * Static method called directly by the Game Object factory functions.
    * With this method you can register a custom GameObject factory in the GameObjectFactory,
    * providing a name (`factoryType`) and the constructor (`factoryFunction`) in order
    * to be called when you call to Phaser.Scene.add[ factoryType ] method.
    * @param factoryType The key of the factory that you will use to call to Phaser.Scene.add[ factoryType ] method.
    * @param factoryFunction The constructor function to be called when you invoke to the Phaser.Scene.add method.
    */
  /* static member */
  @JSImport("phaser", "GameObjects.GameObjectFactory.register")
  @js.native
  def register(factoryType: String, factoryFunction: js.Function): Unit = js.native
  
  /**
    * Static method called directly by the Game Object factory functions.
    * With this method you can remove a custom GameObject factory registered in the GameObjectFactory,
    * providing a its `factoryType`.
    * @param factoryType The key of the factory that you want to remove from the GameObjectFactory.
    */
  /* static member */
  @JSImport("phaser", "GameObjects.GameObjectFactory.remove")
  @js.native
  def remove(factoryType: String): Unit = js.native
}
