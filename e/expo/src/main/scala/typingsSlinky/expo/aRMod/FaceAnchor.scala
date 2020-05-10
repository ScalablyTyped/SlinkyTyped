package typingsSlinky.expo.aRMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.expo.aRMod.AnchorType.Face
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type  :expo.expo/build/AR.AnchorType.Face,   isTracked  :boolean,   geometry ? :expo.expo/build/AR.FaceGeometry,   blendShapes ? :{[ shape in expo.expo/build/AR.BlendShape ]:? number}} */
@js.native
trait FaceAnchor extends Anchor {
  var blendShapes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ shape in expo.expo/build/AR.BlendShape ]:? number}
    */ typingsSlinky.expo.expoStrings.FaceAnchor with TopLevel[js.Any]
  ] = js.native
  var geometry: js.UndefOr[FaceGeometry] = js.native
  var id: String = js.native
  var isTracked: Boolean = js.native
  var transform: Matrix = js.native
  var `type`: AnchorType with Face = js.native
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTracked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTracked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AnchorType with Face): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendShapes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ shape in expo.expo/build/AR.BlendShape ]:? number}
      */ typingsSlinky.expo.expoStrings.FaceAnchor with TopLevel[js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendShapes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlendShapes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendShapes")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: FaceGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
  }
  
}

