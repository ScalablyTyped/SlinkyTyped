package typingsSlinky.expo.aRMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.expo.aRMod.AnchorType.Face
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type :expo.expo/build/AR.AnchorType.Face,   isTracked :boolean,   geometry :expo.expo/build/AR.FaceGeometry | undefined,   blendShapes :{[ shape in expo.expo/build/AR.BlendShape ]:? number} | undefined} */
trait FaceAnchor extends Anchor {
  var blendShapes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ typingsSlinky.expo.expoStrings.FaceAnchor with TopLevel[js.Any]
  ] = js.undefined
  var geometry: js.UndefOr[FaceGeometry] = js.undefined
  var id: String
  var isTracked: Boolean
  var transform: Matrix
  var `type`: AnchorType with Face
}

object FaceAnchor {
  @scala.inline
  def apply(id: String, isTracked: Boolean, transform: Matrix, `type`: AnchorType with Face): FaceAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isTracked = isTracked.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceAnchor]
  }
  @scala.inline
  implicit class FaceAnchorOps[Self <: FaceAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTracked(value: Boolean): Self = this.set("isTracked", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformVarargs(value: Double*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: Matrix): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AnchorType with Face): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlendShapes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ shape in expo.expo/build/AR.BlendShape ]:? number}
      */ typingsSlinky.expo.expoStrings.FaceAnchor with TopLevel[js.Any]
    ): Self = this.set("blendShapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendShapes: Self = this.set("blendShapes", js.undefined)
    @scala.inline
    def setGeometry(value: FaceGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
  }
  
}

