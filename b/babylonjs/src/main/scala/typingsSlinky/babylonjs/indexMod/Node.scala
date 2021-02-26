package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.nodeMod.NodeConstructor
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Node")
@js.native
class Node protected ()
  extends typingsSlinky.babylonjs.nodeMod.Node {
  /**
    * Creates a new Node
    * @param name the name and id to be given to this node
    * @param scene the scene this node will be added to
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]) = this()
}
/* static members */
object Node {
  
  @JSImport("babylonjs/index", "Node")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a new node constructor
    * @param type defines the type name of the node to construct
    * @param constructorFunc defines the constructor function
    */
  @JSImport("babylonjs/index", "Node.AddNodeConstructor")
  @js.native
  def AddNodeConstructor(`type`: String, constructorFunc: NodeConstructor): Unit = js.native
  
  /**
    * Returns a node constructor based on type name
    * @param type defines the type name
    * @param name defines the new node name
    * @param scene defines the hosting scene
    * @param options defines optional options to transmit to constructors
    * @returns the new constructor or null
    */
  @JSImport("babylonjs/index", "Node.Construct")
  @js.native
  def Construct(`type`: String, name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene): Nullable[js.Function0[this.type]] = js.native
  @JSImport("babylonjs/index", "Node.Construct")
  @js.native
  def Construct(`type`: String, name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene, options: js.Any): Nullable[js.Function0[this.type]] = js.native
  
  /**
    * Parse animation range data from a serialization object and store them into a given node
    * @param node defines where to store the animation ranges
    * @param parsedNode defines the serialization object to read data from
    * @param scene defines the hosting scene
    */
  @JSImport("babylonjs/index", "Node.ParseAnimationRanges")
  @js.native
  def ParseAnimationRanges(
    node: typingsSlinky.babylonjs.nodeMod.Node,
    parsedNode: js.Any,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): Unit = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "Node._AnimationRangeFactory")
  @js.native
  def _AnimationRangeFactory(name: String, from: Double, to: Double): typingsSlinky.babylonjs.animationRangeMod.AnimationRange = js.native
  
  @JSImport("babylonjs/index", "Node._NodeConstructors")
  @js.native
  def _NodeConstructors: js.Any = js.native
  @scala.inline
  def _NodeConstructors_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NodeConstructors")(x.asInstanceOf[js.Any])
}
