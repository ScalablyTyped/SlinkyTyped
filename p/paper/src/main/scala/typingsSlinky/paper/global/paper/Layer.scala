package typingsSlinky.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Layer item represents a layer in a Paper.js project.
  * 
  * The layer which is currently active can be accessed through
  * {@link Project#activeLayer}.
  * An array of all layers in a project can be accessed through
  * {@link Project#layers}.
  */
@JSGlobal("paper.Layer")
@js.native
/** 
  * Creates a new Layer item and places it at the end of the
  * {@link Project#layers} array. The newly created layer will be activated,
  * so all newly created items will be placed within it.
  * 
  * @param children - An array of items that will be added to the
  * newly created layer
  */
class Layer ()
  extends typingsSlinky.paper.paper.Layer {
  def this(children: js.Array[typingsSlinky.paper.paper.Item]) = this()
  /** 
    * Creates a new Layer item and places it at the end of the
    * {@link Project#layers} array. The newly created layer will be activated,
    * so all newly created items will be placed within it.
    * 
    * @param object - an object containing the properties to be set on
    *     the layer
    */
  def this(`object`: js.Object) = this()
}
