package typingsSlinky.antDesignPro.anon

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.antDesignPro.antDesignProStrings.x
import typingsSlinky.antDesignPro.antDesignProStrings.y
import typingsSlinky.bizcharts.mod.CoordType
import typingsSlinky.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.CoordProps> */
@js.native
trait ReadonlyCoordProps extends StObject {
  
  val children: js.UndefOr[ReactElement] = js.native
  
  val endAngle: js.UndefOr[Double] = js.native
  
  val innerRadius: js.UndefOr[Double] = js.native
  
  val key: js.UndefOr[typingsSlinky.react.mod.Key] = js.native
  
  val radius: js.UndefOr[Double] = js.native
  
  val ref: js.UndefOr[LegacyRef[_]] = js.native
  
  val reflect: js.UndefOr[x | y] = js.native
  
  val rotate: js.UndefOr[Double] = js.native
  
  val scale: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  val startAngle: js.UndefOr[Double] = js.native
  
  val transpose: js.UndefOr[Boolean] = js.native
  
  val `type`: js.UndefOr[CoordType] = js.native
}
object ReadonlyCoordProps {
  
  @scala.inline
  def apply(): ReadonlyCoordProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyCoordProps]
  }
  
  @scala.inline
  implicit class ReadonlyCoordPropsMutableBuilder[Self <: ReadonlyCoordProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setReflect(value: typingsSlinky.antDesignPro.antDesignProStrings.x | y): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
    
    @scala.inline
    def setType(value: CoordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
