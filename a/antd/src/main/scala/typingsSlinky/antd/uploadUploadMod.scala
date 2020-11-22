package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.draggerMod.DraggerProps
import typingsSlinky.antd.uploadInterfaceMod.UploadProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object uploadUploadMod extends js.Object {
  
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[PropsWithChildren[UploadProps[_]] with RefAttributes[_]] {
    
    var Dragger: ReactComponentClass[DraggerProps] = js.native
  }
}
