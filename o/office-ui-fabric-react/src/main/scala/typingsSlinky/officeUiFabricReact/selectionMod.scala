package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.IsSelectedOnFocus
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsSlinky.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection", "Selection")
  @js.native
  class Selection[TItem] protected ()
    extends typingsSlinky.officeUiFabricReact.selectionSelectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
    
    /* 0 */ val horizontal: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
    
    /* 2 */ val multiple: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    /* 0 */ val none: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    /* 1 */ val single: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/selection", "SelectionZone")
  @js.native
  class SelectionZone protected ()
    extends typingsSlinky.officeUiFabricReact.selectionZoneMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  /* static members */
  object SelectionZone {
    
    @JSImport("office-ui-fabric-react/lib/utilities/selection", "SelectionZone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/selection", "SelectionZone.defaultProps")
    @js.native
    def defaultProps: IsSelectedOnFocus = js.native
    @scala.inline
    def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/utilities/selection", "SelectionZone.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
  }
}
