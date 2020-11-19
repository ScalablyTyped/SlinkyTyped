package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EdgesRenderer")
@js.native
class EdgesRenderer protected ()
  extends typingsSlinky.babylonjs.BABYLON.EdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    */
  def this(source: typingsSlinky.babylonjs.BABYLON.AbstractMesh) = this()
  def this(source: typingsSlinky.babylonjs.BABYLON.AbstractMesh, epsilon: Double) = this()
  def this(
    source: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
}
