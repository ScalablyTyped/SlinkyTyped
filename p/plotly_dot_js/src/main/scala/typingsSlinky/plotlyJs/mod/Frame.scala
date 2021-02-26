package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends StObject {
  
  /**
    * The name of the frame into which this frame's properties are merged
    * before applying. This is used to unify properties and avoid needing
    * to specify the same values for the same properties in multiple frames.
    */
  var baseframe: String = js.native
  
  /**
    * A list of traces this frame modifies. The format is identical to the
    * normal trace definition.
    */
  var data: js.Array[Data] = js.native
  
  /**
    * An identifier that specifies the group to which the frame belongs,
    * used by animate to select a subset of frames.
    */
  var group: String = js.native
  
  /**
    * Layout properties which this frame modifies. The format is identical
    * to the normal layout definition.
    */
  var layout: PartialLayout = js.native
  
  /**
    * A label by which to identify the frame
    */
  var name: String = js.native
  
  /**
    * A list of trace indices that identify the respective traces in the
    * data attribute
    */
  var traces: js.Array[Double] = js.native
}
object Frame {
  
  @scala.inline
  def apply(
    baseframe: String,
    data: js.Array[Data],
    group: String,
    layout: PartialLayout,
    name: String,
    traces: js.Array[Double]
  ): Frame = {
    val __obj = js.Dynamic.literal(baseframe = baseframe.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], traces = traces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  @scala.inline
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseframe(value: String): Self = StObject.set(x, "baseframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Data*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: PartialLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraces(value: js.Array[Double]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracesVarargs(value: Double*): Self = StObject.set(x, "traces", js.Array(value :_*))
  }
}
