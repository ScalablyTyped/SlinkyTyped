package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.Annotations
import typingsSlinky.plotlyJs.mod.Camera
import typingsSlinky.plotlyJs.mod.Domain
import typingsSlinky.plotlyJs.mod.Point
import typingsSlinky.plotlyJs.mod.SceneAxis
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.closest
import typingsSlinky.plotlyJs.plotlyJsStrings.cube
import typingsSlinky.plotlyJs.plotlyJsStrings.data
import typingsSlinky.plotlyJs.plotlyJsStrings.manual
import typingsSlinky.plotlyJs.plotlyJsStrings.orbit
import typingsSlinky.plotlyJs.plotlyJsStrings.pan
import typingsSlinky.plotlyJs.plotlyJsStrings.turntable
import typingsSlinky.plotlyJs.plotlyJsStrings.zoom
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Scene> */
@js.native
trait PartialSceneAspectmode extends StObject {
  
  var annotations: js.UndefOr[Partial[Annotations] | js.Array[Partial[Annotations]]] = js.native
  
  var aspectmode: js.UndefOr[auto | cube | data | manual] = js.native
  
  var aspectratio: js.UndefOr[Partial[Point]] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var camera: js.UndefOr[Partial[Camera]] = js.native
  
  var captureevents: js.UndefOr[Boolean] = js.native
  
  var domain: js.UndefOr[Partial[Domain]] = js.native
  
  var dragmode: js.UndefOr[orbit | turntable | zoom | pan | `false`] = js.native
  
  var hovermode: js.UndefOr[closest | `false`] = js.native
  
  var xaxis: js.UndefOr[Partial[SceneAxis]] = js.native
  
  var yaxis: js.UndefOr[Partial[SceneAxis]] = js.native
  
  var zaxis: js.UndefOr[Partial[SceneAxis]] = js.native
}
object PartialSceneAspectmode {
  
  @scala.inline
  def apply(): PartialSceneAspectmode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSceneAspectmode]
  }
  
  @scala.inline
  implicit class PartialSceneAspectmodeMutableBuilder[Self <: PartialSceneAspectmode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: Partial[Annotations] | js.Array[Partial[Annotations]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: Partial[Annotations]*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setAspectmode(value: auto | cube | data | manual): Self = StObject.set(x, "aspectmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectmodeUndefined: Self = StObject.set(x, "aspectmode", js.undefined)
    
    @scala.inline
    def setAspectratio(value: Partial[Point]): Self = StObject.set(x, "aspectratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectratioUndefined: Self = StObject.set(x, "aspectratio", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setCamera(value: Partial[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCaptureevents(value: Boolean): Self = StObject.set(x, "captureevents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureeventsUndefined: Self = StObject.set(x, "captureevents", js.undefined)
    
    @scala.inline
    def setDomain(value: Partial[Domain]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDragmode(value: orbit | turntable | zoom | pan | `false`): Self = StObject.set(x, "dragmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragmodeUndefined: Self = StObject.set(x, "dragmode", js.undefined)
    
    @scala.inline
    def setHovermode(value: closest | `false`): Self = StObject.set(x, "hovermode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovermodeUndefined: Self = StObject.set(x, "hovermode", js.undefined)
    
    @scala.inline
    def setXaxis(value: Partial[SceneAxis]): Self = StObject.set(x, "xaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxisUndefined: Self = StObject.set(x, "xaxis", js.undefined)
    
    @scala.inline
    def setYaxis(value: Partial[SceneAxis]): Self = StObject.set(x, "yaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxisUndefined: Self = StObject.set(x, "yaxis", js.undefined)
    
    @scala.inline
    def setZaxis(value: Partial[SceneAxis]): Self = StObject.set(x, "zaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZaxisUndefined: Self = StObject.set(x, "zaxis", js.undefined)
  }
}
