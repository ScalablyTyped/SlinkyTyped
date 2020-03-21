package typingsSlinky.officeUiFabricReact.selectionBasicExampleMod

import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.all
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.vowels
import typingsSlinky.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsSlinky.uifabricUtilities.selectionTypesMod.ISelection
import typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionBasicExampleState extends js.Object {
  var canSelect: all | vowels
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ]
  var selection: ISelection[IObjectWithKey]
  var selectionMode: SelectionMode
}

object ISelectionBasicExampleState {
  @scala.inline
  def apply(
    canSelect: all | vowels,
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode
  ): ISelectionBasicExampleState = {
    val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectionBasicExampleState]
  }
}

