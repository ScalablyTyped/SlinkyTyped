package typingsSlinky.antd.components

import typingsSlinky.antd.directoryTreeMod.DirectoryTreeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DirectoryTree {
  
  @JSImport("antd/lib/tree/DirectoryTree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DirectoryTreeProps): SharedBuilder_DirectoryTreeProps934662521 = new SharedBuilder_DirectoryTreeProps934662521(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DirectoryTree.type): SharedBuilder_DirectoryTreeProps934662521 = new SharedBuilder_DirectoryTreeProps934662521(js.Array(this.component, js.Dictionary.empty))()
}
