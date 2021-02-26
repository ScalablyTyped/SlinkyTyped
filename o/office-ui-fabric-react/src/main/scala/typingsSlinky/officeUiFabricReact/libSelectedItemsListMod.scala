package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsSlinky.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectedItemsListMod {
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "BasePeopleSelectedItemsList")
  @js.native
  class BasePeopleSelectedItemsList protected ()
    extends typingsSlinky.officeUiFabricReact.selectedItemsListMod.BasePeopleSelectedItemsList {
    def this(basePickerProps: ISelectedPeopleProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "BaseSelectedItemsList")
  @js.native
  class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends typingsSlinky.officeUiFabricReact.selectedItemsListMod.BaseSelectedItemsList[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "ExtendedSelectedItem")
  @js.native
  class ExtendedSelectedItem protected ()
    extends typingsSlinky.officeUiFabricReact.selectedItemsListMod.ExtendedSelectedItem {
    def this(props: ISelectedPeopleItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "SelectedPeopleList")
  @js.native
  class SelectedPeopleList protected ()
    extends typingsSlinky.officeUiFabricReact.selectedItemsListMod.SelectedPeopleList {
    def this(basePickerProps: ISelectedPeopleProps) = this()
  }
  /* static members */
  object SelectedPeopleList {
    
    @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "SelectedPeopleList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SelectedItemsList", "SelectedPeopleList.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    @scala.inline
    def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
