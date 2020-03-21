package typingsSlinky.reactToolbox

import typingsSlinky.react.mod.Component
import typingsSlinky.reactToolbox.libListListMod.ListProps
import typingsSlinky.reactToolbox.listListCheckboxMod.ListCheckboxProps
import typingsSlinky.reactToolbox.listListDividerMod.ListDividerProps
import typingsSlinky.reactToolbox.listListItemActionMod.ListItemActionProps
import typingsSlinky.reactToolbox.listListItemActionsMod.ListItemActionsProps
import typingsSlinky.reactToolbox.listListItemContentMod.ListItemContentProps
import typingsSlinky.reactToolbox.listListItemLayoutMod.ListItemLayoutProps
import typingsSlinky.reactToolbox.listListItemMod.ListItemProps
import typingsSlinky.reactToolbox.listListItemTextMod.ListItemTextProps
import typingsSlinky.reactToolbox.listListSubHeaderMod.ListSubHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/list", JSImport.Namespace)
@js.native
object libListMod extends js.Object {
  @js.native
  class List ()
    extends Component[ListProps, js.Object, js.Any]
  
  @js.native
  class ListCheckbox ()
    extends Component[ListCheckboxProps, js.Object, js.Any]
  
  @js.native
  class ListDivider ()
    extends Component[ListDividerProps, js.Object, js.Any]
  
  @js.native
  class ListItem ()
    extends Component[ListItemProps with ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemAction ()
    extends Component[ListItemActionProps, js.Object, js.Any]
  
  @js.native
  class ListItemActions ()
    extends Component[ListItemActionsProps, js.Object, js.Any]
  
  @js.native
  class ListItemContent ()
    extends Component[ListItemContentProps, js.Object, js.Any]
  
  @js.native
  class ListItemLayout ()
    extends Component[ListItemLayoutProps, js.Object, js.Any]
  
  @js.native
  class ListItemText ()
    extends Component[ListItemTextProps, js.Object, js.Any]
  
  @js.native
  class ListSubHeader ()
    extends Component[ListSubHeaderProps, js.Object, js.Any]
  
}

