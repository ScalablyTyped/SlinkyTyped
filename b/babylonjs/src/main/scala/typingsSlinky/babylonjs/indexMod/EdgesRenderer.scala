package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.edgesRendererMod.IEdgesRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "EdgesRenderer")
@js.native
class EdgesRenderer protected ()
  extends typingsSlinky.babylonjs.renderingIndexMod.EdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices. Note that this parameter is not used if options.useAlternateEdgeFinder = true
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    * @param  options The options to apply when generating the edges
    */
  def this(source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh) = this()
  def this(source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh, epsilon: Double) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
}
/* static members */
object EdgesRenderer {
  
  @JSImport("babylonjs/index", "EdgesRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "EdgesRenderer.GetShader")
  @js.native
  def GetShader: js.Any = js.native
  @scala.inline
  def GetShader_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShader")(x.asInstanceOf[js.Any])
}
