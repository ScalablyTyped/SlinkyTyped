package typingsSlinky.officeUiFabricReact.mod

import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typingsSlinky.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection because Already inherited
- typingsSlinky.uifabricUtilities.selectionSelectionMod.Selection because Already inherited
- typingsSlinky.uifabricUtilities.selectionMod.Selection because Already inherited
- typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection because Already inherited
- typingsSlinky.uifabricUtilities.mod.Selection because Already inherited
- typingsSlinky.uifabricUtilities.selectionSelectionMod.Selection because Already inherited
- typingsSlinky.officeUiFabricReact.selectionSelectionMod.Selection because Already inherited
- typingsSlinky.uifabricUtilities.selectionMod.Selection because Already inherited
- typingsSlinky.officeUiFabricReact.selectionMod.Selection because Already inherited
- typingsSlinky.uifabricUtilities.mod.Selection because Already inherited
- typingsSlinky.officeUiFabricReact.libMarqueeSelectionMod.Selection because Inheritance from two classes. Inlined 
- typingsSlinky.officeUiFabricReact.libSelectionMod.Selection because Inheritance from two classes. Inlined 
- typingsSlinky.officeUiFabricReact.utilitiesMod.Selection because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "Selection")
@js.native
class Selection[TItem] protected ()
  extends typingsSlinky.officeUiFabricReact.libDetailsListMod.Selection[TItem] {
  /**
    * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
    * object with a `getKey` implementation. Providing options is optional otherwise.
    * (At most one `options` object is accepted.)
    */
  def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
}

