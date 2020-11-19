package typingsSlinky.reactContentLoader.components

import typingsSlinky.reactContentLoader.mod.IContentLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletList {
  
  @JSImport("react-content-loader", "BulletList")
  @js.native
  object component extends js.Object
  
  def withProps(p: IContentLoaderProps): SharedBuilder_IContentLoaderProps1813843303 = new SharedBuilder_IContentLoaderProps1813843303(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BulletList.type): SharedBuilder_IContentLoaderProps1813843303 = new SharedBuilder_IContentLoaderProps1813843303(js.Array(this.component, js.Dictionary.empty))()
}
