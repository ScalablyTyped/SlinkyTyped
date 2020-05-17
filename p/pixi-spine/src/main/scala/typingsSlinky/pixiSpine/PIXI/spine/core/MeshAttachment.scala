package typingsSlinky.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshAttachment extends VertexAttachment {
  var color: Color = js.native
  var edges: js.Array[Double] = js.native
  var height: Double = js.native
  var hullLength: Double = js.native
  var parentMesh: js.Any = js.native
  var path: String = js.native
  var region: TextureRegion = js.native
  var regionUVs: js.typedarray.Float32Array = js.native
  var tempColor: Color = js.native
  var triangles: js.Array[Double] = js.native
  var uvs: ArrayLike[Double] = js.native
  var width: Double = js.native
  def getParentMesh(): MeshAttachment = js.native
  def newLinkedMesh(): MeshAttachment = js.native
  def setParentMesh(parentMesh: MeshAttachment): Unit = js.native
}

object MeshAttachment {
  @scala.inline
  def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    computeWorldVerticesOld: (Slot, ArrayLike[Double]) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    edges: js.Array[Double],
    getParentMesh: () => MeshAttachment,
    height: Double,
    hullLength: Double,
    id: Double,
    name: String,
    newLinkedMesh: () => MeshAttachment,
    parentMesh: js.Any,
    path: String,
    region: TextureRegion,
    regionUVs: js.typedarray.Float32Array,
    setParentMesh: MeshAttachment => Unit,
    tempColor: Color,
    triangles: js.Array[Double],
    uvs: ArrayLike[Double],
    vertices: ArrayLike[Double],
    width: Double,
    worldVerticesLength: Double
  ): MeshAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), computeWorldVerticesOld = js.Any.fromFunction2(computeWorldVerticesOld), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getParentMesh = js.Any.fromFunction0(getParentMesh), height = height.asInstanceOf[js.Any], hullLength = hullLength.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newLinkedMesh = js.Any.fromFunction0(newLinkedMesh), parentMesh = parentMesh.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionUVs = regionUVs.asInstanceOf[js.Any], setParentMesh = js.Any.fromFunction1(setParentMesh), tempColor = tempColor.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshAttachment]
  }
  @scala.inline
  implicit class MeshAttachmentOps[Self <: MeshAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetParentMesh(value: () => MeshAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentMesh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHullLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hullLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewLinkedMesh(value: () => MeshAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLinkedMesh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParentMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: TextureRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionUVs(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionUVs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetParentMesh(value: MeshAttachment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParentMesh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTempColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangles(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUvs(value: ArrayLike[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

