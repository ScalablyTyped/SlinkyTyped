package typingsSlinky.reactDevUtils.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.webpack.anon.Module
import typingsSlinky.webpack.mod.DefinePlugin.CodeValuePrimitive
import typingsSlinky.webpack.mod.DefinePlugin.RuntimeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDefinePluginRuntimeValue extends js.Object {
  var RuntimeValue: Instantiable1[
    /* fn */ js.Function1[/* hasModule */ Module, CodeValuePrimitive], 
    typingsSlinky.webpack.mod.DefinePlugin.RuntimeValue
  ] = js.native
}

object TypeofDefinePluginRuntimeValue {
  @scala.inline
  def apply(
    RuntimeValue: Instantiable1[/* fn */ js.Function1[/* hasModule */ Module, CodeValuePrimitive], RuntimeValue]
  ): TypeofDefinePluginRuntimeValue = {
    val __obj = js.Dynamic.literal(RuntimeValue = RuntimeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDefinePluginRuntimeValue]
  }
  @scala.inline
  implicit class TypeofDefinePluginRuntimeValueOps[Self <: TypeofDefinePluginRuntimeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuntimeValue(
      value: Instantiable1[/* fn */ js.Function1[/* hasModule */ Module, CodeValuePrimitive], RuntimeValue]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

