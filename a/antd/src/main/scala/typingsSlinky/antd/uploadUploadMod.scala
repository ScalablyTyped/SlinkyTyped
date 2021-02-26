package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antd.draggerMod.DraggerProps
import typingsSlinky.antd.uploadInterfaceMod.UploadProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadUploadMod extends Shortcut {
  
  @JSImport("antd/lib/upload/Upload", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[PropsWithChildren[UploadProps[_]] with RefAttributes[_]] {
    
    var Dragger: ReactComponentClass[DraggerProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `uploadUploadMod.foo` */
  override def _to: CompoundedComponent = default
}
