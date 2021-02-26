package typingsSlinky.antd

import typingsSlinky.antd.anon.ItemRef
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.scrollIntoViewIfNeeded.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFormMod {
  
  @JSImport("antd/lib/form/hooks/useForm", JSImport.Default)
  @js.native
  def default[Values](): js.Array[FormInstance[Values]] = js.native
  @JSImport("antd/lib/form/hooks/useForm", JSImport.Default)
  @js.native
  def default[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = js.native
  
  @js.native
  trait FormInstance[Values]
    extends typingsSlinky.rcFieldForm.interfaceMod.FormInstance[Values] {
    
    /** This is an internal usage. Do not use in your prod */
    var __INTERNAL__ : ItemRef = js.native
    
    def getFieldInstance(name: NamePath): js.Any = js.native
    
    def scrollToField(name: NamePath): Unit = js.native
    def scrollToField(name: NamePath, options: Options[_]): Unit = js.native
  }
}
