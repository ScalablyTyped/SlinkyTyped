package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.IBasePickerSuggestionsProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod.ValidationState
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSelectedProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerMod.IGenericItem
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateGenericItem extends js.Object {
  var createGenericItem: js.Function2[
    /* name */ String, 
    /* currentValidationState */ ValidationState, 
    IGenericItem with Anon_Key
  ] = js.native
  def onRenderItem(props: IPeoplePickerItemSelectedProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps, suggestionsProps: IBasePickerSuggestionsProps[_]): Element = js.native
}

