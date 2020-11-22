package typingsSlinky.antd.components

import typingsSlinky.antd.directoryTreeMod.DirectoryTreeProps
import typingsSlinky.rcTree.mod.default
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DirectoryTree {
  
  @JSImport("antd/lib/tree/DirectoryTree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DirectoryTreeProps with RefAttributes[default]): SharedBuilder_DirectoryTreePropsRefAttributes_1564941547[default] = new SharedBuilder_DirectoryTreePropsRefAttributes_1564941547[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DirectoryTree.type): SharedBuilder_DirectoryTreePropsRefAttributes_1564941547[default] = new SharedBuilder_DirectoryTreePropsRefAttributes_1564941547[default](js.Array(this.component, js.Dictionary.empty))()
}
