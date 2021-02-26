package typingsSlinky.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hints for displaying the asset, based on information available when the
  * asset was uploaded.
  */
@js.native
trait SchemaPresentationParams extends StObject {
  
  /**
    * A background color which could be used for displaying the 3D asset in a
    * &#39;thumbnail&#39; or &#39;palette&#39; style view. Authors have the
    * option to set this background color when publishing or editing their
    * asset.  This is represented as a six-digit hexademical triplet specifying
    * the RGB components of the background color, e.g. #FF0000 for Red.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * The materials&#39; diffuse/albedo color. This does not apply to vertex
    * colors or texture maps.
    */
  var colorSpace: js.UndefOr[String] = js.native
  
  /**
    * A rotation that should be applied to the object root to make it upright.
    * More precisely, this quaternion transforms from &quot;object space&quot;
    * (the space in which the object is defined) to &quot;presentation
    * space&quot;, a coordinate system where +Y is up, +X is right, -Z is
    * forward. For example, if the object is the Eiffel Tower, in its local
    * coordinate system the object might be laid out such that the base of the
    * tower is on the YZ plane and the tip of the tower is towards positive X.
    * In this case this quaternion would specify a rotation (of 90 degrees
    * about the Z axis) such that in the presentation space the base of the
    * tower is aligned with the XZ plane, and the tip of the tower lies towards
    * +Y.  This rotation is unrelated to the object&#39;s pose in the web
    * preview, which is just a camera position setting and is *not* reflected
    * in this rotation.  Please note: this is applicable only to the gLTF.
    */
  var orientingRotation: js.UndefOr[SchemaQuaternion] = js.native
}
object SchemaPresentationParams {
  
  @scala.inline
  def apply(): SchemaPresentationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPresentationParams]
  }
  
  @scala.inline
  implicit class SchemaPresentationParamsMutableBuilder[Self <: SchemaPresentationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    @scala.inline
    def setOrientingRotation(value: SchemaQuaternion): Self = StObject.set(x, "orientingRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientingRotationUndefined: Self = StObject.set(x, "orientingRotation", js.undefined)
  }
}
