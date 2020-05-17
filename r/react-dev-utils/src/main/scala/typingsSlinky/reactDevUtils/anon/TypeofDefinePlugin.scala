package typingsSlinky.reactDevUtils.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webpack.anon.Module
import typingsSlinky.webpack.mod.DefinePlugin
import typingsSlinky.webpack.mod.DefinePlugin.CodeValueObject
import typingsSlinky.webpack.mod.DefinePlugin.CodeValuePrimitive
import typingsSlinky.webpack.mod.DefinePlugin.RuntimeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDefinePlugin extends Instantiable1[/* definitions */ StringDictionary[CodeValueObject], DefinePlugin] {
  def runtimeValue(fn: js.Function1[/* hasModule */ Module, CodeValuePrimitive]): RuntimeValue = js.native
  def runtimeValue(fn: js.Function1[/* hasModule */ Module, CodeValuePrimitive], fileDependencies: js.Array[String]): RuntimeValue = js.native
}

