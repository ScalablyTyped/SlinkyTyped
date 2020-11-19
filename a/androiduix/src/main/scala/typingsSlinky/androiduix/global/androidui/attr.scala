package typingsSlinky.androiduix.global.androidui

import typingsSlinky.androiduix.android.content.res.ColorStateList
import typingsSlinky.androiduix.android.content.res.Resources
import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.ViewGroup.LayoutParams
import typingsSlinky.androiduix.androidui.attr.AttrBinder.ClassBinderValue
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("androidui.attr")
@js.native
object attr extends js.Object {
  
  @js.native
  class AttrBinder protected ()
    extends typingsSlinky.androiduix.androidui.attr.AttrBinder {
    def this(host: View) = this()
    def this(host: LayoutParams) = this()
  }
  @js.native
  object AttrBinder extends js.Object {
    
    @js.native
    class ClassBinderMap ()
      extends typingsSlinky.androiduix.androidui.attr.AttrBinder.ClassBinderMap {
      def this(copyBinderMap: Map[String, ClassBinderValue]) = this()
    }
  }
  
  @js.native
  class AttrValueParser ()
    extends typingsSlinky.androiduix.androidui.attr.AttrValueParser
  /* static members */
  @js.native
  object AttrValueParser extends js.Object {
    
    def parseBoolean(r: Resources, value: String, defValue: Boolean): Boolean = js.native
    
    def parseColor(r: Resources, value: String, defValue: Double): Double = js.native
    
    def parseColorStateList(r: Resources, value: String): ColorStateList = js.native
    
    def parseDimension(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimension(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimensionPixelOffset(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double): Double = js.native
    def parseDimensionPixelSize(r: Resources, value: String, defValue: Double, baseValue: Double): Double = js.native
    
    def parseDrawable(r: Resources, value: String): Drawable = js.native
    
    def parseFloat(r: Resources, value: String, defValue: Double): Double = js.native
    
    def parseInt(r: Resources, value: String, defValue: Double): Double = js.native
    
    def parseString(r: Resources, value: String): String = js.native
    def parseString(r: Resources, value: String, defValue: String): String = js.native
    
    def parseTextArray(r: Resources, value: String): js.Array[String] = js.native
  }
  
  @js.native
  class StateAttr protected ()
    extends typingsSlinky.androiduix.androidui.attr.StateAttr {
    def this(state: js.Array[Double]) = this()
  }
  
  @js.native
  class StateAttrList protected ()
    extends typingsSlinky.androiduix.androidui.attr.StateAttrList {
    def this(view: View) = this()
  }
  /* static members */
  @js.native
  object StateAttrList extends js.Object {
    
    def getViewStateValue(attrName: String): Double = js.native
  }
}
