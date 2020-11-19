package typingsSlinky.reactNative.mod.Animated

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNative.anon.X
import typingsSlinky.reactNative.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "Animated.ValueXY")
@js.native
class ValueXY ()
  extends typingsSlinky.reactNative.mod.Animated.Animated {
  def this(valueIn: Y) = this()
  
  def addListener(callback: ValueXYListenerCallback): String = js.native
  
  def extractOffset(): Unit = js.native
  
  def flattenOffset(): Unit = js.native
  
  /**
    * Converts `{x, y}` into `{left, top}` for use in style, e.g.
    *
    *```javascript
    *  style={this.state.anim.getLayout()}
    *```
    */
  def getLayout(): StringDictionary[AnimatedValue] = js.native
  
  /**
    * Converts `{x, y}` into a useable translation transform, e.g.
    *
    *```javascript
    *  style={{
    *    transform: this.state.anim.getTranslateTransform()
    *  }}
    *```
    */
  def getTranslateTransform(): js.Array[StringDictionary[AnimatedValue]] = js.native
  
  def removeListener(id: String): Unit = js.native
  
  def setOffset(offset: X): Unit = js.native
  
  def setValue(value: X): Unit = js.native
  
  def stopAnimation(): Unit = js.native
  def stopAnimation(callback: js.Function1[/* value */ X, Unit]): Unit = js.native
  
  var x: AnimatedValue = js.native
  
  var y: AnimatedValue = js.native
}
