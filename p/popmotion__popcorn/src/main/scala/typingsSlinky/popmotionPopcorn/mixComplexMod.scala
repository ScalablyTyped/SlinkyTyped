package typingsSlinky.popmotionPopcorn

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.styleValueTypes.typesMod.HSLA
import typingsSlinky.styleValueTypes.typesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popmotion/popcorn/lib/utils/mix-complex", JSImport.Namespace)
@js.native
object mixComplexMod extends js.Object {
  
  def mixArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = js.native
  
  def mixComplex(origin: String, target: String): MixComplex_ = js.native
  
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]] = js.native
  
  type BlendableObject = StringDictionary[String | Double | RGBA | HSLA]
  
  type MixComplex_ = js.Function1[/* p */ Double, String]
}
