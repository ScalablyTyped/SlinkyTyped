package typingsSlinky.fundamentalDashReact

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLLIElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/TreeView/TreeView", JSImport.Namespace)
@js.native
object libTreeViewTreeViewMod extends js.Object {
  @js.native
  trait TreeView
    extends Component[TreeViewProps, js.Object, js.Any] {
    var displayName: typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.TreeView = js.native
  }
  
  @js.native
  class default () extends TreeView
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Branch: ReactComponentClass[js.Object] with Anon_DisplayNameTreeViewBranch = js.native
    var Col: ReactComponentClass[TreeColProps] with Anon_DisplayNameTreeViewCol = js.native
    var Head: ReactComponentClass[TreeHeadProps] with Anon_DisplayNameTreeViewHead = js.native
    var Item: ReactComponentClass[TreeItemProps] with Anon_DisplayNameTreeViewItem = js.native
    var Row: ReactComponentClass[TreeRowProps] with Anon_DisplayNameTreeViewRow = js.native
    var Tree: ReactComponentClass[js.Object] with Anon_DisplayNameTreeViewTree = js.native
  }
  
  type TreeColProps = Anon_ClassNameString with HTMLAttributes[HTMLDivElement]
  type TreeHeadProps = Anon_ButtonPropsClassNameX with HTMLAttributes[HTMLDivElement]
  type TreeItemProps = Anon_IsExpanded with HTMLAttributes[HTMLLIElement]
  type TreeRowProps = js.Object with HTMLAttributes[HTMLDivElement]
  type TreeViewProps = Anon_CustomStylesDisableStylesExpandData with HTMLAttributes[HTMLDivElement]
}

