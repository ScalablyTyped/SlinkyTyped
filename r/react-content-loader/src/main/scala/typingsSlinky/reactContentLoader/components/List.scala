package typingsSlinky.reactContentLoader.components

import typingsSlinky.reactContentLoader.mod.IContentLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  @JSImport("react-content-loader", "List")
  @js.native
  object component extends js.Object
  
  def withProps(p: IContentLoaderProps): SharedBuilder_IContentLoaderProps1813843303 = new SharedBuilder_IContentLoaderProps1813843303(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: List.type): SharedBuilder_IContentLoaderProps1813843303 = new SharedBuilder_IContentLoaderProps1813843303(js.Array(this.component, js.Dictionary.empty))()
}

