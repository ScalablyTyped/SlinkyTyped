package typingsSlinky.ionicReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.ionicReact.anon.PickHTMLAttributesHTMLIon
import typingsSlinky.ionicReact.ionicReactPropsMod.IonicReactProps
import typingsSlinky.ionicons.componentsMod.global.HTMLIonIconElement
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.ionicCore.componentsMod.JSX.IonIcon with typingsSlinky.ionicReact.anon.PickHTMLAttributesHTMLIon with typingsSlinky.ionicReact.ionicReactPropsMod.IonicReactProps with typingsSlinky.react.mod.RefAttributes[typingsSlinky.ionicons.componentsMod.global.HTMLIonIconElement] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IoniconsJSX.IonIcon * / js.Any because couldn't resolve ClassTree.) */
object IonIconInner {
  
  @JSImport("@ionic/react/dist/types/components/inner-proxies", "IonIconInner")
  @js.native
  object component extends js.Object
  
  def apply(
    p: typingsSlinky.ionicCore.componentsMod.JSX.IonIcon with PickHTMLAttributesHTMLIon with IonicReactProps with RefAttributes[HTMLIonIconElement]
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: IonIconInner.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
