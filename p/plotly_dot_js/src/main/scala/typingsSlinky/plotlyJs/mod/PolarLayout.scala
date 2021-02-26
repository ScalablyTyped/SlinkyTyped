package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialDomain
import typingsSlinky.plotlyJs.anon.PartialLayoutAxisAnchor
import typingsSlinky.plotlyJs.plotlyJsStrings.circular
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolarLayout extends StObject {
  
  var angularaxis: PartialLayoutAxisAnchor = js.native
  
  var bgcolor: Color = js.native
  
  var domain: PartialDomain = js.native
  
  var gridshape: circular | linear = js.native
  
  var hole: Double = js.native
  
  var radialaxis: PartialLayoutAxisAnchor = js.native
  
  var sector: js.Array[Double] = js.native
  
  var uirevision: String | Double = js.native
}
object PolarLayout {
  
  @scala.inline
  def apply(
    angularaxis: PartialLayoutAxisAnchor,
    bgcolor: Color,
    domain: PartialDomain,
    gridshape: circular | linear,
    hole: Double,
    radialaxis: PartialLayoutAxisAnchor,
    sector: js.Array[Double],
    uirevision: String | Double
  ): PolarLayout = {
    val __obj = js.Dynamic.literal(angularaxis = angularaxis.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], gridshape = gridshape.asInstanceOf[js.Any], hole = hole.asInstanceOf[js.Any], radialaxis = radialaxis.asInstanceOf[js.Any], sector = sector.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarLayout]
  }
  
  @scala.inline
  implicit class PolarLayoutMutableBuilder[Self <: PolarLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngularaxis(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "angularaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridshape(value: circular | linear): Self = StObject.set(x, "gridshape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHole(value: Double): Self = StObject.set(x, "hole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadialaxis(value: PartialLayoutAxisAnchor): Self = StObject.set(x, "radialaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSector(value: js.Array[Double]): Self = StObject.set(x, "sector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectorVarargs(value: Double*): Self = StObject.set(x, "sector", js.Array(value :_*))
    
    @scala.inline
    def setUirevision(value: String | Double): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
  }
}
