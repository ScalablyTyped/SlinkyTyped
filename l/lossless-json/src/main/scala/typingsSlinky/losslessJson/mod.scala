package typingsSlinky.losslessJson

import typingsSlinky.losslessJson.anon.CircularRefs
import typingsSlinky.losslessJson.anon.CircularRefsBoolean
import typingsSlinky.losslessJson.losslessJsonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lossless-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def config(): CircularRefsBoolean = js.native
  def config(hasCircularRefs: CircularRefs): CircularRefsBoolean = js.native
  
  def parse(text: String): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _]): js.Any = js.native
  
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double]): String = js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: Double): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
  
  @js.native
  class LosslessNumber protected () extends js.Object {
    def this(value: String) = this()
    def this(value: Double) = this()
    
    var isLosslessNumber: `true` = js.native
    
    var `type`: typingsSlinky.losslessJson.losslessJsonStrings.LosslessNumber = js.native
    
    // value as string
    var value: String = js.native
  }
}
