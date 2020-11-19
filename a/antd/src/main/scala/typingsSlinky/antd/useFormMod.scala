package typingsSlinky.antd

import typingsSlinky.antd.anon.ItemRef
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.scrollIntoViewIfNeeded.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/form/hooks/useForm", JSImport.Namespace)
@js.native
object useFormMod extends js.Object {
  
  def default(): js.Array[FormInstance] = js.native
  def default(form: FormInstance): js.Array[FormInstance] = js.native
  
  @js.native
  trait FormInstance
    extends typingsSlinky.rcFieldForm.interfaceMod.FormInstance {
    
    /** This is an internal usage. Do not use in your prod */
    var __INTERNAL__ : ItemRef = js.native
    
    def getFieldInstance(name: NamePath): js.Any = js.native
    
    def scrollToField(name: NamePath): Unit = js.native
    def scrollToField(name: NamePath, options: Options[_]): Unit = js.native
  }
}
