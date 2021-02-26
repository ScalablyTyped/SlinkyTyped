package typingsSlinky.recharts.anon

import slinky.core.facade.ReactElement
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.LabelFormatter
import typingsSlinky.recharts.mod.LabelProps
import typingsSlinky.recharts.mod.PositionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Angle extends StObject {
  
  var angle: js.UndefOr[Double] = js.native
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clockWise: js.UndefOr[Boolean] = js.native
  
  var content: js.UndefOr[ReactElement | ContentRenderer[LabelProps]] = js.native
  
  var data: js.UndefOr[Double] = js.native
  
  var formatter: js.UndefOr[LabelFormatter] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[PositionType] = js.native
}
object Angle {
  
  @scala.inline
  def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit class AngleMutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClockWise(value: Boolean): Self = StObject.set(x, "clockWise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockWiseUndefined: Self = StObject.set(x, "clockWise", js.undefined)
    
    @scala.inline
    def setContent(value: ReactElement | ContentRenderer[LabelProps]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction1(value: LabelProps => ReactElement): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setData(value: Double): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* label */ String | Double => ReactElement): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
